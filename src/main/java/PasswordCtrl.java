public class PasswordCtrl {

    public static boolean containsUpperCaseCharacter(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (Character.isUpperCase(string.charAt(i))){
                return true;
            }
        }
        return false;
    }
    public static boolean containsLowerCaseCharacter(String string){
        for (int i = 0; i < string.length(); i++) {
            if(Character.isLowerCase(string.charAt(i))){
                return true;
            }
        }
        return false;
    }


    public static boolean checkPassword(String password) {
        //if(password.length() >= 8 && password.length() <= 25){
           // return true;
        return checkLength(password) && containsLowerCaseCharacter(password)
                && containsUpperCaseCharacter(password)
                && checkDigit(password);

    }
    public static boolean checkLength(String password){
        return password.length() >= 8 && password.length() <= 25;
    }
    public static boolean checkDigit(String input){
        for (char chr : input.toCharArray())
             if(Character.isDigit(chr))
                 return true;
        return false;
        }
    }
