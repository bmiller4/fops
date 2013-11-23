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

    private Map<String, Staff> faculty;
    private Map<String, Committee> committees;
    private static Gson gson;

    public FopsDB() {
        faculty = new Hashtable<String, Staff>();
        committees = new Hashtable<String, Committee>();
        GsonBuilder builder = new GsonBuilder();
        builder.registerTypeAdapter(Rule.class, new RuleJsonizer());
        gson = builder.create();
    }

    public String[] toJson() {
        String maps[] = new String[2];
        maps[0] = gson.toJson(faculty);
        maps[1] = gson.toJson(committees);
        return maps;
    }

    public static FopsDB fromJson(String faculty, String committees) {
        FopsDB db = new FopsDB();
        Type facType = new TypeToken<Map<String, Staff>>(){}.getType();
        Type comType = new TypeToken<Map<String, Committee>>(){}.getType();
        db.faculty = gson.fromJson(faculty, facType);
        db.committees = gson.fromJson(committees, comType);
        return db;
    }

    public void addCommittee(Committee committee) {
        committees.put(committee.getName(), committee);
    }

    public void addFaculty(Staff faculty) {
        this.faculty.put(faculty.getName(), faculty);
    }

    public Committee getCommittee(String name) {
        return committees.get(name);
    }

    public Staff getFaculty(String name) {
        return faculty.get(name);
    }
}
