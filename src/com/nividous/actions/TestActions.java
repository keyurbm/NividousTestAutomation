package com.nividous.actions;

import java.io.IOException;
import java.util.Hashtable;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import com.nividous.common.NividousTest;

public abstract class TestActions extends NividousTest {
	
	/**
	 * Launch Web Browser for Web Testing. i.e. FireFox, Chrome, IE, etc.
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param browserType
	 *    	Type to open i.e. FireFox, Chrome, IE
	 *            
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 */
	public String openBrowser(int step, String browserType) {
		return super.openBrowser(step, browserType);
	}
	
	/**
	 * Closes any Browser(s) which are open
	 * Keyword have 2 options as close single browser or close all opened browsers
	 * To close all browsers use CLOSE_MultiWindowsOpen in the 'data' column in 'Test Steps' WorkSheet
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param multiBrowserOption
	 *      Variable to close only 1 Browser instance or All Browsers which are opened
	 *      - Optional argument
	 *      - For closing multiple browsers, value must be 'All_Windows' only
	 *
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 */
	public String closeBrowser(int step, String multiBrowserOption) {
		return super.closeBrowser(step, multiBrowserOption);
	}
	
	/**
	 * Closes and Teardown the driver instance
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * 
	 * @return 'PASS' or 'FAIL' as String
	 */
	public String closeDriver(int step) {
		return super.closeDriver(step);
	}
	
	/**
	 * Navigation to specified Web URL
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param url
	 *      URL or Link to go to
	 *
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 */
	public String navigate(int step, String url) {
		return super.navigate(step, url);
	}
	
	/**
	 * Navigate back to the previous page from Browser's back button
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 *            
	 * @return 'PASS' or 'FAIL' as String            
	 */
	public String navigateBackOnBrowser(int step) {
		return super.navigateBackOnBrowser(step);
	}
	
	/**
	 * Navigate forward to the next page from Browser's forward button
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 *            
	 * @return 'PASS' or 'FAIL' as String            
	 */
	public String navigateForwardOnBrowser(int step) {
		return super.navigateForwardOnBrowser(step);
	}
	
	/**
	 * Reload the WebPage
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * 
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String reloadPage(int step) throws Exception {
		return super.reloadPage(step);
	}
	
	/**
	 * Refresh the WebPage
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * 
	 * @return 'PASS' or 'FAIL' as String
	 */
	public String refereshPage(int step) {
		return super.refereshPage(step);
	}
	
	/**
	 * Click any Web Element object
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Label on which need to Click
	 *            
	 * @return 'PASS' or 'PASS - OPTIONAL STEP' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String click(int step, String label) throws Exception {
		return super.click(step, label);
	}
	
	/**
	 * Click any Web Element object based on Object's xpath
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param xpathKey
	 *      Object's xpath locator contain property name
	 *            
	 * @return 'PASS' or 'PASS - OPTIONAL STEP' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String clickBasedOnXpath(int step, String xpathKey) throws Exception {
		return super.clickBasedOnXpath(step, xpathKey);
	}
	
	/**
	 * Click any Web Element object, object label comes from "Test Data" sheet
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param data
	 *      data on which need to Click, which needs to provide from TestData sheet
	 *            
	 * @return 'PASS' or 'PASS - OPTIONAL STEP' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String clickFromTestData(int step, String data) throws Exception {
		return super.clickFromTestData(step, data);
	}
	
	/**
	 * Click Link By LinkText
	 * Will Find a Link on the WebPage by the "text of the Link (itself)"
	 * Example: 'click here' (LINK). In your Excel, data = "click here"
	 * 
	 * @author Nividous
	 * 
\	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param linkText
	 *      The Text of the LINK you want to CLICK
	 *            
	 * @return 'PASS' or "Pass - Optional Step" or 'FAIL' as String
	 */
	public String clickLinkByLinkText(int step, String linkText) {
		return super.clickLinkByLinkText(step, linkText);
	}
	
