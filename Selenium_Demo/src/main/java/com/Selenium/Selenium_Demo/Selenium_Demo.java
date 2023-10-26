package com.Selenium.Selenium_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.KeyInput;
import org.openqa.selenium.WebDriver;

public class Selenium_Demo {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to the ChromeDriver executable.
        System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
//         // Launch in headless mode. Sometimes this might help.
////        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--disable-dev-shm-usage");
////        WebDriver driver = new ChromeDriver(options);
        // Create a new instance of ChromeDriver.
        ChromeDriver driver = new ChromeDriver();

        try {
            // Navigate to Facebook.
            driver.get("https://www.facebook.com/");

            // Find the username and password input fields and enter the credentials.
            WebElement emailInput = driver.findElement(By.id("email"));
            emailInput.sendKeys("asefatareda@gmail.com"); // fb username.
            
            WebElement passwordInput = driver.findElement(By.id("pass"));
            passwordInput.sendKeys("goodLuckBreakingIn!"); // fb pw
            
            // Find the login button and click it.
            WebElement loginButton = driver.findElement(By.name("login"));
            loginButton.click();
            // Add your further test steps here, if needed.
            
            // Pause for visualization purposes.
           Thread.sleep(15000); 
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser.
           driver.close();
        }
    }
}

