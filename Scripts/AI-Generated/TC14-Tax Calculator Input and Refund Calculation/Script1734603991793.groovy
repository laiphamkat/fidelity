import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/residentProvinceTerritoryDropdown'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 2-Click on residentProvinceTerritoryDropdown.png')

"Step 3: Click on yearSelector"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/yearSelector'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 3-Click on yearSelector.png')

"Step 4: Click on employmentIncomeSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/employmentIncomeSlider'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 4-Click on employmentIncomeSlider.png')

"Step 5: Click on employmentIncomeSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/employmentIncomeSlider'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 5-Click on employmentIncomeSlider.png')

"Step 6: Click on employmentIncomeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/employmentIncomeInput'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 6-Click on employmentIncomeInput.png')

"Step 7: Click on interestIncomeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/interestIncomeInput'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 7-Click on interestIncomeInput.png')

"Step 8: Enter input value in interestIncomeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator/interestIncomeInput'), interestIncomeInput)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 8-Enter input value in interestIncomeInput.png')

"Step 9: Click on div TotalIncome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/div_TotalIncome'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 9-Click on div TotalIncome.png')

"Step 10: Click on interestIncomeSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/interestIncomeSlider'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 10-Click on interestIncomeSlider.png')

"Step 11: Click on taxCalculatorLink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/taxCalculatorLink'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 11-Click on taxCalculatorLink.png')

"Step 12: Click on residentProvinceTerritoryDropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/residentProvinceTerritoryDropdown'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 12-Click on residentProvinceTerritoryDropdown.png')

"Step 13: Click on employmentIncomeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/employmentIncomeInput'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 13-Click on employmentIncomeInput.png')

"Step 14: Enter input value in employmentIncomeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator/employmentIncomeInput'), employmentIncomeInput)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 14-Enter input value in employmentIncomeInput.png')

"Step 15: Click on interestIncomeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/interestIncomeInput'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 15-Click on interestIncomeInput.png')

"Step 16: Enter input value in interestIncomeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator/interestIncomeInput'), interestIncomeInput_1)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 16-Enter input value in interestIncomeInput.png')

"Step 17: Click on dividendIncomeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/dividendIncomeInput'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 17-Click on dividendIncomeInput.png')

"Step 18: Enter input value in dividendIncomeInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator/dividendIncomeInput'), dividendIncomeInput)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 18-Enter input value in dividendIncomeInput.png')

"Step 19: Click on capitalGainsSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/capitalGainsSlider'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 19-Click on capitalGainsSlider.png')

"Step 20: Click on capitalGainsFuture"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/capitalGainsFuture'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 20-Click on capitalGainsFuture.png')

"Step 21: Click on taxesPaidInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/taxesPaidInput'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 21-Click on taxesPaidInput.png')

"Step 22: Enter input value in taxesPaidInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator/taxesPaidInput'), taxesPaidInput)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 22-Enter input value in taxesPaidInput.png')

"Step 23: Click on div TotalDeductions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/div_TotalDeductions'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 23-Click on div TotalDeductions.png')

"Step 24: Click on rrspContributionsInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/rrspContributionsInput'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 24-Click on rrspContributionsInput.png')

"Step 25: Enter input value in rrspContributionsInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator/rrspContributionsInput'), rrspContributionsInput)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 25-Enter input value in rrspContributionsInput.png')

"Step 26: Click on fhsaContributionsInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/fhsaContributionsInput'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 26-Click on fhsaContributionsInput.png')

"Step 27: Click on calculateRefundButton -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/calculateRefundButton'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 27-Click on calculateRefundButton - Navigate to page .png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-Tax Calculator Input and Refund Calculation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}