	/**
	 * Click Link By LinkText With Two References - From "Test Steps" worksheet<br>
	 * It works as follow, clicks the first link(e.g. "SELECT") then click 2nd link as its visible
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param reference
	 *      First LINK to CLICK
	 * @param linkText
	 *      Second LINK to CLICK
	 *            
	 * @return 'PASS' or "Pass - Optional Step" or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String clickLinkByLinkTextWithReferenceLink(int step,
			String reference, String linkText) throws Exception {
		return super.clickLinkByLinkTextWithReferenceLink(step, reference, linkText);
	}
	
	/**
	 * Click link by LinkText, but linktext comes from 'Test Data' Worksheet
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param data
	 *      The Text of the LINK you want to CLICK
	 *            
	 * @return 'PASS' or "Pass - Optional Step" or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String clickLinkByLinkTextFromTestData(int step, String data)
			throws Exception {
		return super.clickLinkByLinkTextFromTestData(step, data);
	}
	
	/**
	 * Click on any object Based on Reference object element
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 * 		Label on which need to CLick
	 * @param reference
	 * 		References Object Element label	
	 * 
	 * @return 'PASS' or "Pass - Optional Step" or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String clickByReference(int step, String label, String reference) throws Exception {
		return super.clickByReference(step, label, reference);
	}
	
	/**
	 * Click on any object, object will identify based on ID
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param id
	 * 		Element's Id, which generate xpath for that element later
	 * 
	 * @return 'PASS' or "Pass - Optional Step" or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String clickById(int step, String id) throws Exception {
		return super.clickById(step, id);
	}
	
	/**
	 * 
	 */
	public String clickElementFromDynamicListByValue(int step,
			String xpathKey, String valueToFind, String valueIndex) throws Exception {
		return super.clickElementFromDynamicListByValue(step, xpathKey, valueToFind, valueIndex);
	}
	
	/**
	 * Its first checks that element is enable or not. If enable then and then its click else fail the test step
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 * 		Element label, which needs to click
	 * 
	 * @return 'PASS' or 'FAIL' as String
	 */
	public String clickIfEnabled(int step, String label) {
		return super.clickIfEnabled(step, label);
	}	
	
	/**
	 * Double Click, any Web Element object
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Label on which need to double click
	 *            
	 * @return 'PASS' or 'PASS - OPTIONAL STEP' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String doubleClick(int step, String label) throws Exception {
		return super.doubleClick(step, label);
	}	
	
	/**
	 * Click on a object from a list of Dynamic Controls
	 * Locate an Element to click from Dynamic list using "By Value"
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Element label, which needs to click
	 * @param valueToClick
	 *      Could be Table Row/Column Number, Index Number, etc....
	 *      It should be in digit only.
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 */
	public String clickElementFromDynamicList(int step, String label, String valueToClick) {
		return super.clickElementFromDynamicList(step, label, valueToClick);
	}
	
	public String clickOnLink(int step, String label) throws Exception {
		return super.clickOnLink(step, label);
	}
	
	public String clickOnButton(int step, String label) throws Exception {
		return super.clickOnButton(step, label);
	}
	
	public String clickOnInputBox(int step, String label) throws Exception {
		return super.clickOnInputBox(step, label);
	}
	
	public String clickOnCheckBox(int step, String label) throws Exception {
		return super.clickOnCheckBox(step, label);
	}
	
	public String clickOnLabel(int step, String label) throws Exception {
		return super.clickOnLabel(step, label);
	}
	
	public String clickOnRadioButton(int step, String label) throws Exception {
		return super.clickOnRadioButton(step, label);
	}
	
	public String clickOnTextArea(int step, String label) throws Exception {
		return super.clickOnTextArea(step, label);
	}
	
	public String clickOnTextBox(int step, String label) throws Exception {
		return super.clickOnTextBox(step, label);
	}
	
	public String clickOnTableElement(int step, String label) throws Exception {
		return super.clickOnTableElement(step, label);
	}
	
