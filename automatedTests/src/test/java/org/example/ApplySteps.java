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

    @Given("on '$page'")
    private void givenOnPage(String page){
        asse
        String title = driver.getTitle();
        System.out.println("is called");
        System.out.println(title);
    }

    @When("'$button' is selected")
    private void whenButtonIsSelected(String button){

    }

    @When("'$button' is clicked")
    private void whenButtonIsClicked(String button){
    }

    @Then("navigated to '$page'")
    private void whenButtonIsClicked(){
    }

    @AfterScenario
    public void afterScenario() {
        driver.quit();
    }
}
