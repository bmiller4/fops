/**
 * Data object for staff members in the FOPS db.
 */

package db;

import java.util.List;
import java.util.ArrayList;
import util.MonthYear;

public class Staff {

    private String name;
    private DataTypes.College college;
    private DataTypes.Gender gender;
    private DataTypes.Discipline discipline;
    private DataTypes.Rank rank;
    private MonthYear startDate;
    private List<CommitteeAppointment> committees;

    public Staff() {
        this("John Doe", DataTypes.Gender.MALE, 
                DataTypes.College.BUSINESS, DataTypes.Discipline.LATIN, 
                DataTypes.Rank.PROFESSOR, new MonthYear(9, 1985));
    }

    public Staff(String name, DataTypes.Gender gender, 
            DataTypes.College college, DataTypes.Discipline discipline, 
            DataTypes.Rank rank, MonthYear startYear) {
        this.name = name;
        this.gender = gender;
        this.college = college;
        this.discipline = discipline;
        this.rank = rank;
        this.startDate = startDate;
        committees = new ArrayList<CommitteeAppointment>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStartDate(MonthYear startDate) {
       this.startDate = startDate; 
    }

    public MonthYear getStartDate() {
        return startDate;
    }

    public String getName() {
        return name;
    }

    public DataTypes.College getCollege() {
        return college;
    }

    public DataTypes.Rank getRank() {
        return rank;
    }
}
