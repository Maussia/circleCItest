package page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import java.util.concurrent.TimeUnit;

public class TestBase {
    String URL = "https://www.mail.ru/";
    WebDriver driver;
    public Main main;
    public TaskOne taskOne;
    public TaskTwo taskTwo;

    @BeforeEach
    public void start(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        main = PageFactory.initElements(driver, Main.class);
        taskOne = PageFactory.initElements(driver, TaskOne.class);
        taskTwo = PageFactory.initElements(driver, TaskTwo.class);
    }
    @AfterEach
    public void finish(){
        driver.quit();
    }

}
