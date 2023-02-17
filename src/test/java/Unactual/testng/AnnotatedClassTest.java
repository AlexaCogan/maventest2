package Unactual.testng;

import org.testng.annotations.Test;

// аннотация может применяться к классу
// в этом случае считается, что все методы в этом классе
// объявлены тестовыми
@Test
public class AnnotatedClassTest {
    public void test1() {
        System.out.println("test1");
    }

    public void test2() {
        System.out.println("test2");
    }

    // не будет запущен, т.к. private
    private void notATest() {
        System.out.println("notATest");
    }

    // не будет запущен, т.к. disabled
    @Test(enabled = false)
    public void disabledTest() {
        System.out.println("disabledTest");
    }
}
