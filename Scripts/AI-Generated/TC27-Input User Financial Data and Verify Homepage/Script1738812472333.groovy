import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.inputUserFinancialDataMultipleTimes
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to */retirementcalculator"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/retirementcalculator")

"Step 2: Input user financial data multiple times"

inputUserFinancialDataMultipleTimes.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Click on main myPlan"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/main_myPlan'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 3-Click on main myPlan.png')

"Step 4: Click on input userFinancialData (UserMonthlySavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 4-Click on input userFinancialData UserMonthlySavings.png')

"Step 5: Enter input value in input userFinancialData (UserMonthlySavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_1]), input_userFinancialData)

WebUI.takeScreenshot(reportLocation + '/TC27/Step 5-Enter input value in input userFinancialData UserMonthlySavings.png')

"Step 6: Click on link navigation (next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation', ['link_navigation_nth': link_navigation_nth]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 6-Click on link navigation next.png')

"Step 7: Click on input userFinancialData (UserIncomeOther)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 7-Click on input userFinancialData UserIncomeOther.png')

"Step 8: Click on input userFinancialData (UserIncomeOther)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 8-Click on input userFinancialData UserIncomeOther.png')

"Step 9: Enter input value in input userFinancialData (UserIncomeOther)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_4]), input_userFinancialData_1)

WebUI.takeScreenshot(reportLocation + '/TC27/Step 9-Enter input value in input userFinancialData UserIncomeOther.png')

"Step 10: Click on link navigation (next2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation', ['link_navigation_nth': link_navigation_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 10-Click on link navigation next2.png')

"Step 11: Click on div userInvestmentStyle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/div_userInvestmentStyle_1'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 11-Click on div userInvestmentStyle.png')

"Step 12: Click on link navigation (next2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation', ['link_navigation_nth': link_navigation_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 12-Click on link navigation next2.png')

"Step 13: Click on div userRequiredIncome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/div_userRequiredIncome'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 13-Click on div userRequiredIncome.png')

"Step 14: Click on link navigation (seeMyResults)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation', ['link_navigation_nth': link_navigation_nth_3]))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 14-Click on link navigation seeMyResults.png')

"Step 15: Click on select resultsView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/select_resultsView'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 15-Click on select resultsView.png')

"Step 16: Select option with input value from select resultsView"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_calculator_page/select_resultsView'), select_resultsView)

WebUI.takeScreenshot(reportLocation + '/TC27/Step 16-Select option with input value from select resultsView.png')

"Step 17: Click on link projectedIncome"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/link_projectedIncome'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 17-Click on link projectedIncome.png')

"Step 18: Click on link startOver (startOver) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_startOver'))

WebUI.takeScreenshot(reportLocation + '/TC27/Step 18-Click on link startOver startOver - Navigate to page .png')

"Step 19: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC27-Input User Financial Data and Verify Homepage_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}