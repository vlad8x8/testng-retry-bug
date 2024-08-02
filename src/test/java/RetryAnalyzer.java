import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    int counter = 0;
    int retryLimit = 2;

    @Override
    public boolean retry(ITestResult result) {
        return ++counter < retryLimit;
    }
}
