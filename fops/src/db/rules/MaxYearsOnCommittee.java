package db.rules;

import db.*;

public class MaxYearsOnCommittee implements Rule {

    private static String description =
            "Maximum number of years for one committee appointment";
    private int maxYears;

    public MaxYearsOnCommittee(int maxYears) {
        this.maxYears = maxYears;
    }

    @Override
    public String getDescription() {
        return description();
    }

    @Override
    public String getLimit() {
        return (new Integer(maxYears)).toString();
    }

    @Override
    public boolean isValidMember(Committee committee, Staff faculty) {
        List<CommitteeAppointment> appointments =
                faculty.getOpenCommitteeAppointments();
        CommitteeAppointment appointment;
        for (CommitteeAppointment appoint : appointments) {
            if (committee.getName().equals(appoint.getCommittee())) {
                appointment = appoint;
                break;
            }
        }
        if (appointment == null)
            return true;
        if (appointment.getStartDate().timeSince().getYear() >= maxYears)
            return false;
        return true;
    }
}
