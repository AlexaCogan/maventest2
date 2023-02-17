package Unactual.junit5;

import org.junit.jupiter.api.Test;
import java.util.concurrent.TimeUnit;
import static java.time.Duration.ofMillis;
import static java.time.Duration.ofMinutes;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

class TimeoutExceededTest {
    @Test //Превышение заданного времени нет
    void timeoutNotExceeded() {
        assertTimeout(ofMinutes(2), this::operation);
    }

    @Test //Заданное время превышено
    void timeoutExceeded() {
        assertTimeout(ofMillis(10), this::operation,
                () -> "Операция занимает больше 10 миллисекунд");
    }

    @Test
    void timeoutNotExceededWithResult() {
        String actualResult = assertTimeout(ofMinutes(1), () -> { return "ЕФС"; });
        assertEquals("ЕФС", actualResult);
    }

    private int operation() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        return 4;
    }
}
