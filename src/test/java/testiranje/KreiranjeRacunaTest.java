import hr.stiven.eracunplus.filtriranje_racuna.FiltriranjeRacunaPage;
import hr.stiven.eracunplus.kreiraj_racun.*;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class KreiranjeRacunaTest{
    WebDriver driver;
    KreirajRacunIzdavateljPage kreirajRacunIzdavateljPage;
    KreirajRacunPrimateljPage kreirajRacunPrimateljPage;
    DetaljiPage detaljiPage;
    StavkePage stavkePage;
    PlacanjePage placanjePage;
    FiltriranjeRacunaPage filtriranjeRacunaPage;

    @BeforeTest
    public void setup(){
        System.setProperty("webdrive.gecko.driver", "C:\\SVI ALATI\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        driver.navigate().to("http://localhost:5173/");
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    public void popunjavanjeOsnovnoStraniceIzdavatelj(){
        kreirajRacunIzdavateljPage = new KreirajRacunIzdavateljPage(driver);
        kreirajRacunIzdavateljPage.imeHeadera();
        kreirajRacunIzdavateljPage.klikKreirajRacun();
        kreirajRacunIzdavateljPage.unosNazivaTvrtkeIzdavatelja("HEP");
        kreirajRacunIzdavateljPage.unosOIBIzdavatelja("6492015627323");
        kreirajRacunIzdavateljPage.unosAdreseIzdavatelja("Ulica Vilka Novaka 100");
        kreirajRacunIzdavateljPage.unosDrzaveIzdavatelja("Hrvatska");
        kreirajRacunIzdavateljPage.unosPostanskogBrojaIzdavatelja("42000");
        kreirajRacunIzdavateljPage.unosGradaIzdavatelja("Varaždin");
    }
    @Test(priority = 2)
    public void popunjavanjeOsnovnoStranicePrimatelj() {
        kreirajRacunPrimateljPage = new KreirajRacunPrimateljPage(driver);
        kreirajRacunPrimateljPage.nazivStranice();
        kreirajRacunPrimateljPage.unesiNazivTvrkePrimatelja("FINA");
        kreirajRacunPrimateljPage.unesiOIBPrimatelja("0987654321");
        kreirajRacunPrimateljPage.unestiAdresuPrimatelja("Koturaška 123");
        kreirajRacunPrimateljPage.unesiDrzavuPrimatelja("Hrvatska");
        kreirajRacunPrimateljPage.unestiPostanskiBrojPrimatelja("10000");
        kreirajRacunPrimateljPage.unesiGradPrimatelja("Zagreb");
    }
    @Test(priority = 3)
    public void popunjavanjeDetalji(){
        detaljiPage = new DetaljiPage(driver);
        detaljiPage.dolazakaNaDetalji();
        detaljiPage.imeHeadera();
        detaljiPage.unosBrojaRacunaDetalji("HR12345678");
        detaljiPage.klikDatumIzvadanja();
        detaljiPage.odabirDatumaIzdavanja();
        detaljiPage.klikRokPlacanja();
        detaljiPage.odabirIducegMjeseca();
        detaljiPage.odabirDanaRokaPlacanja();
        detaljiPage.ddValuta();
        detaljiPage.odabirValuta();
        detaljiPage.dodajOpis("Novi opis");
    }
    @Test(priority = 4)
    public void popunjavanjeStavki(){
        stavkePage = new StavkePage(driver);
        stavkePage.dolazakNaStavke();
        stavkePage.dodajStavku();
        stavkePage.unesiNazivStavke("Stavka 1");
        stavkePage.unesiKolicinuStavki(32F);
        stavkePage.unesiCijenuStavke(44F);
    }
    @Test(priority = 5)
    public void popunjavanjePlacanja(){
        placanjePage = new PlacanjePage(driver);
        placanjePage.dolazakNaPlacanje();
        placanjePage.ddOdabirNacinaPlacanja();
        placanjePage.odaberiGotovinskoPlacanje();
        placanjePage.spremiRacun();
    }
    @Test(priority = 6)
    public void filtriranjeRacuna() throws InterruptedException {
        filtriranjeRacunaPage = new FiltriranjeRacunaPage(driver);
        filtriranjeRacunaPage.odabirValuteFilter();
        filtriranjeRacunaPage.odabirHRKFilter();
        filtriranjeRacunaPage.pretraziFilter();
    }
}
