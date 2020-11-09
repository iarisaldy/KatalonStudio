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

WebUI.navigateToUrl('https://community.idntimes.com/login')

WebUI.setText(findTestObject('Object Repository/Page_Sign In  IDN Times/input_Email_email'), 'alam.baka.99@yahoo.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In  IDN Times/input_Password_password'), 'Kh8YlhhrrZq9lDrwnpLheQ==')

WebUI.click(findTestObject('Object Repository/Page_Sign In  IDN Times/button_Sign In'))

WebUI.delay(15)

WebUI.click(findTestObject('Object Repository/Page_Dashboard  IDN Times/i_Talk to Us_idn-mini-icon idn-write'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Editor  IDN Times/label_Pilih Topics'))

WebUI.click(findTestObject('Page_Editor  IDN Times/p_Automotive   Berita Otomotif Terbaru Hari_da8068'))

WebUI.setText(findTestObject('Object Repository/Page_Editor  IDN Times/h1_judul'), 'judul')

WebUI.setText(findTestObject('Object Repository/Page_Editor  IDN Times/p_cuplikan'), 'cuplikan')

WebUI.click(findTestObject('Object Repository/Page_Editor  IDN Times/button_Sisipkan Gambar'))

WebUI.click(findTestObject('Object Repository/Page_Editor  IDN Times/span_Pilih Semua_GalleryStyles__check___16cXI'))

WebUI.click(findTestObject('Object Repository/Page_Editor  IDN Times/div_Galeri Gambar'))

WebUI.click(findTestObject('Object Repository/Page_Editor  IDN Times/span_Pilih Semua_GalleryStyles__check___16cXI'))

WebUI.click(findTestObject('Object Repository/Page_Editor  IDN Times/img_Pilih Semua_GalleryStyles__image-grid___pOed4'))

WebUI.click(findTestObject('Object Repository/Page_Editor  IDN Times/svg_Tambah Section_feather feather-x'))

WebUI.click(findTestObject('Object Repository/Page_Editor  IDN Times/svg_Submit_feather feather-save'))

