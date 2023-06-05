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

WebUI.setEncryptedText(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/input_Email  User Name_Password'),
	'zzojq9yQ0IhfvR+cLrzcmQ==')

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

WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/div_I-REC'))

WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/p_Next'))

WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__DeviceName'), 'smth')

WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/button_Next'))

WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input_Select Device Fuel_react-select-DeviceFuel-input'), 'Solar')

WebUI.sendKeys(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input_Select Device Fuel_react-select-DeviceFuel-input'),
	Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input_Select_react-select-DeviceTechnology-input'), 'PV Ground Mounted')

WebUI.sendKeys(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input_Select_react-select-DeviceTechnology-input'),
	Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__Capacity'), '11')

WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__CommissionDate'))

WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__CommissionDate'), '04/04/2022')

WebUI.scrollToPosition(99999,99999)

WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__EffectiveDate'), '01/01/2023')

WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/button_Next'))

WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__Address'), 'smth street')

WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__Province'), 'Singapore')

WebUI.setText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/input__react-select-CountryCode-input'), 'United States')

text = WebUI.getText(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/div_Afghanistan'))

println text