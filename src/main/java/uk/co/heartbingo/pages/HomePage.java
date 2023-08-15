package uk.co.heartbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.heartbingo.utilities.Utility;

public class HomePage extends Utility
{
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement acceptAllCookies;

    @CacheLookup
    @FindBy(xpath = "//a[@class='site-main-nav__item--link bvs-link'][normalize-space()='Bingo']")
    WebElement bingoTab;

    @CacheLookup
    @FindBy(xpath = "//a[@class='site-main-nav__item--link bvs-link'][normalize-space()='Slots']")
    WebElement SlotTab;

    @CacheLookup
    @FindBy(xpath = "//a[@class='site-main-nav__item--link bvs-link'][normalize-space()='Casino']")
    WebElement casinoTab;

    public void clickOnAcceptAllCookies(){
        log.info("clicking on accept all" + acceptAllCookies.toString());
        clickOnElement(acceptAllCookies);

    }

    public void clickOnBingoTab(){
        log.info("clicking on bingo button" + bingoTab.toString());
        clickOnElement(bingoTab);
    }

    public void clickOnSlotsTab(){
        log.info("clicking on slots button" + SlotTab.toString());
        clickOnElement(SlotTab);

    }

    public void clickOnCasinoTab(){
        log.info("clicking on casino button" + casinoTab.toString());
        clickOnElement(casinoTab);
    }
 //  public void click(){}


}
