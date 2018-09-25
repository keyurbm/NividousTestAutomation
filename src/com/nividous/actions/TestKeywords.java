package com.nividous.actions;

import java.io.IOException;
import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.nividous.common.XpathGenerate;

public class TestKeywords extends TestActions {
	
	public String extendedSwitch(Hashtable<String, String> data,String keyword,
			int i,String objectKey,String dataColVal,String dataColVal2,
			String dataColVal3, int timeout) throws InterruptedException, Exception {
		switch (keyword) {
		
		case "VerifyNewKeyword":
			return verifyNewKeyword(i, dataColVal);
			
		case "AccoutDetail":
			return accoutDetail(i, objectKey);
	
		case "EnterCredential":
			return enterCredential(i);
			
		case "EnterDate":
			   return enterDate(i, objectKey, data.get(dataColVal), timeout);
	
		default:
			return super.throwKeywordExecption(i);
		}
	}
	
	public String verifyNewKeyword(int step, String xpathKey) {
		try {
			driver.findElement(By.xpath(xpathKey)).click();
			return "Pass";
		} catch (Exception e) {
			System.out.println(step+" VerifyNewKeyword failed because,"
					+ " the driver was unable to click");
			System.out.println("Exception Details: "+e);
			return "Fail";
		}
	}
	
	/**
	 * It makes test class singleton
	 * 
	 * @author Nividous
	 * 
	 * @throws IOException
	 */
	public TestKeywords getKeywordsInstance() throws IOException {
		TestKeywords keywords = null;
		if (keywords == null) {
			keywords = new TestKeywords();
		}
		return (TestKeywords) keywords;
	}
	
	public String accoutDetail(int step,String xpath) {
		try {
			WebElement element = driver.findElement(By.xpath(OR.getProperty(xpath)));
			String data=element.getText();
			data=data.subSequence(125, 182).toString();
			data=data.replaceAll("customer_id is - ","");
			data=data.replaceAll("and password is - ","");
			String s[] = data.split(" ");
			System.out.println("UserName "+s[1]);
			System.out.println("Password "+s[2]);
			UserName=s[1];
			Password=s[2];
			return "Pass";
		} catch(Exception e) {
			softAssert.assertTrue(false, "\n Steps # " + step
					+ " Fail - not able");
			return "Fail - not able  " 
			+ " from Page Source";
		}
	}
	
	public String enterCredential(int step) {
		try {
			waitForElementByXpath(step, ".//*[@id='loginid']",30);
			WebElement element = driver.findElement(By.xpath(".//*[@id='loginid']"));
			System.out.println("Value: "+UserName);
			element.clear();
			element.sendKeys(UserName);
			element = driver.findElement(By.xpath(".//*[@id='uipassword']"));
			System.out.println("Value: "+Password);
			element.clear();
			element.sendKeys(Password);
			//
			element = driver.findElement(By.xpath(".//input[@value='Login']"));
			Actions actions = new Actions(driver);
			actions.moveToElement(element).perform();
			element.click();
			return "Pass";
		} catch(Exception e) {
			softAssert.assertTrue(false, "\n Steps # " + step
					+ " Fail - not able");
			return "Fail - not able  " 
			+ " from Page Source";
		}
	}
	
	public String enterDate(int step, String label, String data, int timeout) {
		try {
			if(timeout!=0) {
				waitForElement(step, label, timeout);
			}
			scrollTillElement(step, label);
			String xpathKey=new XpathGenerate().getXpathSearchOld(driver, "Label", label);
			System.out.println("#### xpathkey:####"+xpathKey);
			waitForElementByXpath(step, xpathKey, 50);
			WebElement element = driver.findElement(By.xpath(xpathKey));
			System.out.println("Value: "+data);
			element.clear();
			element.sendKeys(data);
			element.sendKeys("\t");
			return "Pass";
		} catch (Exception e) {
			e.printStackTrace();
			// <OPTIONAL STEP>
			if (Global_ProceedTestonFailure.equals("Y")) {
				softAssert.assertTrue(true, "\n Steps # "+ step
						+ "  Optional Step - <OK> if NOT Able to enter data in input object  =  "
						+ label + " with data =" + data);
				System.out
					.println("OPTIONAL STEP = <OK> if NOT Able to Input ");
				return "Pass - Optional Step";
			}
			// <OPTIONAL STEP>
			softAssert.assertTrue(false, "\n Steps # " + step
					+ " Fail - not able to enter data in input box" + label);
			return "Step# =" + step
					+ " Fail - not able to enter data in input box ="+ label;
		}
	}
}
