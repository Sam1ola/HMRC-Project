import PageObjects.HomePage;
import PageObjects.LoginPage;
import Resource.base;
import org.junit.Test;

import java.io.IOException;


public class test extends base {
    @Test
    public void ggg() throws IOException {

        driver =initializeDriver();
        driver.get(prop.getProperty("url"));

        HomePage H=new HomePage( driver );
        LoginPage L= new LoginPage( driver );
        H.signinbutton().click();

        L.RegEmail().sendKeys( "tommie163@hotmail.com" );



    }
}
