import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.inputUserFinancialDataMultipleTimes
import truetest.common.navigateAndInputFinancialInvestmentData
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

"Step 2: Click on link toolsAndCalculators (ToolsAndCalculators)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_homepage/link_toolsAndCalculators'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 2-Click on link toolsAndCalculators ToolsAndCalculators.png')

"Step 3: Input user financial data multiple times"

inputUserFinancialDataMultipleTimes.execute(data_path_0, Integer.valueOf(index_0))

"Step 4: Click on input userFinancialData (UserMonthlySavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 4-Click on input userFinancialData UserMonthlySavings.png')

"Step 5: Enter input value in input userFinancialData (UserMonthlySavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_1]), input_userFinancialData)

WebUI.takeScreenshot(reportLocation + '/TC37/Step 5-Enter input value in input userFinancialData UserMonthlySavings.png')

"Step 6: Click on main myPlan"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/main_myPlan'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 6-Click on main myPlan.png')

"Step 7: Navigate and input user financial and investment data"

navigateAndInputFinancialInvestmentData.execute(data_path_1, Integer.valueOf(index_1))

"Step 8: Adjust div userRequiredIncome by input value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Page_calculator_page/div_userRequiredIncome'), Double.valueOf(div_userRequiredIncome))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 8-Adjust div userRequiredIncome by input value.png')

"Step 9: Adjust div userRequiredIncome by input value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Page_calculator_page/div_userRequiredIncome'), Double.valueOf(div_userRequiredIncome_1))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 9-Adjust div userRequiredIncome by input value.png')

"Step 10: Click on link navigation (SeeMyResultsArrow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation', ['link_navigation_nth': link_navigation_nth]))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 10-Click on link navigation SeeMyResultsArrow.png')

"Step 11: Click on link generatePDF (GeneratePDF) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_generatePDF'))

WebUI.takeScreenshot(reportLocation + '/TC37/Step 11-Click on link generatePDF GeneratePDF - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC37-Input User Financial Data and Generate PDF_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}