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

"Step 1: Navigate to */taxcalculator"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/taxcalculator")

"Step 2: Click on residentProvinceTerritoryDropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/residentProvinceTerritoryDropdown'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 2-Click on residentProvinceTerritoryDropdown.png')

"Step 3: Click on yearSelector"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/yearSelector'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 3-Click on yearSelector.png')

"Step 4: Click on employmentIncomeSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/employmentIncomeSlider'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 4-Click on employmentIncomeSlider.png')

"Step 5: Click on employmentIncomeSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/employmentIncomeSlider'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 5-Click on employmentIncomeSlider.png')

"Step 6: Click on employmentIncomeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/employmentIncomeInput'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 6-Click on employmentIncomeInput.png')

"Step 7: Click on interestIncomeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/interestIncomeInput'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 7-Click on interestIncomeInput.png')

"Step 8: Enter input value in interestIncomeInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/interestIncomeInput'), interestIncomeInput2)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 8-Enter input value in interestIncomeInput2.png')

"Step 9: Click on div TotalIncome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/div_TotalIncome'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 9-Click on div TotalIncome.png')

"Step 10: Click on interestIncomeSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/interestIncomeSlider'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 10-Click on interestIncomeSlider.png')

"Step 11: Click on taxCalculatorLink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/taxCalculatorLink'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 11-Click on taxCalculatorLink.png')

"Step 12: Click on residentProvinceTerritoryDropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/residentProvinceTerritoryDropdown'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 12-Click on residentProvinceTerritoryDropdown.png')

"Step 13: Click on employmentIncomeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/employmentIncomeInput'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 13-Click on employmentIncomeInput.png')

"Step 14: Enter input value in employmentIncomeInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/employmentIncomeInput'), employmentIncomeInput2)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 14-Enter input value in employmentIncomeInput2.png')

"Step 15: Click on interestIncomeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/interestIncomeInput'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 15-Click on interestIncomeInput.png')

"Step 16: Enter input value in interestIncomeInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/interestIncomeInput'), interestIncomeInput2_1)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 16-Enter input value in interestIncomeInput2.png')

"Step 17: Click on dividendIncomeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/dividendIncomeInput'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 17-Click on dividendIncomeInput.png')

"Step 18: Enter input value in dividendIncomeInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/dividendIncomeInput'), dividendIncomeInput2)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 18-Enter input value in dividendIncomeInput2.png')

"Step 19: Click on capitalGainsSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/capitalGainsSlider'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 19-Click on capitalGainsSlider.png')

"Step 20: Click on capitalGainsFuture"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/capitalGainsFuture'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 20-Click on capitalGainsFuture.png')

"Step 21: Click on taxesPaidInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/taxesPaidInput'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 21-Click on taxesPaidInput.png')

"Step 22: Enter input value in taxesPaidInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/taxesPaidInput'), taxesPaidInput2)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 22-Enter input value in taxesPaidInput2.png')

"Step 23: Click on div TotalDeductions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/div_TotalDeductions'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 23-Click on div TotalDeductions.png')

"Step 24: Click on rrspContributionsInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/rrspContributionsInput'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 24-Click on rrspContributionsInput.png')

"Step 25: Enter input value in rrspContributionsInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/rrspContributionsInput'), rrspContributionsInput2)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 25-Enter input value in rrspContributionsInput2.png')

"Step 26: Click on fhsaContributionsInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/fhsaContributionsInput'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 26-Click on fhsaContributionsInput.png')

"Step 27: Click on calculateRefundButton -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/calculateRefundButton'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 27-Click on calculateRefundButton - Navigate to page .png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC25-Tax Calculator Input and Refund Verification_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}