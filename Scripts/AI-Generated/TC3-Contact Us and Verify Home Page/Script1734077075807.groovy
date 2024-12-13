import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 1: Navigate to */*/*/*"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/${GlobalVariable.path_param_2}/${GlobalVariable.path_param_3}/${GlobalVariable.path_param_4}")

"Step 2: Click on aboutUsLink -> Navigate to page 'informational page#*/aboutus'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/aboutUsLink'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on aboutUsLink - Navigate to page informational pageaboutus.png')

"Step 3: Click on contactUsLink -> Navigate to page 'contact page#*/contact'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/aboutus?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_informational/contactUsLink'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on contactUsLink - Navigate to page contact pagecontact.png')

"Step 4: Click on sendEmailButton -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/contact?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_contact/sendEmailButton'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on sendEmailButton - Navigate to page .png')

"Step 5: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Contact Us and Verify Home Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}