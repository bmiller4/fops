/**
 * A Rule that specifies that members of a committee must be of a minimum
 * rank.
 */

package db.rules;

import db.*;
import db.values.*;

public class MinimumRankRule implements Rule {

    private Rank rank;
    private static String description =
            "Requires a minimum faculty rank";

    public MinimumRankRule(Rank rank) {
        this.rank = rank;
    }

    @Override
    public String getDescription() {
        return description; 
        /*
        return String.format(
                "Members of this committee must have at least rank %s",
                rank.getHumanReadable());
        */
    }

    @Override
    public String getLimit() {
        return rank.toString();
    }

    @Override
    public boolean isValidMember(Committee committee, Staff faculty) {
        return faculty.getRank().ordinal() > rank.ordinal();
    }

}
