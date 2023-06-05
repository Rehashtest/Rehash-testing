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

WebUI.setText(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_REHash/input_Welcome to_UserName'), 
    'officeuser')

WebUI.setEncryptedText(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_REHash/input_Email  User Name_Password'), 
    'p4y+y39Ir5MVSEbdClH9Cg==')

WebUI.sendKeys(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_REHash/input_Email  User Name_Password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_REHash/span_Application'))

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_REHash/a_Device Registration'))

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_REHash/button_Submitted (I-REC)'))

WebUI.setText(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_REHash/input_Policy Management_Search'), 
    deviceName)

WebUI.sendKeys(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_REHash/input_Policy Management_Search'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_REHash/button_View'))

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_REHash/Page_REHash/p_ROOFES10007'))

assetCode = WebUI.getText(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_REHash/Page_REHash/p_ROOFES10007'))

println(assetCode)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://sandbox.evident.dev/login')

WebUI.setText(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_Login - IREC/input_Email Address_email'), 
    'irecissueruser17730@mail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_Login - IREC/input_Password_password'), 
    'tSml6uzDUt83cn7LoqRWg373ppEjEm3RyiJBZtt1t/ETXuBEKb7tBQ==')

WebUI.sendKeys(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_Login - IREC/input_Password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_Dashboard - IREC/a_Devices'))

WebUI.setText(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_Device Management - IREC/input_Device Registrations___BVID__163'), 
    assetCode)

WebUI.sendKeys(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_Device Management - IREC/input_Device Registrations___BVID__163'),
	Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_Device Management - IREC/a_Edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_Edit Device - IREC/button_Verify'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_Edit Device - IREC/button_Yes, Verify'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_Device Management - IREC/input_Device Registrations___BVID__393'), 
    assetCode)

WebUI.sendKeys(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_Device Management - IREC/input_Device Registrations___BVID__393'),
	Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_Device Management - IREC/a_Edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_Edit Device - IREC/button_Approve'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval Evident/Page_Edit Device - IREC/button_Yes, Approve'))

WebUI.closeBrowser()

