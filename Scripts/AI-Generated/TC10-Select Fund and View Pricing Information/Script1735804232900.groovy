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

"Step 1: Navigate to */*/*"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/${GlobalVariable.path_param_2}/${GlobalVariable.path_param_3}")

"Step 2: Click on fundSearchInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/fundSearchInput'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 2-Click on fundSearchInput.png')

"Step 3: Enter input value in combobox fund name input"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_investment_finder/fundSearchInput'), combobox_fund_name_input)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 3-Enter input value in combobox fund name input.png')

"Step 4: Click on fidelityAmericanEquityFundOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/fidelityAmericanEquityFundOption'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 4-Click on fidelityAmericanEquityFundOption.png')

"Step 5: Click on fundNameTag -> Navigate to page 'product page#*/products/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/fundNameTag'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 5-Click on fundNameTag - Navigate to page product pageproducts.png')

"Step 6: Click on priceTab -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_page/priceTab'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 6-Click on priceTab - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Select Fund and View Pricing Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}