package maventest2.ListenersInterceptors;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//первый способ подключения Listener.
// Действует на весь suite, поэтому обычно указывают его в базовом классе.
//@Listeners(VideoListener.class)
public class BrowserVideoRecorder {

    @BeforeClass
    public void startDriver() {
        System.out.println("start Driver");
    }

    @Test
    public void test1() {
        System.out.println("go to site1");
    }

    @Test
    public void test2() {
        System.out.println("go to site2");
    }

    @AfterClass(alwaysRun = true)
    public void stopDriver() {
        System.out.println("stop Driver");
    }
}