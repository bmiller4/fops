

public class NumberAtLargeMembersRule implements Rule {

    private int maxAtLargeMembers;
    private String description;

    public NumberAtLargeMembersRule(int maxAtLargeMembers) {
        this.maxAtLargeMembers = maxAtLargeMembers;
        description = String.format(
                "This committee requires %d at-large members",
                maxAtLargeMembers);
    } 

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isValidMember(Committee committee, Staff faculty) {
        return (committee.numAtLargeMembers() < maxAtLargeMembers);
    }
}
