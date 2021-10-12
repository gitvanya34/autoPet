package com.example.autopetshop.TestCases;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.example.autopetshop.PageObject.MainPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import io.qameta.allure.Description;

import java.util.concurrent.TimeUnit;


public class MainPageTest extends BaseTest{

    @Test
    @Description("Some detailed test description")
    public void addPetPA() throws InterruptedException {
        mainPage.buttonSingIn.click();

        $x("//button[contains(@class, 'ClickableText_clickable_text__1QO8K ClickableText_blue__3ajvq     ')]").click();

        mainPage.inputPhone.shouldBe(visible).click();
        mainPage.inputPhone.sendKeys("9178327683");//убрать в конфиг

        mainPage.inputPassword.shouldBe(visible);
        mainPage.inputPassword.sendKeys("u4BV7iaYzMaS+bF");//убрать в конфиг

        $x("//button[@class= 'Button_mobile__1Qa6Z Button_tablet__2BNdh Button_desktop__H7KtM Button_button__13DxV Button_large__34qP1 Button_orange__1uMmo']")
                .click();


        $x("//iframe[@id='fl-399427']")
                .waitUntil(visible,10000);
        switchTo().frame($x("//iframe[@id='fl-399427']"));
        $x("//button[@class= 'close']")
                .shouldBe(visible).click();
        switchTo().defaultContent();

        $x("//button[@class= 'Button_item__1rK3W UserInfo_name__3Zvc7 action-header-top__user-button Button_item_orange__2kCno Button_item_click__3_Pud ']")
                .shouldBe(visible)
                .scrollTo()
                .click();

//        TimeUnit.SECONDS.sleep(100);
        $x("//li[@class= 'nps-pets-list__item nps-pets-list__add']")
                .shouldBe(visible)
                .scrollTo()
                .click();

        $x(" //input[@aria-label='Имя']")
                .shouldBe(visible).sendKeys("барсик");

        $x("//button[@class='button orange']")
                .shouldBe(visible).click();

    }
//

}
