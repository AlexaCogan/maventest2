package Unactual.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

// все public методы будут выполняться
// за исключением тех, которые описывают фикстуры
// и тех, у которых установлен флаг enabled = false
@Test
public class MethodFixturesTest {

    // будет выполняться перед каждым тестовым методом
    @BeforeMethod
    public void setUp() {
        System.out.println("setUp");
    }

    // будет выполняться после каждого тестового метода
    @AfterMethod
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