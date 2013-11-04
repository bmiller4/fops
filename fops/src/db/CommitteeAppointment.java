/**
 * Represents a professors relationship with a particular committee.
 */

package db;

import util.MonthYear;

public class CommitteeAppointment {
    
    private String committee;
    private DataTypes.CommitteeType type;
    private MonthYear startDate;

    public CommitteeAppointment(String committee, 
            DataTypes.CommitteeType type, MonthYear startDate) {
        this.committee = committee;
        this.type = type;
        this.startDate = startDate;
    }
}
