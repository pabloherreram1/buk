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

CustomKeywords.'com.help.openYourStore.openYourStore.open'('https://opencart.abstracta.us/index.php?route=account/login')

WebUI.setText(findTestObject('yourStore/ingresarUsuario/l_Email'), email)

WebUI.setText(findTestObject('yourStore/ingresarUsuario/l_Password'), pass)

WebUI.click(findTestObject('yourStore/ingresarUsuario/l_btnLogin'))

WebUI.click(findTestObject('yourStore/FlujoCompleto/btnLogo'))

WebUI.click(findTestObject('yourStore/FlujoCompleto/addMac'))

WebUI.click(findTestObject('yourStore/FlujoCompleto/addIphone'))

WebUI.click(findTestObject('yourStore/FlujoCompleto/addCanon'))

WebUI.click(findTestObject('yourStore/FlujoCompleto/addTocartCanon'))

requeride = WebUI.verifyElementPresent(findTestObject('yourStore/FlujoCompleto/selectRequeride'), 2)

println(requeride)

if (requeride == true) {
    WebUI.selectOptionByValue(findTestObject('yourStore/FlujoCompleto/selectColor'), '16', false)
}

WebUI.setText(findTestObject('yourStore/FlujoCompleto/cantidadCanon'), '2')

WebUI.click(findTestObject('yourStore/FlujoCompleto/addTocartCanon'))

WebUI.click(findTestObject('yourStore/FlujoCompleto/cartTotal'))

WebUI.click(findTestObject('yourStore/FlujoCompleto/ViewCart'))

WebUI.click(findTestObject('yourStore/FlujoCompleto/removeOneCanon'))

WebUI.click(findTestObject('yourStore/FlujoCompleto/btnCheckout'))

WebUI.click(findTestObject('yourStore/FlujoCompleto/c_newAddress'))

WebUI.click(findTestObject('yourStore/FlujoCompleto/btnContinueCheckout'))

f_Name = WebUI.verifyElementPresent(findTestObject('yourStore/FlujoCompleto/a_dateRequerides/re_firstName'), 2)

println(f_Name)

l_Name = WebUI.verifyElementPresent(findTestObject('yourStore/FlujoCompleto/a_dateRequerides/re_lastName'), 2)

address = WebUI.verifyElementPresent(findTestObject('yourStore/FlujoCompleto/a_dateRequerides/re_address1'), 2)

city = WebUI.verifyElementPresent(findTestObject('yourStore/FlujoCompleto/a_dateRequerides/re_city'), 2)

postCode = WebUI.verifyElementPresent(findTestObject('yourStore/FlujoCompleto/a_dateRequerides/re_postCode'), 2)

region = WebUI.verifyElementPresent(findTestObject('yourStore/FlujoCompleto/a_dateRequerides/re_region'), 2)

if ((((((f_Name == true) && (l_Name == true)) && (address == true)) && (city == true)) && (postCode == true)) && (region == 
true)) {
    WebUI.setText(findTestObject('yourStore/FlujoCompleto/c_firstName'), nombre)

    WebUI.setText(findTestObject('yourStore/FlujoCompleto/c_lastName'), apellido)

    WebUI.setText(findTestObject('yourStore/FlujoCompleto/c_company'), company)

    WebUI.setText(findTestObject('yourStore/FlujoCompleto/c_address1'), address1)

    WebUI.setText(findTestObject('yourStore/FlujoCompleto/c_address2'), address2)

    WebUI.setText(findTestObject('yourStore/FlujoCompleto/c_city'), ciudad)

    WebUI.setText(findTestObject('yourStore/FlujoCompleto/c_postCode'), postcode)

    WebUI.selectOptionByValue(findTestObject('yourStore/FlujoCompleto/c_country'), '43', false)

    WebUI.selectOptionByValue(findTestObject('yourStore/FlujoCompleto/c_region'), '681', false)
}

WebUI.click(findTestObject('yourStore/FlujoCompleto/btnContinueCheckout'))

WebUI.click(findTestObject('yourStore/FlujoCompleto/btnContinueCheckout2'))

WebUI.click(findTestObject('yourStore/FlujoCompleto/btnContinueCheckout3'))

WebUI.click(findTestObject('yourStore/FlujoCompleto/btnContinueCheckout4'))

warningCheck = WebUI.waitForImagePresent(findTestObject('yourStore/crearUsuario/r_warning'), GlobalVariable.timePage)

if (warningCheck == true) {
    WebUI.click(findTestObject('Object Repository/yourStore/FlujoCompleto/c_checkbox'))

    WebUI.click(findTestObject('yourStore/FlujoCompleto/btnContinueCheckout4'))
}

WebUI.click(findTestObject('yourStore/FlujoCompleto/c_confirmOrder'))

WebUI.verifyElementText(findTestObject('yourStore/FlujoCompleto/exito'), 'Your order has been placed!')

WebUI.click(findTestObject('yourStore/FlujoCompleto/btnContinueCheckout5'))

CustomKeywords.'com.help.cerrarSesion.cerrarSesion.cerrar'()

