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

"Step 1: Navigate to */*/*/*"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/${GlobalVariable.path_param_2}/${GlobalVariable.path_param_3}/${GlobalVariable.path_param_4}")

"Step 2: Click on link about us -> Navigate to page 'informational page#*/aboutus'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/link_about_us'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 2-Click on link about us - Navigate to page informational pageaboutus.png')

"Step 3: Click on link contact us -> Navigate to page 'contact page#*/contact'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/aboutus?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_informational_page/link_contact_us'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 3-Click on link contact us - Navigate to page contact pagecontact.png')

"Step 4: Click on button send email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/contact?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_contact_page/button_send_email'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 4-Click on button send email.png')

"Step 5: Click on link careers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/contact?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_contact_page/link_careers'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 5-Click on link careers.png')

"Step 6: Click on link media centre -> Navigate to page 'media resources#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/contact?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_contact_page/link_media_centre'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 6-Click on link media centre - Navigate to page media resources.png')

"Step 7: Click on span object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_media_resources/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 7-Click on span object - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC20-Contact Us and Verify Home Page Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}