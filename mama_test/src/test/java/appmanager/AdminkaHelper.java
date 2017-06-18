package appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

/**
 * Created by axomia on 17.06.2017.
 */
public class AdminkaHelper extends HelperBase {
    public AdminkaHelper(WebDriver wd) {
        super(wd);
    }

    public void areHeaderPresent() {
        areElementPresents(By.cssSelector("h1"));
    }
public List<WebElement> menuList(){
        return listOfElements(By.cssSelector("#app-"));
}
    public List<WebElement> subMenuList(WebElement element){
        return listOfElements(By.xpath("/li[contains(@id,'doc%s')"),element);
    }

}
