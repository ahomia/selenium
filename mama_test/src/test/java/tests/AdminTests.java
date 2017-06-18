package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by axomia on 17.06.2017.
 */
public class AdminTests extends TestBase {

    @Before
    public void init() throws Exception {
        app.initAdmin();
        app.login().loginAdminka("admin", "admin");
    }


    @Test
    public void AdminTest() {
        List<WebElement> menuList=app.adminka().menuList();
     for (int i=0;i<menuList.size();i++){
         app.adminka().click(menuList.get(i));
         app.adminka().areHeaderPresent();
         app.adminka().wait5();
         List<WebElement> subMuuList=app.adminka().subMenuList(menuList.get(i));
         System.out.println(subMuuList.size());
         for (int j=0;j<subMuuList.size();j++) {
             app.adminka().click(subMuuList.get(j));
             app.adminka().wait5();
             app.adminka().areHeaderPresent();
         }
         app.adminka().back();
         app.adminka().wait5();
         menuList=app.adminka().menuList();

     }

    }

    @After
    public void stop() {
        app.stop();
    }
}
