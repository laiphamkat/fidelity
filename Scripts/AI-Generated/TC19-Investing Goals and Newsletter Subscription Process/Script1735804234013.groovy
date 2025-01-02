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

"Step 3: Click on button viewAllGoals (ViewAllLifeExperiences) -> Navigate to page 'investing goals#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_investor_education_investing_goals/button_viewAllGoals"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investor_education_investing_goals/button_viewAllGoals', ['button_viewAllGoals_class': button_viewAllGoals_class]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 3-Click on button viewAllGoals ViewAllLifeExperiences - Navigate to page investing goals.png')

"Step 4: Click on signUpButton -> Navigate to page 'newsletter page#*/newsletter'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investing_goals/signUpButton'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 4-Click on signUpButton - Navigate to page newsletter pagenewsletter.png')

"Step 5: Click on emailInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter_page/emailInputField'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 5-Click on emailInputField.png')

"Step 6: Enter input value in emailInputField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_newsletter_page/emailInputField'), emailInputField2)

WebUI.takeScreenshot(reportLocation + '/TC19/Step 6-Enter input value in emailInputField2.png')

"Step 7: Click on div Newsletter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter_page/div_Newsletter'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 7-Click on div Newsletter.png')

"Step 8: Click on userTypeSelection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter_page/userTypeSelection'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 8-Click on userTypeSelection.png')

"Step 9: Click on userDescriptionSelector"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter_page/userDescriptionSelector'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 9-Click on userDescriptionSelector.png')

"Step 10: Click on consentCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter_page/consentCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 10-Click on consentCheckbox.png')

"Step 11: Click on fidelityCanadaSustainabilityLink -> Navigate to page 'informational page#*/aboutus/sustainability'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter_page/fidelityCanadaSustainabilityLink'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 11-Click on fidelityCanadaSustainabilityLink - Navigate to page informational pageaboutussustainability.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC19-Investing Goals and Newsletter Subscription Process_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}