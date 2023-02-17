package Unactual.Assertions;


// Все три проверки работают одинаково,
// разница лишь в содержимом логов

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

public class AssertionsTest {
    @Test
    public void testAssertKeyword() {
        System.out.println("testAssertKeyword");
        assert 2 * 2 == 5;
    }

    // в JUnit принято писать сначала ожидаемый результат,
    // а потом - фактический
    @Test (priority = 1)
    public void testAssertJUnit(){
        System.out.println();
        AssertJUnit.assertEquals(5, 2 * 2);
    }

    // в TestNG - наоборот
    @Test
    public void testAssertTestNG() {
        System.out.println("testAssertTestNG");
        Assert.assertEquals(2 * 2, 5);
    }


}
