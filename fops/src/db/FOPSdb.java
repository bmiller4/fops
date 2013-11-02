/**
 * The big ol' honking database class for FOPS.
 */

import java.util.Map;
import java.util.Hashtable;

public class FOPSdb {

    private Map<String, Staff> faculty;
    private Map<String, Committee> committees;

    public FOPSdb() {
        faculty = new Hashtable<String, Staff>();
        committees = new Hashtable<String, Staff>();
    }

    public void addCommittee(Committee committee) {
        committees.put(committee.getName(), committee);
    }

    public void addFaculty(Staff faculty) {
        faculty.put(faculty.getName(), faculty):
    }
}
