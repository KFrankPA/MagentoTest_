package com.magento.utilities;

import com.magento.pageObjects.CartPage;
import com.magento.pageObjects.HomePage;
import com.magento.pageObjects.ProductPage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ProjectUtils {
    public static CartPage cartPage = new CartPage();
    public static ProductPage productPage = new ProductPage();

    public static void searchProduct(String productName) {
        cartPage.searchBox.sendKeys(productName + Keys.ENTER);

        // cartPage.searchButton.click(); // second option


        WebElement productLink = Driver.get().findElement(By.linkText(productName));
        productLink.click();

    }

    public static void selectShippingAddress(String country) {
        Select deliveryCountryDropdown = new Select(cartPage.deliveryCountrySelect);
        deliveryCountryDropdown.selectByVisibleText(country);
    }

    public static String getCartTotal() {
        return cartPage.cartTotal.getText();
    }

    public static void updateQuantity(String itemName, int newQuantity) {
        WebElement itemRow = cartPage.cartItemsTable.findElement(By.xpath("//td[contains(text(), '" + itemName + "')]//ancestor::tr"));
        WebElement itemQuantityInput = itemRow.findElement((By) cartPage.quantityInput);
        itemQuantityInput.clear();
        itemQuantityInput.sendKeys(String.valueOf(newQuantity));
        cartPage.cartButton.click();
    }

    public static void addProductToCart(String productName, int quantity) {
        searchProduct(productName);
        setQuantity(quantity);
        addToCart();
        proceedToCheckout();
    }

    public static void selectSize(String selectSize) {
        Select sizeDropdown = new Select(productPage.sizeSelect);
        sizeDropdown.selectByVisibleText(selectSize);
    }


    public static void setQuantity(int quantity) {
        productPage.quantityInput.clear();
        productPage.quantityInput.sendKeys(String.valueOf(quantity));
    }

    public static void addToCart() {
        productPage.addToCartButton.click();
    }

    public static void proceedToCheckout() {
        productPage.proceedToCheckoutButton.click();
    }

    public static void productColor(String green) {
        productPage.green.click();
    }

    public static void productName(String name) {
        productPage.productsName.click();
    }
}

