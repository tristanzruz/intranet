package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import testdata.TestConstants;
//import pages.EticaPage;

public class HomePage extends  BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }



    public  void goToHomePage (){

        driver.get(TestConstants.TestData.HOME_PAGE_URL);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3")));
    }


    public void clickOverMenuOption(){

        click(menuOpt);

    }

    public  EticaPage  clickOverEticaMenuOption (){

        click(menubtnint);
        return new PageFactory().initElements(driver,EticaPage.class);

    }

    /********Testing IT Menu Items***



     /***


    /********Selectors***/

    @FindBy(how = How.CLASS_NAME, using = "btnSignIn")
    public WebElement signInButton;

    @FindBy(how = How.ID, using ="mega-menu-item-1770")
    public WebElement menuOpt;

    @FindBy(how = How.ID,using = "mega-menu-item-48364")
    public  WebElement menubtnint;


    /***IT Menu Items**/

    @FindBy(how = How.ID, using = "mega-menu-item-649")
    public WebElement menuCorporativo;

    @FindBy(how = How.ID, using = "mega-menu-item-40524")
    public WebElement subMenuIT;






}

