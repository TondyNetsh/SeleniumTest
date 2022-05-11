package stepDefinitions;

import io.cucumber.java.en.*;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class StepDefinitions2 {
    public WebDriver driver;
    @Given("^launch the facebook browser$")
    public void launch_the_facebook_browser() throws Throwable {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\CMDQ1\\IdeaProjects\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
    }
    @Then("^Verify if the title facebook appears on homepage$")
    public void verify_if_the_title_facebook_appears_on_homepage() throws Throwable {

    }
    @And("^close browser$")
    public void close_browser() throws Throwable {
        driver.close();
    }

}

