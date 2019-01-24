package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {

    public WebDriver driver;



    By TitleMr=By.id( "id_gender1" );
    By Firstname=By.id( "customer_firstname" );
    By Lastname=By.id( "customer_lastname" );
    By email=By.id( "tommie163@hotmail.com" );
    By Password=By.id( "passwd" );
    By DayofBirth=By.id( "days" );
    By MonthofBirth=By.id( "months" );
    By YearofBirth=By.id( "years" );
    By NewsLetters=By.id( "newsletter" );
    By Offers=By.id( "optin" );

    //Your address section

    By AdFirstname=By.xpath("//*[@id=\"firstname\"] ");
    By AdLastName=By.id( "lastname" );
    By AdCompany=By.id( "company" );
    By AdAddress1=By.id( "address1" );
    By AdAddress2=By.id( "address2" );
    By City=By.id( "city" );
    By State=By.id( "id_state" );
    By ZipPostalCode=By.id( "postcode" );
    By Country=By.id( "id_country" );
    By Additionalinfo=By.id( "other" );
    By Homephone=By.id( "phone" );
    By Mobilephone=By.id( "phone_mobile" );
    By alias=By.id( "alias" );
    By Register=By.cssSelector("#submitAccount > span");


    public RegistrationPage(WebDriver driver) {
        // TODO Auto-generated constructor stub

        this.driver=driver;
    }
//Personal Information section
    public WebElement TitleMr()
    {
        return driver.findElement(TitleMr);
    }
    public WebElement Firstname()
    {
        return driver.findElement(Firstname);
    }
    public WebElement Lastname()
    {
        return driver.findElement(Lastname);
    }
    public WebElement email()
    {
        return driver.findElement(email);
    }
    public WebElement Password()
    {
        return driver.findElement(Password);
    }
    public WebElement DayofBirth()
    {
        return driver.findElement(DayofBirth);
    }
    public WebElement MonthofBirth()
    {
        return driver.findElement(MonthofBirth);
    }
    public WebElement YearofBirth()
    {
        return driver.findElement(YearofBirth);
    }
    public WebElement NewsLetters()
    {
        return driver.findElement(NewsLetters);
    }
    public WebElement Offers()
    {
        return driver.findElement(Offers);
    }

    //Your address section
    public WebElement AdFirstname()
    {
        return driver.findElement(AdFirstname);
    }
    public WebElement AdLastName()
    {
        return driver.findElement(AdLastName);
    }
    public WebElement AdCompany()
    {
        return driver.findElement(AdCompany);
    }
    public WebElement AdAddress1()
    {
        return driver.findElement(AdAddress1);
    }
    public WebElement AdAddress2()
    {
        return driver.findElement(AdAddress2);
    }
    public WebElement City()
    {
        return driver.findElement(City);
    }
    public WebElement State()
    {
        return driver.findElement(State);
    }
    public WebElement ZipPostalCode()
    {
        return driver.findElement(ZipPostalCode);
    }
    public WebElement Country()
    {
        return driver.findElement(Country);
    }
    public WebElement Additionalinfo()
    {
        return driver.findElement(Additionalinfo);
    }
    public WebElement Homephone()
    {
        return driver.findElement(Homephone);
    }
    public WebElement Mobilephone()
    {
        return driver.findElement(Mobilephone);
    }
    public WebElement alias()
    {
        return driver.findElement(alias);
    }
    public WebElement Register()
    {
        return driver.findElement(Register);
    }
}


