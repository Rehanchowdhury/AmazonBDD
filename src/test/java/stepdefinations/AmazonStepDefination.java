package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pageobjects.AmazonHomePageTest;
import pageobjects.GoogleTest;

public class AmazonStepDefination {

    AmazonHomePageTest page=new AmazonHomePageTest();
    @Given("i am in Amazon Home")
    public void i_am_in_Amazon_Home() {
        page.browserSetup();
        page.geTTitle();
     }

    @Then("I am clicking And writing {string}")
    public void i_am_clicking_And_writing(String string) {
        page.click(string);
        String actual="Laptop";
        Assert.assertEquals(actual, string);
    }
   }







