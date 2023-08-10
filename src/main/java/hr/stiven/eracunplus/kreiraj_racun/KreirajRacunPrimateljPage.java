package hr.stiven.eracunplus.kreiraj_racun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static org.testng.Assert.assertEquals;

public class KreirajRacunPrimateljPage {
    WebDriver driver;
    @FindBy(xpath = "//h2[contains(text(),'Primatelj računa')]")
    WebElement nazivHeaderaPrimatelja;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]")
    WebElement txtNazivTvrtkePrimatelja;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/input[1]")
    WebElement txtOibTvrtkePrimatelja;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/input[1]")
    WebElement txtAdresaPrimatelja;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[6]/div[1]/div[1]/input[1]")
    WebElement txtDrzavaPrimatelja;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[7]/div[1]/div[1]/input[1]")
    WebElement txtPostanskiBrojPrimatelja;
    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/main[1]/form[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[8]/div[1]/div[1]/input[1]")
    WebElement txtGradPrimatelja;

    public KreirajRacunPrimateljPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void nazivStranice(){
        String ime = nazivHeaderaPrimatelja.getText().trim();
        assertEquals("Primatelj računa", ime);
    }
    public void unesiNazivTvrkePrimatelja(String naziv){
        txtNazivTvrtkePrimatelja.sendKeys(naziv);
    }
    public void unesiOIBPrimatelja(String oib){
        txtOibTvrtkePrimatelja.sendKeys(oib);
    }
    public void unestiAdresuPrimatelja(String adresa){
        txtAdresaPrimatelja.sendKeys(adresa);
    }
    public void unesiDrzavuPrimatelja(String drzava){
        txtDrzavaPrimatelja.sendKeys(drzava);
    }
    public void unestiPostanskiBrojPrimatelja(String postanskiBroj){
        txtPostanskiBrojPrimatelja.sendKeys(postanskiBroj);
    }
    public void unesiGradPrimatelja(String grad){
        txtGradPrimatelja.sendKeys(grad);
    }

}
