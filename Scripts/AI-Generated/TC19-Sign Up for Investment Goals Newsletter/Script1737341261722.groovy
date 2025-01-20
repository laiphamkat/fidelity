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

WebUI.takeScreenshot(reportLocation + '/TC19/Step 2-Hover over link LifeExperiences.png')

"Step 3: Click on button viewAllInvestmentOptions (ViewAllRetirement2) -> Navigate to page 'investing goals#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_investor_education_investing_goals/button_viewAllInvestmentOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investor_education_investing_goals/button_viewAllInvestmentOptions', ['button_viewAllInvestmentOptions_class': button_viewAllInvestmentOptions_class]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 3-Click on button viewAllInvestmentOptions ViewAllRetirement2 - Navigate to page investing goals.png')

"Step 4: Click on link sign up today -> Navigate to page 'newsletter page#*/newsletter'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investing_goals/link_sign_up_today'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 4-Click on link sign up today - Navigate to page newsletter pagenewsletter.png')

"Step 5: Click on textbox email address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter_page/textbox_email_address'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 5-Click on textbox email address.png')

"Step 6: Enter input value in textbox email address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_newsletter_page/textbox_email_address'), textbox_email_address)

WebUI.takeScreenshot(reportLocation + '/TC19/Step 6-Enter input value in textbox email address.png')

"Step 7: Click on div Newsletter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter_page/div_Newsletter'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 7-Click on div Newsletter.png')

"Step 8: Click on radio individual investor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter_page/radio_individual_investor'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 8-Click on radio individual investor.png')

"Step 9: Click on combobox description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter_page/combobox_description'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 9-Click on combobox description.png')

"Step 10: Select option with input value from combobox description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_newsletter_page/combobox_description'), combobox_description)

WebUI.takeScreenshot(reportLocation + '/TC19/Step 10-Select option with input value from combobox description.png')

"Step 11: Click on checkbox consent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter_page/checkbox_consent'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 11-Click on checkbox consent.png')

"Step 12: Click on link fidelity canada sustainability -> Navigate to page 'informational page#*/aboutus/sustainability'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter_page/link_fidelity_canada_sustainability'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 12-Click on link fidelity canada sustainability - Navigate to page informational pageaboutussustainability.png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC19-Sign Up for Investment Goals Newsletter_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}