package com.magento.pageObjects;

import com.magento.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class HomePage{


    @FindBy(id = "search")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@title='Search']")
    public WebElement searchButton;

    //search_mini_form

    public void search(String searchKeyword){

        searchBox.sendKeys(searchKeyword + Keys.ENTER);
    }


    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }




}