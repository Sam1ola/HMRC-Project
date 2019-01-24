package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {



    public WebDriver driver;

    //By signin=By.cssSelector("a[href*='sign_in']");
    By getSignin=By.className( "login" );

    public HomePage(WebDriver driver) {
        // TODO Auto-generated constructor stub

        this.driver=driver;

    }

    public WebElement signinbutton()
    {
        return driver.findElement(getSignin);
    }

}
