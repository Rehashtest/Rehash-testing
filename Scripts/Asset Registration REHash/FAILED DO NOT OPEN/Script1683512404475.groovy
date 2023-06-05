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

WebUI.navigateToUrl('https://e2e.rehash.redex.eco/#/login')

WebUI.click(findTestObject('Object Repository/Page_REHash/div_Email  User Name'))

WebUI.setText(findTestObject('Object Repository/Page_REHash/input_Welcome to_UserName'), 'jovianng')

WebUI.click(findTestObject('Object Repository/Page_REHash/div_Password'))

WebUI.click(findTestObject('Object Repository/Page_REHash/div_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_REHash/input_Email  User Name_Password'), '86EPss8z3Vlq1Wl6AHI4Cvbbwex7iAkr')

WebUI.sendKeys(findTestObject('Object Repository/Page_REHash/input_Email  User Name_Password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_REHash/button_Go to Dashboard'))

WebUI.click(findTestObject('Object Repository/Page_REHash/a_Register Asset'))

WebUI.click(findTestObject('Object Repository/Page_REHash/div_Select Registry_field-select-responsive_ee4d3e'))

WebUI.click(findTestObject('Object Repository/Page_REHash/div_TIGR'))

WebUI.click(findTestObject('Object Repository/Page_REHash/p_Next'))

WebUI.setText(findTestObject('Object Repository/Page_REHash/input__ProjectName'), 'Katalon Solar Panels 4')

WebUI.setText(findTestObject('Object Repository/Page_REHash/input__NameplateCapacity'), '0.95')

WebUI.click(findTestObject('Object Repository/Page_REHash/button_Next'))

//WebUI.click(findTestObject('Object Repository/Page_REHash/div_Click to upload document'))

CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Page_REHash/div_Click to upload document'), 'C:\\Users\\jovia\\Downloads\\1. CTY NHẬT MINH ECO.xlsx')

//WebUI.click(findTestObject('Object Repository/Page_REHash/div_Click to upload document (GI)'))

CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Page_REHash/div_Click to upload document (GI)'), 'C:\\Users\\jovia\\Downloads\\13. THIEN PHUOC.xlsx')

CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Page_REHash/div_Click to upload document (Comms)'), 'C:\\Users\\jovia\\Downloads\\12. SOLAR DUC HOA LA.xlsx')

CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Page_REHash/div_Click to upload document (Meter)'), 'C:\\Users\\jovia\\Downloads\\REDEX-RECEIPT-RCPT-2023-04-19-00004.pdf')

CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Page_REHash/div_Click to upload document (APX Form)'), 'C:\\Users\\jovia\\Downloads\\REDEX-RECEIPT-RCPT-2023-04-19-00004.pdf')

CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Page_REHash/div_Click to upload document (LOC)'), 'C:\\Users\\jovia\\Downloads\\REDEX-RECEIPT-RCPT-2023-04-19-00004.pdf')

CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Page_REHash/div_Click to upload document (LOA)'), 'C:\\Users\\jovia\\Downloads\\REDEX-RECEIPT-RCPT-2023-04-19-00004.pdf')

CustomKeywords.'tools.uploadFiles.uploadFile'(findTestObject('Object Repository/Page_REHash/div_Click to upload document (Asset Photo)'), 'C:\\Users\\jovia\\Downloads\\hinh anh du an.jpg')

WebUI.scrollToPosition(9999999, 9999999)

WebUI.click(findTestObject('Object Repository/Page_REHash/p_Submit (aft doc)'))

WebUI.click(findTestObject('Object Repository/Page_REHash/button_Done'))