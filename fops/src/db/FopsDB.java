/**
 * The big ol' honking database class for FOPS.
 */

package db;

import java.util.Map;
import java.util.Hashtable;
import java.lang.reflect.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import db.rules.*;

public class FopsDB {

    private Map<Integer, Staff> faculty;
    private Map<String, Committee> committees;
    private static Gson gson;
    static {
        GsonBuilder builder = new GsonBuilder();
        //builder.setPrettyPrinting();
        builder.registerTypeAdapter(Rule.class, new RuleJsonizer());
        gson = builder.create();
    }

    public FopsDB() {
        faculty = new Hashtable<Integer, Staff>();
        committees = new Hashtable<String, Committee>();
    }

    public Gson getGson() {
        return gson;
    }

    public String toJson() {
        return gson.toJson(this);
    }

    public static FopsDB fromJson(String json) {
        FopsDB db = new FopsDB();
        db = gson.fromJson(json, FopsDB.class);
        for (Committee committee : db.committees.values()) {
            committee.setDB(db);
        }
        return db;
    }

    public void addCommittee(Committee committee) {
        committees.put(committee.getName(), committee);
    }

    public void addFaculty(Staff faculty) {
        this.faculty.put(faculty.getDBID(), faculty);
    }

    public Committee getCommittee(String name) {
        return committees.get(name);
    }

    public Staff getFaculty(int dbid) {
        return faculty.get(dbid);
    }

    public Staff getFaculty(String name) {
        for (Staff person : faculty.values()) {
            if (name.equals(person.getName())) {
                return person;
            }
        }
        //TODO throw exception instead
        return null;
    }
}
