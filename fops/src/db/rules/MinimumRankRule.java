/**
 * A Rule that specifies that members of a committee must be of a minimum
 * rank.
 */

package db.rules;

public class MinimumRankRule implements Rule {

    private DataTypes.Rank rank;
    private final String description;
    
    public MinimumRankRule(DataTypes.Rank rank) {
        this.rank = rank;
        description = String.format(
                "Members of this committee must have at least rank %s",
                rank.getHumanReadable());
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isValidMember(Committee committee, Staff faculty) {
        return faculty.getRank().ordinal() > rank.ordinal();
    }

}
