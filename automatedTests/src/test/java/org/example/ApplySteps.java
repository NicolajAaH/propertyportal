package org.example;

import org.jbehave.core.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplySteps {

    public ApplySteps() {
    }

    WebDriver driver;

    @BeforeScenario
    public void scenarioSetup() {
        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    }

    @Given("on $page")
    public void givenOnPage(String page){
        String title = driver.getTitle();
        driver.findElement()

    }

    @When("'$button' is selected")
    public void whenButtonIsSelected(String button){

    }

    @When("'$button' is clicked")
    public void whenButtonIsClicked(String button){
    }

    @Then("navigated to '$page'")
    public void whenButtonIsClicked(){
    }

    @AfterScenario
    public void afterScenario() {
        driver.quit();
    }
}
