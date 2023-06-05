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

WebUI.click(findTestObject('Object Repository/Ops Device Approval (APX)/Page_REHash/div_Email  User Name'))

WebUI.setText(findTestObject('Object Repository/Ops Device Approval (APX)/Page_REHash/input_Welcome to_UserName'), 'officeuser')

WebUI.setEncryptedText(findTestObject('Object Repository/Ops Device Approval (APX)/Page_REHash/input_Email  User Name_Password'), 
    'p4y+y39Ir5MVSEbdClH9Cg==')

WebUI.sendKeys(findTestObject('Object Repository/Ops Device Approval (APX)/Page_REHash/input_Email  User Name_Password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Ops Device Approval (APX)/Page_REHash/span_Application'))

WebUI.click(findTestObject('Object Repository/Ops Device Approval (APX)/Page_REHash/a_Device Registration'))

WebUI.setText(findTestObject('Object Repository/Ops Device Approval (APX)/Page_REHash/input_Policy Management_Search'), 
    'Solar energy panel')

WebUI.sendKeys(findTestObject('Object Repository/Ops Device Approval (APX)/Page_REHash/input_Policy Management_Search'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Ops Device Approval (APX)/Page_REHash/button_View'))

WebUI.click(findTestObject('Object Repository/Ops Device Approval (APX)/Page_REHash/button_Amend'))

WebUI.setText(findTestObject('Object Repository/Ops Device Approval (APX)/Page_REHash/input__AssetCode'), 'test1234')

WebUI.click(findTestObject('Object Repository/Ops Device Approval (APX)/Page_REHash/button_Save'))

WebUI.click(findTestObject('Object Repository/Ops Device Approval (APX)/Page_REHash/input_Progress_InformationCorrect'))

WebUI.click(findTestObject('Object Repository/Ops Device Approval (APX)/Page_REHash/input_Information Correct_DocumentsAreValid'))

WebUI.click(findTestObject('Object Repository/Ops Device Approval (APX)/Page_REHash/p_Verify'))

