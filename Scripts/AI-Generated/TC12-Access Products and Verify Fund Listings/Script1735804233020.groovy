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

"Step 1: Navigate to */products/*/*"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/products/${GlobalVariable.products_id}/${GlobalVariable.path_param_4}")

"Step 2: Click on div HighchartsToolbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/div_HighchartsToolbar'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 2-Click on div HighchartsToolbar.png')

"Step 3: Click on div StockToolsWrapper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/div_StockToolsWrapper'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 3-Click on div StockToolsWrapper.png')

"Step 4: Click on link language"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_language'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 4-Click on link language.png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Access Products and Verify Fund Listings_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}