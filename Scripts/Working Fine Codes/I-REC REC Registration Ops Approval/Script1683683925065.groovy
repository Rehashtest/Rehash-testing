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
import org.openqa.selenium.Keys as Keys

import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testdata.TestData

WebUI.openBrowser('')

WebUI.navigateToUrl('https://rehash3uat.z23.web.core.windows.net/#/login')

WebUI.click(findTestObject('Object Repository/I-REC REC Registration/Page_REHash/input_Welcome to_UserName'))

WebUI.setText(findTestObject('Object Repository/I-REC REC Registration/Page_REHash/input_Welcome to_UserName'), 'officeuser')

WebUI.setEncryptedText(findTestObject('Object Repository/I-REC REC Registration/Page_REHash/input_Required_Password'), 'p4y+y39Ir5MVSEbdClH9Cg==')

WebUI.sendKeys(findTestObject('Object Repository/I-REC REC Registration/Page_REHash/input_Required_Password'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/I-REC REC Registration/Page_REHash/span_Application'))

TestData assetData = TestDataFactory.findTestData('Data Files/RECs Test Data')

int totalRows = assetData.getRowNumbers()

for (int row = 1; row <= totalRows; row++) {
	
	String assetName = assetData.getValue('Device Name', row)

	WebUI.click(findTestObject('Object Repository/I-REC REC Registration/Page_REHash/a_REC Registration'))
	
	WebUI.scrollToPosition(0,0)
	
	WebUI.click(findTestObject('Object Repository/I-REC REC Registration/Page_REHash/button_New'))

	WebUI.setText(findTestObject('Object Repository/I-REC REC Registration/Page_REHash/input_Policy Management_Search'), assetName)
	
	WebUI.sendKeys(findTestObject('Object Repository/I-REC REC Registration/Page_REHash/input_Policy Management_Search'), Keys.chord(Keys.ENTER))

	WebUI.click(findTestObject('Object Repository/I-REC REC Registration/Page_REHash/button_View'))

	WebUI.click(findTestObject('Object Repository/I-REC REC Registration/Page_REHash/input_Progress_InformationCorrect'))

	WebUI.click(findTestObject('Object Repository/I-REC REC Registration/Page_REHash/input_Information Correct_DocumentsAreValid'))

	WebUI.scrollToPosition(99999, 99999)

	WebUI.click(findTestObject('Object Repository/I-REC REC Registration/Page_REHash/p_Submit'))
	
	WebUI.click(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/a_Dashboard'))

}

