package Utilities;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
    public void selectByValue(WebElement element, String value) {
        try {
            org.openqa.selenium.support.ui.Select menu = new Select(element);
            menu.selectByValue(value);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
