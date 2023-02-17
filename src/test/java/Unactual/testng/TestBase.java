package Unactual.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class TestBase {

    @BeforeMethod
    public void baseSetUp() {
        System.out.println("baseSetUp");
    }

    @AfterMethod
    public void baseTearDown() {
        System.out.println("baseTearDown");
    }

    // выполнятся фикстуры родителя @Before, фикстуры наследника (если есть) @Before,
    // потом этод метод
    // потом @After наследника (если есть) и @After родителя
    public void baseTest() {
        System.out.println("baseTest");
    }
}
