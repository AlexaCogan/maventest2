package Unactual.junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SimpleTaggingTest {

    @Test
    @Tag("WEB")
    void testingWEB() {
        Assertions.assertEquals(1 + 1, 2);
    }

    @Test
    @Tag("IOS")
    void testingIOS() {
        Assertions.assertEquals(1 + 2, 3);
    }

    @Test
    @Tag("ANDROID")
    void testingANDROID() {
        Assertions.assertEquals(1 + 3, 4);
    }

}
