/**
 * A University of Mary Washington committee.
 */

package db;

import java.util.List;
import java.util.ArrayList;

public class Committee {
    
    private String name;
    private String chair;
    private String secretary;
    private DataTypes.CommitteeType type;
    private List<String> atLargeMembers;
    private List<String> representativeMembers;
    private int numAtLargeMembers;
    private int representativesPerCollege;

    public Committee(String name) {
        this(name, "", "", DataTypes.CommitteeType.UNIVERSITY);
    }

    public Committee(String name, DataTypes.CommitteeType type,
            int numAtLargeMembers, int representativesPerCollege) {
        this.name = name;
        this.type = type;
        this.numAtLargeMembers = numAtLargeMembers;
        this.representativesPerCollege = representativesPerCollege

        atLargeMembers = new ArrayList<String>(numAtLargeMembers);
        representativeMembers = 
                new ArrayList<String>(representativesPerCollege *
                DataTypes.College.size);
    }

    public void addAtLargeMember(String name) {
        if (isMember(name))
            return;
        atLargeMembers.add(name);
    }

    public void addRepresentativeMember(String name) {
        if (isMember(name))
            return;
        representativeMembers.add(name);
    }

    public int numRepresentativesOfCollege(DataTypes.College college) {
        int representatives = 0;
        for (Staff member : representativeMembers) {
            if (member.getCollege() == college)
                representatives++;
        }
        return representatives;
    }

    public int numAtLargeMembers() {
        return atLargeMembers.size();
    }

    public boolean isMember(String name) {
        return (atLargeMembers.contains(name)
                || representativeMembers.contains(name));
    }

    public void setChair(String name) {
        if (isMember(name)) {
            chair = name;
        } else {
            // TODO: throw exception here
        }
    }

    public void setSecretary(String name) {
        if (isMember(name)) {
            secretary = name;
        } else {
            // TODO: throw exception here
        }
    }
}
