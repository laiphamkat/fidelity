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

"Step 2: Click on select residentProvince"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/select_residentProvince'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 2-Click on select residentProvince.png')

"Step 3: Select option with input value from select residentProvince"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_calculator_page/select_residentProvince'), select_residentProvince)

WebUI.takeScreenshot(reportLocation + '/TC29/Step 3-Select option with input value from select residentProvince.png')

"Step 4: Click on select taxYear"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/select_taxYear'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 4-Click on select taxYear.png')

"Step 5: Click on input employmentIncome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_employmentIncome'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 5-Click on input employmentIncome.png')

"Step 6: Click on input employmentIncome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_employmentIncome'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 6-Click on input employmentIncome.png')

"Step 7: Click on input employmentIncome2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_employmentIncome2'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 7-Click on input employmentIncome2.png')

"Step 8: Click on input interestIncome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_interestIncome'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 8-Click on input interestIncome.png')

"Step 9: Enter input value in input interestIncome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/input_interestIncome'), input_interestIncome)

WebUI.takeScreenshot(reportLocation + '/TC29/Step 9-Enter input value in input interestIncome.png')

"Step 10: Click on div totalIncome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/div_totalIncome'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 10-Click on div totalIncome.png')

"Step 11: Click on input interestIncome2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_interestIncome2'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 11-Click on input interestIncome2.png')

"Step 12: Click on link taxCalculator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/link_taxCalculator'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 12-Click on link taxCalculator.png')

"Step 13: Click on select residentProvince"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/select_residentProvince'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 13-Click on select residentProvince.png')

"Step 14: Select option with input value from select residentProvince"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_calculator_page/select_residentProvince'), select_residentProvince_1)

WebUI.takeScreenshot(reportLocation + '/TC29/Step 14-Select option with input value from select residentProvince.png')

"Step 15: Click on input employmentIncome2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_employmentIncome2'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 15-Click on input employmentIncome2.png')

"Step 16: Enter input value in input employmentIncome2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/input_employmentIncome2'), input_employmentIncome2)

WebUI.takeScreenshot(reportLocation + '/TC29/Step 16-Enter input value in input employmentIncome2.png')

"Step 17: Click on input interestIncome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_interestIncome'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 17-Click on input interestIncome.png')

"Step 18: Enter input value in input interestIncome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/input_interestIncome'), input_interestIncome_1)

WebUI.takeScreenshot(reportLocation + '/TC29/Step 18-Enter input value in input interestIncome.png')

"Step 19: Click on input dividendIncome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_dividendIncome'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 19-Click on input dividendIncome.png')

"Step 20: Enter input value in input dividendIncome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/input_dividendIncome'), input_dividendIncome)

WebUI.takeScreenshot(reportLocation + '/TC29/Step 20-Enter input value in input dividendIncome.png')

"Step 21: Click on input capitalGainsPre"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_capitalGainsPre'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 21-Click on input capitalGainsPre.png')

"Step 22: Click on input capitalGainsPost"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_capitalGainsPost'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 22-Click on input capitalGainsPost.png')

"Step 23: Click on input taxesPaid"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_taxesPaid'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 23-Click on input taxesPaid.png')

"Step 24: Enter input value in input taxesPaid"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/input_taxesPaid'), input_taxesPaid)

WebUI.takeScreenshot(reportLocation + '/TC29/Step 24-Enter input value in input taxesPaid.png')

"Step 25: Click on div totalDeductions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/div_totalDeductions'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 25-Click on div totalDeductions.png')

"Step 26: Click on input rrspContribution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_rrspContribution'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 26-Click on input rrspContribution.png')

"Step 27: Enter input value in input rrspContribution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/input_rrspContribution'), input_rrspContribution)

WebUI.takeScreenshot(reportLocation + '/TC29/Step 27-Enter input value in input rrspContribution.png')

"Step 28: Click on input fhsaContribution"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_fhsaContribution'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 28-Click on input fhsaContribution.png')

"Step 29: Click on button calculateRefund -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/button_calculateRefund'))

WebUI.takeScreenshot(reportLocation + '/TC29/Step 29-Click on button calculateRefund - Navigate to page .png')

"Step 30: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC29-Input Tax Information and Verify Homepage_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}