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

"Step 2: Click on link GrowthCalculator -> Navigate to page 'calculator#*/growthcalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/link_GrowthCalculator'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 2-Click on link GrowthCalculator - Navigate to page calculatorgrowthcalculator.png')

"Step 3: Click on span financialValues (NominalDollars)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/span_financialValues"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/span_financialValues', ['span_financialValues_class': span_financialValues_class]))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 3-Click on span financialValues NominalDollars.png')

"Step 4: Click on input nominalDollars (NominalDollars2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_nominalDollars'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 4-Click on input nominalDollars NominalDollars2.png')

"Step 5: Click on link 5WaysToDitchDebt -> Navigate to page 'investor education ditching debt#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/link_5WaysToDitchDebt'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 5-Click on link 5WaysToDitchDebt - Navigate to page investor education ditching debt.png')

"Step 6: Click on link GetStarted"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/link_GetStarted'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 6-Click on link GetStarted.png')

"Step 7: Click on input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/input_Email'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 7-Click on input Email.png')

"Step 8: Enter input value in input Email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_investor_education_ditching_debt/input_Email'), input_Email)

WebUI.takeScreenshot(reportLocation + '/TC19/Step 8-Enter input value in input Email.png')

"Step 9: Click on input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/input_FirstName'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 9-Click on input FirstName.png')

"Step 10: Enter input value in input FirstName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_investor_education_ditching_debt/input_FirstName'), input_FirstName)

WebUI.takeScreenshot(reportLocation + '/TC19/Step 10-Enter input value in input FirstName.png')

"Step 11: Click on input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/input_LastName'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 11-Click on input LastName.png')

"Step 12: Enter input value in input LastName"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_investor_education_ditching_debt/input_LastName'), input_LastName)

WebUI.takeScreenshot(reportLocation + '/TC19/Step 12-Enter input value in input LastName.png')

"Step 13: Click on select PreferredLanguage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/select_PreferredLanguage'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 13-Click on select PreferredLanguage.png')

"Step 14: Select option with input value from select PreferredLanguage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_investor_education_ditching_debt/select_PreferredLanguage'), select_PreferredLanguage)

WebUI.takeScreenshot(reportLocation + '/TC19/Step 14-Select option with input value from select PreferredLanguage.png')

"Step 15: Click on label IndividualInvestor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/label_IndividualInvestor'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 15-Click on label IndividualInvestor.png')

"Step 16: Click on select InvestorType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/select_InvestorType'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 16-Click on select InvestorType.png')

"Step 17: Select option with input value from select InvestorType"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_investor_education_ditching_debt/select_InvestorType'), select_InvestorType)

WebUI.takeScreenshot(reportLocation + '/TC19/Step 17-Select option with input value from select InvestorType.png')

"Step 18: Click on button GetTheGuide"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/button_GetTheGuide'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 18-Click on button GetTheGuide.png')

"Step 19: Click on input InvestorOptIn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/input_InvestorOptIn'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 19-Click on input InvestorOptIn.png')

"Step 20: Click on button GetTheGuide"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/button_GetTheGuide'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 20-Click on button GetTheGuide.png')

"Step 21: Click on link DifferenceBetweenSaving -> Navigate to page 'investor education save or invest#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/link_DifferenceBetweenSaving'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 21-Click on link DifferenceBetweenSaving - Navigate to page investor education save or invest.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC19-Get Financial Guide and Verify Education Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}