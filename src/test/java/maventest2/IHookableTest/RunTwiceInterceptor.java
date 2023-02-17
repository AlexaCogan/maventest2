package maventest2.IHookableTest;

import org.testng.IHookCallBack;
import org.testng.IHookable;
import org.testng.ITestResult;
//если первый тест свалился, то перехватчик
// сообщит об этом и запустит тест ещё раз.
public class RunTwiceInterceptor implements IHookable {
    public void run(IHookCallBack iHookCallBack, ITestResult iTestResult) {
        System.out.println("Starting " + iTestResult.getName());
        iHookCallBack.runTestMethod(iTestResult);
        if (iTestResult.getThrowable() != null) {
            iTestResult.setThrowable(null);
            System.out.println("Second attempt " + iTestResult.getName());
            iHookCallBack.runTestMethod(iTestResult);
        }
    }
}