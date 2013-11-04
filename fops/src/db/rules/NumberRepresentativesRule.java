/**
 * Rule specifying how many representative members of each college must be
 * on a committee.
 */

package db.rules;

import db.*;

public class NumberRepresentativesRule implements Rule {

    private String description;
    private int representativesPerCollege;

    public NumberRepresentativesRule(int representativesPerCollege) {
        this.representativesPerCollege = representativesPerCollege;
        description = String.format(
                "This committee requires %d representatives per college.",
                representativesPerCollege);
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isValidMember(Committee committee, Staff faculty) {
        return (committee.numRepresentativesOfCollege(faculty.getCollege())
                < representativesPerCollege);
    }
}
