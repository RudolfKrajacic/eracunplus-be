package hr.stiven.eracunplus.kreiraj_racun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.assertEquals;

public class KreirajRacunIzdavateljPage {
    WebDriver driver;
    @FindBy(xpath = "//h1[contains(text(),'Dobrodošli na našu platformu za slanje e-računa!')]")
    WebElement nazivHeaderaIzdavatelja;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/ul[2]/li[1]/a[1]")
    WebElement btnRacun;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement txtNazivTvrtkeIzdavatelja;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
    WebElement txtOIBIzdavatelja;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/input[1]")
    WebElement txtAdresaIzdavatelja;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[6]/div[1]/div[1]/input[1]")
    WebElement txtDrzavaIzdavatelja;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[7]/div[1]/div[1]/input[1]")
    WebElement txtPostanskiBrojIzdavatelja;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/input[1]")
    WebElement txtGradIzdavatelja;

    public KreirajRacunIzdavateljPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void imeHeadera(){
        String headerIzdavatelja = nazivHeaderaIzdavatelja.getText().trim();
        assertEquals("Dobrodošli na našu platformu za slanje e-računa!", headerIzdavatelja);
    }
    public void klikKreirajRacun(){
        btnRacun.click();
    }
    public void unosNazivaTvrtkeIzdavatelja(String naziv){
        txtNazivTvrtkeIzdavatelja.sendKeys(naziv);
    }
    public void unosOIBIzdavatelja(String oibIzdavatelja){
        txtOIBIzdavatelja.sendKeys(oibIzdavatelja);
    }
    public void unosAdreseIzdavatelja(String adresa){
        txtAdresaIzdavatelja.sendKeys(adresa);
    }
    public void unosDrzaveIzdavatelja(String drzava){
        txtDrzavaIzdavatelja.sendKeys(drzava);
    }
    public void unosPostanskogBrojaIzdavatelja(String postanskiBroj){
        txtPostanskiBrojIzdavatelja.sendKeys(postanskiBroj);
    }
    public void unosGradaIzdavatelja(String grad){
        txtGradIzdavatelja.sendKeys(grad);
    }
}
