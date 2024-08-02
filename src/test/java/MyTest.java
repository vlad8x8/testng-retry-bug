import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.fail;

public class MyTest {

    int tryNumber = 0;
    boolean isRetry = false;

    @Test
    public void test() {
        System.out.println("---------------------------------------------");
        System.out.println("Try number: " + tryNumber++);
        System.out.println("    Is this real retry: " + isRetry);
        if (!isRetry) {
            isRetry = true;
            fail();
        }
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        System.out.println("After method:");
        System.out.println("    Is result thinks that it was retried? " + result.wasRetried());
    }
}
