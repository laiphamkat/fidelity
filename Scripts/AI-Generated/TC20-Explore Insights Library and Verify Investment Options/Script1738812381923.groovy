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

"Step 2: Click on link ArticlesWebcastsPodcasts -> Navigate to page 'insights library#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/link_ArticlesWebcastsPodcasts'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 2-Click on link ArticlesWebcastsPodcasts - Navigate to page insights library.png')

"Step 3: Click on button wellnessPodcasts (Podcasts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_insights_library/button_wellnessPodcasts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_insights_library/button_wellnessPodcasts', ['button_wellnessPodcasts_nthChild': button_wellnessPodcasts_nthChild, 'button_wellnessPodcasts_class': button_wellnessPodcasts_class, 'button_wellnessPodcasts_internalRoleCheckboxName': button_wellnessPodcasts_internalRoleCheckboxName]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 3-Click on button wellnessPodcasts Podcasts.png')

"Step 4: Click on button wellnessPodcasts (Wellness)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_insights_library/button_wellnessPodcasts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_insights_library/button_wellnessPodcasts', ['button_wellnessPodcasts_nthChild': button_wellnessPodcasts_nthChild_1, 'button_wellnessPodcasts_class': button_wellnessPodcasts_class_1, 'button_wellnessPodcasts_internalRoleCheckboxName': button_wellnessPodcasts_internalRoleCheckboxName_1]))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 4-Click on button wellnessPodcasts Wellness.png')

"Step 5: Click on button ApplyFilters"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_library/button_ApplyFilters'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 5-Click on button ApplyFilters.png')

"Step 6: Click on button ClearAllFilters"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_library/button_ClearAllFilters'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 6-Click on button ClearAllFilters.png')

"Step 7: Click on link ExploringFixedIncome -> Navigate to page 'sustainable investing#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_library/link_ExploringFixedIncome'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 7-Click on link ExploringFixedIncome - Navigate to page sustainable investing.png')

"Step 8: Click on link WebcastRegistration -> Navigate to page 'registration page#*/*/webcasts-registration'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_sustainable_investing/link_WebcastRegistration'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 8-Click on link WebcastRegistration - Navigate to page registration pagewebcasts-registration.png')

"Step 9: Click on link FidelityConnectsLive -> Navigate to page 'investment options#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/webcasts-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_registration_page/link_FidelityConnectsLive'))

WebUI.takeScreenshot(reportLocation + '/TC20/Step 9-Click on link FidelityConnectsLive - Navigate to page investment options.png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC20-Explore Insights Library and Verify Investment Options_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}