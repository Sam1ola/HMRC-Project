package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public WebDriver driver;


//To Register
    By enteremail=By.id( "email_create" );
    By email=By.id( "email_create" );
    By createaccount=By.id( "SubmitCreate" );

    //To Sign in
    By RegEmail=By.id( "email" );
    By RegPassword=By.id( "passwd" );
    By Signin=By.xpath( "//*[@id=\"SubmitLogin\"]/span" );

    public LoginPage(WebDriver driver) {
        // TODO Auto-generated constructor stub

        this.driver=driver;

    }

    public WebElement enteremail()
    {
        return driver.findElement(enteremail);
    }

    public WebElement createaccount()
    {
        return driver.findElement(createaccount);
    }


    //Sign in
    public WebElement RegEmail()
    {
        return driver.findElement(RegEmail);
    }
    public WebElement RegPassword()
    {
        return driver.findElement(RegPassword);
    }
    public WebElement Signin()
    {
        return driver.findElement(Signin);
    }





}


