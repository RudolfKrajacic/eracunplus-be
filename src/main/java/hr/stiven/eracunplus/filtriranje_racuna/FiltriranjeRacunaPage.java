package hr.stiven.eracunplus.filtriranje_racuna;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

public class FiltriranjeRacunaPage {
    WebDriver driver;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
    WebElement txtFilterNazivPrimatelja;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/input[1]")
    WebElement txtFilterBrojRacuna;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/button[1]")
    WebElement btnPretraziFilter;
    @FindBy(xpath = "//div[@id='valuta']")
    WebElement ddValutaFilter;
    @FindBy(xpath = "//li[normalize-space()='HRK']")
    WebElement btnFilterHRK;
    public FiltriranjeRacunaPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void unesiNazivPrimateljaFilter(String filterNazivPrimatelja) throws InterruptedException {
        Thread.sleep(2000);
        txtFilterNazivPrimatelja.sendKeys(filterNazivPrimatelja);
    }
    public void unesiBrojRacunaFilter(String brojRacunaFilter){
        txtFilterBrojRacuna.sendKeys(brojRacunaFilter);
    }
    public void pretraziFilter(){
        btnPretraziFilter.click();
    }
    public void odabirValuteFilter(){
        ddValutaFilter.click();
    }
    public void odabirHRKFilter(){
        btnFilterHRK.click();
    }

}
