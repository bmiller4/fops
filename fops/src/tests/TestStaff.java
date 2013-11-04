/**
 * Test class for Staff.java
 */

package tests;

import com.google.gson.Gson;
import db.*;
import db.rules.*;

public class TestStaff {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Staff staff = new Staff();

        gson.toJson(staff, System.out);
        System.out.println();
    }
}
