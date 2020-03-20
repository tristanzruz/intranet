package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import testdata.TestConstants;

public class LogInPage extends BasePage {


    public LogInPage(WebDriver driver) {
        super(driver);
    }




    public void fillUserInput(){

    userLogInInput.click();
    writeText(userLogInInput, TestConstants.TestData.LOG_IN_USER);

    }

    public void fillPassWordInput(){
        writeText(passLogInIput, TestConstants.TestData.LOG_IN_PASS);
    }

    public  void clickOverStayConnectedCheckBox (){

        stayConnectedCheck.click();

    }


    public void clickOverSignInButton() {

        logInButton.click();
    }




    @FindBy(how = How.ID, using = "username-15")
    public WebElement userLogInInput;

    @FindBy(how = How.ID, using = "user_password-15")
    public WebElement passLogInIput;


    @FindBy(how = How.CLASS_NAME, using = "um-icon-android-checkbox-outline-blank")
    public WebElement stayConnectedCheck;

    @FindBy(how = How.ID, using = "um-submit-btn")
    public WebElement logInButton;


    //***Selectors
}
