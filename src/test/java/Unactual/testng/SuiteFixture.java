package Unactual.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@Test
public class SuiteFixture {
    private static int sField;

    @BeforeSuite
    public void setUpSuite() {
        System.out.println("setUpSuite");
        sField=100;
    }
    @AfterSuite
    public void tearDownSuite() {
        System.out.println("tearDownSuite");
        sField=0;
        }
}
