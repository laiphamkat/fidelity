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

"Step 2: Click on link growth calculator -> Navigate to page 'calculator page#*/growthcalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/link_growth_calculator'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 2-Click on link growth calculator - Navigate to page calculator pagegrowthcalculator.png')

"Step 3: Click on nominalDollarsOption2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/nominalDollarsOption2'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 3-Click on nominalDollarsOption2.png')

"Step 4: Click on input nominalDollars (NominalDollarsRadio)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_nominalDollars'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 4-Click on input nominalDollars NominalDollarsRadio.png')

"Step 5: Click on link years -> Navigate to page 'investor education ditching debt#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/link_years'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 5-Click on link years - Navigate to page investor education ditching debt.png')

"Step 6: Click on link get started"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/link_get_started'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 6-Click on link get started.png')

"Step 7: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 7-Click on input email.png')

"Step 8: Enter input value in input email2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_investor_education_ditching_debt/input_email'), input_email2)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 8-Enter input value in input email2.png')

"Step 9: Click on textbox first name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/textbox_first_name'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 9-Click on textbox first name.png')

"Step 10: Enter input value in textbox first name2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_investor_education_ditching_debt/textbox_first_name'), textbox_first_name2)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 10-Enter input value in textbox first name2.png')

"Step 11: Click on textbox last name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/textbox_last_name'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 11-Click on textbox last name.png')

"Step 12: Enter input value in textbox last name2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_investor_education_ditching_debt/textbox_last_name'), textbox_last_name2)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 12-Enter input value in textbox last name2.png')

"Step 13: Click on combobox preferred language"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/combobox_preferred_language'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 13-Click on combobox preferred language.png')

"Step 14: Click on role radio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/role_radio'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 14-Click on role radio.png')

"Step 15: Click on combobox description"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/combobox_description'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 15-Click on combobox description.png')

"Step 16: Click on button get the guide"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/button_get_the_guide'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 16-Click on button get the guide.png')

"Step 17: Click on checkbox consent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/checkbox_consent'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 17-Click on checkbox consent.png')

"Step 18: Click on button get the guide"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/button_get_the_guide'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 18-Click on button get the guide.png')

"Step 19: Click on link editorial card -> Navigate to page 'investor education save or invest#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_ditching_debt/link_editorial_card'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 19-Click on link editorial card - Navigate to page investor education save or invest.png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-Get Started with Financial Education and Resources_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}