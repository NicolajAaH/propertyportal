package org.example;

import org.jbehave.core.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;


public class ApplySteps {

    public ApplySteps() {
    }

    WebDriver driver;

    private final String url = "file:///Users/nicolajaalykkehansen/ise/propertyportal/html/";

    @BeforeScenario
    public void scenarioSetup() {
        driver = new ChromeDriver();
        driver.get(url + "Frontpage_signed_in.html");
    }

    @Given("on $page")
    public void givenOnPage(String page){
        System.out.println(url + page + ".html");
        driver.get(url + page + ".html");
        assertThat(driver.getCurrentUrl()).isEqualTo(url + page + ".html");
    }

    @When("$button is clicked")
    public void buttonIsClicked(String button){
        driver.findElement(By.id(button)).click();
    }

    @Then("navigated to $page")
    public void navigatedToPage(String page){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        assertThat(driver.getCurrentUrl()).isEqualTo("url" + page + ".html");
    }

    @AfterScenario
    public void afterScenario() {
        driver.quit();
    }
}
