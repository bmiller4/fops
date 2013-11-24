package db.rules;

import db.*;

/**
 * Rule specifying how many representative members of each college must be
 * on a committee.
 */
public class NumberRepresentativesRule implements Rule {

    private int representativesPerCollege;
    private static String description =
            "Number of representatives per college";

    public NumberRepresentativesRule(int representativesPerCollege) {
        this.representativesPerCollege = representativesPerCollege;
    }

    @Override
    public String getDescription() {
        return description;
        /*
        return String.format(
                "This committee requires %d representatives per college.",
                representativesPerCollege);
        */
    }

    @Override
    public String getLimit() {
        return (new Integer(representativesPerCollege)).toString();
    }

    @Override
    public boolean isValidMember(Committee committee, Staff faculty) {
        return (committee.numRepresentativesOfCollege(faculty.getCollege())
                < representativesPerCollege);
    }
}
