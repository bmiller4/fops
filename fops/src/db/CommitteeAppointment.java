/**
 * Represents a professors relationship with a particular committee.
 */

package db;

public class CommitteeAppointment {
    
    private String committee;
    private DataTypes.CommitteeType type;
    private int startYear;

    public CommitteeAppointment(String committee, 
            DataTypes.CommitteeType type, int startYear) {
        this.committee = committee;
        this.type = type;
        this.startYear = startYear;
    }
}
