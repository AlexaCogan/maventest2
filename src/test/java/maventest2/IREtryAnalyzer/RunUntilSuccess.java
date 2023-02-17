package maventest2.IREtryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
//тест будет продолжать выполняться, пока не станет успешным
public class RunUntilSuccess implements IRetryAnalyzer {
    public boolean retry(ITestResult iTestResult) {
        return !iTestResult.isSuccess();
    }
}