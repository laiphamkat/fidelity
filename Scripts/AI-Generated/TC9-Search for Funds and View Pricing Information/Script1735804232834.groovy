import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to */priceandperformance"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/priceandperformance")

"Step 2: Click on fundSearchInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/fundSearchInput'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Click on fundSearchInput.png')

"Step 3: Hover over tr GenericPage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_generic_page/tr_GenericPage3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Hover over tr GenericPage3.png')

"Step 4: Enter input value in fundSearchInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_generic_page/fundSearchInput'), fundSearchInput2)

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Enter input value in fundSearchInput2.png')

"Step 5: Click on americanEquityLink -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/americanEquityLink'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on americanEquityLink - Navigate to page .png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Search for Funds and View Pricing Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}