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

"Step 2: Click on link investingForBeginnersWeLlHelpYouUnderstand -> Navigate to page 'investor education investing beginners#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/link_investingForBeginnersWeLlHelpYouUnderstand'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on link investingForBeginnersWeLlHelpYouUnderstand - Navigate to page investor education investing beginners.png')

"Step 3: Click on link investingForBeginnersWeLlHelpYouUnderstand"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_investing_beginners/link_investingForBeginnersWeLlHelpYouUnderstand'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link investingForBeginnersWeLlHelpYouUnderstand.png')

"Step 4: Click on link savingsCalculatorPlanYourSavingsWhetherFor -> Navigate to page 'financial tool#*/savingscalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_investing_beginners/link_savingsCalculatorPlanYourSavingsWhetherFor'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on link savingsCalculatorPlanYourSavingsWhetherFor - Navigate to page financial toolsavingscalculator.png')

"Step 5: Click on link investingForBeginnersWeLlHelpYouUnderstand -> Navigate to page 'investor education investing beginners#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/link_investingForBeginnersWeLlHelpYouUnderstand'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link investingForBeginnersWeLlHelpYouUnderstand - Navigate to page investor education investing beginners.png')

"Step 6: Click on link whatAreMyInvestmentGoalsThereAreManyReason -> Navigate to page 'investor education investing goals#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_investing_beginners/link_whatAreMyInvestmentGoalsThereAreManyReason'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on link whatAreMyInvestmentGoalsThereAreManyReason - Navigate to page investor education investing goals.png')

"Step 7: Hover over link retirementEveryoneSRetirementWillLookDiffere"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investor_education_investing_goals/link_retirementEveryoneSRetirementWillLookDiffere'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Hover over link retirementEveryoneSRetirementWillLookDiffere.png')

"Step 8: Click on button goToRetirementPage -> Navigate to page 'retirement information#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_investing_goals/button_goToRetirementPage'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on button goToRetirementPage - Navigate to page retirement information.png')

"Step 9: Click on link retirementIncomeOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_retirement_information/link_retirementIncomeOptions'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on link retirementIncomeOptions.png')

"Step 10: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_retirement_information/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Hover over div object.png')

"Step 11: Click on link insights -> Navigate to page 'insights#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_retirement_information/link_insights'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on link insights - Navigate to page insights.png')

"Step 12: Click on link viewInvestorWebcasts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights/link_viewInvestorWebcasts'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on link viewInvestorWebcasts.png')

"Step 13: Click on button registerToday -> Navigate to page 'registration page#*/*/webcasts-registration'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights/button_registerToday'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on button registerToday - Navigate to page registration pagewebcasts-registration.png')

"Step 14: Click on link fidelityconnectsLiveWebcastsForFinancialAdvi -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/webcasts-registration?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_registration/link_fidelityconnectsLiveWebcastsForFinancialAdvi'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on link fidelityconnectsLiveWebcastsForFinancialAdvi - Navigate to page .png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Access Investing Resources for Beginners and Retirement_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}