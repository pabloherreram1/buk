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

CustomKeywords.'com.help.openYourStore.openYourStore.open'('http://opencart.abstracta.us/index.php?route=common/home')

WebUI.click(findTestObject('yourStore/crearUsuario/btnMyAccount'))

WebUI.click(findTestObject('yourStore/crearUsuario/btnRegister'))

WebUI.click(findTestObject('yourStore/crearUsuario/r_btnContinue'))

WebUI.delay(2)

warning = WebUI.waitForImagePresent(findTestObject('yourStore/crearUsuario/r_warning'), GlobalVariable.timePage)

println(warning)

if (warning == true) {
    int num = ((Math.random() * 1000) as int)

    def z = ['Laura', 'Amalia', 'Francisco', 'Jeremy', 'Pablo', 'Ignacio', 'Christina', 'German', 'Marcelo', 'Monica', 'Antonia']

    Random rn = new Random()

    variable = (z[rn.nextInt(z.size)])

    WebUI.setText(findTestObject('yourStore/crearUsuario/r_firstName'), variable + num)

    WebUI.setText(findTestObject('yourStore/crearUsuario/r_lastName'), variable)

    WebUI.setText(findTestObject('yourStore/crearUsuario/r_email'), (variable + num) + '@qa.cl')

    WebUI.setText(findTestObject('yourStore/crearUsuario/r_telephone'), '952687415')

    WebUI.setText(findTestObject('yourStore/crearUsuario/r_password'), variable)

    WebUI.setText(findTestObject('yourStore/crearUsuario/r_passwordConfirm'), variable)

    WebUI.click(findTestObject('yourStore/crearUsuario/r_suscribeYes'))

    WebUI.click(findTestObject('yourStore/crearUsuario/r_privacyPolicy'))

    WebUI.delay(2)

    WebUI.takeScreenshot((('C:\\KAtalon\\Proyectos\\Desafio_Buk\\img\\' + variable) + num) + '.jpg')

    WebUI.click(findTestObject('yourStore/crearUsuario/r_btnContinue'))

    WebUI.waitForElementClickable(findTestObject('yourStore/crearUsuario/a_bntContinue'), GlobalVariable.timePage)

    WebUI.click(findTestObject('yourStore/crearUsuario/a_bntContinue'))

    WebUI.delay(2)

    WebUI.click(findTestObject('yourStore/crearUsuario/btnMyAccount'))

    WebUI.click(findTestObject('yourStore/crearUsuario/a_logOut'))

    WebUI.click(findTestObject('yourStore/crearUsuario/a_bntContinue'))
}

WebUI.closeBrowser()

