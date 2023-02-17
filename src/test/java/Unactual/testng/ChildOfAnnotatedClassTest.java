package Unactual.testng;
// несмотря на то, что класс-наследник не помечен
// аннотацией @Test,все его методы,
// также как и у родителя, помеченного @Test,
// будут выполняться
public class ChildOfAnnotatedClassTest extends AnnotatedClassTest{
    public void childTest() {
        System.out.println("childTest");
    }
}
