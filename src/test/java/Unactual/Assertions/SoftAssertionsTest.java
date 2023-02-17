package Unactual.Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

public class SoftAssertionsTest {
    @Test
    public void testAssertion() {
        System.out.println("testAssertion");
        Assertion s = new Assertion();
        s.assertEquals(2 * 2, 5);
    }

    @Test
    public void testSoftAssert() {
        System.out.println("testSoftAssert");
        SoftAssert s = new SoftAssert();
        // к каждой проверке добавляется комментарий
        s.assertEquals(2 * 2, 3, "Three");
        s.assertEquals(2 * 2, 5, "Five");
        // в самом конце вызываем этот метод, который и будет ронять наш тест,
        // если какая-то из предыдущих проверок завершилась неуспешно
        s.assertAll();
    }
}
