package db.rules;

import db.*;

public class MaxCommitteesPerFaculty implements Rule {
	
    private static String description =
            "Maximum number for various types committees per faculty member";
    private String limit;
    private int university;
    private int standing;
    private int advisoryAndAdHoc;


    public MaxCommitteesPerFaculty() {
        university = 2;
        standing = 1;
        advisoryAndAdHoc = 1;
        limit = String.format("University: %s Standing: %s Advisory/Ad-Hoc: %s",
                university, standing, advisoryAndAdHoc);
    }

    @Override
    public String getDescription() {
        return description;
    }
    
    @Override
    public String getLimit() {
        return limit;
    }

    @Override
    public boolean isValidMember(Committee committee, Staff faculty) {

    }
}
