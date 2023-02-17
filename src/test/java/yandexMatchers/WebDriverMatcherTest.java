package yandexMatchers;
import com.google.inject.Inject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import ru.sbtqa.tutorials.xunit.yandexmatchers.core.modules.DriverModule;
import ru.sbtqa.tutorials.xunit.yandexmatchers.core.pages.Google;
import ru.yandex.qatools.matchers.decorators.TimeoutWaiter;
import ru.yandex.qatools.matchers.webdriver.RefreshPageAction;
import ru.yandex.qatools.matchers.webdriver.TextMatcher;
import ru.yandex.qatools.matchers.webdriver.driver.CanFindElementMatcher;
import ru.yandex.qatools.matchers.webdriver.driver.HasTextMatcher;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Every.everyItem;
import static ru.yandex.qatools.matchers.decorators.MatcherDecorators.should;
import static ru.yandex.qatools.matchers.decorators.MatcherDecorators.timeoutHasExpired;
import static ru.yandex.qatools.matchers.decorators.WaiterMatcherDecorator.decorateMatcherWithWaiter;
import static ru.yandex.qatools.matchers.webdriver.DisplayedMatcher.displayed;
import static ru.yandex.qatools.matchers.webdriver.EnabledMatcher.enabled;
import static ru.yandex.qatools.matchers.webdriver.ExistsMatcher.exists;
import static ru.yandex.qatools.matchers.webdriver.RefreshPageAction.pageRefresh;
import static ru.yandex.qatools.matchers.webdriver.TagNameMatcher.tagName;
import static ru.yandex.qatools.matchers.webdriver.TextMatcher.text;
import static ru.yandex.qatools.matchers.webdriver.driver.CanFindElementMatcher.canFindElement;
import static ru.yandex.qatools.matchers.webdriver.driver.HasTextMatcher.textOnCurrentPage;

@Guice(modules = {DriverModule.class})
public class WebDriverMatcherTest {

    @Inject
    private Google google;

    @Inject
    private WebDriver driver;

    @Inject
    private Actions actions;

    @BeforeMethod
    public void setUp() {
        google.goTo();
    }
