/**
 * The big ol' honking database class for FOPS.
 */

package db;

import java.util.Map;
import java.util.Hashtable;

public class FopsDB {

    private Map<String, Staff> faculty;
    private Map<String, Committee> committees;

    public FopsDB() {
        faculty = new Hashtable<String, Staff>();
        committees = new Hashtable<String, Committee>();
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
