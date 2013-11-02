/**
 * Data object for staff members in the FOPS db
 */

package db;

import java.util.List;
import java.util.ArrayList;

public class Staff {

    private String name;
    private DataTypes.College college;
    private DataTypes.Gender gender;
    private DataTypes.Discipline discipline;
    private DataTypes.Rank rank;
    private int startYear;
    private List<CommitteeAppointment> committees;

    public Staff() {
        this("John Doe", DataTypes.Gender.MALE, 
                DataTypes.College.BUSINESS, DataTypes.Discipline.LATIN, 
                DataTypes.Rank.PROFESSOR, 1985);
    }

    public Staff(String name, DataTypes.Gender gender, 
            DataTypes.College college, DataTypes.Discipline discipline, 
            DataTypes.Rank rank, int startYear) {
        this.name = name;
        this.gender = gender;
        this.college = college;
        this.discipline = discipline;
        this.rank = rank;
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

    public DataTypes.College getCollege() {
        return college;
    }
}
