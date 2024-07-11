package com.softserve.edu;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;
import java.util.List;

public class T1Test {

    private static WebDriver driver;

    private void presentationSleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @BeforeAll
    public static void setup() {
        System.out.println("@BeforeAll executed");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //
        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();
        //
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("@AfterAll executed");
        if (driver != null) {
            driver.quit();
        }
    }

    @BeforeEach
    public void setupThis() {
        System.out.println("\t@BeforeEach executed");
        driver.get("https://www.greencity.cx.ua/");
        presentationSleep();
    }

    @AfterEach
    public void tearThis() {
        System.out.println("\t@AfterEach executed");
        // logout
    }

    @Test
    public void t1() {
        driver.findElement(By.cssSelector("app-header:nth-child(1) .ubs-header-sing-in-img")).click();
        presentationSleep();
        //
        List<WebElement> closeButtons = driver.findElements(By.tagName("iframe"));
        presentationSleep();
        if (closeButtons.size() > 0) {
            driver.switchTo().frame(closeButtons.get(0));
            presentationSleep();
            driver.findElement(By.id("close")).click();
            presentationSleep();
            driver.switchTo().defaultContent();
        }
        presentationSleep();
        //
        driver.findElement(By.id("email")).click();
        presentationSleep();
        //
        driver.findElement(By.id("email")).sendKeys("tyv09754@zslsz.com");
        presentationSleep();
        //
        driver.findElement(By.id("password")).click();
        presentationSleep();
        //
        driver.findElement(By.id("password")).sendKeys("Qwerty_1");
        presentationSleep();
        //
        driver.findElement(By.cssSelector(".image-show-hide-password")).click();
        presentationSleep();
        //
        driver.findElement(By.cssSelector(".ubsStyle")).click();
        presentationSleep();
        //
        //
        WebElement userName = driver.findElement(By.cssSelector("app-header:nth-child(1) .body-2"));
        Assertions.assertEquals("QwertyY", userName.getText());
        presentationSleep();
        //
        driver.findElement(By.cssSelector("app-header:nth-child(1) .body-2")).click();
        presentationSleep();
        //
        driver.findElement(By.linkText("Sign out")).click();
        presentationSleep();
        //
        driver.findElement(By.cssSelector("app-header:nth-child(1) .ubs-header_sign-up-btn")).click();
        presentationSleep();
        //
        driver.findElement(By.cssSelector("img.cross-btn")).click();
        presentationSleep();
        //
        WebElement sinup = driver.findElement(By.cssSelector("div.main-content.app-container div.ubs-header_sign-up-btn > span"));
        Assertions.assertEquals("Sign up", sinup.getText().trim());
        presentationSleep();
    }

    @Test
    public void t2events() {
        driver.findElement(By.cssSelector("app-header:nth-child(1) .nav-left-list:nth-child(4) > .url-name")).click();
        presentationSleep();
        //
        driver.findElement(By.linkText("Events")).click();
        presentationSleep();
        //
        driver.findElement(By.cssSelector(".mat-mdc-select-arrow > .ng-tns-c3393473648-3")).click();
        presentationSleep();
        //
        driver.findElement(By.cssSelector("#mat-option-17 > .mat-pseudo-checkbox")).click();
        presentationSleep();
        //
        driver.findElement(By.cssSelector(".cdk-overlay-backdrop")).click();
        presentationSleep();
        //
        driver.findElement(By.cssSelector(".active-filter")).click();
        presentationSleep();
        //
        Assertions.assertEquals("Kyiv", driver.findElement(By.cssSelector(".active-filter")).getText());
    }
}
