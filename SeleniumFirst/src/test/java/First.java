import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Users//E5655209//OneDrive - FIS//Desktop//July SDET//Selenium//chrome//chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }
}
