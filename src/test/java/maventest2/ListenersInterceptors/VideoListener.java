package maventest2.ListenersInterceptors;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class VideoListener implements IInvokedMethodListener {
    //запускаем видеопроигрыватель и создаём файл, в которых будем записывать видео
    //Создаём уникальное название файла, потому что эти методы вызываются до и после каждого тестового метода
    public void beforeInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        //Поскольку мы хотим записывать видео только для тестовых методов, укажем эту проверку.
        if (iInvokedMethod.isTestMethod()) {
            System.out.println("start MediaPlayer");
        }
    }
    //останавливаем видеопроигрыватель и закрываем его, а также закрываем файл, в который записали видео
    public void afterInvocation(IInvokedMethod iInvokedMethod, ITestResult iTestResult) {
        if (iInvokedMethod.isTestMethod()) {
            System.out.println("stop MediaPlayer");
        }
    }
}
