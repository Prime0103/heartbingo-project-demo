package uk.co.heartbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.heartbingo.utilities.Utility;

public class BingoPage extends Utility
{
    private static final Logger log = LogManager.getLogger(BingoPage.class.getName());

    public BingoPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'All Rooms')]")
    WebElement allRoomText;

    public String verifyTheText(){
        log.info("verify the text on bingo page" + allRoomText.getText());
        return getTextFromElement(allRoomText);

    }

}
