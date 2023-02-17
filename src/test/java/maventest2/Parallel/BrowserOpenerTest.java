package maventest2.Parallel;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BrowserOpenerTest {
    private String driver;
    //открываем нужный нам браузер ( в зависимости от переданного нам параметра )
    @BeforeClass(alwaysRun = true)
    @Parameters("browser")
    public void startBrowser(String browser) {
        System.out.println("Starting " + browser);
        if (browser.equals("firefox")) {
            driver = "firefox";
        } else if (browser.equals("chrome")) {
            driver = "chrome";
        } else {
            throw new Error("unknown browser" + browser);
        }
    }

    @AfterClass(alwaysRun = true)
    public void stopBrowser() {
        System.out.println("Stopping " + driver);
        if (driver != null) {
            driver = null;
        }
    }
}
