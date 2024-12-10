package com.testHeal;

import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;

public class TestHealeniumAPL {

    private static final Logger log = LoggerFactory.getLogger(TestHealeniumAPL.class);

    public static void main(String[] args) throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        WebDriver delegate = new ChromeDriver(options);
        SelfHealingDriver driver =  SelfHealingDriver.create((WebDriver) delegate);
//        driver.get("https://www.google.com");
        driver.get("https://account.apple.com/account");

        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//input[@class='generic-input-field   form-textbox form-textbox-text       ']//following::span[text()='First name']")).sendKeys("Heal");
//        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Heal");
        driver.findElement(By.xpath("//input[@name='firstName']//following::label[1]")).sendKeys("Heal");
//        driver.findElement(By.xpath("//first-name-input[@placeholder='FName']//input[1]")).sendKeys("Heal");
        driver.findElement(By.xpath("//input[@name='lastName']//following::label[1]")).sendKeys("Code");
//        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Code");
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("heal@yopmail.com");
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("healmycode");
//        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("healmycode");
//        driver.findElement(By.xpath("//input[@name='mobileNo']")).sendKeys("7956463659");
//
//
//        driver.findElement(By.xpath("//button[text()='Submit']")).click();
//
//
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//*[text()='User Registration Form']")));

    }
}
