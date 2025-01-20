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

"Step 2: Click on combobox resident province territory"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/combobox_resident_province_territory'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 2-Click on combobox resident province territory.png')

"Step 3: Select option with input value from combobox resident province territory"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_calculator_page/combobox_resident_province_territory'), combobox_resident_province_territory)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 3-Select option with input value from combobox resident province territory.png')

"Step 4: Click on combobox year"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/combobox_year'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 4-Click on combobox year.png')

"Step 5: Click on slider employment and other income"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/slider_employment_and_other_income'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 5-Click on slider employment and other income.png')

"Step 6: Click on slider employment and other income"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/slider_employment_and_other_income'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 6-Click on slider employment and other income.png')

"Step 7: Click on input employment and other income"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_employment_and_other_income'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 7-Click on input employment and other income.png')

"Step 8: Click on input interest income"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_interest_income'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 8-Click on input interest income.png')

"Step 9: Enter input value in input interest income"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/input_interest_income'), input_interest_income)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 9-Enter input value in input interest income.png')

"Step 10: Click on div TotalIncome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/div_TotalIncome'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 10-Click on div TotalIncome.png')

"Step 11: Click on slider interest income"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/slider_interest_income'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 11-Click on slider interest income.png')

"Step 12: Click on link tax calculator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/link_tax_calculator'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 12-Click on link tax calculator.png')

"Step 13: Click on combobox resident province territory"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/combobox_resident_province_territory'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 13-Click on combobox resident province territory.png')

"Step 14: Select option with input value from combobox resident province territory"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_calculator_page/combobox_resident_province_territory'), combobox_resident_province_territory_1)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 14-Select option with input value from combobox resident province territory.png')

"Step 15: Click on input employment and other income"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_employment_and_other_income'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 15-Click on input employment and other income.png')

"Step 16: Enter input value in input employment and other income"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/input_employment_and_other_income'), input_employment_and_other_income)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 16-Enter input value in input employment and other income.png')

"Step 17: Click on input interest income"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_interest_income'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 17-Click on input interest income.png')

"Step 18: Enter input value in input interest income"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/input_interest_income'), input_interest_income_1)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 18-Enter input value in input interest income.png')

"Step 19: Click on input dividend income"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_dividend_income'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 19-Click on input dividend income.png')

"Step 20: Enter input value in input dividend income"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/input_dividend_income'), input_dividend_income)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 20-Enter input value in input dividend income.png')

"Step 21: Click on slider capital gains before june 25 2024"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/slider_capital_gains_before_june_25_2024'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 21-Click on slider capital gains before june 25 2024.png')

"Step 22: Click on slider capital gains late"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/slider_capital_gains_late'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 22-Click on slider capital gains late.png')

"Step 23: Click on input taxes paid"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_taxes_paid'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 23-Click on input taxes paid.png')

"Step 24: Enter input value in input taxes paid"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/input_taxes_paid'), input_taxes_paid)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 24-Enter input value in input taxes paid.png')

"Step 25: Click on div TotalDeductions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/div_TotalDeductions'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 25-Click on div TotalDeductions.png')

"Step 26: Click on textbox RRSP contributions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/textbox_RRSP_contributions'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 26-Click on textbox RRSP contributions.png')

"Step 27: Enter input value in textbox RRSP contributions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/textbox_RRSP_contributions'), textbox_RRSP_contributions)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 27-Enter input value in textbox RRSP contributions.png')

"Step 28: Click on textbox fhsa contributions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/textbox_fhsa_contributions'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 28-Click on textbox fhsa contributions.png')

"Step 29: Click on button calculate refund -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/button_calculate_refund'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 29-Click on button calculate refund - Navigate to page .png')

"Step 30: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC25-Calculate Tax Refund Based on Financial Data_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}