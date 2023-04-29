package com.magento.pageObjects;

import com.magento.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends HomePage{

    @FindBy(id = "deliveryCountry")
    public WebElement deliveryCountrySelect;

    @FindBy(xpath = "//span[contains(@class, 'cart-total')]")
    public WebElement cartTotal;

    @FindBy(id = "cart-button")
    public WebElement cartButton;

    @FindBy(xpath = "//table[contains(@class, 'cart-items')]")
    public WebElement cartItemsTable;

    @FindBy(xpath = "//input[contains(@class, 'cart-qty-input')]")
    public WebElement quantityInput;

    public CartPage() {
        PageFactory.initElements(Driver.get(), this);
    }


}
