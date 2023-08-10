package hr.stiven.eracunplus.kreiraj_racun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.assertEquals;

public class DetaljiPage {
    WebDriver driver;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]/span[1]/*[name()='svg'][1]")
    WebElement btnStranicaDetalji;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[1]/h2[1]")
    WebElement nazivHeaderaDetalji;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement txtBrojRacuna;
    @FindBy(xpath = "//div[3]//div[1]//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']")
    WebElement btnDatumIzdavanja;
    @FindBy(xpath = "//button[normalize-space()='31']")
    WebElement btnDanDatumaIzdavanja;
    @FindBy(xpath = "//div[4]//div[1]//div[1]//div[1]//div[1]//div[1]//button[1]//*[name()='svg']")
    WebElement btnRokPlacanja;
    @FindBy(xpath = "//button[@title='Next month']//*[name()='svg']")
    WebElement btnRokPlacanjaIduciMjesec;
    @FindBy(xpath = "//button[normalize-space()='21']")
    WebElement btnDanRokPlacanja;
    @FindBy(xpath = "//div[@id='valuta']")
    WebElement ddValuta;
    @FindBy(xpath = "//li[normalize-space()='EUR']")
    WebElement btnOdabirEUR;
    @FindBy(xpath = "//li[normalize-space()='HRK']")
    WebElement btnOdabirHRK;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/fieldset[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/textarea[1]")
    WebElement txtOpis;

    public DetaljiPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void dolazakaNaDetalji(){
        btnStranicaDetalji.click();
    }
    public void imeHeadera(){
        String headerDetalji = nazivHeaderaDetalji.getText().trim();
        assertEquals("Detalji računa", headerDetalji);
    }
    public void unosBrojaRacunaDetalji(String brojRacunaDetalji){
        txtBrojRacuna.sendKeys(brojRacunaDetalji);
    }
    public void klikDatumIzvadanja(){
        btnDatumIzdavanja.click();
    }
    public void odabirDatumaIzdavanja(){
        btnDanDatumaIzdavanja.click();
    }
    public void klikRokPlacanja(){
        btnRokPlacanja.click();
    }
    public void odabirIducegMjeseca(){
        btnRokPlacanjaIduciMjesec.click();
    }
    public void odabirDanaRokaPlacanja(){
        btnDanRokPlacanja.click();
    }
    public void ddValuta(){
        ddValuta.click();
    }
    public void odabirValuta(){
        btnOdabirHRK.click();
    }
    public void dodajOpis(String opis){
        txtOpis.sendKeys(opis);
    }

}