	/**
	 * Clear Input box
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Object's label, which needs to Clear
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 *
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String clearInputBox(int step, String label) throws Exception {
		return super.clearInputBox(step, label);
	}
	
	/**
	 * Clear Input box based on Object's xpath
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param xpathKey
	 *      Object's xpath locator contain property name
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 *
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String clearInputBoxBasedOnXpath(int step, String xpathKey) throws Exception {
		return super.clearInputBoxBasedOnXpath(step, xpathKey);
	}
	
	/**
	 * Get text - Retrieves TEXT from an Object
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Object's label to retrieve the text from
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String getText(int step, String label) throws Exception {
		return super.getText(step, label);
	}
	
	/**
	 * Get text - Retrieves TEXT from an Object based on Object's xpath
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param xpathKey
	 *      Object's xpath locator contain property name
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String getTextBasedOnXpath(int step, String xpathKey) throws Exception {
		return super.getTextBasedOnXpath(step, xpathKey);
	}
	
	/**
	 * Upload File from local - work with sendkey only
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param xpathKey
	 *      Object's xpath locator contain property name
	 * @param filePath
	 *      File Path which need to be upload
	 *            
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String uploadFileBasedOnXpath(int step, String xpathKey, String filePath)
			throws Exception {
		return super.uploadFileBasedOnXpath(step, xpathKey, filePath);
	}
	
	/**
	 * Browser file from Local machine and upload it
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 * 	 	Object Label Name
	 * @param filePath
	 * 		File Path which need to be upload
	 * @param timeout
	 * 		wait for element with max time
	 * 
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String uploadFile(int step, String label, String filePath, int timeout) 
			throws Exception {
		return super.uploadFile(step, label, filePath, timeout);
	}
	
	/**
	 * Upload the file from local machine through folder browsing
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 * 		Object Label Name
	 * @param filePath
	 * 	  	File Path which need to be upload
	 * 
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String browserAndUploadFile(int step, String xpathKey, String filePath)
			throws Exception {
		return super.browserAndUploadFile(step, xpathKey, filePath);
	}
	
	/**
	 * Finds Dynamic count of Links, which link name yoy are looking for
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param linkNameToFind
	 *      Value to find and count up the amount of them
	 *            
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String findAllDynamicLinksOfPage(int step, String linkNameToFind)
			throws Exception {
		return super.findAllDynamicLinksOfPage(step, linkNameToFind);
	}
	
	/**
	 * Focus on any Object
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 * 		Object Label name
	 * @param timeout
	 *  	Wait for element with max time
	 *  
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String setFocus(int step, String label, int timeout) throws Exception {
		return super.setFocus(step, label, timeout);
	}
	
	/**
	 * Focus on any Object based on Object's xpath
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param xpathKey
	 *      Object's xpath locator contain property name
	 * @param timeout
	 *  	Wait for element with max time
	 *  
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String setFocusBasedOnXpath(int step, String xpathKey, int timeout) throws Exception {
		return super.setFocusBasedOnXpath(step, xpathKey, timeout);
	}
	
	/**
	 * Scroll the screen till Element display on the screen
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 * 		Object Label name
	 * 
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws InterruptedException
	 * 		if fail, then through InterruptedException
	 */
	public String scrollTillElement(int step, String label) throws InterruptedException {
		return super.scrollTillElement(step, label);
	}
	
	/**
	 * Scroll the screen till Element display on the screen based on Object's xpath
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param xpathKey
	 *      Object's xpath locator contain property name
	 * 
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws InterruptedException
	 * 		if fail, then through InterruptedException
	 */
	public String scrollTillElementBasedOnXpath(int step, String xpathKey) throws InterruptedException{
		return super.scrollTillElementBasedOnXpath(step, xpathKey);
	}
	
	/**
	 * Scroll the screen till defined coordinates
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param xCoordinate
	 * 		X Axis value for coordinate, till needs to scroll screen
	 * @param yCoordinate
	 * 		Y Axis valur for coordinate, till needs to scroll screen
	 * 
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws InterruptedException
	 * 		if fail, then through InterruptedException
	 */
	public String scrollToCoordinates(int step, String xCoordinate, String yCoordinate) throws InterruptedException {
		return super.scrollToCoordinates(step, xCoordinate, yCoordinate);
	}
	
	/**
	 * Scroll the specific portion of the Web page, without scrolling whole page
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param startingCoordinates
	 * 		starting point's coorinates
	 * @param endingCoordinates
	 * 		ending point's coordinates
	 * 
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws InterruptedException
	 * 		if fail, then through InterruptedException
	 */
	public String scrollPartOfPageUsingCoordinates(int step, String startingCoordinates, String endingCoordinates) throws InterruptedException {
		return super.scrollPartOfPageUsingCoordinates(step, startingCoordinates, endingCoordinates);
	}
	
	public String scrollUp(int step) throws InterruptedException {
		return super.scrollUp(step);
	}
	
	public String scrollDown(int step) throws InterruptedException {
		return super.scrollDown(step);
	}
	
	public String scrollTillPageEnd(int step) throws InterruptedException {
		return super.scrollTillPageEnd(step);
	}
	
	public String scrollToPageTop(int step) throws InterruptedException {
		return super.scrollToPageTop(step);
	}
	
	public String swipeLeft(int step) throws InterruptedException {
		return super.swipeLeft(step);
	}
	
	public String swipeRight(int step) throws InterruptedException {
		return super.swipeRight(step);
	}
	
