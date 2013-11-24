/**
 * Rule specifying how long a committee member must have served at UMW.
 */

package db.rules;

import util.MonthYear;
import db.*;

public class MinimumYearsServiceRule implements Rule {

    private int minYearsService;
    private static String description =
            "Requires a number of years at UMW";

    public MinimumYearsServiceRule(int minYearsService) {
        this.minYearsService = minYearsService;
    }

    @Override
    public String getDescription() {
        return description;
        /*
        return String.format(
                "This committee requires that members have served for %d "
                + "years at UMW.", minYearsService);
        */
    }

    @Override
    public String getLimit() {
        return (new Integer(minYearsService)).toString();
    }

    @Override
    public boolean isValidMember(Committee committee, Staff faculty) {
        return (faculty.getStartDate().timeSince().getYear()
                >= minYearsService);
    }
}
