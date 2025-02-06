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

"Step 1: Navigate to */products/*"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/products/${GlobalVariable.products_id}")

"Step 2: Click on input FundNameFundCodeTicker"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/input_FundNameFundCodeTicker'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 2-Click on input FundNameFundCodeTicker.png')

"Step 3: Enter input value in input FundNameFundCodeTicker"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/input_FundNameFundCodeTicker'), input_FundNameFundCodeTicker)

WebUI.takeScreenshot(reportLocation + '/TC15/Step 3-Enter input value in input FundNameFundCodeTicker.png')

"Step 4: Click on item productOptions (object)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/item_productOptions'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 4-Click on item productOptions object.png')

"Step 5: Click on link FundName -> Navigate to page 'product page#*/products/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_FundName'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 5-Click on link FundName - Navigate to page product pageproducts.png')

"Step 6: Click on button Price -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_page/button_Price'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 6-Click on button Price - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Search Fund Name and Verify Homepage_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}