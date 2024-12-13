import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
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

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Hover over link LifeExperiences.png')

"Step 3: Click on viewAllButton -> Navigate to page 'investing goals#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_investing_goals/viewAllButton'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on viewAllButton - Navigate to page investing goals.png')

"Step 4: Click on signUpButton -> Navigate to page 'newsletter page#*/newsletter'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investing_goals/signUpButton'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on signUpButton - Navigate to page newsletter pagenewsletter.png')

"Step 5: Click on emailInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter/emailInputField'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on emailInputField.png')

"Step 6: Enter input value in emailInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_newsletter/emailInputField'), emailInputField)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Enter input value in emailInputField.png')

"Step 7: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on div object.png')

"Step 8: Click on userTypeSelection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter/userTypeSelection'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on userTypeSelection.png')

"Step 9: Click on userDescriptionSelector"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter/userDescriptionSelector'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on userDescriptionSelector.png')

"Step 10: Click on consentCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter/consentCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on consentCheckbox.png')

"Step 11: Click on fidelityCanadaSustainabilityLink -> Navigate to page 'informational page#*/aboutus/sustainability'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/newsletter?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_newsletter/fidelityCanadaSustainabilityLink'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on fidelityCanadaSustainabilityLink - Navigate to page informational pageaboutussustainability.png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Sign Up for Newsletter with Investing Goals Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}