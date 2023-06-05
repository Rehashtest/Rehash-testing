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

// Load test data
TestData clientData = TestDataFactory.findTestData('Data Files/sample client data')

// Get the total number of rows in the test data
int totalRowsClient = clientData.getRowNumbers()

// Loop through each row
for (int row = 1; row <= totalRowsClient; row++) {
	// Access data from columns
	String username = clientData.getValue('Username', row)
	String password = clientData.getValue('Password', row)

	// Print the data or perform desired actions
	System.out.println("Row " + row + ": Username = " + username + ", Password = " + password)
	
	// Login
	
	WebUI.openBrowser('')
	
	WebUI.maximizeWindow()
	
	WebUI.navigateToUrl('https://rehash3uat.z23.web.core.windows.net/#/login?redirect=/') //needs to be environment specific
	
	WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/div_Email  User Name'))
	
	WebUI.setText(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/input_Welcome to_UserName'), username)
	
	WebUI.setText(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/input_Email  User Name_Password'),password)
		
	WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/p_Sign In'))
	
	// Dashboard
	//WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/button_Go to Dashboard'))
	
	//if (WebUI.verifyElementVisible(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/button_Go to Dashboard'), FailureHandling.OPTIONAL) == true) {
		//WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/button_Go to Dashboard'))
	//}
	
	//else if (WebUI.verifyElementVisible(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/div_Privacy Policy'),
		//FailureHandling.OPTIONAL) == true) {
		//WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/svg (privacy policy)'))
	//} else {
		//WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/a_Dashboard'))
	//}
	
	TestData assetData = TestDataFactory.findTestData('Data Files/sample devices data')
	
	// Get the total number of rows in the test data
	int totalRowsAsset = assetData.getRowNumbers()
	for (int assetRow = 1; assetRow <= totalRowsAsset; assetRow++) {
		
		String businessAccountName = assetData.getValue('Business account name', assetRow)
		String registry = assetData.getValue('Registry', assetRow)
		String deviceName = assetData.getValue('Device Name', assetRow)
		String fuelType = assetData.getValue('Fuel Type', row)
		String deviceTechnology = assetData.getValue('Device Technology', row)
		String nameplateCapacity = assetData.getValue('Nameplate capacity', row)
		String commissionDate = assetData.getValue('Commission date', row)
		String effectiveRegistrationDate = assetData.getValue('Effective Registration Date', row)
		String address = assetData.getValue('Address', row)
		String province = assetData.getValue('Province', row)
		String country = assetData.getValue('Country', row)
		String postalCode = assetData.getValue('Postal Code', row)
		String longitude = assetData.getValue('Longitude', row)
		String latitude = assetData.getValue('Latitude', row)
		String remarks = assetData.getValue('Notes/Remarks', row)
		
		
		// ... Add more columns as needed
	
		// Print the data or perform desired actions
		System.out.println("Row " + assetRow + ": Business account name = " + businessAccountName + ", Registry = " + registry + ", Device Name = " + deviceName)
		
		WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/a_Register Asset'))
		
		WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/div_Select Registry_field-select-responsive_ee4d3e'))
		
		if (registry == 'TIGR') {
			WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/div_TIGR'))
		
			WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/button_Next'))
		
			WebUI.setText(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/input__ProjectName'), deviceName)
		
			WebUI.setText(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/input__NameplateCapacity'), nameplateCapacity)
		
			WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/p_Next'))
		
			CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/Page_REHash/div_Click to upload document (ProofAssetOwnership)'),
				'C:\\Users\\jovia\\Downloads\\1. CTY NHẬT MINH ECO.xlsx')
		
			CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/Page_REHash/div_Click to upload document (Grid Interconnection)'),
				'C:\\Users\\jovia\\Downloads\\1. CTY NHẬT MINH ECO.xlsx')
		
			CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/Page_REHash/div_Click to upload document (Comms Report)'),
				'C:\\Users\\jovia\\Downloads\\1. CTY NHẬT MINH ECO.xlsx')
		
			CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/Page_REHash/div_Click to upload document (MeterInverter)'),
				'C:\\Users\\jovia\\Downloads\\1. CTY NHẬT MINH ECO.xlsx')
		
			CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/Page_REHash/div_Click to upload document (APX Form)'),
				'C:\\Users\\jovia\\Downloads\\1. CTY NHẬT MINH ECO.xlsx')
		
			CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/Page_REHash/div_Click to upload document (LOC)'),
				'C:\\Users\\jovia\\Downloads\\1. CTY NHẬT MINH ECO.xlsx')
		
			CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/Page_REHash/div_Click to upload document (LOA)'),
				'C:\\Users\\jovia\\Downloads\\1. CTY NHẬT MINH ECO.xlsx')
		
			CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/Page_REHash/div_Click to upload document (ProjPhoto)'),
				'C:\\Users\\jovia\\Downloads\\hinh anh du an.jpg')
		
			WebUI.scrollToPosition(9999999, 9999999)
		
			WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/Page_REHash/p_Submit'))
		
			WebUI.delay(2)
		
			WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/Page_REHash/button_Done'))
			WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/a_Dashboard'))
			
		
		//	WebUI.closeBrowser() //WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__Latitude'), Latitude)
			//WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__Longitude'),Longitude)
		} else if (registry == 'I-REC') {
			WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/div_I-REC'))
		
			WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/p_Next'))
		
			WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__DeviceName'), deviceName)
		
			WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/button_Next'))
		
			WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input_Select Device Fuel_react-select-DeviceFuel-input'),
				fuelType)
		
			WebUI.sendKeys(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input_Select Device Fuel_react-select-DeviceFuel-input'),
				Keys.chord(Keys.ENTER))
		
			WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input_Select_react-select-DeviceTechnology-input'),
				deviceTechnology)
		
			WebUI.sendKeys(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input_Select_react-select-DeviceTechnology-input'),
				Keys.chord(Keys.ENTER))
		
			WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__Capacity'), nameplateCapacity)
		
			WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__CommissionDate'))
		
			WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__CommissionDate'), commissionDate)
		
			WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__EffectiveDate'), effectiveRegistrationDate)
			
			WebUI.scrollToPosition(9999999, 9999999)
		
			WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/button_Next'))
		
			WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__Address'), address)
		
			WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__Province'), province)
		
			WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__react-select-CountryCode-input'),
				country)
		
			//WebUI.sendKeys(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__react-select-CountryCode-input'),
				//Keys.chord(Keys.ENTER))
		
			if (WebUI.getText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/div_Afghanistan')) != country) {
				WebUI.sendKeys(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__react-select-CountryCode-input'), Keys.chord(Keys.DOWN, Keys.ENTER))
			}
			
			else {
				WebUI.sendKeys(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__react-select-CountryCode-input'), Keys.chord(Keys.ENTER))
			}
			
			WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__PostCode'), postalCode)
		
			WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/button_Next'))
		
			CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/Page_REHash/div_Click to upload document (Device Registration App Form)'),
				'C:\\Users\\jovia\\Downloads\\OneDrive_2023-02-13\\Asset Reg - Testing Documents\\I-REC\\Completed Device Registration Application Form.pdf')
		
			CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/Page_REHash/div_Click to upload document (Owner Dec Form)'),
				'C:\\Users\\jovia\\Downloads\\OneDrive_2023-02-13\\Asset Reg - Testing Documents\\I-REC\\Owner Declaration Letter.pdf')
		
			CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/Page_REHash/div_Click to upload document (Sample Metering Evidence)'),
				'C:\\Users\\jovia\\Downloads\\OneDrive_2023-02-13\\Asset Reg - Testing Documents\\I-REC\\Sample metering .pdf')
		
			CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/Page_REHash/div_Click to upload document (SLD)'),
				'C:\\Users\\jovia\\Downloads\\OneDrive_2023-02-13\\Asset Reg - Testing Documents\\I-REC\\Single Line Diagram.pdf')
		
			CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/Page_REHash/div_Click to upload document (ProjPhoto)'),
				'C:\\Users\\jovia\\Downloads\\OneDrive_2023-02-13\\Asset Reg - Testing Documents\\I-REC\\Wind Mills - 3.jpg')
		
			WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/Page_REHash/textarea_Notes_Notes'))
		
			WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/Page_REHash/textarea_Notes_Notes'),
				'Testing for Katalon')
		
			WebUI.scrollToPosition(9999999, 9999999)
		
			WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/Page_REHash/button_Submit'))
		
			WebUI.delay(2)
		
			WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/Page_REHash/button_Done'))
			WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/a_Dashboard'))
			}
			
	}
}