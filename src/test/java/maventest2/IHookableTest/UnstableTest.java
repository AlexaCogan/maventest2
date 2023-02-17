package maventest2.IHookableTest;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(RunTwiceInterceptor.class)
public class UnstableTest {
    private static int attempt = 1;

    @Test
    public void randomlyFailedTest() {
        if (attempt == 2) {
            attempt = 1;
        } else {
            Assert.fail("Failed on" + (attempt++) + " attempt");
        }
    }
}