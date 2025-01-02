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

"Step 1: Navigate to */*"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/${GlobalVariable.path_param_2}")

"Step 2: Click on fundsDropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_performance_ratings/fundsDropdown'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 2-Click on fundsDropdown.png')

"Step 3: Click on link performanceOptions (CategoryOption)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_performance_ratings/link_performanceOptions'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 3-Click on link performanceOptions CategoryOption.png')

"Step 4: Click on categoryDropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_performance_ratings/categoryDropdown'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 4-Click on categoryDropdown.png')

"Step 5: Click on link performanceOptions (Funds)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_performance_ratings/link_performanceOptions'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 5-Click on link performanceOptions Funds.png')

"Step 6: Click on viewFundButton -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_performance_ratings/viewFundButton'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 6-Click on viewFundButton - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC24-Performance Ratings and Fund Viewing_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}