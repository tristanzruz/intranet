package tests;

import commonComponents.MenuTop;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pages.EticaPage;
import pages.HomePage;
import pages.LogInPage;


public class HomePageTests extends BaseTest {

    HomePage homePage;
    MenuTop menuTop;

    @Test()

    public void gotoHomePage () throws Exception {

        //homePage.goToHomePage();

        page.GetInstance(HomePage.class).goToHomePage();



        Thread.sleep(1000);

        //page.GetInstance(HomePage.class).clickOverMenuOption();

        page.GetInstance(MenuTop.class).mouseOverMenuPrincipal();
        Thread.sleep(1000);
       //page.GetInstance(HomePage.class).clickOverEticaMenuOption();
        page.GetInstance(MenuTop.class).mouseOverSubmenuIT();
        Thread.sleep(1000);
        page.GetInstance(MenuTop.class).mouseOverSubMenuPoliticas();
        Thread.sleep(1000);
        page.GetInstance(MenuTop.class). clickOverSubmenuIT();
        Thread.sleep(2000);
        page.GetInstance(LogInPage.class). fillUserInput();
        Thread.sleep(1000);
        page.GetInstance(LogInPage.class). fillPassWordInput();
        Thread.sleep(1000);
        page.GetInstance(LogInPage.class). clickOverStayConnectedCheckBox();
        Thread.sleep(1000);
        page.GetInstance(LogInPage.class).clickOverSignInButton();
        Thread.sleep(1000);
    }


    public void navigateToEticaPage() throws Exception{


        page.GetInstance(HomePage.class).clickOverEticaMenuOption();
    }
}
