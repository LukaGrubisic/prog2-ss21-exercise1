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

    // Checks if password is valid
    public static boolean checkPassword(String password) {
        return checkLength(password)
                && containsLowerCaseCharacter(password)
                && containsUpperCaseCharacter(password)
                && checkDigit(password)
                && checkSpecialSymbols(password);

    }
    //Check password length
    public static boolean checkLength(String password){
        return password.length() >= 8 && password.length() <= 25;
    }
    //Check Digit
    public static boolean checkDigit(String input) {
        for (char chr : input.toCharArray())
            if (Character.isDigit(chr))
                return true;
        return false;
        }

    //Check special symbols
    public static boolean checkSpecialSymbols(String input){
        char [] specialSymbols = new char[]{'(',')','#','$','?','!','%','/','@'};
        for (char chr : input.toCharArray())
            for(char chrArray : specialSymbols)
                if (chr == chrArray)
                    return true;
        return false;
        }
    }
