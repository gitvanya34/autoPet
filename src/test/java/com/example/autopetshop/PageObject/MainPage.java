package com.example.autopetshop.PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {


    public SelenideElement buttonSingIn = $x("//button[contains(@class, 'FirstLine_auth__3thUn FirstLine_item_35__3YK4H action-header-top__auth')]");
    public SelenideElement inputPhone = $x("//input[contains(@class, 'MuiInputBase-input MuiInput-input')]");
    public SelenideElement inputPassword = $x("//input[@class= 'MuiInputBase-input MuiInput-input' and @type='password']");
//    public SelenideElement searchButton = $("[data-test='menu-main-icon-search']");
//    public SelenideElement seeAllToolsButton = $("a.wt-button_mode_primary");
//    public SelenideElement toolsMenu = $x("//div[contains(@class, 'menu-main__item') and text() = 'Developer Tools']");

}
