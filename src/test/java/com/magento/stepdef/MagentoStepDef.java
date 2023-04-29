package com.magento.stepdef;

import com.magento.pageObjects.HomePage;
import com.magento.pageObjects.ProductPage;
import com.magento.pageObjects.SearchResults;
import com.magento.utilities.ConfigurationReader;
import com.magento.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;


public class MagentoStepDef {

    ProductPage productPage = new ProductPage();
    SearchResults searchResults = new SearchResults();


    @Given("I am on the homepage")
    public void open_the_website() {
        Driver.get().get(ConfigurationReader.getProperty("url"));

    }


    @When("I add {string} to the cart with quanitiy {string}")
    public void iAddToTheCartWithQuanitiy(String productName, String selectQty) throws InterruptedException {

        productPage.search(productName + Keys.ENTER);

        searchResults.firstItem.click();

        searchResults.quantity.clear();
        //  homePage.searchBox.sendKeys(productName);
       searchResults.quantity.sendKeys(selectQty);

       searchResults.greenColor.click();
       Thread.sleep(5000);

       searchResults.addToCart.click();




    }



   /*@When("I add {string} to the cart with quantity {string}")
    public void i_add_to_the_cart_with_quantity(String productName, String quantity, String color) {
        general.searchProduct(productName);
        general.selectSize("Medium");
        general.productColor(color);
        general.setQuantity(4);
        general.addToCart();
        general.proceedToCheckout();
    }

    */


    @When("I select {string} as the shipping address")
    public void i_select_as_the_shipping_address(String shippingAddress) {
        //  general.selectShippingAddress(shippingAddress);
    }

    @Then("the cart total should be {string}")
    public void the_cart_total_should_be(String expectedTotal) {
        //String cartTotal = general.getCartTotal();
        // Assert.assertEquals("$92.00", cartTotal);
    }

    @When("I update the quantity of {string} to {string}")
    public void i_update_the_quantity_of_to(String itemName, int qty) {
        ;//general.updateQuantity(itemName, qty)
    }

    @When("I add to quantity {string} {string} to chart")
    public void i_add_to_quantity_to_chart(String string, String string2) {
//        general.searchProduct("Gwyn Endurance Tee Small Yellow");
//        general.selectSize("Small");
//        general.addToCart();
//        general.proceedToCheckout();
    }

    @When("I add again {string} to the cart with quantity {string}")
    public void i_add_again_to_the_cart_with_quantity(String string, String string2) {
//        general.searchProduct("Quest Lumaflex™ Band");
//        general.addToCart();
//        general.proceedToCheckout();
    }

    @Then("the latest cart total should be {string}")
    public void the_latest_cart_total_should_be(String string) {
//        String cartTotal = general.getCartTotal();
//        Assert.assertEquals("$116.00", cartTotal);
    }


}

    /*
    @Given("I am on the homepage")
    public void i_am_on_the_homepage() throws InterruptedException {
        driver.get("https://magento.softwaretestingboard.com/");
        Thread.sleep(5000);
    }

    @When("I add {string} to the cart with quantity {string}")
    public void i_add_to_the_cart_with_quantity(String string, String string2) {
        productPage = homePage.searchProduct("Gwyn Endurance Tee Medium Green");
        productPage.selectSize("Medium");
        productPage.setQuantity(4);
        productPage.addToCart();
        productPage.proceedToCheckout();

    }

    @When("I select {string} as the shipping address")
    public void i_select_as_the_shipping_address(String string) {
        cartPage = new CartPage(driver);
        cartPage.selectShippingAddress("United Kingdom");
    }

    @Then("the cart total should be {string}")
    public void the_cart_total_should_be(String string) {
        String cartTotal = cartPage.getCartTotal();
        Assert.assertEquals("$92.00", cartTotal);
    }

    @When("I update the quantity of {string} to {string}")
    public void i_update_the_quantity_of_to(String string, String string2) {
        productPage = homePage.searchProduct("Gwyn Endurance Tee Small Yellow");
        productPage.selectSize("Small");
        productPage.addToCart();
        productPage.proceedToCheckout();
        cartPage = new CartPage(driver);    }

    @Then("I add Quest Lumaflex™ Band to the cart with quantity 1")
    public void i_add_Quest_Lumaflex_Band(String string, String string2) {
        productPage = homePage.searchProduct("Quest Lumaflex™ Band");
        productPage.addToCart();
        productPage.proceedToCheckout();
        cartPage = new CartPage(driver);

    }

    @Then("the latest cart total should be {string}")
    public void theLatestCartTotalShouldBe(String arg0) {
        String cartTotal = cartPage.getCartTotal();
        Assert.assertEquals("$116.00", cartTotal);
        tearDown();
    }

    private void tearDown() {
    }

    }

     */