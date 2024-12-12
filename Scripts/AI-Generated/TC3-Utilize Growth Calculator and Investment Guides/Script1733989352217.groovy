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

"Step 2: Click on link growthCalculatorFindOutHowMuchYourSavingsW -> Navigate to page 'calculator page#*/growthcalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/link_growthCalculatorFindOutHowMuchYourSavingsW'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 2-Click on link growthCalculatorFindOutHowMuchYourSavingsW - Navigate to page calculator pagegrowthcalculator.png')

"Step 3: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 3-Click on span object.png')

"Step 4: Click on input dollars"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/input_dollars'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 4-Click on input dollars.png')

"Step 5: Click on link 5WaysToDitchDebtAndBetterManageYourMoney -> Navigate to page 'investor education ditching debt#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/link_5WaysToDitchDebtAndBetterManageYourMoney'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 5-Click on link 5WaysToDitchDebtAndBetterManageYourMoney - Navigate to page investor education ditching debt.png')

"Step 6: Click on link getStarted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/link_getStarted'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 6-Click on link getStarted.png')

"Step 7: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 7-Click on input email.png')

"Step 8: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_investor_education_ditching_debt/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 8-Enter input value in input email.png')

"Step 9: Click on input firstname"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/input_firstname'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 9-Click on input firstname.png')

"Step 10: Enter input value in input firstname"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_investor_education_ditching_debt/input_firstname'), input_firstname)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 10-Enter input value in input firstname.png')

"Step 11: Click on input lastname"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/input_lastname'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 11-Click on input lastname.png')

"Step 12: Enter input value in input lastname"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_investor_education_ditching_debt/input_lastname'), input_lastname)

WebUI.takeScreenshot(reportLocation + '/TC3/Step 12-Enter input value in input lastname.png')

"Step 13: Click on select preferredLanguageC"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/select_preferredLanguageC'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 13-Click on select preferredLanguageC.png')

"Step 14: Click on label lblmktoradio2494230"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/label_lblmktoradio2494230'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 14-Click on label lblmktoradio2494230.png')

"Step 15: Click on select investortypedescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/select_investortypedescription'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 15-Click on select investortypedescription.png')

"Step 16: Click on button getTheGuide"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/button_getTheGuide'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 16-Click on button getTheGuide.png')

"Step 17: Click on input investoroptin"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/input_investoroptin'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 17-Click on input investoroptin.png')

"Step 18: Click on button getTheGuide"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/button_getTheGuide'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 18-Click on button getTheGuide.png')

"Step 19: Click on link theDifferenceBetweenSavingAndInvesting -> Navigate to page 'investor education save or invest#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/link_theDifferenceBetweenSavingAndInvesting'))

WebUI.takeScreenshot(reportLocation + '/TC3/Step 19-Click on link theDifferenceBetweenSavingAndInvesting - Navigate to page investor education save or invest.png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC3-Utilize Growth Calculator and Investment Guides_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}