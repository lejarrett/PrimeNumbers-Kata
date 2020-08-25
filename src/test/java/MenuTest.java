import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MenuTest {

    @Test
    void getNumsFromUser() {

        Menu menu = new Menu();
        Assertions.assertArrayEquals(new String[]{"1","10"},menu.getNumsFromUser("1","10"));
    }
}