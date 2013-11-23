/**
 * Serialize/Deserialize db.rules.Rule to/from JSON format.
 *
 * This code modeled on that by Oleg Varaksin in "JSON with GSON and
 * abstract classes"
 * http://www.javacodegeeks.com/2012/04/json-with-gson-and-abstract-classes.html
 */

package db.rules;

import com.google.gson.*;
import java.lang.reflect.Type;

public class RuleJsonizer implements JsonSerializer<Rule>,
        JsonDeserializer<Rule> {
    @Override
    public JsonElement serialize(Rule src, Type typeOfSrc,
            JsonSerializationContext context) {
        JsonObject result = new JsonObject();
        result.add("type", 
                new JsonPrimitive(src.getClass().getSimpleName()));
        result.add("properties", context.serialize(src, src.getClass()));

        return result;
    }

    @Override
    public Rule deserialize(JsonElement json, Type typeOfT,
            JsonDeserializationContext context)
            throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        String type = jsonObject.get("type").getAsString();
        JsonElement rule = jsonObject.get("properties");

        try {
            return context.deserialize(rule,
                    Class.forName("db.rules." + type));
        } catch (ClassNotFoundException e) {
            throw new JsonParseException("Unknown rule: " + type, e);
        }
    }
}
