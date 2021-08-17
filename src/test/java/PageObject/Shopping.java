package PageObject;

import Utilities.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Shopping extends BasePage {
    public WebDriver driver;
    public WebDriver ldriver;

    public Shopping(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(xpath = "//a[@class='login']")
    WebElement signIn;
    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailForCreateAccount;
    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]/span")
    WebElement createAccountBtn;
    @FindBy(xpath = "//h3[contains(text(), 'Your personal information')]//parent::div")
    WebElement personalInformationtext;
    @FindBy(xpath = "//input[@id='id_gender1']")
    WebElement radioBtnMr;
    @FindBy(xpath = "//input[@id='id_gender2']")
    WebElement radioBtnMrs;
    @FindBy(xpath = "//input[@id='customer_firstname']")
    WebElement custFirstNameForCreateAccount;
    @FindBy(xpath = "//input[@id='customer_lastname']")
    WebElement custLastNameForCreateAccount;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement pass;
    @FindBy(xpath = "//select[@id='days']")
    WebElement day;
    @FindBy(xpath = "//select[@id='months']")
    WebElement month;
    @FindBy(xpath = "//select[@id='years']")
    WebElement years;
    @FindBy(xpath = "//input[@id='firstname']")
    WebElement firstNameForAddress;
    @FindBy(xpath = "//input[@id='lastname']")
    WebElement lastNameForAddress;
    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressLine1;
    @FindBy(xpath = "//input[@id='address2']")
    WebElement addressLine2;
    @FindBy(xpath = "//input[@id='city']")
    WebElement city;
    @FindBy(xpath = "//select[@id='id_state']")
    WebElement state;
    @FindBy(xpath = "//input[@id='postcode']")
    WebElement postCode;
    @FindBy(xpath = "//input[@id='phone_mobile']")
    WebElement mobileNo;
    @FindBy(xpath = "//span[contains(text(), 'Register')]")
    WebElement registerBtn;
    @FindBy(xpath = "//input[@id='email']")
    WebElement eMail;
    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwd;
    @FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
    WebElement signInBtn;
    @FindBy(xpath = "//a[@title='Women']")
    WebElement  womenText;
    @FindBy(xpath ="//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[1]/ul/li[1]/a")
    WebElement  Tshirts;
    @FindBy(xpath="//a[@title ='Blouses']")
    WebElement blouses;
    @FindBy(xpath="//div[@class='product-container']")
    WebElement productContainer;
    @FindBy(xpath ="//span[contains(text(),'Add to cart')]")
    WebElement addToCartBlouses;
    @FindBy(xpath ="//span[contains(text(),'Proceed to checkout')]")
    WebElement  proceedToCheckout1;
    @FindBy(xpath ="//p[@class='cart_navigation clearfix']//span[contains(text(),'Proceed to checkout')]")
    WebElement  proceedToCheckout2;
    @FindBy(xpath ="//p[@class='cart_navigation clearfix']//span[contains(text(),'Proceed to checkout')]")
    WebElement  proceedToCheckout3;
    @FindBy(xpath ="//input[@type='checkbox']")
    WebElement  termsofServiceCheckBox;
    @FindBy(xpath ="//p[@class='cart_navigation clearfix']//span[contains(text(),'Proceed to checkout')]")
    WebElement  proceedToCheckout4;
    @FindBy(xpath ="//a[contains(text(),'Pay by bank wire ')]")
    WebElement  payByBankWire;
    @FindBy(xpath ="//span[contains(text(),'I confirm my order')]")
    WebElement  confirmOrder;

    public void launchURL() {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    public void signIn() {

        signIn.click();
    }

    public void createAccount() {
        emailForCreateAccount.clear();
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10000);
        emailForCreateAccount.sendKeys("Sanket" + randomInt + "@gmail.com");
        createAccountBtn.click();
    }

    public void enterPersonalDetails(String first_name, String last_name, String password) throws InterruptedException {
        Thread.sleep(3000);
        radioBtnMrs.click();
        custFirstNameForCreateAccount.sendKeys(first_name);
        custLastNameForCreateAccount.sendKeys(last_name);
        pass.sendKeys(password);
        selectByValue(day,"15");
        selectByValue(month, "10");
        selectByValue(years, "1991");
    }
    public void enterPersonalAddress(String Address_line1, String Address_line2, String City, String Postcode){
        Random randomGenerator = new Random();
        int randomInt1 = randomGenerator.nextInt(100000000);
        addressLine1.sendKeys(Address_line1);
        addressLine2.sendKeys(Address_line2);
        city.sendKeys(City);
        selectByValue(state, "9");
        postCode.sendKeys(Postcode);
        mobileNo.sendKeys("91"+randomInt1);
        registerBtn.click();
    }

    public void enterCredentials(String email,String password){
        eMail.sendKeys(email);
        passwd.sendKeys(password);
        signInBtn.click();
    }

    public void mouseHoverOnWomenText() throws InterruptedException {
        Actions act =new Actions(ldriver);
        act.moveToElement(womenText).perform();
    }
    //    public void selectTshirt(){
//        Tshirts.click();
//    }
    public void selectBlouses() throws InterruptedException {
        Thread.sleep(3000);
        Actions act =new Actions(ldriver);
        blouses.click();
//          act.moveToElement(addToCartBlouses).perform();
//          addToCartBlouses.click();
    }

    public void mouseHoverOnProduct(){
        Actions act = new Actions(ldriver);
        act.moveToElement(productContainer).perform();
    }
    public void addToCartselectBlouses() throws InterruptedException {
        Thread.sleep(3000);
        addToCartBlouses.click();

    }
    public void proceedtoCheckOut1() throws InterruptedException {
        Thread.sleep(3000);
        proceedToCheckout1.click();
    }
    public void proceedToCheckout2() throws InterruptedException {
        Thread.sleep(3000);
        proceedToCheckout2.click();
    }
    public void proceedToCheckout3() throws InterruptedException {
        Thread.sleep(3000);
        proceedToCheckout3.click();
    }
    public void agreeTermsOfService(){
        termsofServiceCheckBox.click();
    }
    public void proceedToCheckout4() throws InterruptedException {
        Thread.sleep(3000);
        proceedToCheckout4.click();
    }
    public void clickPayByBankWire(){
        payByBankWire.click();
    }
    public void confirmOrder(){
        confirmOrder.click();
    }
}
