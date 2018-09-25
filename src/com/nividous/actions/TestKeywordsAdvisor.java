package com.nividous.actions;

import java.io.IOException;
import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.nividous.common.XpathGenerate;

public class TestKeywordsAdvisor extends TestActions {
	
	public String extendedSwitch(Hashtable<String, String> data,String keyword,
			int i,String objectKey,String dataColVal,String dataColVal2,
			String dataColVal3, int timeout) throws InterruptedException, Exception {
		switch (keyword) {
		
		case "VerifyNewKeyword":
			return verifyNewKeyword(i, dataColVal);
		
		case "ConsolePrint":
			return consolePrint(i, dataColVal);
			
		case "PasswordInput":
			return passwordInput(i, objectKey, data.get(dataColVal));
			
		case "AccoutDetail":
			return accoutDetail(i, objectKey);
	
		case "EnterCredential":
			return enterCredential(i);
			
		case "InputByXpath":
			return InputByXpath(i, objectKey, data.get(dataColVal));

		case "RadioButtonClickByXpath":
			return RadioButtonClickByXpath(i, objectKey);

		case "ClickByXpath":
			return RadioButtonClickByXpath(i, objectKey);
			
		case "FileUploadByXpath":
			return FileUploadByXpath(i, objectKey, data.get(dataColVal));
			
		case "DoubleClickByXpath":
			return DoubleClickByXpath(i, objectKey);	
			
		case "SelectDropDownByVisibleText":
			return SelectDropDownByVisibleText(i, objectKey, data.get(dataColVal));	
			
		case "doubleClick1":
			return doubleClick1(i, objectKey);	
			
		case "VerifyTitlePage":
			return VerifyTitlePage(i, data.get(dataColVal));
			
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
	 * Demo purpose - How to add New Keyword with switch case
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on) - Necessary argument for new keywords
	 * @param textToPrint
	 * 	    Reference argumrnt as per need
	 * 
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 */
	public String consolePrint(int step, String textToPrint) {
		System.out.println("driver Info:" +driver);
		System.out.println("Printing on Console: "+textToPrint);
		return "Pass";
	}
			
	//Demo purpose - How to add New Keyword with switch case
	public String passwordInput(int i, String xpathKey, String data) {
		System.out.println("driver Info:" +driver);
		try {
			waitForElementByXpath(i, OR.getProperty(xpathKey), 30);
		} catch (Exception e) {
			e.printStackTrace();
		}
		WebElement element = driver.findElement(By.xpath(OR.getProperty(xpathKey)));
		element.clear();
		element.sendKeys(data);
		System.out.println("Password element:"+element.toString());
		return "Pass";
	}
	
	/**
	 * It makes test class singleton
	 * 
	 * @author Nividous
	 * 
	 * @throws IOException
	 */
	public TestKeywordsAdvisor getKeywordsInstance() throws IOException {
		TestKeywordsAdvisor keywords = null;
		if (keywords == null) {
			keywords = new TestKeywordsAdvisor();
		}
		return (TestKeywordsAdvisor) keywords;
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

	public String InputByXpath(int i, String xpath, String data) {
		String xpathkey = OR.getProperty(xpath);
		System.out.println("driver Info:" + driver);
		try {
			waitForElementByXpath(i, xpath, 30);
		} catch (Exception e) {
			e.printStackTrace();
		}
		WebElement element = driver.findElement(By.xpath(xpathkey));
		// element.clear();
		element.sendKeys(data);
		System.out.println("InputByXpath element:" + element.toString());
		System.out.println(OR.get(data));
		return "Pass";
	}
	
	/* Method used for File upload using sendkey - Author-Keyur Makwana -18-Sept-2017 */
	public String FileUploadByXpath(int i, String xpath, String data) {
		String xpathkey = OR.getProperty(xpath);
		System.out.println("driver Info:" + driver);
		try {
			waitForElementByXpath(i, xpath, 30);
		} catch (Exception e) {
			e.printStackTrace();
		}
		WebElement element = driver.findElement(By.xpath(xpathkey));
		// element.clear();
		element.sendKeys(data);
		System.out.println("Fileupload: " + element.toString());
		return "Pass";
	}
	
	public String ClickByXpath(int i, String xpath) {
		String xpathkey = OR.getProperty(xpath);
		System.out.println("driver Info:" + driver);
		try {
			waitForElementByXpath(i, xpath, 30);
		} catch (Exception e) {
			e.printStackTrace();
		}
		WebElement element = driver.findElement(By.xpath(xpathkey));
		// element.clear();
		element.sendKeys(xpathkey);
		System.out.println("InputByXpath element:" + element.toString());
		return "Pass";
	}

	public String RadioButtonClickByXpath(int i, String xpath) {

		String xpathkey = OR.getProperty(xpath);
		System.out.println("driver Info:" + driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);

		try {
			waitForElementByXpath(i, xpath, 30);
		} catch (Exception e) {
			e.printStackTrace();
		}
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(xpathkey));
		element.click();
		System.out.println("Radion Button click:" + element.toString());
		return "Pass";
	}
	
	public String DoubleClickByXpath(int i, String xpath) {

		String xpathkey = OR.getProperty(xpath);
		System.out.println("driver Info:" + driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);

		try {
			waitForElementByXpath(i, xpath, 30);
		} catch (Exception e) {
			e.printStackTrace();
		}
		WebElement element = driver.findElement(By.xpath(xpathkey));
		// Creates an instance of Actions class, passing current driver instance.
		Actions action = new Actions(driver);
		action.doubleClick(element);
		action.perform();
		System.out.println("Double click:" + element.toString());
		return "Pass";
	}

	/* Method used for selecting value from dropdown by visible text - Author-Keyur Makwana 21-Sept-2017 */
	
	public String SelectDropDownByVisibleText(int i, String id, String data) {

		String xpathkey  = OR.getProperty(id);
		System.out.println("driver Info:" + driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);

		try {
			waitForElementById(i, id, 30);
		} catch (Exception e) {
			e.printStackTrace();
		}
		WebElement element = driver.findElement(By.id(xpathkey));
		Select select = new Select(element);
		select.selectByVisibleText(data);
		System.out.println("Select DropdownByVisibleText" + element.toString());
		return "Pass";
	}
	
	protected String doubleClick1(int step, String xpathKey) throws Exception {
		  WebElement element = null;
		  try {
		   xpathKey=new XpathGenerate().getXpathSearchOld(driver, "Click", xpathKey);
		   System.out.println("Xpath Key:"+xpathKey);
		   waitForElementByXpath(step, xpathKey, 20);
		   element = driver.findElement(By.xpath(xpathKey));
		   Actions action = new Actions(driver);
		   action.doubleClick(element);
		   action.build().perform();
		   return "Pass";
		  } catch (StaleElementReferenceException e) {
		   System.out.println("Element is not attached to the page document "
		     + e.getStackTrace());
		   return "Fail";
		  } catch (NoSuchElementException e) {
		   System.out.println("Element " + element + " was not found in DOM "
		     + e.getStackTrace());
		   return "Fail";
		  } catch (Exception e) {
		   e.printStackTrace();
		   if (Global_ProceedTestonFailure.equals("Y")) {
		    softAssert.assertTrue(true,"\n Steps # "+ step
		      + "  Optional Step - <OK> if NOT Able to double click the object = "+ xpathKey);
		    System.out.println("OPTIONAL STEP = <OK> if NOT Able to double click the object");
		    return "Pass - Optional Step";
		   }

		   softAssert.assertTrue(false, "\n Steps # " + step
		     + "  Fail - Object is not clickable ="+ xpathKey);
		   System.out.println("Error =" + e.getLocalizedMessage());
		   return "Fail - object is not clickable =" + xpathKey;
		  }
		 }
	
	public String VerifyTitlePage(int i, String data) {

		String expectedresult  = OR.getProperty(data);
		String actualresult = driver.getTitle();
		Assert.assertEquals(expectedresult, actualresult);
		return "Pass";
	}
}


