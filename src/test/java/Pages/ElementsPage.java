package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class ElementsPage extends Parent{

    public ElementsPage() {

        PageFactory.initElements(GWD.getDriver(), this);

    }
    @FindBy(css ="a[class='zak-button']")
    public WebElement demoButton;

    @FindBy(xpath = "//span[text()='Explore OpenMRS 2']")
    public WebElement openMrsButton;

    @FindBy(xpath ="//span[text()='Enter the OpenMRS 2 Demo']")
    public WebElement enterOpenMrsButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;

    @FindBy(xpath ="//input[@id='loginButton']")
    public WebElement loginButton;

    @FindBy (linkText= "Register a patient")
    public WebElement registerButton;

    @FindBy(css = "input[name='givenName']")
    public WebElement givenName;

    @FindBy(css = "input[name='middleName']")
    public WebElement middleName;

    @FindBy(css = "input[name='familyName']")
    public WebElement familyName;

    @FindBy(css = "icon.fas.fa-chevron-right")
    public WebElement continueButton1;

    @FindBy(css = "option[value='M']")
    public WebElement male;

    @FindBy(css = "icon.fas.fa-chevron-right")
    public WebElement continueButton2;

    @FindBy(name = "birthdateDay")
    public WebElement day;

    @FindBy(name = "birthdateMonth")
    public WebElement monthSelect;

    @FindBy(name = "birthdateYear")
    public WebElement year;

    @FindBy(css = "icon.fas.fa-chevron-right")
    public WebElement continueButton3;

    @FindBy(id = "address1")
    public WebElement address1;

    @FindBy(id = "address2")
    public WebElement address2;

    @FindBy(id = "cityVillage")
    public WebElement city;

    @FindBy(id = "stateProvince")
    public WebElement state;

    @FindBy(id = "country")
    public WebElement countryField;

    @FindBy(id = "postalCode")
    public WebElement postalCode;

    @FindBy(css = "icon.fas.fa-chevron-right")
    public WebElement continueButton4;

    @FindBy(css = "input[name='phoneNumber']")
    public WebElement phoneNumber;

    @FindBy(css = "icon.fas.fa-chevron-right")
    public WebElement continueButton5;

    @FindBy(id= "relationship_type")
    public WebElement relationTypeSelect;

    @FindBy(css = "input[ng-model='relationship.name']")
    public WebElement personName;

    @FindBy(css = "icon.fas.fa-chevron-right")
    public WebElement continueButton6;

    @FindBy(id = "submit")
    public WebElement confirm;

    @FindBy(css = ".PersonName-givenName")
    public WebElement PatientName;

    @FindBy(xpath = "//em[text()='Patient ID']")
    public WebElement PatientID;

}
