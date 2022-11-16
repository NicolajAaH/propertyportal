package org.example;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ApplyTest {

    WebDriver driver;


    @Test
    public void applyTest(){

        driver = new ChromeDriver();
        //comment the above 2 lines and uncomment below 2 lines to use Chrome
        //System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();

        String baseUrl = "https://habadekuk.dk/dk.php";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title

        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */


        //close Fire fox
        driver.close();
    }

    @Test
    public void createTest(){
    }

    @Given("on '$page'")
    private void givenOnPage(){

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
}
