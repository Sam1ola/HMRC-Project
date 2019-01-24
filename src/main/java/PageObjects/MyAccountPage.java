package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPage {

    public WebDriver driver;

    //account page displayed
    By AccountPage=By.className( "navigation_page" );

    //Shopping page
    By SelectDresses=By.xpath( "//*[@id=\"block_top_menu\"]/ul/li[2]/a" );
    By highDress=By.cssSelector( ".product_img_link > img:nth-child(1)" );
    By EveningDress=By.xpath( "//*[@id=\"categories_block_left\"]/div/ul/li[2]/a" );
    By AddDresstoCart=By.xpath(  "//*[@id=\"add_to_cart\"]/button/span" );
    //By ItemInCart=By.linkText(  "Add to cart" );




    By Signout=By.className( "logout" );
    By CartIsEmpty=By.className( "ajax_cart_no_product" );


    By ContinueShop=By.cssSelector( "a.btn:nth-child(2)" );


    public MyAccountPage(WebDriver driver) {
        // TODO Auto-generated constructor stub

        this.driver=driver;

    }



    public WebElement SelectDresses()
    {
        return driver.findElement(SelectDresses);
    }
    public WebElement highDress()
    {
        return driver.findElement(highDress);
    }
    public WebElement EveningDress()
    {
        return driver.findElement(EveningDress);
    }
    public WebElement AddDresstoCart()
    {
        return driver.findElement(AddDresstoCart);
    }
    public WebElement Signout()
    {
        return driver.findElement(Signout);
    }
    public WebElement CartIsEmpty()
    {
        return driver.findElement(CartIsEmpty);
    }
    public WebElement AccountPage()
    {
        return driver.findElement(AccountPage);
    }
    public WebElement ContinueShop()
    {
        return driver.findElement(ContinueShop);
    }

}


