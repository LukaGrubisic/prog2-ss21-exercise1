import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordCtrlTest {

    //GitHub: https://github.com/LukaGrubisic/prog2-ss21-exercise1

// In Zusammenarbeit mit Mohamad Arastu, Yassin Elwan am 14.3.22
    @Test
    void checkPassword_too_short(){
        boolean actual = PasswordCtrl.checkLength("1234567");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void checkPassword_correct_length(){
        boolean actual = PasswordCtrl.checkLength("123456789");
        boolean expected = true;
        assertEquals(expected, actual);

    }
    @Test
    void checkPassword_too_long(){
        boolean actual = PasswordCtrl.checkLength("123456789012345689012345678901234512345");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    void checkPassword_contains_only_uppercase(){
        boolean actual = PasswordCtrl.containsUpperCaseCharacter("ABCDEFGHIJKLMNO");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void checkPassword_contains_only_lowercase(){
        boolean actual = PasswordCtrl.containsLowerCaseCharacter("abcdefghijklmn");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void checkPassword_contains_lowercase_false() {
        boolean actual = PasswordCtrl.containsLowerCaseCharacter("ABCDEFGHIJKLMNO");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void checkPassword_contains_only_uppercase_false(){
        boolean actual = PasswordCtrl.containsUpperCaseCharacter("abcdefghijklmno");
        boolean expected = false;
        assertEquals(expected, actual);
    /*@Test - nicht mehr notwendig
    void checkPassword_contains_lowercase_and_uppercase(){
        boolean actual = PasswordCtrl.checkPassword("Hallowelten");
        boolean expected = true;
        assertEquals(expected, actual);*/
    }

    @Test
    void checkPassword_no_numbers(){
        boolean actual = PasswordCtrl.checkDigit("Halloweltenabc");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    void checkPassword_contains_numbers(){
        boolean actual = PasswordCtrl.checkDigit("Hallowelten123");
        boolean expected = true;
        assertEquals(expected, actual);

    }
    @Test
    void checkPassword_no_special_symbols(){
        boolean actual = PasswordCtrl.checkSpecialSymbols("HallomeinNameist1");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    void checkPassword_contains_special_symbols(){
        boolean actual = PasswordCtrl.checkSpecialSymbols("HallomeinNameist1!");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void correctPassword(){
        boolean actual = PasswordCtrl.checkPassword("Hallo1chBinJ@ck");
        boolean expected = true;
        assertEquals(expected, actual);
    }
    @Test
    void incorrectPassword(){
        boolean actual = PasswordCtrl.checkPassword("HelloWorld");
        boolean expected = false;
        assertEquals(expected, actual);
    }


}
