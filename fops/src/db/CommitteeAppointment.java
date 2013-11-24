package db;

import util.MonthYear;
import db.values.*;

/**
 * Represents a professors relationship with a particular committee.
 */
public class CommitteeAppointment {

    private String committee;
    private CommitteeType type;
    private MonthYear startDate;
    private MonthYear endDate;

    /**
     * Constructor.
     */
    public CommitteeAppointment(String committee,
            CommitteeType type, MonthYear startDate) {
        this.committee = committee;
        this.type = type;
        this.startDate = startDate;
    }

    /**
     * Set the date the faculty member ended this appointment.
     * @param   endDate that very date
     */
    public void setEndDate(MonthYear endDate) {
        this.endDate = endDate;
    }

    public String getCommittee() {
        return committee;
    }

    /**
     * Determines whether the appointment is still active.
     * @return  true if this appointment hasn't ended, false otherwise
     */
    public boolean isActive() {
        return endDate == null;
    }
}
