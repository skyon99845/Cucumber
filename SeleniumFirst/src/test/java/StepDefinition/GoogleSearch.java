package StepDefinition;



import PageFactoryModel.Google;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GoogleSearch {

    public static WebDriver driver;
    public static Google obj;
    String ActualTitle;

//    @Before public void setup()
//    {
//        //Initializing the Driver
//        driver = new ChromeDriver();
//        obj= new Google(driver);
//    }
    @Given("Open chrome browser and enter the {string} link")
    public void openChromeBrowserAndEnterTheLink(String arg0) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        obj= new Google(driver);
        obj.visit();
        System.out.println("Welcome");
    }
    @When("Get the title of the Webpage")
    public void get_the_title_of_the_webpage() {
        System.out.println("The Title Of The Webpage is :"+obj.getTitle());
    }



    @Then("Close the browser")
    public void close_the_browser() {
        obj.quitTitle();
    }

    @After public void lastStep()
    {
        System.out.println("Last Step of the Feature");
    }

}
