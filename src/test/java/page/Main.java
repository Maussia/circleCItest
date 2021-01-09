package page;

import org.openqa.selenium.WebDriver;

public class Main extends BasePage {
 String URL = "https://www.mail.ru/";

    public Main(WebDriver driver) {
        super(driver);
    }
    public Main goTo (){
        driver.get(URL);
        return this;
    }
}
