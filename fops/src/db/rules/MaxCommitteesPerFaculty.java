package db.rules;

import db.*;
import db.values.*;
import java.util.List;
import java.util.ArrayList;

public class MaxCommitteesPerFaculty implements Rule {
	
    private static String description =
            "Maximum number for various types committees per faculty member";
    private String limit;
    private int university;
    private int standing;
    private int advisoryAndAdHoc;


    public MaxCommitteesPerFaculty() {
        university = 2;
        standing = 1;
        advisoryAndAdHoc = 1;
        limit = String.format("University: %s Standing: %s Advisory/Ad-Hoc: %s",
                university, standing, advisoryAndAdHoc);
    }

    @Override
    public String getDescription() {
        return description;
    }
    
    @Override
    public String getLimit() {
        return limit;
    }

    @Override
    public boolean isValidMember(Committee committee, Staff faculty) {
        int uni, stand, adhoc;
        uni = stand = adhoc = 0;
        List<CommitteeAppointment> appointments = 
                faculty.getOpenCommitteeAppointments();

        switch (committee.getCommitteeType()) {
        case UNIVERSITY:
            uni++;
            break;
        case STANDING:
            stand++;
            break;
        case FACULTY_ADVISORY: case AD_HOC:
            adhoc++;
            break;
        }
        for (CommitteeAppointment appointment : appointments) {
            switch (appointment.getCommitteeType()) {
            case UNIVERSITY:
                uni++;
                break;
            case STANDING:
                stand++;
                break;
            case FACULTY_ADVISORY: case AD_HOC:
                adhoc++;
                break;
            }
        }

        if (uni > university || stand > standing || adhoc > advisoryAndAdHoc)
            return false;
        return true;
    }
}
