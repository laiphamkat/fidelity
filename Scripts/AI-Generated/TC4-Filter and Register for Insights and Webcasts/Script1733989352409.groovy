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

"Step 2: Click on link articlesWebcastsPodcastsCheckOutOurArticl -> Navigate to page 'insights library#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/link_articlesWebcastsPodcastsCheckOutOurArticl'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on link articlesWebcastsPodcastsCheckOutOurArticl - Navigate to page insights library.png')

"Step 3: Click on button insightCategories (podcasts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_insights_library/button_insightCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_insights_library/button_insightCategories', ['button_insightCategories_nthChild': button_insightCategories_nthChild, 'button_insightCategories_class': button_insightCategories_class, 'button_insightCategories_internalRoleCheckboxName': button_insightCategories_internalRoleCheckboxName]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on button insightCategories podcasts.png')

"Step 4: Click on button insightCategories (wellness)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_insights_library/button_insightCategories"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_insights_library/button_insightCategories', ['button_insightCategories_nthChild': button_insightCategories_nthChild_1, 'button_insightCategories_class': button_insightCategories_class_1, 'button_insightCategories_internalRoleCheckboxName': button_insightCategories_internalRoleCheckboxName_1]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on button insightCategories wellness.png')

"Step 5: Click on button applyTheChosenFilters"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_library/button_applyTheChosenFilters'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on button applyTheChosenFilters.png')

"Step 6: Click on button clearAllFilters"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_library/button_clearAllFilters'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on button clearAllFilters.png')

"Step 7: Click on link fidelityconnectsExploringFixedIncomeJoinIns -> Navigate to page 'sustainable investing#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_library/link_fidelityconnectsExploringFixedIncomeJoinIns'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on link fidelityconnectsExploringFixedIncomeJoinIns - Navigate to page sustainable investing.png')

"Step 8: Click on link webcastRegistrationOurLiveInteractiveWebcast -> Navigate to page 'registration page#*/*/webcasts-registration'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_sustainable_investing/link_webcastRegistrationOurLiveInteractiveWebcast'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on link webcastRegistrationOurLiveInteractiveWebcast - Navigate to page registration pagewebcasts-registration.png')

"Step 9: Click on link fidelityconnectsLiveWebcastsForFinancialAdvi -> Navigate to page 'investment options#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/webcasts-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_registration/link_fidelityconnectsLiveWebcastsForFinancialAdvi'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on link fidelityconnectsLiveWebcastsForFinancialAdvi - Navigate to page investment options.png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Filter and Register for Insights and Webcasts_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}