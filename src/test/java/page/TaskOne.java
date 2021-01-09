package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskOne extends BasePage {

    public TaskOne(WebDriver driver) {
        super(driver);
    }

    public TaskOne fillLoginEmail(String fillloginemail) {

        writeText(By.xpath("//input[@name='login']"), fillloginemail);
        return this;
    }

    public TaskOne selectDomain() {
        Select select = new Select(driver.findElement(By.xpath("//select[@name='domain']")));
        select.selectByValue("@bk.ru");
        WebElement option = select.getFirstSelectedOption();
        assertEquals("@bk.ru", option.getText());
        return this;
    }

    public TaskOne clickForFillPassword() {
        driver.findElement(By.xpath("//button[@class='button svelte-eg964p']")).click();
        return this;
    }

    public TaskOne fillPasswordEmail(String fillpasswordemail) {
        writeText(By.xpath("//input[@name='password']"), fillpasswordemail);
        return this;
    }

    public TaskOne pressButtonLogin() {
        driver.findElement(By.xpath("//button[text()='Войти']")).click();
        return this;
    }

    public TaskOne pressButtonForMessage() {

        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        driver.findElement(By.xpath("//span[@class='compose-button__wrapper']")).isDisplayed();
        driver.findElement(By.xpath("//span[@class='compose-button__wrapper']")).click();
        return this;
    }

    public TaskOne fillEmailRecipient(String fillemailrecipient) {
        writeText(By.xpath("/html/body/div[15]/div[2]/div/div[1]/div[2]/div[3]/div[2]/div/div/div[1]/div/div[2]/div/div/label/div/div/input"), fillemailrecipient);
        return this;
    }

    public TaskOne fillThemeOfEmail(String fillthemeofemail) {
        writeText(By.xpath("//input[@name='Subject']"), fillthemeofemail);
        return this;
    }

    public TaskOne fillMessage(String fillmessage) {
        writeText(By.xpath("//div[@role='textbox']"), fillmessage);
        return this;
    }

    public TaskOne pressButtonSendMessage() {
        driver.findElement(By.xpath("//span[text()='Отправить']")).click();
        return this;
    }

    public TaskOne sendIsCorrect() {
        driver.findElement(By.linkText("Письмо отправлено")).isDisplayed();
        return this;
    }

    public TaskOne pressButtonClose() {
        driver.findElement(By.xpath("/html/body/div[9]/div/div/div[2]/div[2]/div/div/div[1]/span/span")).click();
        return this;
    }

}
