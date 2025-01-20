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

"Step 1: Navigate to */taxsmartcalculator"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/taxsmartcalculator")

"Step 2: Click on button add funds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/button_add_funds'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 2-Click on button add funds.png')

"Step 3: Click on textbox fund name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/textbox_fund_name'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 3-Click on textbox fund name.png')

"Step 4: Enter input value in textbox fund name"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/textbox_fund_name'), textbox_fund_name)

WebUI.takeScreenshot(reportLocation + '/TC27/Step 4-Enter input value in textbox fund name.png')

"Step 5: Click on button close dialog"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/button_close_dialog'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 5-Click on button close dialog.png')

"Step 6: Click on link tax smart calculator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/link_tax_smart_calculator'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 6-Click on link tax smart calculator.png')

"Step 7: Click on button add funds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/button_add_funds'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 7-Click on button add funds.png')

"Step 8: Click on button close dialog2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/button_close_dialog2'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 8-Click on button close dialog2.png')

"Step 9: Click on link investment finder -> Navigate to page 'investment finder#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/link_investment_finder'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 9-Click on link investment finder - Navigate to page investment finder.png')

"Step 10: Click on link tax smart calculator -> Navigate to page 'calculator page#*/taxsmartcalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/link_tax_smart_calculator'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 10-Click on link tax smart calculator - Navigate to page calculator pagetaxsmartcalculator.png')

"Step 11: Click on button add funds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/button_add_funds'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 11-Click on button add funds.png')

"Step 12: Click on button close dialog2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/button_close_dialog2'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 12-Click on button close dialog2.png')

"Step 13: Click on radio monthly pre tax cash flow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/radio_monthly_pre_tax_cash_flow'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 13-Click on radio monthly pre tax cash flow.png')

"Step 14: Click on radio monthly pre tax cash flow2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/radio_monthly_pre_tax_cash_flow2'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 14-Click on radio monthly pre tax cash flow2.png')

"Step 15: Click on radio investment in T Series"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/radio_investment_in_T_Series'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 15-Click on radio investment in T Series.png')

"Step 16: Click on button add funds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/button_add_funds'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 16-Click on button add funds.png')

"Step 17: Click on combobox category"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/combobox_category'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 17-Click on combobox category.png')

"Step 18: Select option with input value from combobox category"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_calculator_page/combobox_category'), combobox_category)

WebUI.takeScreenshot(reportLocation + '/TC27/Step 18-Select option with input value from combobox category.png')

"Step 19: Click on textbox fund name2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/textbox_fund_name2'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 19-Click on textbox fund name2.png')

"Step 20: Enter input value in textbox fund name2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/textbox_fund_name2'), textbox_fund_name2)

WebUI.takeScreenshot(reportLocation + '/TC27/Step 20-Enter input value in textbox fund name2.png')

"Step 21: Click on checkbox fidelity balanced class portfolio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/checkbox_fidelity_balanced_class_portfolio'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 21-Click on checkbox fidelity balanced class portfolio.png')

"Step 22: Click on button add selected funds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/button_add_selected_funds'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 22-Click on button add selected funds.png')

"Step 23: Click on input fund allocation percentage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_fund_allocation_percentage'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 23-Click on input fund allocation percentage.png')

"Step 24: Enter input value in input fund allocation percentage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/input_fund_allocation_percentage2'), input_fund_allocation_percentage2)

WebUI.takeScreenshot(reportLocation + '/TC27/Step 24-Enter input value in input fund allocation percentage2.png')

"Step 25: Click on combobox tax province"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/combobox_tax_province'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 25-Click on combobox tax province.png')

"Step 26: Select option with input value from combobox tax province"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_calculator_page/combobox_tax_province'), combobox_tax_province)

WebUI.takeScreenshot(reportLocation + '/TC27/Step 26-Select option with input value from combobox tax province.png')

"Step 27: Click on button calculate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/button_calculate'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 27-Click on button calculate.png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC27-Add Funds and Calculate Tax Implications_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}