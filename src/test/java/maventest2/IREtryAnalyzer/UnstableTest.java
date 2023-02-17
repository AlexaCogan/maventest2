package maventest2.IREtryAnalyzer;

import org.testng.Assert;
import org.testng.annotations.Test;


public class UnstableTest {
    private static int attempt = 1;

    @Test(retryAnalyzer = RunUntilSuccess.class)
    public void randomlyFailedTest() {
        if (attempt == 2) {
            attempt = 1;
        } else {
            Assert.fail("Failed on" + (attempt++) + " attempt");
        }
    }
}