	/**
	 * Select value from Dropdown based on Index, like = 1 OR 2 OR 3, ETC....
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param xpathKey
	 *      Dropdown Object's xpath locator contain property name
	 * @param indexToFind
	 *      Index Value to Select in DropDown
	 *            
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String selectFromDropdownByIndexBasedOnXpath(int step, String xpathKey,
			String indexToFind) throws Exception {
		return super.selectFromDropdownByIndexBasedOnXpath(step, xpathKey, indexToFind);
	}
	
	/**
	 * Select value from Dropdown based on value text itself
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Dropdown object Label Name
	 * @param data
	 *      Value text to Select in DropDown
	 *            
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String selectFromDropdownByText(int step, String label, String data)
			throws Exception {
		return super.selectFromDropdownByText(step, label, data);
	}
	
	/**
	 * Select value from Dropdown based on value text itself based on Object's xpath
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param xpathKey
	 *      Object's xpath locator contain property name
	 * @param data
	 *      Value text to Select in DropDown
	 *            
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String selectFromDropdownByTextBasedOnXpath(int step, String xpathKey, String data)
			throws Exception {
		return super.selectFromDropdownByTextBasedOnXpath(step, xpathKey, data);
	}
	
	/**
	 * Select value from Dropdown based on value
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Dropdown object Label Name
	 * @param data
	 *      Value text to Select in DropDown
	 *            
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String selectFromDropdownByValue(int step, String label, String data)
			throws Exception {
		return super.selectFromDropdownByValue(step, label, data);
	}
	
	/**
	 * Select Date from Date Dropdown
	 *
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Date dropdown object Label Name
	 * @param date
	 *      Date, which needs to select from dropdown
	 *            
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String selectDateFromDropdown(int step, String label, String date) throws Exception {
		return super.selectDateFromDropdown(step, label, date);
	}
	
	/**
	 * select value from that dropdown, which dropdown will open after clicking on any refereneced object like Input/Span/Div.
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Reference Object's Label name, for dropdown generate
	 * @param data
	 *      Value text to Select from DropDown
	 *            
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String selectFromDropdownWithReferenceClick(int step,
			String label, String data) throws Exception {
		return super.selectFromDropdownWithReferenceClick(step, label, data);
	}
	
	/**
	 * Verify asked data value present in Dropdown
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Dropdown object Label Name
	 * @param data
	 *      Value text, which needs to verify present in Dropdown
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String verifyPresentInDropdown(int step, String label, String data)
			throws Exception {
		return super.verifyPresentInDropdown(step, label, data);
	}
	
	/**
	 * Verify Selected Dropdown option value
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Object Label Name
	 * @param data
	 *      value text, which needs to verify that its selected or not from dropdown
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String verifySelectedDropdownText(int step, String label,
			String data) throws Exception {
		return super.verifySelectedDropdownText(step, label, data);
	}
	
	/**
	 * Verify Object is Present 
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *  	The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Object Label Name
	 *
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String verifyPresent(int step, String label) throws Exception {
		return super.verifyPresent(step, label);
	}
	
	/**
	 * Verify Object is not Present 
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *  	The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Object Label Name
	 *
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String verifyNotPresent(int step, String label) throws Exception {
		return super.verifyNotPresent(step, label);
	}
	
	/**
	 * LOOK TO SEE IF A LINK (WITH A GIVEN NAME) IS NOT PRESENT
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param linkName
	 *      Object Name to not find
	 *      
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL'
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String verifyLinkNotPresent(int step, String linkName)
			throws Exception {
		return super.verifyLinkNotPresent(step, linkName);
	}
	
	/**
	 * Verify Element/Object's Text
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Object Label Name
	 * @param textToBeVerify
	 *      Text to verify
	 *            
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String verifyTextPresent(int step, String label, String textToBeVerify) throws Exception {
		return super.verifyTextPresent(step, label, textToBeVerify);
	}
	
	/**
	 * Verify Element/Object's Text is not present as expected
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Object Label Name
	 * @param textToBeVerifyNotPresent
	 *      Text to be not verify
	 *            
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String verifyTextNotPresent(int step, String label, String textToBeVerifyNotPresent) throws Exception {
		return super.verifyTextNotPresent(step, label, textToBeVerifyNotPresent);
	}
	
	/**
	 * Verify Web Page's Title
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param titleText
	 *      Web Page's Title text
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 */
	public String verifyPageTitle(int step, String titleText) {
		return super.verifyPageTitle(step, titleText);
	}
	
