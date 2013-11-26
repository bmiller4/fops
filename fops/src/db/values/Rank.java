package db.values;

/**
 * Instructing rank.
 */
public enum Rank {
    LECTURER("lecturer"),
    SENIOR_LECTURER("senior lecturer"),
    INSTRUCTOR("instructor"),
    ASSISTANT_PROFESSOR("assistant professor"),
    ASSOCIATE_PROFESSOR("associate professor"),
    PROFESSOR("professor");

    private final String humanReadable;

    private Rank(String description) {
        humanReadable = description;
    }

    public String getHumanReadable() {
        return humanReadable;
    }
}
