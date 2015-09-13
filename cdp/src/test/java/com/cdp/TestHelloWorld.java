package com.cdp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.*;

public class TestHelloWorld {

    public static void main(String[] args) {
        
        //如果火狐浏览器没有默认安装在C盘，需要制定其路径
        System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe"); 
        WebDriver driver = new FirefoxDriver();
        driver.get("http://192.168.9.207:8082/hra/newhome.do");
        
        driver.manage().window().maximize();
        
        WebElement company = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/form/table/tbody/tr[1]/td[2]/input"));
        company.sendKeys("Compass");
         //错在哪？
        //WebElement user = driver.findElement(By.xpath("//*[@id="j_username"]"));
        WebElement user = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/form/table/tbody/tr[2]/td[2]/input"));
        user.sendKeys("jordan"); 
        
        WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/form/table/tbody/tr[3]/td[2]/input"));
        password.sendKeys("123456");
        
        WebElement btn = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/form/table/tbody/tr[5]/td/a"));
        btn.click();
        
        driver.close();

    }

}
