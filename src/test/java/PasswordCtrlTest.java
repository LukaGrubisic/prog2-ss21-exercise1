import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordCtrlTest {


    @Test
    void checkPassword_too_short(){
        boolean actual = PasswordCtrl.checkPassword("1234567");
        boolean expected = false;
        assertEquals(expected, actual);
    }

    @Test
    void checkPassword_correct_length(){
        boolean actual = PasswordCtrl.checkPassword("12345678");
        boolean expected = true;
        assertEquals(expected, actual);

    }
    @Test
    void checkPassword_too_long(){
        boolean actual = PasswordCtrl.checkPassword("123456789012345689012345678901234512345");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    void checkPassword_contains_only_uppercase(){
        boolean actual = PasswordCtrl.checkPassword("ABCDEFGHIJKLMNO");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    void checkPassword_contains_only_lowercase(){
        boolean actual = PasswordCtrl.checkPassword("abcdefghijklmn");
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    void checkPassword_contains_lowercase_and_uppercase(){
        boolean actual = PasswordCtrl.checkPassword("Hallowelten");
        boolean expected = true;
        assertEquals(expected, actual);
    }

}