	/**
	 * Verify Object's Title attribute
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Object Label Name
	 * @param data
	 *      Title to verify
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String verifyTitleAttribute(int step, String label, String data)
			throws Exception {
		return super.verifyTitleAttribute(step, label, data);
	}
	
	/**
	 * Verify Object's Value attribute
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Object Label Name
	 * @param data
	 *      Value to verify with element's ValueTag
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String verifyTextByValueAttribute(int step, String label, String data)
			throws Exception {
		return super.verifyTextByValueAttribute(step, label, data);
	}

	/**
	 * Verify Date value - Its validator
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Object Label Name
	 * @param data
	 *      Value to verify
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String verifyDate(int step, String label, String data)
			throws Exception {
		return super.verifyDate(step, label, data);
	}
	
	/**
	 * Verify Link is present by LinkText
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param linkText
	 *      Link's Partial Text to verify
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String verifyLinkByLinkText(int step, String linkText) throws Exception {
		return super.verifyLinkByLinkText(step, linkText);
	}
	
	/**
	 * Verify Alert popup is present with Alert Message
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param alertMsg
	 *      Message needs to verify
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String verifyAlertPresent(int step, String alertMsg) throws Exception {
		return super.verifyAlertPresent(step);
	}
	
	/**
	 * Verify Alert popup Message
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param alertMsg
	 *      Message needs to verify
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String verifyAlertMessage(int step, String alertMsg) throws Exception {
		return super.verifyAlertMessage(step, alertMsg);
	}
	
	/**
	 * Dismiss Alert by clicking No or Cancel Option
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String dismissAlert(int step) throws Exception {
		return super.dismissAlert(step);
	}
	
	/**
	 * Accept Alert by clicking Yes or Ok Option, based on Alert message verification
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param alertMsg
	 *      Message needs to verify for accepting
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String acceptAlert(int step, String alertMsg) throws Exception {
		return super.acceptAlert(step, alertMsg);
	}
	
	/**
	 * Input - Types text in a Input Object
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Object Label Name
	 * @param data
	 *      Value to type in the Input Object
	 * @param timeout
	 *  	Wait for element with max time       
	 *            
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 */
	public String input(int step, String label, String data, int timeout) {
		return super.input(step, label, data, timeout);
	}
	
	/**
	 * Types text in a Input Object based on Object's ID
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param id
	 * 	 	Id of Object
	 * @param data
	 * 		Value to type in the Input Object
	 * 
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 */
	public String inputById(int step, String id, String data) {
		return super.inputById(step, id, data);
	}
	
	/**
	 * Types text in a Input Object based on Object's xpath
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param xpathKey
	 * 	 	Object's xpath locator contain property name
	 * @param data
	 * 		Value to type in the Input Object
	 * @param timeout
	 *  	Wait for element with max time     
	 * 
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String inputBasedOnXpath(int step, String xpathKey, String data, int timeout)
			throws Exception {
		return super.inputBasedOnXpath(step, xpathKey, data, timeout);
	}
	
	public String inputToInputBox(int step, String label, String data, int timeout) {
		return super.inputToInputBox(step, label, data, timeout);
	}
	
	public String inputToTextArea(int step, String label, String data, int timeout) {
		return super.inputToTextArea(step, label, data, timeout);
	}
	
	public String inputToTextBox(int step, String label, String data, int timeout) {
		return super.inputToTextBox(step, label, data, timeout);
	}
	
	public String inputToTableElement(int step, String label, String data, int timeout) {
		return super.inputToTableElement(step, label, data, timeout);
	}
	
	/**
	 * WAIT - 'Hard' implicit wait in Seconds
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param timeToWait
	 *      Sleep Value in Seconds
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String wait(int step, String timeToWait) throws Exception {
		return super.wait(step, timeToWait);
	}
	
	/**
	 * Wait for an Object/Element to appear on the Webpage in seconds limits
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Object Label Name
	 * @param timeout
	 *      wait in seconds
	 *            
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String waitForElement(int step, String label, int timeout)
			throws Exception {
		return super.waitForElement(step, label, timeout);
	}
	
	/**
	 * Wait for an Object/Element to appear on the Webpage in seconds limits
	 * Which is optional till dynamic limit of element
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Object Label Name
	 * @param timeout
	 *      Wait in seconds
	 *            
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String waitForElementOptional(int step, String label, int timeout)
			throws Exception {
		return super.waitForElementOptional(step, label, timeout);
	}
	
	/**
	 * Wait for an Object/Element to appear on the Webpage by Xpath in seconds
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param xpathKey
	 *      Object's xpath locator contain property name
	 * @param timeout
	 *      Wait in seconds
	 *            
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String waitForElementByXpath(int step, String xpathKey, int timeout)
			throws Exception {
		return super.waitForElementByXpath(step, xpathKey, timeout);
	}
	
	/**
	 * Wait for Link to appear on the webpage by LinkText in seconds
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param linkText
	 *      Link Object's Partial text
	 * @param timeout
	 *      Wait in seconds
	 *            
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String waitForLinkByLinkText(int step, String linkText, int timeout)
			throws Exception {
		return super.waitForLinkByLinkText(step, linkText, timeout);
	}
	
	/**
	 * Wait for Object/Element to disappear from the webpage in seconds
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Object Label Name
	 * @param timeout
	 *      Wait in seconds
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String waitForElementUntilInVisible(int step, String label,
			int timeout) throws Exception {
		return super.waitForElementUntilInVisible(step, label, timeout);
	}
	
	/**
	 * Wait for Object's Text to disappear from the webpage in seconds
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Object Label Name
	 * @param data
	 * 		Text needs to disappear          
	 * @param timeout
	 *      Wait in seconds
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String waitForTextUntilInVisible(int step, String label,
			String data, int timeout) throws Exception {
		return super.waitForTextUntilInVisible(step, label, data, timeout);
	}
	
	/**
	 * Wait for Text to visible on the webpage in seconds
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Object Label Name
	 * @param data
	 * 	 	Text needs to disappear          
	 * @param timeout
	 *      Wait in seconds
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String waitForTextUntilVisible(int step, String label,
			String data, int timeout) throws Exception {
		return super.waitForTextUntilVisible(step, label, data, timeout);
	}
	
	/**
	 * Wait for Object's Text to visible on the webpage in seconds
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param xpathKey
	 *      Object's xpath locator contain property name       
	 * @param timeout
	 *      Wait in seconds
	 *            
	 * @return 'PASS' or 'FAIL' as String	
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String waitForElementTextUntilVisible(int step, String xpathKey, int timeout)
			throws Exception {
		return super.waitForElementTextUntilVisible(step, xpathKey, timeout);
	}
	
	/**
	 * Wait for a timeout perios, get all the text on a page and looks for "Expected" text with Contains option
	 *  
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param expectedText
	 * 		Text needs to disappear          
	 * @param timeout
	 *      Wait in seconds
	 *            
	 * @return 'PASS' or 'FAIL' as String	
	 * 
	 * @throws Exception
	 * 		if fail, then through exception 
	 */
	public String waitForTextOnScreen(int step, String expectedText,
			int timeout) throws Exception {
		return super.waitForTextOnScreen(step, expectedText, timeout);
	}
	
