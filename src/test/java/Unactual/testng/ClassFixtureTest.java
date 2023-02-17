package Unactual.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

// сперва сработает @BeforeClass,
// потом прогонятся все тесты,
// а потом сработает @AfterClass
@Test
public class ClassFixtureTest {

    @BeforeClass
    public void setUp() {
        System.out.println("setUp");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("tearDown");
    }

    public void test1() {
        System.out.println("test1");
    }

    public void test2() {
        System.out.println("test2");
    }
}