package hr.stiven.eracunplus.kreiraj_racun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StavkePage {
    WebDriver driver;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[3]/span[1]/*[name()='svg'][1]/*[name()='path'][1]")
    WebElement btnstranicaStavke;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/fieldset[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/button[1]")
    WebElement btnDodajStavku;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/fieldset[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
    WebElement txtNazivStavke;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/fieldset[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/input[1]")
    WebElement txtKolicina;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/fieldset[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/input[1]")
    WebElement txtJedinicnaCijena;

    public StavkePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void dolazakNaStavke(){
        btnstranicaStavke.click();
    }
    public void dodajStavku(){
        btnDodajStavku.click();
    }
    public void unesiNazivStavke(String nazivStavke){
        txtNazivStavke.sendKeys(nazivStavke);
    }
    public void unesiKolicinuStavki(Float kolicinaStavki){
        txtKolicina.sendKeys(String.valueOf(kolicinaStavki));
    }
    public void unesiCijenuStavke(Float cijenaStavke){
        txtJedinicnaCijena.sendKeys(String.valueOf(cijenaStavke));
    }
}
