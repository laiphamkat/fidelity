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

"Step 2: Click on link InvestingForBeginners -> Navigate to page 'investor education investing beginners#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/link_InvestingForBeginners'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on link InvestingForBeginners - Navigate to page investor education investing beginners.png')

"Step 3: Click on link InvestingForBeginners"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_investing_beginners/link_InvestingForBeginners'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on link InvestingForBeginners.png')

"Step 4: Click on link SavingsCalculator -> Navigate to page 'financial tool#*/savingscalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_investing_beginners/link_SavingsCalculator'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on link SavingsCalculator - Navigate to page financial toolsavingscalculator.png')

"Step 5: Click on link InvestingForBeginners -> Navigate to page 'investor education investing beginners#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/link_InvestingForBeginners'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on link InvestingForBeginners - Navigate to page investor education investing beginners.png')

"Step 6: Click on link InvestmentGoals -> Navigate to page 'investor education investing goals#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_investing_beginners/link_InvestmentGoals'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on link InvestmentGoals - Navigate to page investor education investing goals.png')

"Step 7: Hover over link Retirement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investor_education_investing_goals/link_Retirement'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Hover over link Retirement.png')

"Step 8: Click on button viewAllRetirementOptions (ViewAllRetirement) -> Navigate to page 'investing goals#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_investor_education_investing_goals/button_viewAllRetirementOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investor_education_investing_goals/button_viewAllRetirementOptions', ['button_viewAllRetirementOptions_class': button_viewAllRetirementOptions_class]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Click on button viewAllRetirementOptions ViewAllRetirement - Navigate to page investing goals.png')

"Step 9: Click on link investingResources (RetirementIncomeOptions) -> Navigate to page 'insights articles#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_investing_goals/link_investingResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investing_goals/link_investingResources', ['link_investingResources_internalRoleLinkName': link_investingResources_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on link investingResources RetirementIncomeOptions - Navigate to page insights articles.png')

"Step 10: Hover over div Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_insights_articles/div_Object'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Hover over div Object.png')

"Step 11: Click on link Insights -> Navigate to page 'educational content#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/link_Insights'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on link Insights - Navigate to page educational content.png')

"Step 12: Click on link TheUpsideWebcasts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/link_TheUpsideWebcasts'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Click on link TheUpsideWebcasts.png')

"Step 13: Click on button RegisterToday -> Navigate to page 'registration page#*/*/webcasts-registration'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/button_RegisterToday'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Click on button RegisterToday - Navigate to page registration pagewebcasts-registration.png')

"Step 14: Click on link FidelityConnectsLive -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/webcasts-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_registration_page/link_FidelityConnectsLive'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Click on link FidelityConnectsLive - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Explore Investing for Beginners and Financial Tools_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}