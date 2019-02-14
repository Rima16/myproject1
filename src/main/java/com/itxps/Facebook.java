/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itxps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author dellpc
 */
public class Facebook {

    public static void main(String args[]) throws Exception {

        System.setProperty("webdriver.gecko.driver", "c:\\data\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.facebook.com";

        driver.get(baseUrl);
        WebElement element = driver.findElement(By.id("email"));
        element.sendKeys("a@abc.com");
        WebElement element1 = driver.findElement(By.id("pass"));
        element1.sendKeys("abc");
        WebElement element2 = driver.findElement(By.id("u_0_2"));
        element2.click();

        Thread.sleep(10000);
        driver.close();
    }
}
