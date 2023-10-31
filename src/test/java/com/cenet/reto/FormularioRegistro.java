package com.cenet.reto;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * 
 * @author Elkin Fabian Alfonso Bermudez
 * @version 1.0
 * @category CENET
 *
 */
public class FormularioRegistro {
    private WebDriver webDriver;
    By fullNameLocator = By.id(null);
    By emailLocator = By.className(null);
    By passwordLocator = By.id(null);
    By confirmPasswordLocator = By.id(null);
    By buttonConfirmRegister = By.name(null);
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		webDriver=new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get("https://www.google.com/");
	}

	@After
	public void tearDown() throws Exception {
		webDriver.quit();
	}

	@Test
	public void test() {
		webDriver.findElement(fullNameLocator).sendKeys("userCenet");
		webDriver.findElement(emailLocator).sendKeys("cenet@gmail.com");
		webDriver.findElement(passwordLocator).sendKeys("passcenet123");
		webDriver.findElement(confirmPasswordLocator).sendKeys("passcenet123");
		
		webDriver.findElement(buttonConfirmRegister).click();
		
	}

}
