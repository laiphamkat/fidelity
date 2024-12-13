import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts
import com.kms.katalon.core.configuration.RunConfiguration

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to */retirementcalculator"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/retirementcalculator")

"Step 2: Click on input userFinancialInfo (UserAge)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': input_userFinancialInfo_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on input userFinancialInfo UserAge.png')

"Step 3: Enter input value in input userFinancialInfo (UserAge)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': input_userFinancialInfo_internalLabel_1]), input_userFinancialInfo)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Enter input value in input userFinancialInfo UserAge.png')

"Step 4: Click on input userFinancialInfo (UserAnnualIncome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': input_userFinancialInfo_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on input userFinancialInfo UserAnnualIncome.png')

"Step 5: Enter input value in input userFinancialInfo (UserAnnualIncome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': input_userFinancialInfo_internalLabel_3]), input_userFinancialInfo_1)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Enter input value in input userFinancialInfo UserAnnualIncome.png')

"Step 6: Click on input userFinancialInfo (UserRetirementSavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': input_userFinancialInfo_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on input userFinancialInfo UserRetirementSavings.png')

"Step 7: Enter input value in input userFinancialInfo (UserRetirementSavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': input_userFinancialInfo_internalLabel_5]), input_userFinancialInfo_2)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Enter input value in input userFinancialInfo UserRetirementSavings.png')

"Step 8: Click on main MyPlanMain"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/main_MyPlanMain'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on main MyPlanMain.png')

"Step 9: Click on input userFinancialInfo (UserMonthlySavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': input_userFinancialInfo_internalLabel_6]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on input userFinancialInfo UserMonthlySavings.png')

"Step 10: Enter input value in input userFinancialInfo (UserMonthlySavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': input_userFinancialInfo_internalLabel_7]), input_userFinancialInfo_3)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Enter input value in input userFinancialInfo UserMonthlySavings.png')

"Step 11: Click on link navigation (Next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/link_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/link_navigation', ['link_navigation_nth': link_navigation_nth]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Click on link navigation Next.png')

"Step 12: Click on input userFinancialInfo (UserIncomeOther)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': input_userFinancialInfo_internalLabel_8]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 12-Click on input userFinancialInfo UserIncomeOther.png')

"Step 13: Click on input userFinancialInfo (UserIncomeOther)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': input_userFinancialInfo_internalLabel_9]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 13-Click on input userFinancialInfo UserIncomeOther.png')

"Step 14: Enter input value in input userFinancialInfo (UserIncomeOther)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': input_userFinancialInfo_internalLabel_10]), input_userFinancialInfo_4)

WebUI.takeScreenshot(reportLocation + '/TC4/Step 14-Enter input value in input userFinancialInfo UserIncomeOther.png')

"Step 15: Click on link navigation (Next2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/link_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/link_navigation', ['link_navigation_nth': link_navigation_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 15-Click on link navigation Next2.png')

"Step 16: Click on div UserInvestmentStyleSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/div_UserInvestmentStyleSlider'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 16-Click on div UserInvestmentStyleSlider.png')

"Step 17: Click on link navigation (Next2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/link_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/link_navigation', ['link_navigation_nth': link_navigation_nth_2]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 17-Click on link navigation Next2.png')

"Step 18: Click on div UserRequiredIncomeSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/div_UserRequiredIncomeSlider'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 18-Click on div UserRequiredIncomeSlider.png')

"Step 19: Click on link navigation (SeeMyResults)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/link_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/link_navigation', ['link_navigation_nth': link_navigation_nth_3]))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 19-Click on link navigation SeeMyResults.png')

"Step 20: Click on resultsViewSelect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/resultsViewSelect'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 20-Click on resultsViewSelect.png')

"Step 21: Click on projectedIncomeTab"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/projectedIncomeTab'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 21-Click on projectedIncomeTab.png')

"Step 22: Click on startOverButton -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/startOverButton'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 22-Click on startOverButton - Navigate to page .png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Complete Retirement Calculator with User Financial Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}