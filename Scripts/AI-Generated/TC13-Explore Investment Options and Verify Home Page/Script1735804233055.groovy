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

"Step 2: Click on body Homepage4 -> Navigate to page 'investment options#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Homepage'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 2-Click on body Homepage4 - Navigate to page investment options.png')

"Step 3: Click on link investments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_options/link_investments'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 3-Click on link investments.png')

"Step 4: Click on link fd-megamenu--desktop  subject -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_options/link_fd-megamenu--desktop__subject'))

WebUI.takeScreenshot(reportLocation + '/TC13/Step 4-Click on link fd-megamenu--desktop  subject - Navigate to page .png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC13-Explore Investment Options and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}