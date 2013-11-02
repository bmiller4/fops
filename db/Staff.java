/**
 * Data object for staff members in the FOPS db
 */

package db;

import java.util.List;
import java.util.ArrayList;

public class Staff {

    private String name;
    private DataTypes.Colleges college;
    private DataTypes.Gender gender;
    private DataTypes.Disciplines discipline;
    private int startYear;
    private List<CommitteeAppointment> committees;

    public Staff() {
        this("John Doe", DataTypes.Gender.MALE, 
                DataTypes.Colleges.BUSINESS, DataTypes.Disciplines.LATIN, 1985);
    }

    public Staff(String name, DataTypes.Gender gender, 
            DataTypes.Colleges college, DataTypes.Disciplines discipline, 
            int startYear) {
        this.name = name;
        this.gender = gender;
        this.college = college;
        this.discipline = discipline;
        this.startYear = startYear;
        committees = new ArrayList<CommitteeAppointment>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartYear(int startYear) {
       this.startYear = startYear; 
    }

    public String getName() {
        return name;
    }
}
