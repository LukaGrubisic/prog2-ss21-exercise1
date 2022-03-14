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

}
