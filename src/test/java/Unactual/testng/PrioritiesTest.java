package Unactual.testng;

import org.testng.annotations.Test;

public class PrioritiesTest {
    // чем ниже значение параметра priority,
    // тем раньше будет выполнен тест
    @Test(priority = 2)
    public void test1() {
        System.out.println("test1");
    }

    @Test(priority = 1)
    public void test2() {
        System.out.println("test2");
    }
}
