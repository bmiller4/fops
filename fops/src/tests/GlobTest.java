package tests;

import util.Glob;

public class GlobTest {
    public static void main(String args[]) {
        Glob glob = new Glob("Dan* Easter?ing");
        String name;
        String format = "Glob matches%s %s\n";
        String output;
        boolean matches;

        System.out.println(glob.toString());

        name = "Mario Lopez";
        matches = glob.matches(name);
        System.out.printf(format, matches ? "" : " not", name);

        name = "Brennan Miller";
        matches = glob.matches(name);
        System.out.printf(format, matches ? "" : " not", name);

        name = "Daniel Easterling";
        matches = glob.matches(name);
        System.out.printf(format, matches ? "" : " not", name);
        
        name = "daniel easterling";
        matches = glob.matches(name);
        System.out.printf(format, matches ? "" : " not", name);

        glob = new Glob("Money$$Man");
        System.out.println(glob.toString());

        name = "money$$MAN";
        matches = glob.matches(name);
        System.out.printf(format, matches ? "" : " not", name);

        name = "Mario";
        matches = glob.matches(name);
        System.out.printf(format, matches ? "" : " not", name);

        glob = new Glob("ario");
        System.out.println(glob.toString());

        name = "Mario";
        matches = glob.matches(name);
        System.out.printf(format, matches ? "" : " not", name);

        glob = new Glob("*ario");
        System.out.println(glob.toString());

        name = "Mario";
        matches = glob.matches(name);
        System.out.printf(format, matches ? "" : " not", name);

        glob = new Glob("");
        System.out.println(glob.toString());
        name = "Brennan";
        matches = glob.matches(name);
        System.out.printf(format, matches ? "" : " not", name);
    }
}
