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
    private List<Integer> atLargeMembers;
    private List<Integer> representativeMembers;
    //private List<Staff> atLargeMembers;
    //private List<Staff> representativeMembers;
    private List<Rule> rules;
    transient private FopsDB db;

    public Committee(String name) {
        this(name, DataTypes.CommitteeType.UNIVERSITY, null);
    }

    public Committee(String name, DataTypes.CommitteeType type,
            List<Rule> rules) {
        this.name = name;
        this.type = type;
        this.rules = (rules == null) ? new ArrayList<Rule>() : rules;

        atLargeMembers = new ArrayList<Integer>();
        representativeMembers = new ArrayList<Integer>();
    }

    public void setDB(FopsDB db) {
        this.db = db;
    }

    public String getName() {
        return name;
    }

    public void addAtLargeMember(Staff member) {
        if (isMember(member))
            return;
        addMember(atLargeMembers, member);
    }

    public void addRepresentativeMember(Staff member) {
        if (isMember(member))
            return;
        addMember(representativeMembers, member);
    }

    private void addMember(List<Integer> memberList, Staff member) {
        memberList.add(member.getDBID());
        addAppointment(member);
    }

    private void addAppointment(Staff member) {
        member.addCommitteeAppointment(
                new CommitteeAppointment(this.name, this.type,
                new MonthYear()));
    }

    public boolean canJoin(Staff member) {
        for (Rule rule : rules) {
            if (!rule.isValidMember(this, member)) {
                return false;
            }
        }
        return true;
    }

    public void removeRepresentativeMember(Staff member) {
        removeMember(representativeMembers, member);
    }

    public void removeAtLargeMember(Staff member) {
        removeMember(atLargeMembers, member);
    }

    private void removeMember(List<Integer> memberList, Staff member) {
        if (!isMember(member)) {
            // TODO: consider exception
            return;
        }
        closeAppointment(member);
        memberList.remove(member.getDBID());
    }

    private void closeAppointment(Staff member) {
        member.closeCommitteeAppointment(this.name, new MonthYear());
    }

    public int numRepresentativesOfCollege(DataTypes.College college) {
        int representatives = 0;
        for (Integer member : representativeMembers) {
            if (db.getFaculty(member).getCollege() == college) {
                representatives++;
            }
        }
        return representatives;
    }

    public List<Staff> representativesOfCollege(DataTypes.College college) {
        List<Staff> reps = new ArrayList<Staff>();
        Staff member;
        for (Integer memberid : representativeMembers) {
            member = db.getFaculty(memberid);
            if (member.getCollege() == college) {
                reps.add(member);
            }
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