	/**
	 * Wait for an Object/Element to appear on the Webpage by ID in seconds
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param id
	 *      Id of Object
	 * @param timeout
	 *      Wait in seconds
	 *            
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String waitForElementById(int step, String id, int timeout)
			throws Exception {
		return super.waitForElementById(step, id, timeout);
	}
	
	public String waitForButton(int step, String label, int timeout)
			throws Exception {
		return super.waitForButton(step, label, timeout);
	}
	
	public String waitForLink(int step, String label, int timeout)
			throws Exception {
		return super.waitForLink(step, label, timeout);
	}
	
	public String waitForRadioButton(int step, String label, int timeout)
			throws Exception {
		return super.waitForRadioButton(step, label, timeout);
	}
	
	public String waitForCheckBox(int step, String label, int timeout)
			throws Exception {
		return super.waitForCheckBox(step, label, timeout);
	}
	
	public String waitForInput(int step, String label, int timeout)
			throws Exception {
		return super.waitForInput(step, label, timeout);
	}
	
	public String waitForLabel(int step, String label, int timeout)
			throws Exception {
		return super.waitForLabel(step, label, timeout);
	}
	
	public String waitForTextArea(int step, String label, int timeout)
			throws Exception {
		return super.waitForTextArea(step, label, timeout);
	}
	
	public String waitForTextBox(int step, String label, int timeout)
			throws Exception {
		return super.waitForTextBox(step, label, timeout);
	}
	
	public String waitForTableElement(int step, String label, int timeout)
			throws Exception {
		return super.waitForTableElement(step, label, timeout);
	}
	
	/**
	 * Create New Window - Add window current Handle into HashMap
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param operation
	 *      Operation To Perfrom (CREATE NEW WINDOW OR SWITCH TO EXISTING WINDOW OR CLOSE OPENED WINDOW)
	 * @param windowNumberToSwitch
	 *      Value For Window Number To Switch On
	 * @param windowNumberToClose
	 * 		Window number, which needs to close
	 *            
	 * @return 'PASS' OR 'FAIL' as String
	 */
	public String openNewBrowserTab(int step, String operation,
			String windowNumberToSwitch, String windowNumberToClose) {
		return super.openNewBrowserTab(step, operation, windowNumberToSwitch, 
				windowNumberToClose);
	}
	
	/**
	 * Switch to Exisiting Window - Based on Window number its switch control over pages
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param operation
	 *      Operation To Perfrom (CREATE NEW WINDOW OR SWITCH TO EXISTING WINDOW OR CLOSE OPENED WINDOW)
	 * @param windowNumberToSwitch
	 *      Value For Window Number To Switch On
	 * @param windowNumberToClose
	 * 		Window number, which needs to close
	 *            
	 * @return 'PASS' OR 'FAIL' as String
	 */
	public String switchToBrowserTab(int step, String operation,
			String windowNumberToSwitch, String windowNumberToClose) {
		return super.switchToBrowserTab(step, operation, windowNumberToSwitch, 
				windowNumberToClose);
	}
	
