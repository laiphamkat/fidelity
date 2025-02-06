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

"Step 2: Click on link AboutUs -> Navigate to page 'informational#*/aboutus'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/link_AboutUs'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 2-Click on link AboutUs - Navigate to page informationalaboutus.png')

"Step 3: Click on link ContactUs -> Navigate to page 'contact page#*/contact'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/aboutus?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_informational/link_ContactUs'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 3-Click on link ContactUs - Navigate to page contact pagecontact.png')

"Step 4: Click on button SendAnEmail"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/contact?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_contact_page/button_SendAnEmail'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 4-Click on button SendAnEmail.png')

"Step 5: Click on link Careers"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/contact?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_contact_page/link_Careers'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 5-Click on link Careers.png')

"Step 6: Click on link MediaCentre -> Navigate to page 'media resources#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/contact?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_contact_page/link_MediaCentre'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 6-Click on link MediaCentre - Navigate to page media resources.png')

"Step 7: Click on span object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_media_resources/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 7-Click on span object - Navigate to page .png')

"Step 8: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC24-Contact Us and Verify Homepage_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}