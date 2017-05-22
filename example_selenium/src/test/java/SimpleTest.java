import org.junit.Test;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by axomia on 23.05.2017.
 */
public class SimpleTest {
    @Test
    public void simpleTest(){
        FirefoxDriver wd;
        wd=new FirefoxDriver();
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("https://github.com/");
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.quit();

    }
}
