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

"Step 1: Navigate to */*/*"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/${GlobalVariable.path_param_2}/${GlobalVariable.path_param_3}")

"Step 2: Hover over link LifeExperiences"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investor_education_investing_goals/link_LifeExperiences'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 2-Hover over link LifeExperiences.png')

"Step 3: Click on button viewAllRetirementOptions (ViewAllRetirement2) -> Navigate to page 'investing goals#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_investor_education_investing_goals/button_viewAllRetirementOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investor_education_investing_goals/button_viewAllRetirementOptions', ['button_viewAllRetirementOptions_class': button_viewAllRetirementOptions_class]))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 3-Click on button viewAllRetirementOptions ViewAllRetirement2 - Navigate to page investing goals.png')

"Step 4: Click on link SignUpToday -> Navigate to page 'newsletter page#*/newsletter'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investing_goals/link_SignUpToday'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 4-Click on link SignUpToday - Navigate to page newsletter pagenewsletter.png')

"Step 5: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter_page/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 5-Click on input Email.png')

"Step 6: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_newsletter_page/input_Email'), input_Email)

WebUI.takeScreenshot(reportLocation + '/TC23/Step 6-Enter input value in input Email.png')

"Step 7: Click on div ColumnUP2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter_page/div_ColumnUP2'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 7-Click on div ColumnUP2.png')

"Step 8: Click on input IndividualInvestor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter_page/input_IndividualInvestor'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 8-Click on input IndividualInvestor.png')

"Step 9: Click on select InvestorTypeDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter_page/select_InvestorTypeDescription'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 9-Click on select InvestorTypeDescription.png')

"Step 10: Select option with input value from select InvestorTypeDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_newsletter_page/select_InvestorTypeDescription'), select_InvestorTypeDescription)

WebUI.takeScreenshot(reportLocation + '/TC23/Step 10-Select option with input value from select InvestorTypeDescription.png')

"Step 11: Click on input InvestorOptIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter_page/input_InvestorOptIn'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 11-Click on input InvestorOptIn.png')

"Step 12: Click on link FidelityCanadaSustainability -> Navigate to page 'informational page#*/aboutus/sustainability'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter_page/link_FidelityCanadaSustainability'))

WebUI.takeScreenshot(reportLocation + '/TC23/Step 12-Click on link FidelityCanadaSustainability - Navigate to page informational pageaboutussustainability.png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC23-Sign Up for Newsletter and Verify Informational Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}