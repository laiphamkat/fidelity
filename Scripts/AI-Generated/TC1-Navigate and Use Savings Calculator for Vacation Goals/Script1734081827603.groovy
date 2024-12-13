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

"Step 1: Navigate to *"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}")

"Step 2: Click on toolsAndCalculatorsLink -> Navigate to page 'financial tools#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/toolsAndCalculatorsLink'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on toolsAndCalculatorsLink - Navigate to page financial tools.png')

"Step 3: Hover over link SavingsCalculator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_financial_tools/link_SavingsCalculator'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Hover over link SavingsCalculator.png')

"Step 4: Click on tryItOutButton -> Navigate to page 'financial tool#*/savingscalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tools/tryItOutButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on tryItOutButton - Navigate to page financial toolsavingscalculator.png')

"Step 5: Click on vacationGoalToggle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/vacationGoalToggle'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on vacationGoalToggle.png')

"Step 6: Click on button navigationOption (Next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationOption', ['button_navigationOption_class': button_navigationOption_class, 'button_navigationOption_question': button_navigationOption_question]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on button navigationOption Next.png')

"Step 7: Click on goalNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/goalNameInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on goalNameInput.png')

"Step 8: Enter input value in goalNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_financial_tool/goalNameInput'), goalNameInput)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Enter input value in goalNameInput.png')

"Step 9: Click on button navigationOption (Next2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationOption', ['button_navigationOption_class': button_navigationOption_class_1, 'button_navigationOption_question': button_navigationOption_question_1]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on button navigationOption Next2.png')

"Step 10: Click on input savedAmount (SaveAmount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savedAmount"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savedAmount', ['input_savedAmount_class': input_savedAmount_class, 'input_savedAmount_internalLabel': input_savedAmount_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on input savedAmount SaveAmount.png')

"Step 11: Enter input value in input savedAmount (SaveAmount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savedAmount"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savedAmount', ['input_savedAmount_class': input_savedAmount_class_1, 'input_savedAmount_internalLabel': input_savedAmount_internalLabel_1]), input_savedAmount)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Enter input value in input savedAmount SaveAmount.png')

"Step 12: Click on div QuestionContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/div_QuestionContent'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on div QuestionContent.png')

"Step 13: Enter input value in input savedAmount (SaveAmount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savedAmount"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savedAmount', ['input_savedAmount_class': input_savedAmount_class_2, 'input_savedAmount_internalLabel': input_savedAmount_internalLabel_2]), input_savedAmount_1)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Enter input value in input savedAmount SaveAmount.png')

"Step 14: Click on button navigationOption (Next3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationOption', ['button_navigationOption_class': button_navigationOption_class_2, 'button_navigationOption_question': button_navigationOption_question_2]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on button navigationOption Next3.png')

"Step 15: Click on input savedAmount (AlreadySavedAmount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savedAmount"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savedAmount', ['input_savedAmount_class': input_savedAmount_class_3, 'input_savedAmount_internalLabel': input_savedAmount_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 15-Click on input savedAmount AlreadySavedAmount.png')

"Step 16: Enter input value in input savedAmount (AlreadySavedAmount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savedAmount"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savedAmount', ['input_savedAmount_class': input_savedAmount_class_4, 'input_savedAmount_internalLabel': input_savedAmount_internalLabel_4]), input_savedAmount_2)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 16-Enter input value in input savedAmount AlreadySavedAmount.png')

"Step 17: Click on button navigationOption (Next4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationOption', ['button_navigationOption_class': button_navigationOption_class_3, 'button_navigationOption_question': button_navigationOption_question_3]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 17-Click on button navigationOption Next4.png')

"Step 18: Click on button navigationOption (SelectOption)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationOption', ['button_navigationOption_class': button_navigationOption_class_4, 'button_navigationOption_question': button_navigationOption_question_4]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 18-Click on button navigationOption SelectOption.png')

"Step 19: Click on timeHorizonOptionThreeYears"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/timeHorizonOptionThreeYears'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 19-Click on timeHorizonOptionThreeYears.png')

"Step 20: Click on button navigationOption (SeeResults)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationOption"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationOption', ['button_navigationOption_class': button_navigationOption_class_5, 'button_navigationOption_question': button_navigationOption_question_5]))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 20-Click on button navigationOption SeeResults.png')

"Step 21: Click on increaseMonthlySavingsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/increaseMonthlySavingsButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 21-Click on increaseMonthlySavingsButton.png')

"Step 22: Click on increaseMonthlySavingsButton -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/increaseMonthlySavingsButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 22-Click on increaseMonthlySavingsButton - Navigate to page .png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Navigate and Use Savings Calculator for Vacation Goals_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}