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

TestData assetData = TestDataFactory.findTestData('Data Files/Retirement Data')

int totalRows = assetData.getRowNumbers()

for (int row = 1; row <= totalRows; row++) {
	
	String deviceName = assetData.getValue('Device Name', row)
	
	String vintage = assetData.getValue('Vintage', row)
	
	String quantity = assetData.getValue('Quantity', row)
	
	WebUI.openBrowser('')

	WebUI.navigateToUrl('https://uat.rehash.redex.eco/#/login')

	WebUI.setText(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input_Welcome to_UserName'), 'ba711046@gmail.com')

	WebUI.setEncryptedText(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input_Email  User Name_Password'), 
		'9NLz+4tGZcQ=')

	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/div_Password'))

	WebUI.setText(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input_Email  User Name_Password'), 
		'Password1234@')

	WebUI.sendKeys(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input_Email  User Name_Password'), 
		Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/button_Go to Dashboard'))

//if (WebUI.verifyElementVisible(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/div_Privacy Policy'), FailureHandling.OPTIONAL) == true) {
	//WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/svg (privacy policy)'))
//}

//else {
//	WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/a_Dashboard'))
//}

	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/a_REC Retirement'))

	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/button_Retire REC'))

	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/div_Select Device  Project_field-select-res_8c8655'))

	WebUI.setText(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input__react-select-AssetId-input'), 
		deviceName)

	WebUI.sendKeys(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input__react-select-AssetId-input'), 
		Keys.chord(Keys.ENTER))

	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/p_Confirm'))

	WebUI.setText(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input__react-select-Vintage-input'), 
		vintage)

	WebUI.sendKeys(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input__react-select-Vintage-input'), 
		Keys.chord(Keys.ENTER))

	WebUI.setText(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input__Quantity'), quantity)

	WebUI.sendKeys(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input__Quantity'), Keys.chord(Keys.ENTER))

	WebUI.setText(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/textarea__Reason'), 'testing katalon')

	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/button_Own'))

	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/button_Submit'))
	
	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/button_Confirm'))

	WebUI.closeBrowser()

	WebUI.openBrowser('')

	WebUI.navigateToUrl('https://uat.rehash.redex.eco/#/login')

	WebUI.setText(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input_Welcome to_UserName'), 'officeuser')

	WebUI.setEncryptedText(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input_Email  User Name_Password'), 
		'p4y+y39Ir5MVSEbdClH9Cg==')

	WebUI.sendKeys(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input_Email  User Name_Password'), 
		Keys.chord(Keys.ENTER))

	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/span_Application'))

	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/a_REC Retirement_1'))
	
	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/button_In-Progress'))

	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/button_View'))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/p_Approve'))

	WebUI.setText(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/textarea_Remark_RemarkContent'), 'ok')

	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/button_Submit_1'))

	invoiceNo = WebUI.getText(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/h6_INV-REAR-2023-05-10-00018'))

	WebUI.closeBrowser()

	WebUI.delay(3)

	WebUI.openBrowser('')

	WebUI.deleteAllCookies()

	WebUI.navigateToUrl('https://uat.rehash.redex.eco/#/login')

	WebUI.setText(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input_Welcome to_UserName'), 'ba711046@gmail.com')

	WebUI.setEncryptedText(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input_Email  User Name_Password'), 
		'9NLz+4tGZcQ=')

	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/div_Password'))

	WebUI.setText(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input_Email  User Name_Password'), 
		'Password1234@')

	WebUI.sendKeys(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input_Email  User Name_Password'), 
		Keys.chord(Keys.ENTER))

//WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/button_Go to Dashboard'))

//if (WebUI.verifyElementVisible(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/div_Privacy Policy'), FailureHandling.OPTIONAL) == true) {
	//WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/svg (privacy policy)'))
//}

//else {
	//WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/a_Dashboard'))
//}

	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/a_Accounts Payable'))

	WebUI.setText(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input_t_Search'), invoiceNo)

	WebUI.sendKeys(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input_t_Search'), Keys.chord(Keys.ENTER))

	WebUI.delay(3)

	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/button_View (Acc Payable)'))

	WebUI.delay(2)

	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/button_Confirm Payment'))

	WebUI.delay(1)

	CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/div_Click to upload document'), 'C:\\Users\\jovia\\Downloads\\OneDrive_2023-02-13\\Asset Reg - Testing Documents\\I-REC\\Wind Mills - 3.jpg')

	WebUI.setText(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/textarea_Remark_RemarkContent_1'), 
		'ok')

	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/button_Submit_1'))

	WebUI.closeBrowser()

	WebUI.openBrowser('')

	WebUI.navigateToUrl('https://uat.rehash.redex.eco/#/login')

	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/div_Email  User Name'))

	WebUI.setText(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input_Welcome to_UserName'), 'financeuser')

	WebUI.setEncryptedText(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input_Email  User Name_Password'), 
		'p4y+y39Ir5MVSEbdClH9Cg==')

	WebUI.sendKeys(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input_Email  User Name_Password'), 
		Keys.chord(Keys.ENTER))

	WebUI.setText(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input_t_Search'), invoiceNo)

	WebUI.sendKeys(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/input_t_Search'), Keys.chord(Keys.ENTER))

	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/a_View'))

	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/button_Received Payment'))

	WebUI.setText(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/textarea_Remark_RemarkContent'), 'confirmed payment')

	WebUI.click(findTestObject('Object Repository/REC Retirement Full Flow/Page_REHash/button_Submit_1'))

	WebUI.closeBrowser()
}
