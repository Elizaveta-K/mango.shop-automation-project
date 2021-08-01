package manager;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageFactoryManager {

    WebDriver driver;

    public HomePage getHomePage() {return new HomePage(driver);}

    public SalePage getSalePage() {return new SalePage(driver);}

    public NewPage getNewPage() {return new NewPage(driver);}

    public WomenPage getWomenPage() {return new WomenPage(driver);}

    public MenPage getMenPage() {return new MenPage(driver);}

    public KidsPage getKidsPage() {return new KidsPage(driver);}

    public PlusSizePage getPlusSizePage() {return new PlusSizePage(driver);}

    public HeaderPage getHeaderPage() {return new HeaderPage(driver);}

}
