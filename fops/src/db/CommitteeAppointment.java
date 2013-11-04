/**
 * Represents a professors relationship with a particular committee.
 */

package db;

import util.MonthYear;

public class CommitteeAppointment {
    
    private String committee;
    private DataTypes.CommitteeType type;
    private MonthYear startDate;
    private MonthYear endDate;

    public CommitteeAppointment(String committee, 
            DataTypes.CommitteeType type, MonthYear startDate) {
        this.committee = committee;
        this.type = type;
        this.startDate = startDate;
    }

    public void setEndDate(MonthYear endDate) {
        this.endDate = endDate;
    }

    public String getCommittee() {
        return committee;
    }

    public boolean isOpen() {
        return endDate == null;
    }
}
