package com.RCRM.pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class undrosBase extends basetest{

	
	public undrosBase() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"col-sm-12\"]/form/div/div[1]/div[1]/div[2]/ul/li[1]/div/div/input")
	public static WebElement enterno;
	
	@FindBy(xpath = "//*[@name='operator' and @data-qa='celular-operator']")
	public static WebElement clickoperator;
	
	@FindBy(xpath = "//*[text() = 'Telcel']")
	public static WebElement selectoperator;
	
	@FindBy(xpath = "//*[@id=\"col-sm-12\"]/form/div/div[1]/div[1]/div[2]/ul/li[3]/div/div/input")
	public static WebElement clickrecharge;
	
	@FindBy(xpath = "//*[@id=\"col-sm-12\"]/form/div/div[1]/div[1]/div[2]/ul/li[3]/div/div/div/ul[1]/li[1]")
	public static WebElement selectrecharge;
	
	@FindBy(xpath = "//*[@id=\"col-sm-12\"]/form/div/div[1]/div[1]/div[3]/div/button")
	public static WebElement submit;
	
	@FindBy(xpath = "//*[@id=\"panel-title-card\"]")
	public static WebElement selecttarjeta;
	
	@FindBy(xpath = "//*[@id=\"radio-n\"]/td")
	public static WebElement seletcard;
	
	@FindBy(xpath = "//*[@id=\"cardnumberunique\"]")
	public static WebElement entercardno;
	
	@FindBy(xpath = "//*[@id=\"payment-form\"]/div[3]/div[1]/div/div[1]/input")
	public static WebElement month;
	
	@FindBy(xpath = "//*[@id=\"payment-form\"]/div[3]/div[1]/div/div[3]/input")
	public static WebElement year;
	
	@FindBy(xpath = "//*[@id=\"payment-form\"]/div[3]/div[2]/div/input")
	public static WebElement cvv;
	
	@FindBy(xpath = "//*[@id=\"payment-form\"]/div[4]/div/div/input")
	public static WebElement email;
	
	@FindBy(xpath = "//*[@id=\"paylimit\"]")
	public static WebElement proceedtopay;
	
	@FindBy(xpath = "//*[@id=\"usrname\"]")
	public static WebElement userName;
	
	@FindBy(xpath = "//*[@id=\"psw\"]")
	public static WebElement Password;
	
	@FindBy(xpath = "//*[@id=\"loginForm\"]/div[4]")
	public static WebElement capcha;
	
	@FindBy(xpath = "//*[@id=\"loginBtn\"]")
	public static WebElement login;
	
	@FindBy(xpath = "//*[@id=\"mainBlueContainer\"]/div/div[1]/div[1]/div[1]/div[3]")
	public static WebElement verify;
	
	/*
	 * Methods to perform different operations on different pages.
	 */
	
	public void rechargeDetails() {
		enterno.sendKeys("8465433546");
		clickoperator.click();
		selectoperator.click();
		clickrecharge.click();
		selectrecharge.click();
		submit.click();
	}
	
	public void cardDetails() throws InterruptedException {
		
		selecttarjeta.click();
		Thread.sleep(3000);
		seletcard.click();
		entercardno.sendKeys("4111111111111111");
		month.sendKeys("11");
		year.sendKeys("25");
		cvv.sendKeys("111");
		email.sendKeys("test@test.com");
		proceedtopay.click();
		
		
	}
	
	public void login() throws InterruptedException {
		
		userName.sendKeys("automationexcersise@test.com");
		Password.sendKeys("123456");
		Thread.sleep(3000);
		capcha.click();
		login.click();
		String msg = "Recharge Successful";
		String cmsg = verify.getText();
		//System.out.println(cmsg);
		assertEquals(cmsg, msg);
	}
}
