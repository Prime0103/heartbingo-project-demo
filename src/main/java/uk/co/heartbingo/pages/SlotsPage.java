package uk.co.heartbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.heartbingo.utilities.Utility;

public class SlotsPage extends Utility
{
    private static final Logger log = LogManager.getLogger(SlotsPage.class.getName());

    public SlotsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//a[@aria-label='Magic Jokers']")
    WebElement magicJokers;

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Magic Jokers')]")
    WebElement magicJokersText;

    public void clickOnMagicJokersTab(){
        log.info("clicking on magicJokers Button" + magicJokers.toString());
        clickOnElement(magicJokers);
    }

    public String verifyMagicJokerText(){
        log.info("verify the text Magic Jokers" + magicJokersText.getText());
        return getTextFromElement(magicJokersText);
    }


}
