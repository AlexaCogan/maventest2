package Unactual.junit5;

import org.junit.jupiter.api.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestTest {
    @Test
    void assertWithHamcrestMatcher() {
        assertThat(10 - 5, equalTo(5));
        assertThat("xUnit is't test framework", stringContainsInOrder(asList("x", "test", "framework")));
        assertThat("Kotlin Appium Android", containsString("Appium"));
        assertThat("Vadim", notNullValue());
    }
}
