package com.testHeal;

import com.epam.healenium.SelfHealingDriver;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.MalformedURLException;

public class TestHealenium {

    private static final Logger log = LoggerFactory.getLogger(TestHealenium.class);

    @Test
     public void test(){
        ChromeOptions options = new ChromeOptions();
        WebDriver delegate = new ChromeDriver(options);
        SelfHealingDriver driver =  SelfHealingDriver.create((WebDriver) delegate);
        driver.get("https://www.homedepot.com");
        driver.manage().window().maximize();

    }
/*

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        ChromeOptions options = new ChromeOptions();
        WebDriver delegate = new ChromeDriver(options);
        SelfHealingDriver driver =  SelfHealingDriver.create((WebDriver) delegate);

        driver.get("https://www.homedepot.com");

       // driver.get("http://localhost:3000/");

        driver.manage().window().maximize();
*/
/*
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Healenium");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Execution");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("heal@yopmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("healmycode");
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("healmycode");
        driver.findElement(By.xpath("//input[@name='mobileNo']")).sendKeys("7956463659");


        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//button[text()='Save']")));

        driver.findElement(By.xpath("//button[text()='Submit']")).click();


        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//*[text()='User Registration Form']")));

*//*


       //  === THD Test
        //p[text()='Log In']

        Thread.sleep(1000);
     //   driver.findElement(By.xpath("//p[text()='Log In']")).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//a[@class='sui-ml-1 md:sui-underline' and text()='My Preference Center']")));

        driver.findElement(By.xpath("//a[@class='sui-ml-1 md:sui-underline' and text()='My Preference Center']")).click();

        driver.findElement(By.xpath("//input[@name='email-search']")).sendKeys("testheal@yopmail.com");




    }
*/

}
