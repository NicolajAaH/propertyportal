package org.example;

import org.jbehave.core.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;


public class Steps {

    public Steps() {
    }

    WebDriver driver;

    //Change to URL to html pages/website for testing
    private final String url = "file:///Users/nicolajaalykkehansen/ise/propertyportal/html/";

    @BeforeScenario
    public void scenarioSetup() {
        driver = new ChromeDriver();
    }

    @Given("on $page")
    public void givenOnPage(String page){
        driver.get(url + page + ".html");
        assertThat(driver.getCurrentUrl()).isEqualTo(url + page + ".html");
    }

    @When("$button is clicked")
    public void buttonIsClicked(String button){
        driver.findElement(By.id(button)).click();
    }

    @When("$checkbox is checked")
    public void checkboxIsChecked(String checkbox){
        driver.findElement(By.id(checkbox)).click();
    }

    @When("$field is filled with $text")
    public void textIsFilled(String field, String text){
        WebElement webElement = driver.findElement(By.id(field));
        webElement.sendKeys(text);
    }

    @Then("navigated to $page")
    public void navigatedToPage(String page){
        assertThat(driver.getCurrentUrl()).isEqualTo(url + page + ".html");
    }

    @AfterScenario
    public void afterScenario() {
        driver.quit();
    }
}
