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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://rehash3uat.z23.web.core.windows.net/#/login?redirect=/')

WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/div_Email  User Name'))

WebUI.setText(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/input_Welcome to_UserName'), 'tom@trecs.sg')

WebUI.setEncryptedText(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/input_Email  User Name_Password'),
	'9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/div_Password'))

WebUI.setText(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/input_Email  User Name_Password'),
	'Tom@12345')

WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/p_Sign In'))

if (WebUI.verifyElementVisible(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/button_Go to Dashboard'), FailureHandling.OPTIONAL) == true) {
	WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/button_Go to Dashboard'))
}

else if (WebUI.verifyElementVisible(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/div_Privacy Policy'), FailureHandling.OPTIONAL) == true) {
	WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/svg (privacy policy)'))
}

else {
	WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/a_Dashboard'))
}


WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/a_Register Asset'))

WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/div_Select Registry_field-select-responsive_ee4d3e'))

if (Registry == 'TIGR') {
	WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/div_TIGR'))
	
	WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/button_Next'))
	
	WebUI.setText(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/input__ProjectName'), Name)
	
	WebUI.setText(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/input__NameplateCapacity'), Capacity)
	
	WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/p_Next'))
	
	CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/Page_REHash/div_Click to upload document (ProofAssetOwnership)'), 'C:\\Users\\jovia\\Downloads\\1. CTY NHẬT MINH ECO.xlsx')
	
	CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/Page_REHash/div_Click to upload document (Grid Interconnection)'), 'C:\\Users\\jovia\\Downloads\\13. THIEN PHUOC.xlsx')
	
	CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/Page_REHash/div_Click to upload document (Comms Report)'), 'C:\\Users\\jovia\\Downloads\\12. SOLAR DUC HOA LA.xlsx')
	
	CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/Page_REHash/div_Click to upload document (MeterInverter)'), 'C:\\Users\\jovia\\Downloads\\REDEX-RECEIPT-RCPT-2023-04-19-00004.pdf')
	
	CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/Page_REHash/div_Click to upload document (APX Form)'), 'C:\\Users\\jovia\\Downloads\\REDEX-RECEIPT-RCPT-2023-04-19-00004.pdf')
	
	CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/Page_REHash/div_Click to upload document (LOC)'), 'C:\\Users\\jovia\\Downloads\\REDEX-RECEIPT-RCPT-2023-04-19-00004.pdf')
	
	CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/Page_REHash/div_Click to upload document (LOA)'), 'C:\\Users\\jovia\\Downloads\\REDEX-RECEIPT-RCPT-2023-04-19-00004.pdf')
	
	CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/Page_REHash/div_Click to upload document (ProjPhoto)'), 'C:\\Users\\jovia\\Downloads\\hinh anh du an.jpg')
	
	WebUI.scrollToPosition(9999999, 9999999)
	
	WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/Page_REHash/p_Submit'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/Page_REHash/button_Done'))
	
	WebUI.closeBrowser()
}

else if (Registry == 'I-REC') {
	WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/div_I-REC'))
	
	WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/p_Next'))
	
	WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__DeviceName'), Name)
	
	WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/button_Next'))
	
	WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input_Select Device Fuel_react-select-DeviceFuel-input'), primaryFuel)
	
	WebUI.sendKeys(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input_Select Device Fuel_react-select-DeviceFuel-input'),
		Keys.chord(Keys.ENTER))
	
	WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input_Select_react-select-DeviceTechnology-input'), deviceTech)
	
	WebUI.sendKeys(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input_Select_react-select-DeviceTechnology-input'),
		Keys.chord(Keys.ENTER))
	
	WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__Capacity'), Capacity)
	
	WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__CommissionDate'))
	
	WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__CommissionDate'), commsDate)
	
	WebUI.scrollToPosition(99999,99999)
	
	WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__EffectiveDate'), effectiveDate)
	
	WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/button_Next'))
	
	WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__Address'), Address)
	
	WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__Province'), State)
	
	WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__react-select-CountryCode-input'), Country)
	
	if (WebUI.getText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/div_Afghanistan')) != Country) {
		WebUI.sendKeys(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__react-select-CountryCode-input'), Keys.chord(Keys.DOWN, Keys.ENTER))
	}
	
	else {
		WebUI.sendKeys(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__react-select-CountryCode-input'), Keys.chord(Keys.ENTER))
	}
	
	WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__PostCode'), 'NA')
	
	//WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__Latitude'), Latitude)
	
	//WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__Longitude'),Longitude)
	
	WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/button_Next'))
	
	CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/Page_REHash/div_Click to upload document (Device Registration App Form)'), 'C:\\Users\\jovia\\Downloads\\OneDrive_2023-02-13\\Asset Reg - Testing Documents\\I-REC\\Completed Device Registration Application Form.pdf')
	
	CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/Page_REHash/div_Click to upload document (Owner Dec Form)'), 'C:\\Users\\jovia\\Downloads\\OneDrive_2023-02-13\\Asset Reg - Testing Documents\\I-REC\\Owner Declaration Letter.pdf')
	
	CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/Page_REHash/div_Click to upload document (Sample Metering Evidence)'), 'C:\\Users\\jovia\\Downloads\\OneDrive_2023-02-13\\Asset Reg - Testing Documents\\I-REC\\Sample metering .pdf')
	
	CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/Page_REHash/div_Click to upload document (SLD)'), 'C:\\Users\\jovia\\Downloads\\OneDrive_2023-02-13\\Asset Reg - Testing Documents\\I-REC\\Single Line Diagram.pdf')
	
	CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/Page_REHash/div_Click to upload document (ProjPhoto)'), 'C:\\Users\\jovia\\Downloads\\OneDrive_2023-02-13\\Asset Reg - Testing Documents\\I-REC\\Wind Mills - 3.jpg')
		
	WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/Page_REHash/textarea_Notes_Notes'))
	
	WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/Page_REHash/textarea_Notes_Notes'), 'Testing for Katalon')
	
	WebUI.scrollToPosition(9999999, 9999999)
	
	WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/Page_REHash/button_Submit'))
	
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/Page_REHash/button_Done'))
	
}

else {
WebUI.closeBrowser()
	}
