package ExtendResport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.annotations.Test;

    public class extendReportFile {
        @Test
        public void extendTest()
        {
            ExtentReports extent = new ExtentReports();
            ExtentSparkReporter spark = new ExtentSparkReporter("ReportFile/TestIndex.html");
            extent.attachReporter(spark);



            spark.config().setTheme(Theme.DARK);
            spark.config().setDocumentTitle("Shubham Automation Report");
            spark.config().setReportName("Shubham Report");


            ExtentTest test = extent.createTest("Shubham Login").assignAuthor("Shubham");
            test.pass("Login To Google");
            test.info("URL is loaded");
            test.info("Values added");
            test.pass("Login test passed successfully");


            test.pass("Login To MSN");
            test.info("URL is loaded");
            test.info("Values added");
            test.pass("Login test passed successfully");


            extent.flush();
    }

}
