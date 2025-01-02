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

"Step 2: Click on toolsAndCalculatorsLink -> Navigate to page 'financial tools#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/toolsAndCalculatorsLink'))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 2-Click on toolsAndCalculatorsLink - Navigate to page financial tools.png')

"Step 3: Hover over link SavingsCalculator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_financial_tools/link_SavingsCalculator'))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 3-Hover over link SavingsCalculator.png')

"Step 4: Click on tryItOutButton2 -> Navigate to page 'financial tool#*/savingscalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tools/tryItOutButton2'))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 4-Click on tryItOutButton2 - Navigate to page financial toolsavingscalculator.png')

"Step 5: Click on vacationGoalToggle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/vacationGoalToggle'))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 5-Click on vacationGoalToggle.png')

"Step 6: Click on button navigationActions (Next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationActions', ['button_navigationActions_class': button_navigationActions_class, 'button_navigationActions_question': button_navigationActions_question]))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 6-Click on button navigationActions Next.png')

"Step 7: Click on goalNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/goalNameInput'))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 7-Click on goalNameInput.png')

"Step 8: Enter input value in goalNameInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_financial_tool/goalNameInput'), goalNameInput2)

WebUI.takeScreenshot(reportLocation + '/TC38/Step 8-Enter input value in goalNameInput2.png')

"Step 9: Click on button navigationActions (Next2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationActions', ['button_navigationActions_class': button_navigationActions_class_1, 'button_navigationActions_question': button_navigationActions_question_1]))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 9-Click on button navigationActions Next2.png')

"Step 10: Click on input savingsGoals (HowMuchDoYouWantToSave)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals', ['input_savingsGoals_class': input_savingsGoals_class, 'input_savingsGoals_internalLabel': input_savingsGoals_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 10-Click on input savingsGoals HowMuchDoYouWantToSave.png')

"Step 11: Enter input value in input savingsGoals (HowMuchDoYouWantToSave)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals', ['input_savingsGoals_class': input_savingsGoals_class_1, 'input_savingsGoals_internalLabel': input_savingsGoals_internalLabel_1]), input_savingsGoals)

WebUI.takeScreenshot(reportLocation + '/TC38/Step 11-Enter input value in input savingsGoals HowMuchDoYouWantToSave.png')

"Step 12: Click on div QuestionContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/div_QuestionContent'))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 12-Click on div QuestionContent.png')

"Step 13: Enter input value in input savingsGoals (HowMuchDoYouWantToSave)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals', ['input_savingsGoals_class': input_savingsGoals_class_2, 'input_savingsGoals_internalLabel': input_savingsGoals_internalLabel_2]), input_savingsGoals_1)

WebUI.takeScreenshot(reportLocation + '/TC38/Step 13-Enter input value in input savingsGoals HowMuchDoYouWantToSave.png')

"Step 14: Click on button navigationActions (Next3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationActions', ['button_navigationActions_class': button_navigationActions_class_2, 'button_navigationActions_question': button_navigationActions_question_2]))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 14-Click on button navigationActions Next3.png')

"Step 15: Click on input savingsGoals (HowMuchHaveYouAlready)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals', ['input_savingsGoals_class': input_savingsGoals_class_3, 'input_savingsGoals_internalLabel': input_savingsGoals_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 15-Click on input savingsGoals HowMuchHaveYouAlready.png')

"Step 16: Enter input value in textbox already saved"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_financial_tool/textbox_already_saved'), textbox_already_saved)

WebUI.takeScreenshot(reportLocation + '/TC38/Step 16-Enter input value in textbox already saved.png')

"Step 17: Click on button navigationActions (Next4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationActions', ['button_navigationActions_class': button_navigationActions_class_3, 'button_navigationActions_question': button_navigationActions_question_3]))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 17-Click on button navigationActions Next4.png')

"Step 18: Click on button navigationActions (Next5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationActions', ['button_navigationActions_class': button_navigationActions_class_4, 'button_navigationActions_question': button_navigationActions_question_4]))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 18-Click on button navigationActions Next5.png')

"Step 19: Click on timeHorizonOptionThreeYears"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/timeHorizonOptionThreeYears'))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 19-Click on timeHorizonOptionThreeYears.png')

"Step 20: Click on button navigationActions (SeeResults)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigationActions', ['button_navigationActions_class': button_navigationActions_class_5, 'button_navigationActions_question': button_navigationActions_question_5]))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 20-Click on button navigationActions SeeResults.png')

"Step 21: Click on increaseMonthlySavingsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/increaseMonthlySavingsButton'))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 21-Click on increaseMonthlySavingsButton.png')

"Step 22: Click on increaseMonthlySavingsButton -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/increaseMonthlySavingsButton'))

WebUI.takeScreenshot(reportLocation + '/TC38/Step 22-Click on increaseMonthlySavingsButton - Navigate to page .png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC38-Utilize Savings Calculator for Financial Goals_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}