public class PasswordCtrl {
    public static boolean checkPassword(String password) {
        return password.length() >= 8 && password.length() <= 25;
    }

}
