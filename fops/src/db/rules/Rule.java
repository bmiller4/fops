/**
 * Interface for committee rules.
 */

package db.rules;

import db.*;

public interface Rule {

//    public final String description;

    /**
     * Get a human-readable description of the rule.
     * @return a String containing a description of the rule
     */
    public String getDescription();

    /**
     * Determine whether a faculty member can be on a committee, based on
     * the rule.
     * 
     * @param committee the committee to check for membership validity in
     * @param faculty for whom membership is in question
     * @return  true if the faculty member may be on the committee,
     *          false otherwise
     */
    public boolean isValidMember(Committee committee, Staff faculty);
}
