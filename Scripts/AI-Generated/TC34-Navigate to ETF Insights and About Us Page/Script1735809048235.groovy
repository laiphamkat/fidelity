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

"Step 2: Click on priceAndPerformanceLink -> Navigate to page 'generic page#*/priceandperformance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/priceAndPerformanceLink'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 2-Click on priceAndPerformanceLink - Navigate to page generic pagepriceandperformance.png')

"Step 3: Click on insightsLink -> Navigate to page 'educational content#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/insightsLink'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 3-Click on insightsLink - Navigate to page educational content.png')

"Step 4: Click on aboutUsLink -> Navigate to page 'informational page#*/aboutus'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/aboutUsLink'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 4-Click on aboutUsLink - Navigate to page informational pageaboutus.png')

"Step 5: Click on proxyVotingLink -> Navigate to page 'generic proxy#*/proxy'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/aboutus?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_informational_page/proxyVotingLink'))

WebUI.takeScreenshot(reportLocation + '/TC34/Step 5-Click on proxyVotingLink - Navigate to page generic proxyproxy.png')

"Step 6: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC34-Navigate to ETF Insights and About Us Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}