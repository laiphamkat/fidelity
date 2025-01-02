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

"Step 2: Click on link articles webcasts podcasts -> Navigate to page 'insights library#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/link_articles_webcasts_podcasts'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 2-Click on link articles webcasts podcasts - Navigate to page insights library.png')

"Step 3: Click on button insights (Podcasts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_insights_library/button_insights"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_insights_library/button_insights', ['button_insights_class': button_insights_class, 'button_insights_nthChild': button_insights_nthChild, 'button_insights_internalRoleCheckboxName': button_insights_internalRoleCheckboxName]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 3-Click on button insights Podcasts.png')

"Step 4: Click on button insights (Wellness)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_insights_library/button_insights"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_insights_library/button_insights', ['button_insights_class': button_insights_class_1, 'button_insights_nthChild': button_insights_nthChild_1, 'button_insights_internalRoleCheckboxName': button_insights_internalRoleCheckboxName_1]))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 4-Click on button insights Wellness.png')

"Step 5: Click on button apply filters"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_library/button_apply_filters'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 5-Click on button apply filters.png')

"Step 6: Click on button filter clear"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_library/button_filter_clear'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 6-Click on button filter clear.png')

"Step 7: Click on link editorial card -> Navigate to page 'sustainable investing#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_library/link_editorial_card'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 7-Click on link editorial card - Navigate to page sustainable investing.png')

"Step 8: Click on link webcast registration -> Navigate to page 'registration page#*/*/webcasts-registration'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_sustainable_investing/link_webcast_registration'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 8-Click on link webcast registration - Navigate to page registration pagewebcasts-registration.png')

"Step 9: Click on link fidelity connects live webcasts2 -> Navigate to page 'investment options#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/webcasts-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_registration_page/link_fidelity_connects_live_webcasts'))

WebUI.takeScreenshot(reportLocation + '/TC15/Step 9-Click on link fidelity connects live webcasts2 - Navigate to page investment options.png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC15-Insights Library and Webcast Registration Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}