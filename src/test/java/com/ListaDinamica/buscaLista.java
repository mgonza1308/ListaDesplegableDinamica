package com.ListaDinamica;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class buscaLista {
	WebDriver driver;
	By ArivalCity 	= By.xpath("//input[contains(@id,'ctl00_mainContent_ddl_originStation1_CTXT')]");
	By Bengaluru	= By.xpath("//a[contains(text(),'Bengaluru (BLR)')]");
	
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", ".//src//test//resources//chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.spicejet.com/");
	  WebDriverWait wait = new WebDriverWait(driver,7);
	  wait.until(ExpectedConditions.presenceOfElementLocated(ArivalCity));
  }
  
  @Test
  public void f() {
	  driver.findElement(ArivalCity).click();
	  driver.findElement(Bengaluru).click();
	  
  }

  @AfterClass
  public void afterClass() {
	  //driver.close();
  }

}
