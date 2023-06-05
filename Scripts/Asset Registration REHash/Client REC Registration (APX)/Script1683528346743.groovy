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

WebUI.navigateToUrl('https://rehash3uat.z23.web.core.windows.net/#/login')

WebUI.setText(findTestObject('Object Repository/Client REC Registration (TIGR)/Page_REHash/input_Welcome to_UserName'), 'tom@trecs.sg')

WebUI.click(findTestObject('Object Repository/Client REC Registration (TIGR)/Page_REHash/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Client REC Registration (TIGR)/Page_REHash/input_Email  User Name_Password'), 
    'zzojq9yQ0IhfvR+cLrzcmQ==')

WebUI.sendKeys(findTestObject('Object Repository/Client REC Registration (TIGR)/Page_REHash/input_Email  User Name_Password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/button_Go to Dashboard'))

if (WebUI.verifyElementVisible(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/div_Privacy Policy'), FailureHandling.OPTIONAL) == true) {
	WebUI.click(findTestObject('Object Repository/UAT TIGR Device Registration/Page_REHash/svg (privacy policy)'))
}

else {
	WebUI.click(findTestObject('Object Repository/Asset Registration IREC/Page_REHash/a_Dashboard'))
}


WebUI.click(findTestObject('Object Repository/Client REC Registration (TIGR)/Page_REHash/a_Register REC'))

WebUI.click(findTestObject('Object Repository/Client REC Registration (TIGR)/Page_REHash/div_Select asset_field-select-responsive in_5f3ef5'))

WebUI.setText(findTestObject('Object Repository/Client REC Registration (TIGR)/Page_REHash/input_Select your asset_react-select-AssetL_8ce7c6'), 
    'jonsons')

WebUI.sendKeys(findTestObject('Object Repository/Client REC Registration (TIGR)/Page_REHash/input_Select your asset_react-select-AssetL_8ce7c6'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Client REC Registration (TIGR)/Page_REHash/button_Next'))

WebUI.setText(findTestObject('Object Repository/Client REC Registration (TIGR)/Page_REHash/input__Generation'), '100')

WebUI.setText(findTestObject('Object Repository/Client REC Registration (TIGR)/Page_REHash/input__VintageFrom'), '03/2022')

WebUI.sendKeys(findTestObject('Object Repository/Client REC Registration (TIGR)/Page_REHash/input__VintageFrom'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Client REC Registration (TIGR)/Page_REHash/input__VintageTo'), '03/2022')

WebUI.sendKeys(findTestObject('Object Repository/Client REC Registration (TIGR)/Page_REHash/input__VintageTo'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Client REC Registration (TIGR)/Page_REHash/input__CheckCondition'))

WebUI.click(findTestObject('Object Repository/Client REC Registration (TIGR)/Page_REHash/p_Next'))

CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Client REC Registration (TIGR)/Page_REHash/Page_REHash/div_Click to upload document (Meter Photo)'), 'C:\\Users\\jovia\\Downloads\\MicrosoftTeams-image(1) (1).png')

CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Client REC Registration (TIGR)/Page_REHash/Page_REHash/div_Click to upload document (Exported Data)'), 'C:\\Users\\jovia\\Downloads\\MicrosoftTeams-image (6).png')

CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Client REC Registration (TIGR)/Page_REHash/Page_REHash/div_Click to upload document (Utility Bills)'), 'C:\\Users\\jovia\\Downloads\\Sample(APX)-LetterofAuthorization(1) (1).png')

WebUI.scrollToPosition(5000,5000)

WebUI.click(findTestObject('Object Repository/Client REC Registration (TIGR)/Page_REHash/button_Submit'))

WebUI.closeBrowser()