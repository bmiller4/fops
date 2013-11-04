/**
 * A University of Mary Washington committee.
 */

package db;

import java.util.List;
import java.util.ArrayList;
import db.rules.*;
import util.*;

public class Committee {
    
    private String name;
    private Staff chair;
    private Staff secretary;
    private DataTypes.CommitteeType type;
    private List<Staff> atLargeMembers;
    private List<Staff> representativeMembers;
    private List<Rule> rules;

    public Committee(String name) {
        this(name, DataTypes.CommitteeType.UNIVERSITY, null);
    }

    public Committee(String name, DataTypes.CommitteeType type,
            List<Rule> rules) {
        this.name = name;
        this.type = type;
        this.rules = (rules == null) ? new ArrayList<Rule>() : rules;

        atLargeMembers = new ArrayList<Staff>();
        representativeMembers = new ArrayList<Staff>();
    }

    public String getName() {
        return name;
    }

    public void addAtLargeMember(Staff member) {
        if (isMember(member))
            return;
        atLargeMembers.add(member);
        member.addCommitteeAppointment(
                new CommitteeAppointment(this.name, this.type, 
                    new MonthYear()));
    }

    public void addRepresentativeMember(Staff member) {
        if (isMember(member))
            return;
        representativeMembers.add(member);
    }

    public int numRepresentativesOfCollege(DataTypes.College college) {
        int representatives = 0;
        for (Staff member : representativeMembers) {
            if (member.getCollege() == college)
                representatives++;
        }
        return representatives;
    }

    public List<Staff> representativesOfCollege(DataTypes.College college) {
        List<Staff> reps = new ArrayList<Staff>();
        for (Staff member : representativeMembers) {
            if (member.getCollege() == college)
                reps.add(member);
        }
        return reps;
    }

    public int numAtLargeMembers() {
        return atLargeMembers.size();
    }

    public boolean isMember(Staff member) {
        return (atLargeMembers.contains(member)
                || representativeMembers.contains(member));
    }

    public void setChair(Staff member) {
        if (isMember(member)) {
            chair = member;
        } else {
            // TODO: throw exception here
        }
    }

    public void setSecretary(Staff member) {
        if (isMember(member)) {
            secretary = member;
        } else {
            // TODO: throw exception here
        }
    }
}
