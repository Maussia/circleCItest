package test;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.junit.jupiter.api.Test;
import page.TestBase;

public class TestOne extends TestBase {

    @Epic("TESTIN FOR SEND EMAIL")
    @Feature(value = "login")

    @Test
    public void firstTest() {
        main.goTo();
        taskOne.fillLoginEmail("egoritchev")
                .selectDomain()
                .clickForFillPassword()
                .fillPasswordEmail("127111aaAA")
                .pressButtonLogin()
                .pressButtonForMessage()
                .fillEmailRecipient("32rus07@mail.ru")
                .fillThemeOfEmail("Тест с ГитХаба")
                .fillMessage("Тест на Junit который запускает нерегулярную задачу по двум ресурсам и одному профилю на Java и бебру не забудь")
                .pressButtonSendMessage()
                .sendIsCorrect()
                .pressButtonClose();


        //   taskTwo.clickButtonLogin()
        //          .fillLoginGoogle("kup4asik@gmail.com")
        //         .clickButtonLoginNext()
        //         .fillPasswordGoogle("malinka19")
        //         .clickButtonPasswordNext();
    }
}
