package Stepdefinations;

import PageObject.Shopping;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ShoppingStepDefination {
    public WebDriver driver;
    public Shopping lp;

    @Given("User launches a browser")
    public void user_launches_a_browser() {
        System.setProperty("webdriver.chrome.driver", "E://chromedriver.exe");
        driver = new ChromeDriver();
        lp = new Shopping(driver);
    }

    @Then("user hits the url")
    public void user_hits_the_url() {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Then("user clicks on sign in")
    public void user_clicks_on_sign_in() {
        lp.signIn();
    }

    @Then("user enters mailId and creates account")
    public void user_enters_mail_id_and_creates_account() {
        lp.createAccount();
    }

    @Then("user enters the personal information as {string}, {string}, {string}")
    public void user_enters_the_personal_information_as(String first_name, String last_name, String password) throws InterruptedException {
        lp.enterPersonalDetails(first_name, last_name, password);
    }
    @Then("user enters address details as {string}, {string},{string}, {string}")
    public void user_enters_address_details_as(String Address_line1, String Address_line2, String City, String Postcode) {
        lp.enterPersonalAddress(Address_line1,Address_line2,City,Postcode);
    }

//    @Then("user enters address details")
//    public void user_enters_address_details() {
//        lp.enterPersonalAddress();
//    }
    @Then("user enters {string} and {string}")
    public void user_enters_and(String email, String password) {
        lp.enterCredentials(email, password);
    }

    @Then("user mousehovers on women category")
    public void user_mousehovers_on_women_category() throws InterruptedException {
        lp.mouseHoverOnWomenText();
    }
//    @Then("user selects an option T-shirts")
//    public void userSelectsAnOptionTShirts() {
//        lp.selectTshirt();
//    }

    @Then("user selects an option Blouses")
    public void user_selects_an_option_Blouses() throws InterruptedException {
        lp.selectBlouses();
    }
    @Then("user mousehovers on a product")
    public void user_mousehovers_on_a_product() {
        lp.mouseHoverOnProduct();
    }
    @Then("user clicks on add to cart")
    public void user_clicks_on_add_to_cart() throws InterruptedException {
        lp.addToCartselectBlouses();
    }

    @Then("user clicks on Proceed to checkout")
    public void user_clicks_on_proceed_to_checkout() throws InterruptedException {
        lp.proceedtoCheckOut1();
    }

    @Then("user Again clicks on Proceed to checkout")
    public void user_again_clicks_on_proceed_to_checkout() throws InterruptedException {
        lp.proceedToCheckout2();
    }

    @Then("user Further clicks on Proceed to checkout")
    public void user_further_clicks_on_proceed_to_checkout() throws InterruptedException {
        lp.proceedToCheckout3();
    }

    @Then("user clicks the checkbox for agrreing the terms")
    public void user_clicks_the_checkbox_for_agrreing_the_terms() {
        lp.agreeTermsOfService();

    }

    @Then("user Finally clicks on Proceed to checkout")
    public void user_finally_clicks_on_proceed_to_checkout() throws InterruptedException {
        lp.proceedToCheckout4();
    }

    @Then("user clicks on Pay by bank wire")
    public void user_clicks_on_pay_by_bank_wire() {
        lp.clickPayByBankWire();
    }
    @Then("User confirms the order")
    public void user_confirms_the_order() {
        lp.confirmOrder();
    }


}
