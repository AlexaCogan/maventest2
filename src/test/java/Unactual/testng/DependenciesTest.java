package Unactual.testng;

import org.testng.annotations.Test;

public class DependenciesTest {

    // зависимость предполагает не только порядок,
    // но и успешное прохождение теста, от которого текущий зависит
    // тест будет пропущен, так как зависит от test2,
    // а test2 упадет
    @Test(dependsOnMethods = "test2")
    public void test1() {
        System.out.println("test1");
    }

    // Не такая жесткая зависимость. Хоть test2 и упадет,
    // test3 все-равно будет выполнен
    @Test(dependsOnMethods = "test2", alwaysRun = true)
    public void test3() {
        System.out.println("test3");
    }

    @Test
    public void test2() {
        System.out.println("test2");
        throw new Error();
    }
}