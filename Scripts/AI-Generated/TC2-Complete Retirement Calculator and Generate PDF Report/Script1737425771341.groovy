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

"Step 1: Navigate to */retirementcalculator"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/retirementcalculator")

"Step 2: Click on input userFinancialDetails (UserAge)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialDetails', ['input_userFinancialDetails_internalLabel': input_userFinancialDetails_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on input userFinancialDetails UserAge.png')

"Step 3: Enter input value in input userFinancialDetails (UserAge)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialDetails', ['input_userFinancialDetails_internalLabel': input_userFinancialDetails_internalLabel_1]), input_userFinancialDetails)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Enter input value in input userFinancialDetails UserAge.png')

"Step 4: Click on input userFinancialDetails (UserAnnualIncome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialDetails', ['input_userFinancialDetails_internalLabel': input_userFinancialDetails_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on input userFinancialDetails UserAnnualIncome.png')

"Step 5: Enter input value in input userFinancialDetails (UserAnnualIncome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialDetails', ['input_userFinancialDetails_internalLabel': input_userFinancialDetails_internalLabel_3]), input_userFinancialDetails_1)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Enter input value in input userFinancialDetails UserAnnualIncome.png')

"Step 6: Click on input userFinancialDetails (UserRetirementSavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialDetails', ['input_userFinancialDetails_internalLabel': input_userFinancialDetails_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on input userFinancialDetails UserRetirementSavings.png')

"Step 7: Enter input value in input userFinancialDetails (UserRetirementSavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialDetails', ['input_userFinancialDetails_internalLabel': input_userFinancialDetails_internalLabel_5]), input_userFinancialDetails_2)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Enter input value in input userFinancialDetails UserRetirementSavings.png')

"Step 8: Click on div SavingsInfo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/div_SavingsInfo'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on div SavingsInfo.png')

"Step 9: Click on input userFinancialDetails (UserMonthlySavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialDetails', ['input_userFinancialDetails_internalLabel': input_userFinancialDetails_internalLabel_6]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on input userFinancialDetails UserMonthlySavings.png')

"Step 10: Enter input value in input userFinancialDetails (UserMonthlySavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialDetails', ['input_userFinancialDetails_internalLabel': input_userFinancialDetails_internalLabel_7]), input_userFinancialDetails_3)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Enter input value in input userFinancialDetails UserMonthlySavings.png')

"Step 11: Click on link navigationArrows (NextArrow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationArrows"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationArrows', ['link_navigationArrows_internalRoleLinkName': link_navigationArrows_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on link navigationArrows NextArrow.png')

"Step 12: Click on input userFinancialDetails (UserIncomeOther)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialDetails', ['input_userFinancialDetails_internalLabel': input_userFinancialDetails_internalLabel_8]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on input userFinancialDetails UserIncomeOther.png')

"Step 13: Enter input value in input userFinancialDetails (UserIncomeOther)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialDetails"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialDetails', ['input_userFinancialDetails_internalLabel': input_userFinancialDetails_internalLabel_9]), input_userFinancialDetails_4)

WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Enter input value in input userFinancialDetails UserIncomeOther.png')

"Step 14: Click on link navigationArrows (NextArrow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationArrows"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationArrows', ['link_navigationArrows_internalRoleLinkName': link_navigationArrows_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on link navigationArrows NextArrow.png')

"Step 15: Adjust div UserInvestmentStyle by input value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Page_calculator_page/div_UserInvestmentStyle'), Double.valueOf(div_UserInvestmentStyle))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Adjust div UserInvestmentStyle by input value.png')

"Step 16: Click on link navigationArrows (NextArrow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationArrows"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationArrows', ['link_navigationArrows_internalRoleLinkName': link_navigationArrows_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Click on link navigationArrows NextArrow.png')

"Step 17: Adjust div UserRequiredIncome by input value"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Page_calculator_page/div_UserRequiredIncome'), Double.valueOf(div_UserRequiredIncome))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Adjust div UserRequiredIncome by input value.png')

"Step 18: Click on link navigationArrows (SeeMyResultsArrow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationArrows"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationArrows', ['link_navigationArrows_internalRoleLinkName': link_navigationArrows_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Click on link navigationArrows SeeMyResultsArrow.png')

"Step 19: Click on link GeneratePDF"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/link_GeneratePDF'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 19-Click on link GeneratePDF.png')

"Step 20: Click on link StartOver -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/link_StartOver'))

WebUI.takeScreenshot(reportLocation + '/TC2/Step 20-Click on link StartOver - Navigate to page .png')

"Step 21: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Complete Retirement Calculator and Generate PDF Report_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}