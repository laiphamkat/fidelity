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

"Step 2: Click on investingForBeginnersLink -> Navigate to page 'investor education investing beginners#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/investingForBeginnersLink'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on investingForBeginnersLink - Navigate to page investor education investing beginners.png')

"Step 3: Click on link investing for beginners"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_investing_beginners/link_investing_for_beginners'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link investing for beginners.png')

"Step 4: Click on link savings calculator -> Navigate to page 'financial tool#*/savingscalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_investing_beginners/link_savings_calculator'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on link savings calculator - Navigate to page financial toolsavingscalculator.png')

"Step 5: Click on link investing for beginners -> Navigate to page 'investor education investing beginners#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/link_investing_for_beginners'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link investing for beginners - Navigate to page investor education investing beginners.png')

"Step 6: Click on investmentGoalsLink -> Navigate to page 'investor education investing goals#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_investing_beginners/investmentGoalsLink'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on investmentGoalsLink - Navigate to page investor education investing goals.png')

"Step 7: Hover over link Retirement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investor_education_investing_goals/link_Retirement'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Hover over link Retirement.png')

"Step 8: Click on button viewAllGoals (ViewAllRetirement) -> Navigate to page 'investing goals#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_investor_education_investing_goals/button_viewAllGoals"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investor_education_investing_goals/button_viewAllGoals', ['button_viewAllGoals_class': button_viewAllGoals_class]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on button viewAllGoals ViewAllRetirement - Navigate to page investing goals.png')

"Step 9: Click on link investingOptions (RetirementIncomeOptions) -> Navigate to page 'insights articles#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_investing_goals/link_investingOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investing_goals/link_investingOptions', ['link_investingOptions_internalRoleLinkName': link_investingOptions_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on link investingOptions RetirementIncomeOptions - Navigate to page insights articles.png')

"Step 10: Hover over div InsightsArticles"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_insights_articles/div_InsightsArticles'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Hover over div InsightsArticles.png')

"Step 11: Click on link insights -> Navigate to page 'educational content#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/link_insights'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on link insights - Navigate to page educational content.png')

"Step 12: Click on link webcast for investors"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/link_webcast_for_investors'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on link webcast for investors.png')

"Step 13: Click on button RegisterToday -> Navigate to page 'registration page#*/*/webcasts-registration'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/button_RegisterToday'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on button RegisterToday - Navigate to page registration pagewebcasts-registration.png')

"Step 14: Click on link fidelity connects live webcasts -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/webcasts-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_registration_page/link_fidelity_connects_live_webcasts'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on link fidelity connects live webcasts - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Beginner Investment Education and Tools Exploration_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}