package app.helpers;

import app.models.Student;

public class AuthenticateHelper {

    public static Student current;

    public static void isValid() {
    }

    public static boolean Authenticated() {

        if (current == null) {
            return false;
        } else {
            return true;
        }

    }

    public static Student getCurrent() {
        return current;
    }
}
