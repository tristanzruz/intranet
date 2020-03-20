package commonComponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import pages.BasePage;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.By;

public class MenuTop extends BasePage {

    public MenuTop(WebDriver driver) {
        super(driver);
    }

    Actions actions =new Actions(driver);

    //**Public Actions

public void mouseOverMenuPrincipal() {
    actions.moveToElement(menuPrincipal).perform();
}

public void mouseOverSubMenuPoliticas(){
    actions.moveToElement(subMenuPoliticas).perform();

}


public void mouseOverSubmenuIT(){

    actions.moveToElement(subMenuIT).perform();
}

    public void clickOverSubmenuIT(){

        subMenuIT.click();
    }

//**Public Actions

//****Selectors

    @FindBy(how = How.ID, using = "mega-menu-item-649")
    public WebElement menuPrincipal;

    @FindBy(how = How.ID, using = "mega-menu-item-40524")
    public WebElement subMenuIT;

    @FindBy(how = How.ID, using = "mega-menu-item-40525")
    public WebElement subMenuPoliticas;




}
