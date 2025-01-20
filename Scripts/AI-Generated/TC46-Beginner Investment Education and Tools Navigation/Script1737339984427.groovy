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

"Step 2: Click on link investing for beginners -> Navigate to page 'investor education investing beginners#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/link_investing_for_beginners'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 2-Click on link investing for beginners - Navigate to page investor education investing beginners.png')

"Step 3: Click on link investing for beginners"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_investing_beginners/link_investing_for_beginners_1'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 3-Click on link investing for beginners.png')

"Step 4: Click on link savings calculator -> Navigate to page 'financial tool#*/savingscalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_investing_beginners/link_savings_calculator_1'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 4-Click on link savings calculator - Navigate to page financial toolsavingscalculator.png')

"Step 5: Click on link investing for beginners -> Navigate to page 'investor education investing beginners#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/link_investing_for_beginners_1'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 5-Click on link investing for beginners - Navigate to page investor education investing beginners.png')

"Step 6: Click on link investment goals -> Navigate to page 'investor education investing goals#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_investing_beginners/link_investment_goals'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 6-Click on link investment goals - Navigate to page investor education investing goals.png')

"Step 7: Hover over link Retirement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investor_education_investing_goals/link_Retirement_1'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 7-Hover over link Retirement.png')

"Step 8: Click on button viewAllEducationOptions (viewAllEducationOptions) -> Navigate to page 'investing goals#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_investor_education_investing_goals/button_viewAllEducationOptions_1"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investor_education_investing_goals/button_viewAllEducationOptions_1', ['button_viewAllEducationOptions_class': button_viewAllEducationOptions_class]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 8-Click on button viewAllEducationOptions viewAllEducationOptions - Navigate to page investing goals.png')

"Step 9: Click on link investingResources (RetirementIncomeOptions) -> Navigate to page 'insights articles#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_investing_goals/link_investingResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investing_goals/link_investingResources', ['link_investingResources_internalRoleLinkName': link_investingResources_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 9-Click on link investingResources RetirementIncomeOptions - Navigate to page insights articles.png')

"Step 10: Hover over div InsightsArticles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_insights_articles/div_InsightsArticles_1'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 10-Hover over div InsightsArticles.png')

"Step 11: Click on link insights -> Navigate to page 'educational content#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/link_insights_1'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 11-Click on link insights - Navigate to page educational content.png')

"Step 12: Click on link webcast for investors"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/link_webcast_for_investors_1'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 12-Click on link webcast for investors.png')

"Step 13: Click on button RegisterToday -> Navigate to page 'registration page#*/*/webcasts-registration'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/button_RegisterToday_1'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 13-Click on button RegisterToday - Navigate to page registration pagewebcasts-registration.png')

"Step 14: Click on link fidelity connects live webcasts -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/webcasts-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_registration_page/link_fidelity_connects_live_webcasts_1'))

WebUI.takeScreenshot(reportLocation + '/TC46/Step 14-Click on link fidelity connects live webcasts - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC46-Beginner Investment Education and Tools Navigation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}