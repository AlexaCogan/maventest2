package maventest2.ParamTest;

import org.testng.annotations.*;

public class ParametersTest {

    // параметры объявлены в parameters-suite.xml
    @BeforeTest(alwaysRun = true)
    //передаём название параметров
    @Parameters("browser")
    //!!!Количество параметров в аннотации @Parameters и в методе должно быть одинаково
    public void beforeTest(String browser) {
        System.out.println("Starting browser: " + browser);
    }

    // Если параметр не всегда передается, то нужно пометить аргумент в функции аннотацией @Optional
    // тогда необходимо проверять его на null
    /*
    @Parameters("sometimesNull")
    public void test(@Optional String sometimesNull)
    */


    @AfterTest(alwaysRun = true)
    public void stopBrowser() {
        System.out.println("Stopping browser");
    }

    @AfterMethod
    public void logout() {
        System.out.println("logout");
    }

    @Test
    @Parameters({"username", "password"})
    public void testLogin(String user, String password) {
        System.out.println("testLogin with user: " + user + " and password: " + password);
    }
}