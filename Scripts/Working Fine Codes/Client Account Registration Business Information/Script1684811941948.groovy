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

TestData assetData = TestDataFactory.findTestData('Data Files/Business Information')

int totalRows = assetData.getRowNumbers()

for (int row = 1; row <= totalRows; row++) {
	
	String userName = assetData.getValue('Username', row)
	
	String password = assetData.getValue('Password', row)
	
	String compRegNum = assetData.getValue('Company Registration Number', row)
	
	String compName = assetData.getValue('Company Name', row)
	
	String compEngName = assetData.getValue('Company English Name', row)
	
	String country = assetData.getValue('Country', row)
	
	String address = assetData.getValue('Address', row)
	
	String paymethod = assetData.getValue('Payment Method', row)
	
	String bankName = assetData.getValue('Bank Name', row)
	
	String bankAccName = assetData.getValue('Bank Account Name', row)
	
	String ACHroutNum = assetData.getValue('ACH Routing Transit Number', row)
	
	String bankAccNum = assetData.getValue('Bank Account Number', row)
	
	String swiftCode = assetData.getValue('Swift Code', row)
	
	String bankAccType = assetData.getValue('Bank Account Type', row)
	
	String recType = assetData.getValue('Recipient Type', row)
	
	String recCountry = assetData.getValue('Recipient Country', row)
	
	String recCity = assetData.getValue('Recipient City', row)
	
	String recAddr = assetData.getValue('Recipient Address', row)
	
	String postCode = assetData.getValue('Post Code', row)
	
	WebUI.openBrowser('')

	WebUI.navigateToUrl('https://uat.rehash.redex.eco/#/login')

	WebUI.click(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/div_Email  User Name'))

	WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input_Welcome to_UserName'), 
		userName)

	WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input_Email  User Name_Password'), 
		password)

	//WebUI.click(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/div_Password'))

	//WebUI.setEncryptedText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input_Email  User Name_Password'), 
		//'p4y+y39Ir5NglOAoDYbW9A==')

	WebUI.click(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/p_Sign In'))

	WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__CompanyRegistrationNumber'), 
		compRegNum)

	WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__CompanyName'), 
		compName)

	WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input_concat(Company, , s English Name)_EnglishCompanyName'), compEngName)

	WebUI.scrollToPosition(99999, 99999)

	WebUI.click(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/div_Select Country_field-select-responsive _f2ef4e'))

	WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__react-select-Country-input'), 
		country)

	WebUI.sendKeys(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__react-select-Country-input'), 
		Keys.chord(Keys.ENTER))

	WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__Address'), 
		address)

//upload documents
	CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/label_Click to upload (Company Registration Document)'),
		'C:\\Users\\jovia\\Downloads\\CompanyRegistration(2) (1).pdf')

	CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/label_Click to upload (LOA)'),
		'C:\\Users\\jovia\\Downloads\\Letter_of_Authorisation_REHash_Account_Registration(4) (4).docx')

	CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/label_Click to upload (Bank Statement)'),
		'C:\\Users\\jovia\\Downloads\\BankStatement (3).ppt')

	WebUI.click(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/p_Next'))

	WebUI.scrollToPosition(0,0)

//for ACH Routing 

	if (paymethod == 'ACH') {
		
		//String bankName = assetData.getValue('Bank Name', row)
		
		//String bankAccName = assetData.getValue('Bank Account Name', row)
		
		//String ACHroutNum = assetData.getValue('ACH Routing Transit Number', row)
		
		//String bankAccNum = assetData.getValue('Bank Account Number', row)
		
		//String bankAccType = assetData.getValue('Bank Account Type', row)
		
		//String recType = assetData.getValue('Recipient Type', row)
		
		//String recCountry = assetData.getValue('Recipient Country', row)
		
		//String recCity = assetData.getValue('Recipient City', row)
		
		//String recAddr = assetData.getValue('Recipient Address', row)
		
		//String postCode = assetData.getValue('Post Code', row)
		
		WebUI.click(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/button_ACH Routing Number'))

		WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__BankName (ACH)'), bankName)

		WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__BankAccountName (ACH)'), bankAccName)

		WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__AbaRoutingTransitNumber (ACH)'), ACHroutNum)

		WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__BankAccountNumber (ACH)'), bankAccNum)

		WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input_Select Bank Account Type_react-select-BankAccountType-input (ACH)'), bankAccType) //Checking or Savings

		WebUI.sendKeys(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input_Select Bank Account Type_react-select-BankAccountType-input (ACH)'),
			Keys.chord(Keys.ENTER))

		WebUI.scrollToPosition(99999,99999)

		WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input_Select Recipient Type_react-select-RecipientType-input (ACH)'), recType) //Business or Person

		WebUI.sendKeys(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input_Select Recipient Type_react-select-RecipientType-input (ACH)'),
			Keys.chord(Keys.ENTER))

		WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input_Select Country_react-select-CountryRecipient-input (ACH)'), recCountry)

		WebUI.sendKeys(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input_Select Country_react-select-CountryRecipient-input (ACH)'),
			Keys.chord(Keys.ENTER))

		WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__City (ACH)'), recCity)

		WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__RecipientAddress (ACH)'),recAddr)

		WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__PostCode (ACH)'), postCode)

		WebUI.click(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/button_Submit'))

	}
//for Swift Code
		
		else if (paymethod == 'Swift') {
			
			//String bankName = assetData.getValue('Bank Name', row)
			
			//String bankAccName = assetData.getValue('Bank Account Name', row)
			
			//String bankAccNum = assetData.getValue('Bank Account Number', row)
			
			//String swiftCode = assetData.getValue('Swift Code', row)
			
			//String recType = assetData.getValue('Recipient Type', row)
			
			//String recCountry = assetData.getValue('Recipient Country', row)
			
			//String recCity = assetData.getValue('Recipient City', row)
			
			//String recAddr = assetData.getValue('Recipient Address', row)
			
			//String postCode = assetData.getValue('Post Code', row)

			WebUI.click(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/button_Swift Code'))

			WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__BankName'), 
				bankName)

			WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__BankAccountName'), 
				bankAccName)

			WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__SwiftCode'), 
				swiftCode)

			WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__BankAccountNumber'), 
				bankAccNum)

			WebUI.scrollToPosition(99999,99999)

			WebUI.click(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/div_Select Recipient Type_field-select-resp_a9fa44'))

			WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__react-select-RecipientType-input'), 
				recType)

			WebUI.sendKeys(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__react-select-RecipientType-input'), 
				Keys.chord(Keys.ENTER))

			WebUI.click(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/div_Select Country_field-select-responsive _f2ef4e_1'))

			WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__react-select-CountryRecipient-input'), 
				recCountry)

			WebUI.sendKeys(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__react-select-CountryRecipient-input'), 
				Keys.chord(Keys.ENTER))

			WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__City'), 
				recCity)

			WebUI.sendKeys(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__City'), 
				Keys.chord(Keys.ENTER))

			WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__RecipientAddress'), 
				recAddr)

			WebUI.sendKeys(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__RecipientAddress'), 
				Keys.chord(Keys.ENTER))

			WebUI.setText(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__PostCode'), 
				postCode)

			WebUI.sendKeys(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/input__PostCode'), 
				Keys.chord(Keys.ENTER))

			WebUI.click(findTestObject('Object Repository/Client Account Registration Business Information/Page_REHash/button_Submit'))
		}
			
		else {
			WebUI.closeBrowser()
		}

}