	/**
	 * Close Opened Window - Close Opened Window and Switch back to parent window
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param operation
	 *      Operation To Perfrom (CREATE NEW WINDOW OR SWITCH TO EXISTING WINDOW OR CLOSE OPENED WINDOW)
	 * @param windowNumberToSwitch
	 *      Value For Window Number To Switch On
	 * @param windowNumberToClose
	 * 		Window number, which needs to close
	 *            
	 * @return 'PASS' OR 'FAIL' as String
	 */
	public String closeBrowserTab(int step, String operation,
			String windowNumberToSwitch, String windowNumberToClose) {
		return super.closeBrowserTab(step, operation, windowNumberToSwitch, 
				windowNumberToClose);
	}
	
	/** 
	 * Clear the Entries of Opened Windows Handlers in the HashMap.
	 * This uses inconjunction with OpenNewOrSwitchOrCloseWindow();
	 * CLEAR THE ENTRIES OF OPENED WINDOWS HANDLERS IN THE HASHMAP
	 * THIS IS USE INCONJUNTION WITH openNewOrSwitchOrCloseWindow();
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * 
	 * @return 'PASS' OR 'FAIL' as String
	 */
	public String clearOpenedBrowserHandles(int step) {
		return super.clearOpenedBrowserHandles(step);
	}
	
	/**
	 * Switch focus to an iFrame on Window by ID attribute
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param iFrameId
	 *      Depending upon amount of Frames, this number usually is 1 or 2
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String switchToIFrameById(int step, String iFrameId)
			throws Exception {
		return super.switchToIFrameById(step, iFrameId);
	}
	
	/**
	 * Switch focus to an iFrame on Window by name attribute
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param data
	 *      Window's id Value to find
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String switchToIFrameByName(int step, String data) throws Exception {
		return super.switchToIFrameByName(step, data);
	}

	/**
	 * Switch focus to an iFrame which is the Main Iframe
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String switchToMainframe(int step) throws Exception {
		return super.switchToMainframe(step);
	}
	
	/**
	 * Switch focus to an iFrame on Window by xpath
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param xpathKey
	 *      Object's xpath locator contain property name   
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws Exception
	 * 		if fail, then through exception
	 */
	public String switchToIFrameByXpath(int step, String xpathKey)
			throws Exception {
		return super.switchToIFrameByXpath(step, xpathKey);
	}
	

	/**
	 * Select Checkbox by value
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param valueToCheck
	 *      Text of checkbox, which needs to select
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 */
	public String selectCheckBoxByValue(int step, String valueToCheck) {
		return super.selectCheckBoxByValue(step, valueToCheck);
	}

	/**
	 * Select Checkbox by value based on Object's xpath
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param xpathKey
	 *      Object's xpath locator contain property name
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 */
	public String selectCheckBoxByValueBasedOnXpath(int step, String xpathKey) {
		return super.selectCheckBoxByValueBasedOnXpath(step, xpathKey);
	}
	
	/**
	 * DeSelect Checkbox by value
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param valueToUnCheck
	 *      Text of checkbox, which needs to DeSelect
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 */
	public String deSelectCheckBoxByValue(int step, String valueToUnCheck) {
		return super.deSelectCheckBoxByValue(step, valueToUnCheck);
	}
	
	/**
	 * DeSelect Checkbox by value based on Object's xpath
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param xpathKey
	 *      Object's xpath locator contain property name
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 */
	public String deSelectCheckBoxByValueBasedOnXpath(int step, String xpathKey) {
		return super.deSelectCheckBoxByValueBasedOnXpath(step, xpathKey);
	}
	
	/**
	 * DeSelect Checkbox by value based on Object's xpath
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param xpathKey
	 *      Object's xpath locator contain property name
	 *            
	 * @return 'PASS' or 'FAIL' as String
	 */
	public String selectRadioBtn(int step, String xpathKey) {
		return super.selectRadioBtn(step, xpathKey);
	}

	/**
	 * Compare Web page screen with provded image
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 *      The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param filename
	 *      Image Path which need to be compare
	 *            
	 * @return 'PASS' or 'Pass - Optional Step' or 'FAIL' as String
	 */
	public String compareImage(int step, String filename) {
		return super.compareImage(step, filename);
	}

