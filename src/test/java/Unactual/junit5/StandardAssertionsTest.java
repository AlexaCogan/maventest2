package Unactual.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StandardAssertionsTest {
    private static final String MESSAGE = "информация, которая будет выведена в случае ошибки";

    @Test
    void standardAssertions() {
        assertEquals(5, 5);
        assertTrue(true, MESSAGE);
        assertFalse(false, () -> "Сообщение " + "ввиде " + "лямбды" +
                "." + MESSAGE);
    }
}
