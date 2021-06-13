import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.navigateToUrl('http://192.168.30.39/BPMLegalV2')

WebUI.click(findTestObject('Page_BPMLegal -/svg_User Administration_svg-inline--fa fa-plus fa-w-14'))

WebUI.sendKeys(findTestObject('Page_BPMLegal -/input_First Name_FIRSTNAME'), 'alnhar')

WebUI.selectOptionByValue(findTestObject('Page_BPMLegal -/select_Please SelectupdatesQA test testmirnarolesRegister new casePaymentsReport and analyticAll RolesLawyerAuditadminemployeelawyer1lawyer2'), 
    '5', true)

WebUI.setText(findTestObject('Page_BPMLegal -/input_Last Name_LASTNAME'), '1')

WebUI.selectOptionByIndex(findTestObject('Page_BPMLegal -/select_Please SelectUser EnableUser Disable'), '1')

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('Page_BPMLegal -/input_Last Name_LASTNAME'), 'alyahya')

