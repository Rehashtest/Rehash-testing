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

WebUI.setText(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/input_Welcome to_UserName'), 'officeuser')

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/input_Email  User Name_Password'), 
    'p4y+y39Ir5MVSEbdClH9Cg==')

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/p_Sign In'))

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/span_Application'))

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/a_Device Registration'))

WebUI.setText(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/input_Policy Management_Search'), 
    'Bandar Lampung Wind Farm')

WebUI.sendKeys(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/input_Policy Management_Search'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/button_View'))

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/input_Progress_InformationCorrect'))

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/input_Information Correct_DocumentsAreValid'))

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/button_Update'))

WebUI.setText(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/input__AssetCode'), 'testcode3')

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/button_Save'))

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/p_Amend'))

WebUI.scrollToPosition(750,750)

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/div_Select Issuer Code_field-select-respons_f5218d'))

WebUI.setText(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/input__react-select-IssuerCode-input'), 
    'Issuer Org 5E7B2')

WebUI.sendKeys(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/input__react-select-IssuerCode-input'), 
    Keys.chord(Keys.ENTER))

WebUI.scrollToPosition(0,0)

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/button_Confirm'))

WebUI.setText(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/textarea_Remarks_RemarkContent'), 
    'confirmed for automated testing')

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/button_Submit'))

WebUI.click(findTestObject('Object Repository/Ops Admin Device Approval/Page_REHash/p_Submit'))

