/**
 * A Rule that specifies that members of a committee must be of a minimum
 * rank.
 */

package db.rules;

import db.*;

public class MinimumRankRule implements Rule {

    private DataTypes.Rank rank;
    
    public MinimumRankRule(DataTypes.Rank rank) {
        this.rank = rank;
    }

    @Override
    public String getDescription() {
        return String.format(
                "Members of this committee must have at least rank %s",
                rank.getHumanReadable());
    }

    @Override
    public boolean isValidMember(Committee committee, Staff faculty) {
        return faculty.getRank().ordinal() > rank.ordinal();
    }

}
