/**
 * A general test for the database system.
 */

package tests;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import db.*;
import db.rules.*;
import util.*;
import db.values.*;

public class GsonTest {

    public static void status(String str) {
        System.out.println(str);
    }

    public static void main(String args[]) {
        FopsDB db = new FopsDB();
        Gson gson = db.getGson();
        GsonBuilder builder = new GsonBuilder();
        List<Rule> rules = new ArrayList<Rule>();
        List<Staff> faculty = new ArrayList<Staff>();

        /* Construct Rules */
        status("Constructing rules");
        rules.add(new MinimumYearsServiceRule(3));
        rules.add(new NumberRepresentativesRule(1));
        rules.add(new NumberAtLargeMembersRule(2));
        rules.add(new MinimumRankRule(Rank.ASSOCIATE));

        /* Add Committees */
        status("Adding committees");
        String com1 = "Test Committee One";
        String com2 = "Test Committee Two";
        db.addCommittee(new Committee(com1,
                CommitteeType.UNIVERSITY, rules));
        db.addCommittee(new Committee(com2,
                CommitteeType.AD_HOC, null));

        /* Construct Staff */
        status("Constructing staff");
        faculty.add(new Staff("John Doe", Gender.MALE, 
                College.BUSINESS, Discipline.LATIN, 
                Rank.PROFESSOR, new MonthYear(9, 1985), true));
        faculty.add(new Staff("Jane Doe", Gender.FEMALE,
                College.ARTS_AND_SCIENCES,
                Discipline.BIOLOGY, Rank.INSTRUCTOR,
                new MonthYear(1, 2011), false));

        /* Add Staff */
        status("Adding staff");
        for (Staff staff : faculty) {
            db.addFaculty(staff);
            db.getCommittee(com1).addAtLargeMember(
                    db.getFaculty(staff.getName()));
        }

        /* Check name pointerness */
        status("Checking that changes are reflected through JSON");
        db.getFaculty("John Doe").setName("John Fro");

        String json = gson.toJson(db);

		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(
                    new FileWriter("fopsdb.json", false));
			writer.write(json, 0, json.length());
			writer.flush();
			//gson.toJson(db, writer);
		} catch (IOException e) {
			System.err.println("Cannot open file fopsdb.json");
			System.exit(1);
		} 
        if (writer != null) {
            try {
                writer.close();
            } catch (IOException e) {
                System.err.println("Could not close writer, not aborting.");
            }
        }

        System.out.println("Checking that file read in properly");
        BufferedReader reader = null;
        FopsDB db2 = null;
        try {
            reader = new BufferedReader(
                    new FileReader("fopsdb.json"));
            db2 = gson.fromJson(reader, FopsDB.class);
        } catch (IOException e) {
            System.err.println("Cannot open file fopsdb.json");
            System.exit(1);
        }
        if (reader != null) {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("Could not close reader, not aborting.");
            }
        }
        if (db2 != null) {
            System.out.println(gson.toJson(db2));
        } else {
            System.out.println("Ruh roh, Raggy! db2 did not load!");
        }

        /* Check pointers again */
        System.out.println("Checking that pointers still work");
        db2.getFaculty("John Fro").setName("John Doe");
        json = gson.toJson(db2);
        System.out.println(json); 
    }
}
