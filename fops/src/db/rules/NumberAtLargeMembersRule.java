/**
 * Rule specifying how many at-large members a committee should contain.
 */

package db.rules;

import db.*;

public class NumberAtLargeMembersRule implements Rule {

    private int maxAtLargeMembers;

    public NumberAtLargeMembersRule(int maxAtLargeMembers) {
        this.maxAtLargeMembers = maxAtLargeMembers;
    } 

    @Override
    public String getDescription() {
        return String.format(
                "This committee requires %d at-large members",
                maxAtLargeMembers);
    }

    @Override
    public boolean isValidMember(Committee committee, Staff faculty) {
        return (committee.numAtLargeMembers() < maxAtLargeMembers);
    }
}
