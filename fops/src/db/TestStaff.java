/**
 * Test class for Staff.java
 */

package db;

import com.google.gson.Gson;

public class TestStaff {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Staff staff = new Staff();

        gson.toJson(staff, System.out);
        System.out.println();
    }
}
