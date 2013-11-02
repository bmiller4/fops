/**
 * A Committee
 */

package db;

public class Committee {
    
    private String name;
    private String chair;
    private String secretary;
    private DataTypes.CommitteeType type;

    public Committee(String name) {
        this(name, "", "");
    }

    public Committee(String name, String chair, String secretary) {
        this.name = name;
        this.chair = chair;
        this.secretary = secretary;
    }
}
