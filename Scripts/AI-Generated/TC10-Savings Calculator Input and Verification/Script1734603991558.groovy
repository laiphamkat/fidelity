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

"Step 1: Navigate to *"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}")

"Step 2: Click on toolsAndCalculatorsLink -> Navigate to page 'financial tools#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/toolsAndCalculatorsLink'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 2-Click on toolsAndCalculatorsLink - Navigate to page financial tools.png')

"Step 3: Hover over link SavingsCalculator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_financial_tools/link_SavingsCalculator'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 3-Hover over link SavingsCalculator.png')

"Step 4: Click on tryItOutButton2 -> Navigate to page 'financial tool#*/savingscalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tools/tryItOutButton2'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 4-Click on tryItOutButton2 - Navigate to page financial toolsavingscalculator.png')

"Step 5: Click on vacationGoalToggle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/vacationGoalToggle'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 5-Click on vacationGoalToggle.png')

"Step 6: Click on button navigation (next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation', ['button_navigation_class': button_navigation_class, 'button_navigation_question': button_navigation_question]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 6-Click on button navigation next.png')

"Step 7: Click on goalNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/goalNameInput'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 7-Click on goalNameInput.png')

"Step 8: Enter input value in goalNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_financial_tool/goalNameInput'), goalNameInput)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 8-Enter input value in goalNameInput.png')

"Step 9: Click on button navigation (next2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation', ['button_navigation_class': button_navigation_class_1, 'button_navigation_question': button_navigation_question_1]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 9-Click on button navigation next2.png')

"Step 10: Click on input savings (saveAmount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savings', ['input_savings_class': input_savings_class, 'input_savings_internalLabel': input_savings_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 10-Click on input savings saveAmount.png')

"Step 11: Enter input value in input savings (saveAmount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savings"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savings', ['input_savings_class': input_savings_class_1, 'input_savings_internalLabel': input_savings_internalLabel_1]), input_savings)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 11-Enter input value in input savings saveAmount.png')

"Step 12: Click on div QuestionContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/div_QuestionContent'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 12-Click on div QuestionContent.png')

"Step 13: Enter input value in input savings (saveAmount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savings"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savings', ['input_savings_class': input_savings_class_2, 'input_savings_internalLabel': input_savings_internalLabel_2]), input_savings_1)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 13-Enter input value in input savings saveAmount.png')

"Step 14: Click on button navigation (next3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation', ['button_navigation_class': button_navigation_class_2, 'button_navigation_question': button_navigation_question_2]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 14-Click on button navigation next3.png')

"Step 15: Click on input savings (savedAmount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savings"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savings', ['input_savings_class': input_savings_class_3, 'input_savings_internalLabel': input_savings_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 15-Click on input savings savedAmount.png')

"Step 16: Enter input value in input savings (savedAmount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savings"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savings', ['input_savings_class': input_savings_class_4, 'input_savings_internalLabel': input_savings_internalLabel_4]), input_savings_2)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 16-Enter input value in input savings savedAmount.png')

"Step 17: Click on button navigation (next4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation', ['button_navigation_class': button_navigation_class_3, 'button_navigation_question': button_navigation_question_3]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 17-Click on button navigation next4.png')

"Step 18: Click on button navigation (selectOption)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation', ['button_navigation_class': button_navigation_class_4, 'button_navigation_question': button_navigation_question_4]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 18-Click on button navigation selectOption.png')

"Step 19: Click on timeHorizonOptionThreeYears"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/timeHorizonOptionThreeYears'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 19-Click on timeHorizonOptionThreeYears.png')

"Step 20: Click on button navigation (seeResults)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation', ['button_navigation_class': button_navigation_class_5, 'button_navigation_question': button_navigation_question_5]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 20-Click on button navigation seeResults.png')

"Step 21: Click on increaseMonthlySavingsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/increaseMonthlySavingsButton'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 21-Click on increaseMonthlySavingsButton.png')

"Step 22: Click on increaseMonthlySavingsButton -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/increaseMonthlySavingsButton'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 22-Click on increaseMonthlySavingsButton - Navigate to page .png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Savings Calculator Input and Verification_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}