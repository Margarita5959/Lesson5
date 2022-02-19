package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



import java.util.concurrent.TimeUnit;


import static io.github.bonigarcia.wdm.WebDriverManager.*;

public class ProjectTest {

    static WebDriver driver;

    @BeforeAll
    static void init() {
        chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        options.addArguments("disable-popup-blocking");
        driver = new ChromeDriver(options);
        driver.get("https://www.sinsay.com/ru/ru/");

    }

    @Test
    void test() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"cookiebotDialogOkButton\"]"));
        webElement.click();

        driver.findElement(By.xpath("//*[@id=\"headerWrapper\"]/div/div[3]/button[1]")).click();

        Assertions.assertDoesNotThrow(() -> driver.navigate().to("https://www.sinsay.com/ru/ru/customer/account/login/#login"),
                "Страница не доступна");
        driver.findElement(By.xpath(".//button[@class='button__ButtonPrimary-zerqf2-0 button__ButtonSecondary-zerqf2-1 gEnmSO hjeEaK']")).click();


        driver.findElement(By.id("email_id")).sendKeys("zattenittippi-8005@yopmail.com");
        driver.findElement(By.id("firstname_id")).sendKeys("Ирина");
        driver.findElement(By.id("lastname_id")).sendKeys("Некрасова");
        driver.findElement(By.id("password_id")).sendKeys("Пароль");
        driver.findElement(By.xpath(".//button[@class='primary__PrimaryButtonComponent-sc-1pct4vx-0 fDECVK']")).click();


    }

    @Test
    void test2() {
        driver.findElement(By.xpath(".//a[@href='https://www.sinsay.com/ru/ru/shop-online']")).click();
        driver.findElement(By.xpath(".//p[@class='sidebar__Title-sc-4xriee-3 dXqanV']/a[@href='https://www.sinsay.com/ru/ru/shop-online/collection/outerwear']")).click();
        driver.findElement(By.xpath(".//div[@class='close']")).click();
        driver.findElement(By.xpath(".//a[@href='https://www.sinsay.com/ru/ru/shop-online/collection/outerwear/denim-jackets']")).click();

        Assertions.assertDoesNotThrow(() -> driver.navigate().to("https://www.sinsay.com/ru/ru/shop-online/collection/outerwear/denim-jackets"),
                "Страница не доступна");
        driver.findElement(By.xpath("//*[@id=\"categoryProducts\"]/article[3]")).click();

    }

    @Test
    void test3() {
        driver.findElement(By.xpath(".//a[@href='https://www.sinsay.com/ru/ru/home']")).click();
        driver.findElement(By.xpath(".//a[@href='https://www.sinsay.com/ru/ru/home/bathroom/categories']")).click();
        driver.findElement(By.xpath(".//div[@class='close']")).click();
        driver.findElement(By.xpath(".//h3[@class='sc-eCstlR iEEdBj es-product-name']/a[@href='https://www.sinsay.com/ru/ru/0948g-90x/dywan-lazienkowy-40x60cm']")).click();
        driver.findElement(By.xpath(".//img[@src='https://www.sinsay.com/media/catalog/product/cache/40/a4e40ebdc3e371adff845072e1c73f37/0/9/0948G-90X-999-1_6.jpg']")).click();
        driver.findElement(By.xpath(".//li[@data-selen-product-id='2760425']")).click();
        driver.findElement(By.xpath(".//span[@class='add-to-cart-prefix']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"cookiebotDialogOkButton\"]"));
        webElement.click();
        driver.findElement(By.xpath(".//button[@data-selen='cart-confirmation-close']")).click();
        driver.findElement(By.xpath(".//button[@class='action-btn__ActionBtn-zbpc1m-1 doiNsT']"));

        driver.navigate().to("https://www.sinsay.com/ru/ru/checkout/cart/");
        Assertions.assertSame("Корзина", "Корзина");
    }

    @Test
    void test4() {
        driver.findElement(By.xpath(".//a[@href='https://www.sinsay.com/ru/ru/home']")).click();
        driver.findElement(By.xpath(".//a[@href='https://www.sinsay.com/ru/ru/home/bathroom/categories']")).click();
        driver.findElement(By.xpath(".//div[@class='close']")).click();
        driver.findElement(By.xpath(".//h3[@class='sc-eCstlR iEEdBj es-product-name']/a[@href='https://www.sinsay.com/ru/ru/0948g-90x/dywan-lazienkowy-40x60cm']")).click();
        driver.findElement(By.xpath(".//img[@src='https://www.sinsay.com/media/catalog/product/cache/40/a4e40ebdc3e371adff845072e1c73f37/0/9/0948G-90X-999-1_6.jpg']")).click();
        driver.findElement(By.xpath(".//li[@data-selen-product-id='2760425']")).click();
        driver.findElement(By.xpath(".//span[@class='add-to-cart-prefix']")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"cookiebotDialogOkButton\"]"));
        webElement.click();
        driver.findElement(By.xpath(".//button[@data-selen='cart-confirmation-close']")).click();
        driver.findElement(By.xpath(".//button[@class='action-btn__ActionBtn-zbpc1m-1 doiNsT']")).click();
        driver.navigate().to("https://www.sinsay.com/ru/ru/checkout/cart/");
        Assertions.assertSame("Корзина", "Корзина");
        driver.findElement(By.xpath(".//button[@class='product-list__RemoveButton-mh8fks-9 cuZeyJ col']")).click();

    }

    @Test
    void test5() {
        driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"cookiebotDialogOkButton\"]"));
        webElement.click();

        driver.findElement(By.xpath("//*[@id=\"headerWrapper\"]/div/div[3]/button[1]")).click();

        driver.findElement(By.id("login[username]_id")).sendKeys("weffugrecrozo-9512@yopmail.com");
        driver.findElement(By.id("login[password]_id")).sendKeys("Лена3333");

        driver.findElement(By.xpath(".//button[@class='primary__PrimaryButtonComponent-sc-1pct4vx-0 fDECVK']")).click();
        driver.findElement(By.xpath(".//div[@class='close']")).click();
        driver.findElement(By.xpath(".//button[@class='action-btn__ActionBtn-zbpc1m-1 jrauLD']")).click();
        driver.findElement(By.xpath("//*[@id=\"customer-data-link\"]/a")).click();
        Assertions.assertDoesNotThrow(() -> driver.navigate().to("https://www.sinsay.com/ru/ru/customer/account/edit/#personal-data"),
                "Страница не доступна");

    }
    @Test
    void test6 () {
        driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
        WebElement webElement = driver.findElement(By.xpath("//*[@id=\"cookiebotDialogOkButton\"]"));
        webElement.click();
        driver.findElement(By.xpath("//*[@id=\"headerWrapper\"]/div/div[3]/div[1]/div/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"algoliaContainer\"]/div/div[1]/div[2]/div/div[2]/input")).sendKeys("Платье");
        driver.findElement(By.xpath("//*[@id=\"algoliaContainer\"]/div/div/div[3]/div[1]/div/span")).click();
        Assertions.assertSame("Платье", "Платье");
    }

    @AfterAll
    static void close() {
        driver.quit();
    }
}


