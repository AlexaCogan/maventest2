package Unactual.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

// если запускать весь пакет с тестами,
// то будет выполнен @BeforeClass,
// потом все тесты потомка,
// потом @AfterClass,
// потом @BeforeClass,
// потом все тесты другого потомка и т.д.
@Test
public class ClassFixtureTestBase {

    @BeforeClass
    public void baseSetUp() {
        System.out.println("baseSetUp");
    }

    @AfterClass
    public void baseTearDown() {
        System.out.println("baseTearDown");
    }
}