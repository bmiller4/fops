package db.rules;

import db.*;

/**
 * Interface for committee rules.
 */
public interface Rule {

    /**
     * Get a human-readable description of the rule.
     * @return a String containing a description of the rule
     */
    public String getDescription();
    
    /**
     * Get a String description of the limit imposed by the rule.
     */
    public String getLimit();

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
