package hr.stiven.eracunplus.kreiraj_racun;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlacanjePage {
    WebDriver driver;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[5]/span[1]/*[name()='svg'][1]/*[name()='path'][1]")
    WebElement btnStranicaPlacanje;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/fieldset[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement ddNacinPlacanja;
    @FindBy(xpath = "//li[normalize-space()='Gotovinsko']")
    WebElement btnGotovinskoPlacanje;

    public PlacanjePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void dolazakNaPlacanje(){
        btnStranicaPlacanje.click();
    }
    public void ddOdabirNacinaPlacanja(){
        ddNacinPlacanja.click();
    }
    public void odaberiGotovinskoPlacanje(){
        btnGotovinskoPlacanje.click();
    }
    public void spremiRacun(){
        WebElement myElement = driver.findElement(By.xpath("//button[contains(text(),'Spremi račun')]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(myElement).click();
        actions.perform();
    }
}
