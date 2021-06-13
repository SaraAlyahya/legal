import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.ExcelData
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class CreateUsers {
	@Given("User navigates to the Application")
	def navigatesToApp(){
		WebUI.openBrowser('http://192.168.30.39/BPMLegalV2')
	}

	@And ("User enters username")
	def entersUserName(){
		WebUI.sendKeys(findTestObject('Page_BPMLegal - Login/input_Error_UserName'), 'admin')
	}

	@When ("Maximise the Browser")
	def maxBrowser(){
		WebUI.maximizeWindow()
	}

	@Then ("clicks on Usename Field")
	def clickOnUserName(){
		WebUI.click(findTestObject('Page_BPMLegal - Login/label_Username'))
	}

	@And ("User clicks on Password Field")
	def clickPass(){
		WebUI.click(findTestObject('Page_BPMLegal - Login/label_Password'))
	}

	@And ("User enters Password")
	def entersPass(){
		WebUI.sendKeys(findTestObject('Page_BPMLegal - Login/input_Username_Password'), '1')
	}

	@And ("clicks on Login")
	def clickOn(){
		WebUI.click(findTestObject('Page_BPMLegal - Login/button_Login'))
	}

	@And ("clicks on Administration")
	def clickOnAdmin(){
		WebUI.click(findTestObject('Page_BPMLegal - Index/label_Administration'))
	}

	@And ("clicks on User Administration")
	def clickOnAdminuser(){
		WebUI.click(findTestObject('Page_BPMLegal -/svg_User Administration_svg-inline--fa fa-plus fa-w-14'))
	}

	@And ("fills (.*) and fills (.*)")
	def fillUserName(String username , String firstname){
		WebUI.setText(findTestObject('Page_BPMLegal -/input_User Name_USERNAME'), username)
		WebUI.setText(findTestObject('Page_BPMLegal -/input_First Name_FIRSTNAME') , firstname)
	}



	@And ("user fills lastname")
	def fillLastName(){
		WebUI.sendKeys(findTestObject('Page_BPMLegal -/LastName'), 'alnhar')
	}

	@And ("user fills Phone extenstion")
	def filext(){
		WebUI.setText(findTestObject('Page_BPMLegal -/input_Phone Extention_PHONEEX'), '1234')
	}

	@And ("enters (.*)")
	def fillfirst(String firstname){
		WebUI.setText(findTestObject('Page_BPMLegal -/input_First Name_FIRSTNAME') , firstname)

		//ExcelData sheet1 = findTestData('Demo1')
		//Random rand = new Random()
		//int rowCount = sheet1 .getRowNumbers()
		//int rowLV = (rand.nextInt(rowCount - 1) + 1);
		//String firstname = sheet1 .getValue(1, rowLV)

		//firstname)
	}


	@And ("user fills phone number")
	def fillphone(){
		WebUI.setText(findTestObject('Page_BPMLegal -/input_Phone Number_PHONENUMBER'), '0790002563')
	}

	@And ("user fills emails notification")
	def fillnotif(){
		WebUI.selectOptionByIndex(findTestObject('Page_BPMLegal -/select_Please Selectnoyes'), '1')
	}

	@And ("user fills email address")
	def fillemailadd(){
		WebUI.setText(findTestObject('Page_BPMLegal -/input_Email Address_EMAILADDRESS'), 'ss@ss.com')
	}

	@And ("user fills enable disable")
	def fillenable(){
		WebUI.selectOptionByIndex(findTestObject('Page_BPMLegal -/select_Please SelectUser EnableUser Disable'), '1')
	}

	@And ("user fills role")
	def fillrole(){
		WebUI.selectOptionByIndex(findTestObject('Page_BPMLegal -/select_Please SelectupdatesQA test testmirnarolesRegister new casePaymentsReport and analyticAll RolesLawyerAuditadminemployeelawyer1lawyer2'),
				'3')
	}

	@And ("user fills description")
	def filldesc(){
		WebUI.selectOptionByIndex(findTestObject('Page_BPMLegal -/select_Please SelectLawyerAdminAuditCentral managerEmployee'), '5')
	}

	@And ("user fills user status")
	def fillstatus(){
		WebUI.selectOptionByIndex(findTestObject('Page_BPMLegal -/select_Please SelectPresentAbsent'), '1')
	}

	@And ("clicks on Save")
	def clicktoSave(){
		WebUI.click(findTestObject('Page_BPMLegal -/button_Save'))
	}
}






