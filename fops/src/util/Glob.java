package util;

import java.util.regex.*;

/**
 * A glob-pattern matching class.
 * A glob pattern is a very simple pattern, with two special characters.
 * The first character is "*", which matches any number of any characters.
 * The second character is "?", which matches a single character.
 * Other characters are treated normally, assuming only a String without
 * special control characters is entered.  Since the underlying mechanism
 * is the Java regex engine (Pattern and Matcher), some meta-characters
 * (especially meta-sequences) * may still act as they do for Pattern.
 * However, the typical /[-a-zA-Z0-9.$^]/ characters should all match 
 * literally.
 */
public class Glob {

    private static Pattern metaConverter = Pattern.compile("([.$^])");
    private static String backslash = Matcher.quoteReplacement("\\");

    private Pattern glob;
    private Matcher metaConverterMatcher;
    private String stringRep;

    /**
     * Constructor.  Creates a Glob object based on the given glob pattern.
     * @param   glob the pattern to base the Glob on
     */
    public Glob(String glob) {
        metaConverterMatcher = metaConverter.matcher(glob);
        glob = metaConverterMatcher.replaceAll(backslash + "$1");
        glob = glob.replace("*", ".*").replace("?", ".");
        glob = "^" + glob + "$";
        this.glob = Pattern.compile(glob, Pattern.CASE_INSENSITIVE);
        stringRep = glob.toString().replace(".*", "*").replace(".", "?");
        stringRep = stringRep.substring(1, stringRep.length() - 1);
    }

    /**
     * Determines whether a given string matches the glob pattern.
     * @param   the String to check
     * @return  true if the string matches, false otherwise
     */
    public boolean matches(String str) {
        return glob.matcher(str).matches();
    }

    /**
     * Returns the String representation of the glob pattern.
     * @return  the String representation of the glob pattern
     */
    @Override
    public String toString() {
        return stringRep;
    }
}
