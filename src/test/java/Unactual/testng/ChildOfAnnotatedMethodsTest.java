package Unactual.testng;

import org.testng.annotations.Test;
// класс-наследник также выполнит все тесты базового класса
// (которые сам базовый класс способен выполнить)
public class ChildOfAnnotatedMethodsTest extends AnnotatedMethodsTest {

    @Test

    public void cildTest() {
        System.out.println("cildTest");
    }
}