	/**
	 * Click Enter button of Keyboard
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 * 		Object's Label Name
	 * 
	 * @return 'PASS' or 'FAIL' as String
	 * 
	 * @throws InterruptedException
	 */
	public String pressEnter(int step, String label)
			throws InterruptedException {
		return super.pressEnter(step, label);
	}
	
	/**
	 * Click Right button of Mouse on Object
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param label
	 *      Object's Label Name
	 * 
	 * @return 'PASS' or 'FAIL' as String
	 */
	public String mouseRightBtnClick(int step, String label) {
		return super.mouseRightBtnClick(step, label);
	}

	/**
	 * Rest API Calling Keyword, for verifying API is valid or not, verifying status equals to 200
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param xpathKey
	 * 		Object's xpath locator contain property name
	 * @param URL
	 * 		Rest API URL
	 * 
	 * @return 'PASS' or 'FAIL' as String
	 */
	public String restServiceCall(int step,String URL){
		return super.restServiceCall(step, URL);
	}
	
	/**
	 * verifies WebServices/Rest APIs Status, apart from Get or Post method
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param userNamePasswd
	 * 		Rest API's accessor Credentials
	 * @param urlWSWithMethodType
	 * 		Rest API URL with Get/Post Method type
	 * 
	 * @return 'PASS' or 'FAIL' as String
	 */
	public String verifyWSStatus(int step, String userNamePasswd, String urlWSWithMethodType) {
		return super.verifyWSStatus(step, userNamePasswd, urlWSWithMethodType);
	}
	
	/**
	 * verifies WebServices/Rest APIs mime type, apart from Get or Post method
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param userNamePasswd
	 * 		Rest API's accessor Credentials
	 * @param urlWSWithMethodType
	 * 		Rest API URL with Get/Post Method type
	 * @param mimeType
	 * 		mimeType of response's data
	 * 
	 * @return 'PASS' or 'FAIL' as String
	 */
	public String verifyMimeType(int step, String userNamePasswd, String urlWSWithMethodType, String mimeType) {
		return super.verifyMimeType(step, userNamePasswd, urlWSWithMethodType, mimeType);
	}
	
	/**
	 * get WebServices/Rest APIs response, apart from Get or Post method in XML mime type
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param userNamePasswd
	 * 		Rest API's accessor Credentials
	 * @param urlWSWithMethodType
	 * 		Rest API URL with Get/Post Method type
	 * @param fileName
	 * 		Name of file where response data will store in XML format
	 * 
	 * @return 'PASS' or 'FAIL' as String
	 */
	public String getWSResponse(int step, String userNamePasswd, String urlWSWithMethodType, String fileName) throws ParserConfigurationException, SAXException, IOException, TransformerException{
		return super.getWSResponse(step, userNamePasswd, urlWSWithMethodType, fileName);
	}
	
	/**
	 * get perticular field's value from WebServices/Rest APIs response
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param fileName
	 * 		Name of file where response data is already stored in XML format
	 * @param tagName
	 * 		Name of Field, for which value require
	 * 
	 * @return 'PASS' or 'FAIL' as String
	 */
	public String getFieldValue(int step, String fileName, String tagName) throws SAXException, IOException, ParserConfigurationException {
		return super.getFieldValue(step, fileName, tagName);
	}
	
	/**
	 * verifies perticular field's value from WebServices/Rest APIs response
	 * 
	 * @author Nividous
	 * 
	 * @param step
	 * 		The Row Number (in the WorkSheet 'Test Steps' is on)
	 * @param fileName
	 * 		Name of file where response data is already stored in XML format
	 * @param tagName
	 * 		Name of Field, for which value require
	 * @param tagValue
	 * 		Field's expected value
	 * 
	 * @return 'PASS' or 'FAIL' as String
	 */
	public String verifyFieldValue(int step, String fileName, String tagName, String tagValue) throws SAXException, IOException, ParserConfigurationException {
		return super.verifyFieldValue(step, fileName, tagName, tagValue);
	}
	
	/**
	 * It's Abstarct method, which allow you to create your own new keyword as per your requirenment
	 * Add created new keyword name in switch mwthod to utilize in excel test sheet
	 * 
	 * @author Nividous
	 * 
	 * @throws InterruptedException
	 * @throws Exception
	 */
	public abstract String extendedSwitch(Hashtable<String, String> data,String keyword,int i,String objectKey,String dataColVal,
			 String dataColVal2,String dataColVal3, int timeout) throws InterruptedException, Exception;
	
	/**
	 * It's Abstarct method, which make test class singleton
	 * 
	 * @author Nividous
	 * 
	 * @throws IOException
	 */
	public abstract TestActions getKeywordsInstance() throws IOException;
}
