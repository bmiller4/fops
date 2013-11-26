package db;

import java.util.List;
import java.util.ArrayList;
import db.rules.*;
import db.values.*;
import util.*;

/**
 * A University of Mary Washington committee.
 */
public class Committee {

    private String name;
    private Staff chair;
    private Staff secretary;
    private CommitteeType type;
    private List<Integer> atLargeMembers;
    private List<Integer> representativeMembers;
    //private List<Staff> atLargeMembers;
    //private List<Staff> representativeMembers;
    private List<Rule> rules;
    transient private FopsDB db;

    /**
     * Create a committee of type University and default rules.
     * @param   name the name of the committee
     */
    public Committee(String name) {
        this(name, CommitteeType.UNIVERSITY, null);
    }

    /**
     * Full constructor for a Committee.
     * @param   name the name of the committee
     * @param   type the type of the committee
     * @param   rules a list of membership rules for the committee
     */
    public Committee(String name, CommitteeType type,
            List<Rule> rules) {
        this.name = name;
        this.type = type;
        this.rules = (rules == null) ? new ArrayList<Rule>() : rules;

        atLargeMembers = new ArrayList<Integer>();
        representativeMembers = new ArrayList<Integer>();
    }

    /**
     * Set the database that holds the members for the committees.
     * @param   sdb the database that holds faculty information
     */
    public void setDB(FopsDB db) {
        this.db = db;
    }

    /**
     * Add a rule.
     * @param   rule the rule to add
     */
    public void addRule(Rule rule) {
        rules.add(rule);
    }

    /**
     * Get the name of the committee.
     * @return  the name of the committee
     */
    public String getName() {
        return name;
    }

    /**
     * Get the type of the committee.
     * @return  the type of the committee
     */
    public CommitteeType getCommitteeType() {
        return type;
    }

    /**
     * Add an at-large member to the committee.
     * @param   member the member to add
     */
    public void addAtLargeMember(Staff member) {
        if (isMember(member))
            return;
        addMember(atLargeMembers, member);
    }

    /**
     * Add a college representative to the committee.
     * @param   member the representative member to add
     */
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

    /**
     * Runs a potential committee member through the list of rules to see
     * if they are qualified.
     * @param   member the member to check for rules compliance
     * @return  true if the member can join, false otherwise
     */
    public boolean canJoin(Staff member) {
        for (Rule rule : rules) {
            if (!rule.isValidMember(this, member)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Remove a college representative from the committee.
     * @param   member the member to remove from the committee
     */
    public void removeRepresentativeMember(Staff member) {
        removeMember(representativeMembers, member);
    }

    /**
     * Remove an at-large member from the committee.
     * @param   member the member to remove from the committee
     */
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

    /**
     * Gives the number of representatives of a particular college that
     * are members of this committee.
     * @param   college the college to check
     * @return  the number of representatives of said college
     */
    public int numRepresentativesOfCollege(College college) {
        int representatives = 0;
        for (Integer member : representativeMembers) {
            if (db.getFaculty(member).getCollege() == college) {
                representatives++;
            }
        }
        return representatives;
    }

    /**
     * Returns a list of the representatives of the college.
     * @param   college the college which the members represent
     * @return  a list of the representatives
     */
    public List<Staff> representativesOfCollege(College college) {
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

    /**
     * Gives the number of at-large members of this committee.
     * @return  the number of at-large members
     */
    public int numAtLargeMembers() {
        return atLargeMembers.size();
    }

    /**
     * Check whether a particular faculty member is a member of this
     * committee.
     * @param   member the faculty member one is checking for
     * @return  true if the faculty member is part of this committee,
     *          false otherwise
     */
    public boolean isMember(Staff member) {
        return (atLargeMembers.contains(member.getDBID())
                || representativeMembers.contains(member.getDBID()));
    }

    /**
     * Set the chair of the committee.
     * @param   the new chair of the committee
     */
    public void setChair(Staff member) {
        if (isMember(member)) {
            chair = member;
        } else {
            // TODO: throw exception here
        }
    }

    /**
     * Set the secretary of the committee.
     * @param   the new secretary of the committee
     */
    public void setSecretary(Staff member) {
        if (isMember(member)) {
            secretary = member;
        } else {
            // TODO: throw exception here
        }
    }

    /**
     * Convert to a string for display.
     * @return  the string
     */
    @Override
    public String toString() {
        return ("hello");
       // return String.format("%s %s", name, type.toString());
    }
}
