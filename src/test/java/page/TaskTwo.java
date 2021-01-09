package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static java.lang.Thread.sleep;

public class TaskTwo extends BasePage {

    public TaskTwo(WebDriver driver){
        super(driver);
    }

    public TaskTwo clickButtonLogin(){
        driver.findElement(By.xpath("//a[text()='Войти']")).click();
        return this;
    }
    public TaskTwo fillLoginGoogle(String filllogingoogle){
        writeText(By.xpath("//input[@type='email']"), filllogingoogle);
        return this;
    }
    public TaskTwo clickButtonLoginNext() throws InterruptedException {
        sleep(500);
        driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
        return this;
    }
    public TaskTwo fillPasswordGoogle(String fillpasswordgoogle){
        writeText(By.xpath("//input[@type='password']"), fillpasswordgoogle);
        return this;
    }
    public TaskTwo clickButtonPasswordNext(){
        driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
        return this;
    }
}
