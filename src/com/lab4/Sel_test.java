package com.lab4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Sel_test {
    public static WebDriver driver = null;

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C://Users//Future//Downloads//chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.navigate().to("http://formy-project.herokuapp.com/form");
        driver.manage().window().maximize();
        String title = driver.getTitle();

        if(title.equalsIgnoreCase("formy-project.herokuapp.com/form"))
            System.out.println("Title matches");
        else
            System.out.println(title);

        // Form controls
        String tag_name ="Tasneem";
        tag_name = driver.findElement(By.cssSelector("#first-name")).getText();
        System.out.println(tag_name);

        String tag_name1 ="Hesham";
        tag_name1 = driver.findElement(By.cssSelector("#last-name")).getText();
        System.out.println(tag_name1);

        String tag_name2 ="Student";
        tag_name2 = driver.findElement(By.cssSelector("#Job-title")).getText();
        System.out.println(tag_name2);


        // Radio button
        WebElement high_school = driver.findElement(By.id("radio-button-1"));
        high_school.click();
        Thread.sleep(2000);

        WebElement College = driver.findElement(By.id("radio-button-2"));
        College.click();

        WebElement grad_school = driver.findElement(By.id("radio-button-3"));
        grad_school.click();


        /*System.out.println("High school is selected?" + high_school.isSelected());
        System.out.println("College is selected?" + College.isSelected());
        System.out.println("Grad school is selected?" + grad_school.isSelected());*/

    }

}
