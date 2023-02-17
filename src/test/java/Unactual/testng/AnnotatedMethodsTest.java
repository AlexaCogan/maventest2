package Unactual.testng;

import org.testng.annotations.Test;

public class AnnotatedMethodsTest {
    // Выполнятся все методы, помеченные аннотацией @Test
    @Test
    public void test1() {
        System.out.println("test1");
    }

    @Test
    public void test2() {
        System.out.println("test2");
    }

    @Test
    public void test3() {
        System.out.println("test3");
    }

    public void notATest() {
        System.out.println("notATest");
    }

    @Test
    private void privateTest() {
        System.out.println("privateTest");
    }

    @Test(enabled = false)
    public void disabledTest() {
        System.out.println("disabledTest");
    }
}
