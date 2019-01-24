package StepDef;


import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import PageObjects.RegistrationPage;
import Resource.base;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
//import cucumber.api.junit.Cucumber;
//import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Objects;

import static java.util.Objects.requireNonNull;

//@RunWith(Cucumber.class)
public class StepDefination  extends base {

                          //GENERAL


    @Given("^I Initialize the browser with Chrome and Navigate to \"([^\"]*)\" Site$")
    public void i_initialize_the_browser_with_chrome_and_navigate_to_something_site(String strArg1) throws Throwable {
        driver =initializeDriver();
        driver.get( strArg1 );
    }


    @And("^click on sign in button and land on Authentication page$")
    public void click_on_sign_in_button_and_land_on_authentication_page() throws Throwable {
       HomePage H=new HomePage( driver );
       H.signinbutton().click();



    }
                            //REGISTRATION


    @When("^I enter my email (.+) and click on create account,Registration page is displayed$")
    public void i_enter_my_email_and_click_on_create_accountregistration_page_is_displayed(String username) throws Throwable {
        LoginPage L= new LoginPage( driver );
        L.enteremail().sendKeys( username );
        L.createaccount().click();
    }


    @And("^I enter the required personal information and click Register$")
    public void i_enter_the_required_personal_information_and_click_register() throws Throwable {
        RegistrationPage R =new RegistrationPage(driver);
       // Select Select = new Select(R.DayofBirth());
        //Select.selectByValue("03");

//Personal Information
        R.TitleMr().click();
        R.Firstname().sendKeys( "Sam" );
        R.Lastname().sendKeys("tom"  );
        //R.email().isDisplayed();
        R.Password().sendKeys( "Blackgold1" );
        R.DayofBirth().sendKeys( "3" );
        R.MonthofBirth().sendKeys( "June" );
        R.YearofBirth().sendKeys( "1980" );
        R.NewsLetters().click();
        R.Offers().click();

        //Address section


        R.AdCompany().sendKeys( "tinsel limited" );
        R.AdAddress1().sendKeys( "1 Blandford rd" );
        R.AdAddress2().sendKeys( "Salford" );
        R.City().sendKeys( "Manchester" );
        R.State().sendKeys( "Arizona" );
        R.ZipPostalCode().sendKeys( "12345" );
        R.Additionalinfo().sendKeys( "please call" );
        R.Homephone().sendKeys( "0123456786" );
        R.Mobilephone().sendKeys( "0793456787" );
        R.Register().click();


    }

    @Then("^My account is successfully created and my account page is displayed$")
    public void my_account_is_successfully_created_and_my_account_page_is_displayed() throws Throwable {

        MyAccountPage Shop = new MyAccountPage(driver);
        Shop.AccountPage().isDisplayed();
       driver.close();
      driver.quit();


    }




                  //LOG IN AND ADD PRODUCT TO CART

    @When("^I enter my (.+) and (.+) and click sign in$")
    public void i_enter_my_and_and_click_sign_in(String username, String password) throws Throwable {
        LoginPage L= new LoginPage( driver );
        L.RegEmail().sendKeys( username );
        L.RegPassword().sendKeys(  password);
        L.Signin().click();
    }


    @And("^I Successfully logged in, selected Dresses and Evening Dresses and click on add to cart$")
    public void i_successfully_logged_in_selected_dresses_and_evening_dresses_and_click_on_add_to_cart() throws Throwable {
        MyAccountPage Shop = new MyAccountPage(driver);
        Shop.SelectDresses().click();
        Shop.EveningDress().click();
        Shop.highDress().click();
        Shop.AddDresstoCart().click();





    }
    @Then("^Item is then Displayed in cart$")
    public void item_is_then_Displayed_in_cart() throws Throwable {

        MyAccountPage Shop = new MyAccountPage(driver);
        //Shop.ContinueShop().isDisplayed();
       Shop.ContinueShop().click();
       // Shop.AddDresstoCart().isDisplayed();


    }
    @And("^I logged out$")
    public void i_logged_out() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        MyAccountPage Shop = new MyAccountPage(driver);
       Shop.Signout().click();
       driver.close();
        driver.quit();




    }

    //RE-LOGIN AND CHECK IF PRODUCT IS STILL IN CART

    @Then("^I Successfully logged in to check my cart but empty cart displayed$")
    public void i_successfully_logged_in_to_check_my_cart_but_empty_cart_displayed() throws Throwable {
        MyAccountPage Shop = new MyAccountPage(driver);
        Shop.CartIsEmpty().click();
        driver.close();
       driver.quit();
    }


}






