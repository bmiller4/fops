/**
 * Rule specifying how many at-large members a committee should contain.
 */

package db.rules;

import db.*;

public class NumberAtLargeMembersRule implements Rule {

    private int maxAtLargeMembers;
    private static String description =
            "Number of at-large members on committee";

    public NumberAtLargeMembersRule(int maxAtLargeMembers) {
        this.maxAtLargeMembers = maxAtLargeMembers;
    } 

    @Override
    public String getDescription() {
        return description;
        /*
        return String.format(
                "This committee requires %d at-large members",
                maxAtLargeMembers);
        */
    }

    @Override
    public String getLimit() {
        return (new Integer(maxAtLargeMembers)).toString();
    }

    @Override
    public boolean isValidMember(Committee committee, Staff faculty) {
        return (committee.numAtLargeMembers() < maxAtLargeMembers);
    }
}
