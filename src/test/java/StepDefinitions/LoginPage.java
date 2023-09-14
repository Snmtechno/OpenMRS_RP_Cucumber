package StepDefinitions;

import Pages.ElementsPage;
import Pages.Parent;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPage {

    ElementsPage ep=new ElementsPage ();
    Parent func= new Parent();

    @Given("User is on the Login page")
    public void user_is_on_the_login_page() {
      GWD.getDriver().get("https://openmrs.org/");
    }

    @When("User successfully logs in")
    public void user_successfully_logs_in() {

        ep.demoButton.click();
        ep.openMrsButton.click();
        ep.enterOpenMrsButton.click();

        ep.userName.click();
        ep.userName.sendKeys("admin");
        ep.password.sendKeys("Admin123");
    }

    @When("User clicks on a random Location button")
    public void user_clicks_on_a_random_location_button() {

        String randomValue = func.getRandomValue();
        WebElement listItem = GWD.getDriver().findElement(By.xpath("//li[@value='" + randomValue + "']"));
        listItem.click();
        ep.loginButton.click();
    }


    @When("User clicks on the {string} button")
    public void user_clicks_on_the_button(String string) {
        ep.registerButton.click();
    }

    @When("User enters the data provided by Customer Data")
    public void user_enters_the_data_provided_by_customer_data() {
        ep.givenName.sendKeys("Techno");
        ep.middleName.sendKeys("Study");
        ep.familyName.sendKeys("Team8");

        ep.continueButton1.click();
        ep.male.click();
        ep.continueButton2.click();
        ep.day.sendKeys("15");

        func.selectByVisibleText(ep.monthSelect, "May");
        ep.year.sendKeys("2023");

        ep.continueButton3.click();

        ep.address1.sendKeys("116 Village");
        ep.address2.sendKeys("Blvd");
        ep.city.sendKeys("Princeton");
        ep.state.sendKeys("NJ");
        ep.countryField.sendKeys("USA");
        ep.postalCode.sendKeys("08540");

        ep.continueButton4.click();
        ep.phoneNumber.sendKeys("609 480 6691");
        ep.continueButton5.click();

        func.selectByVisibleText(ep.relationTypeSelect,"Parent");
        ep.personName.sendKeys("Campus Techno");
        ep.continueButton6.click();


    }

    @When("User clicks on the Confirm button")
    public void user_clicks_on_the_confirm_button() {
        ep.confirm.click();
    }


    @Then("User sees the name and ID of the registered patient on the patient's page")
    public void user_sees_the_name_and_id_of_the_registered_patient_on_the_patient_s_page() {
        func.verifyContainsText(ep.PatientName, "Techno");
        func.verifyContainsText(ep.PatientID, "Patient ID");

    }
    }
