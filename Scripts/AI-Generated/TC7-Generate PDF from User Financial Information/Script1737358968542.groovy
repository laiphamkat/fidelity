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

"Step 1: Navigate to *"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}")

"Step 2: Click on link ToolsAndCalculators -> Navigate to page 'calculator page#*/retirementcalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/link_ToolsAndCalculators'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Click on link ToolsAndCalculators - Navigate to page calculator pageretirementcalculator.png')

"Step 3: Click on input userFinancialInfo (UserAge)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': input_userFinancialInfo_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on input userFinancialInfo UserAge.png')

"Step 4: Enter input value in input userFinancialInfo (UserAge)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialInfo"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': input_userFinancialInfo_internalLabel_1]), input_userFinancialInfo)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Enter input value in input userFinancialInfo UserAge.png')

"Step 5: Click on input userFinancialInfo (UserAnnualIncome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': input_userFinancialInfo_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on input userFinancialInfo UserAnnualIncome.png')

"Step 6: Enter input value in input userFinancialInfo (UserAnnualIncome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialInfo"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': input_userFinancialInfo_internalLabel_3]), input_userFinancialInfo_1)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Enter input value in input userFinancialInfo UserAnnualIncome.png')

"Step 7: Click on input userFinancialInfo (UserRetirementSavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': input_userFinancialInfo_internalLabel_4]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on input userFinancialInfo UserRetirementSavings.png')

"Step 8: Enter input value in input userFinancialInfo (UserRetirementSavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialInfo"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': input_userFinancialInfo_internalLabel_5]), input_userFinancialInfo_2)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Enter input value in input userFinancialInfo UserRetirementSavings.png')

"Step 9: Click on input userFinancialInfo (UserMonthlySavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': input_userFinancialInfo_internalLabel_6]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on input userFinancialInfo UserMonthlySavings.png')

"Step 10: Enter input value in input userFinancialInfo (UserMonthlySavings)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialInfo"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': input_userFinancialInfo_internalLabel_7]), input_userFinancialInfo_3)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Enter input value in input userFinancialInfo UserMonthlySavings.png')

"Step 11: Click on main object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/main_object'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 11-Click on main object.png')

"Step 12: Click on link navigationArrows (NextArrow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationArrows"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationArrows', ['link_navigationArrows_internalRoleLinkName': link_navigationArrows_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 12-Click on link navigationArrows NextArrow.png')

"Step 13: Click on input userFinancialInfo (UserIncomeOther)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialInfo"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': input_userFinancialInfo_internalLabel_8]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 13-Click on input userFinancialInfo UserIncomeOther.png')

"Step 14: Enter input value in input userFinancialInfo (UserIncomeOther)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialInfo"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': input_userFinancialInfo_internalLabel_9]), input_userFinancialInfo_4)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 14-Enter input value in input userFinancialInfo UserIncomeOther.png')

"Step 15: Click on link navigationArrows (NextArrow2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationArrows"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationArrows', ['link_navigationArrows_internalRoleLinkName': link_navigationArrows_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 15-Click on link navigationArrows NextArrow2.png')

"Step 16: Adjust div userFinancialDetails by input value (UserInvestmentStyle)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/div_userFinancialDetails'), Double.valueOf(div_userFinancialDetails))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 16-Adjust div userFinancialDetails by input value UserInvestmentStyle.png')

"Step 17: Click on link navigationArrows (NextArrow2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationArrows"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationArrows', ['link_navigationArrows_internalRoleLinkName': link_navigationArrows_internalRoleLinkName_2]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 17-Click on link navigationArrows NextArrow2.png')

"Step 18: Adjust div userFinancialDetails by input value (UserRequiredIncome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/div_userFinancialDetails'), Double.valueOf(div_userFinancialDetails_1))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 18-Adjust div userFinancialDetails by input value UserRequiredIncome.png')

"Step 19: Adjust div userFinancialDetails by input value (UserRequiredIncome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/div_userFinancialDetails'), Double.valueOf(div_userFinancialDetails_2))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 19-Adjust div userFinancialDetails by input value UserRequiredIncome.png')

"Step 20: Adjust div userFinancialDetails by input value (UserRequiredIncome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/div_userFinancialDetails'), Double.valueOf(div_userFinancialDetails_3))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 20-Adjust div userFinancialDetails by input value UserRequiredIncome.png')

"Step 21: Click on link navigationArrows (SeeMyResultsArrow)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationArrows"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationArrows', ['link_navigationArrows_internalRoleLinkName': link_navigationArrows_internalRoleLinkName_3]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 21-Click on link navigationArrows SeeMyResultsArrow.png')

"Step 22: Click on link GeneratePDF -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/link_GeneratePDF'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 22-Click on link GeneratePDF - Navigate to page .png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Generate PDF from User Financial Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}