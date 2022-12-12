package org.example;

import org.jbehave.core.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;


public class Steps {

    public Steps() {
    }

    WebDriver driver;

    @BeforeStories
    public void setup(){
        driver = new ChromeDriver();
    }

    //Change to URL to html pages/website for testing
    private final String url = "file:///Users/nicolajaalykkehansen/ise/propertyportal/html/";


    @Given("I am on the page $page")
    public void givenOnPage(String page) throws InterruptedException {
        driver.get(url + page + ".html");
        assertThat(driver.getCurrentUrl()).isEqualTo(url + page + ".html");
        Thread.sleep(2000);
    }

    @When("I click on $button")
    public void buttonIsClicked(String button){
        driver.findElement(By.id(button)).click();
    }

    @When("I check $checkbox")
    public void checkboxIsChecked(String checkbox) throws InterruptedException {
        driver.findElement(By.id(checkbox)).click();
        Thread.sleep(500);

    }

    @When("I fill $field with $text")
    public void textIsFilled(String field, String text) throws InterruptedException {
        WebElement webElement = driver.findElement(By.id(field));
        webElement.sendKeys(text);
        Thread.sleep(500);

    }

    @Then("the page $page is displayed for me")
    public void navigatedToPage(String page) throws InterruptedException {
        assertThat(driver.getCurrentUrl()).isEqualTo(url + page + ".html");
        Thread.sleep(2000);
    }

    @AfterStories
    public void afterScenario() {
        driver.quit();
    }
}
