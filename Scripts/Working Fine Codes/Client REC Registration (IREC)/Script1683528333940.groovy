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

WebUI.click(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/div_Email  User Name'))

WebUI.setText(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/input_Welcome to_UserName'), 
    'ba711046@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/input_Email  User Name_Password'), 
    '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/input_Email  User Name_Password'), 
    'p4y+y39Ir5NglOAoDYbW9A==')

WebUI.sendKeys(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/input_Email  User Name_Password'), 
    Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/button_Go to Dashboard'))

//if (WebUI.verifyElementVisible(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/div_Privacy Policy'), FailureHandling.OPTIONAL) == true) {
	//WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/svg (privacy policy)'))
//}

//else {
	//WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/a_Dashboard'))
//}

TestData assetData = TestDataFactory.findTestData('Data Files/RECs Test Data')

int totalRows = assetData.getRowNumbers()

for (int row = 1; row <= totalRows; row++) {
	
	String assetName = assetData.getValue('Device Name', row)
	
	String startDate = assetData.getValue('Start Date', row)
	
	String endDate = assetData.getValue('End Date', row)
	
	String quantity = assetData.getValue('Quantity', row)

	WebUI.click(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/h4_Register REC'))

	WebUI.click(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/div_Select asset_field-select-responsive in_5f3ef5'))

	WebUI.setText(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/input_Select your asset_react-select-AssetL_8ce7c6'), 
		assetName)


	WebUI.sendKeys(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/input_Select your asset_react-select-AssetL_8ce7c6'), 
		Keys.chord(Keys.ENTER))

	WebUI.click(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/button_Next'))

	WebUI.click(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/div_1Information2DocumentsAsset Information_21f5dd'))

	WebUI.setText(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/input__StartDate'), startDate)

	WebUI.sendKeys(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/input__StartDate'), Keys.chord(
			Keys.ENTER))

	WebUI.setText(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/input__EndDate'), endDate)

	WebUI.sendKeys(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/input__EndDate'), Keys.chord(
			Keys.ENTER))

	WebUI.setText(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/input__Quantity'), quantity)

	WebUI.click(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/input__CheckCondition'))

	WebUI.scrollToPosition(5000,5000)

	WebUI.click(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/p_Next'))

	CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/Page_REHash/div_Click to upload document (I-REC Issuing Declaration)'), 'C:\\Users\\jovia\\Downloads\\REDEX-RECEIPT-RCPT-2023-04-19-00004.pdf')

	CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/Page_REHash/div_Click to upload document (I-REC Issuance Request Form)'), 'C:\\Users\\jovia\\Downloads\\REDEX-RECEIPT-RCPT-2023-04-19-00004.pdf')

	CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/Page_REHash/div_Click to upload document (Photos of Meter Reading)'), 'C:\\Users\\jovia\\Downloads\\REDEX-RECEIPT-RCPT-2023-04-19-00004.pdf')

	WebUI.scrollToPosition(5000,5000)

	WebUI.setText(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/textarea_NOTES_Notes'), 'testing for katalon')

	WebUI.click(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/button_Submit'))
	
	WebUI.click(findTestObject('Object Repository/Client REC Registration (I-REC)/Page_REHash/p_Dashboard'))
}

