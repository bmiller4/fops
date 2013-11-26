package db;

import java.util.List;
import java.util.ArrayList;
import util.MonthYear;
import db.values.*;

/**
 * Data object for faculty members in the FOPS db.
 */
public class Staff {

    private static int nextID = 0;

    private int dbid;
    private String name;
    private College college;
    private Gender gender;
    private Discipline discipline;
    private Rank rank;
    private MonthYear startDate;
    private List<CommitteeAppointment> committees;
    private boolean hasTenure;

    /**
     * Default constructor for a Staff member.  Only good for
     * testing and deserializing.
     */
    public Staff() {
        //TODO remove this testing thingy here
        this("John Doe", Gender.MALE, 
                College.BUSINESS, Discipline.LATIN, 
                Rank.PROFESSOR, new MonthYear(9, 1985), true);
    }

    /**
     * Constructor.
     */
    public Staff(String name, Gender gender, 
            College college, Discipline discipline, 
            Rank rank, MonthYear startDate, boolean hasTenure) {
        this.name = name;
        this.gender = gender;
        this.college = college;
        this.discipline = discipline;
        this.rank = rank;
        this.startDate = startDate;
        this.hasTenure = hasTenure;

        committees = new ArrayList<CommitteeAppointment>();
        dbid = ++nextID;
    }

    /**
     * Get the database ID.
     * @return  get the database ID.
     */
    public int getDBID() {
        return dbid;
    }

    /**
     * Set the faculty member's name.
     * @param   name the full name of the faculty member
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Set the date the faculty member started working at UMW.
     * @param   startDate the date they started working
     */
    public void setStartDate(MonthYear startDate) {
       this.startDate = startDate; 
    }

    /**
     * Get the date the faculty member started working at UMW.
     * @return  the date the faculty member started working at UMW.
     */
    public MonthYear getStartDate() {
        return startDate;
    }

    /**
     * Get the full name of the faculty member.
     * @return  the name in First(s) Middle(s) Last(s) format.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the college at which the faculty member teaches.
     * @return  the college
     */
    public College getCollege() {
        return college;
    }

    /**
     * Get the rank of the faculty member.
     * @return  the rank of the faculty member
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * Get whether or not the faculty member has tenure.
     * @return  whether or not the faculty member has tenure
     */
    public boolean getTenure() {
        return hasTenure;
    }

    /**
     * Add a post at a committee to the faculty member's committee history.
     * @param   The appointment
     */
    public void addCommitteeAppointment(CommitteeAppointment appointment) {
        committees.add(appointment);
    }

    /**
     * End a faculty member's time on a particular committee.
     * @param   committee the committee the faculty member just left
     * @param   endDate the date the faculty member left
     */
    public void closeCommitteeAppointment(String committee,
            MonthYear endDate) {
        for (CommitteeAppointment appointment : getOpenCommitteeAppointments()) {
            if (appointment.getCommittee().equals(committee)) {
                appointment.setEndDate(endDate);
            }
        }
    }

    /**
     * Get a list of open committee appointments.
     * @return  a list of open committee appointments
     */
    public List<CommitteeAppointment> getOpenCommitteeAppointments() {
        List<CommitteeAppointment> openAppointments = new ArrayList<>();
        for (CommitteeAppointment appointment : committees) {
            if (appointment.isActive()) {
                openAppointments.add(appointment);
            }
        }
        return openAppointments;
    }
}
