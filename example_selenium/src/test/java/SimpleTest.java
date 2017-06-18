import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by axomia on 23.05.2017.
 */
public class SimpleTest {
    WebDriver wd;

    @Before
    public void init() {
        wd = new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://localhost/litecart/admin/.");
    }

    public void login(String username, String password) {
        wd.findElement(By.name("username")).click();
        wd.findElement(By.name("username")).clear();
        wd.findElement(By.name("username")).sendKeys(username);
        wd.findElement(By.name("password")).click();
        wd.findElement(By.name("password")).clear();
        wd.findElement(By.name("password")).sendKeys(password);
        wd.findElement(By.name("login")).click();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

@Test
    @Test
    public void simpleTest() {
        login("admin", "admin");


    }

   @After
    public void stop() {
        wd.quit();
    }
}
