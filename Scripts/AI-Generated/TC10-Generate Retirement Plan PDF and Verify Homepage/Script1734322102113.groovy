import truetest.custom.TrueTestScripts
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to */retirementcalculator"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/retirementcalculator")

"Step 2: Click on input userFinancialData (UserAge)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 2-Click on input userFinancialData UserAge.png')

"Step 3: Enter input value in input userFinancialData (UserAge)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_1]), input_userFinancialData)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 3-Enter input value in input userFinancialData UserAge.png')

"Step 4: Click on input userFinancialData (UserAnnualIncome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 4-Click on input userFinancialData UserAnnualIncome.png')

"Step 5: Enter input value in input userFinancialData (UserAnnualIncome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_3]), input_userFinancialData_1)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 5-Enter input value in input userFinancialData UserAnnualIncome.png')

"Step 6: Click on input userFinancialData (UserRetirementSavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 6-Click on input userFinancialData UserRetirementSavings.png')

"Step 7: Enter input value in input userFinancialData (UserRetirementSavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_5]), input_userFinancialData_2)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 7-Enter input value in input userFinancialData UserRetirementSavings.png')

"Step 8: Click on main MyPlan"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/main_MyPlan'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 8-Click on main MyPlan.png')

"Step 9: Click on input userFinancialData (UserMonthlySavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_6]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 9-Click on input userFinancialData UserMonthlySavings.png')

"Step 10: Enter input value in input userFinancialData (UserMonthlySavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_7]), input_userFinancialData_3)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 10-Enter input value in input userFinancialData UserMonthlySavings.png')

"Step 11: Click on main MyPlan"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/main_MyPlan'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 11-Click on main MyPlan.png')

"Step 12: Click on link navigation (Next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/link_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/link_navigation', ['link_navigation_nth': link_navigation_nth]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 12-Click on link navigation Next.png')

"Step 13: Click on input userFinancialData (UserIncomeOther)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_8]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 13-Click on input userFinancialData UserIncomeOther.png')

"Step 14: Click on input userFinancialData (UserIncomeOther)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_9]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 14-Click on input userFinancialData UserIncomeOther.png')

"Step 15: Enter input value in input userFinancialData (UserIncomeOther)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialData', ['input_userFinancialData_internalLabel': input_userFinancialData_internalLabel_10]), input_userFinancialData_4)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 15-Enter input value in input userFinancialData UserIncomeOther.png')

"Step 16: Click on link navigation (Next2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/link_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/link_navigation', ['link_navigation_nth': link_navigation_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 16-Click on link navigation Next2.png')

"Step 17: Click on div userFinancialInfo (UserInvestmentStyle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/div_userFinancialInfo'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 17-Click on div userFinancialInfo UserInvestmentStyle.png')

"Step 18: Click on link navigation (Next2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/link_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/link_navigation', ['link_navigation_nth': link_navigation_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 18-Click on link navigation Next2.png')

"Step 19: Click on div userFinancialInfo (UserRequiredIncome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/div_userFinancialInfo'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 19-Click on div userFinancialInfo UserRequiredIncome.png')

"Step 20: Click on link navigation (SeeMyResults)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/link_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/link_navigation', ['link_navigation_nth': link_navigation_nth_3]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 20-Click on link navigation SeeMyResults.png')

"Step 21: Click on generatePdfButton -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/generatePdfButton'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 21-Click on generatePdfButton - Navigate to page .png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Generate Retirement Plan PDF and Verify Homepage_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}