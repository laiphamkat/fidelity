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

"Step 1: Navigate to *"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}")

"Step 2: Enter input value in input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_homepage/input_Search'), input_Search)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 2-Enter input value in input Search.png')

"Step 3: Enter input value in input Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_homepage/input_Search'), input_Search_1)

WebUI.takeScreenshot(reportLocation + '/TC6/Step 3-Enter input value in input Search.png')

"Step 4: Click on button SubmitSearch -> Navigate to page 'search results#content/*/*/search-results.html'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/button_SubmitSearch'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on button SubmitSearch - Navigate to page search resultscontentsearch-resultshtml.png')

"Step 5: Click on atomic object -> Navigate to page 'product#*/products/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + 'content/.*/.*/search-results.html?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_search_results/atomic_object'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on atomic object - Navigate to page productproducts.png')

"Step 6: Click on link GlobalInvestmentNetwork -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_GlobalInvestmentNetwork'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on link GlobalInvestmentNetwork - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Search for Products and Return to Homepage_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}