package maventest2.ParamTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ParametrizedTests {
    // здесь указываем наш dataProvider (имя метода, предоставляющего данные для тестов)
    @Test(dataProvider = "users")
    public void test1(String user, String password) {
        System.out.println(user + ": " + password);
    }

    // либо в качестве возвращаемого значения можно
    // cказать просто Object[][]
    @DataProvider
    public Iterator<Object[]> users() {
        List<Object[]> data = new ArrayList<Object[]>(){{
            add(new Object[]{"admin", "admin"});
            add(new Object[]{"guest", "guest"});
            for (int i = 0; i < 10; i++) {
                add(new Object[]{generateRandomName(), generateRandomPassword()});
            }
        }};
        return data.iterator();
    }

    // тест с данными из файла
    // в качестве провайдера используется другой класс
    @Test(dataProviderClass = FileDataProvider.class, dataProvider = "loadUserFromFile")
    public void test2(String user, String password) {
        System.out.println("test with data from file: " + user + "; " + password);
    }

    private Object generateRandomPassword() {
        return "password" + new Random().nextInt();
    }

    private Object generateRandomName() {
        return "user" + new Random().nextInt();
    }
}
