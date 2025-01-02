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

WebUI.takeScreenshot(reportLocation + '/TC21/Step 2-Click on toolsAndCalculatorsLink - Navigate to page financial tools.png')

"Step 3: Hover over link SavingsCalculator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_financial_tools/link_SavingsCalculator'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 3-Hover over link SavingsCalculator.png')

"Step 4: Click on tryItOutButton2 -> Navigate to page 'financial tool#*/savingscalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tools/tryItOutButton2'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 4-Click on tryItOutButton2 - Navigate to page financial toolsavingscalculator.png')

"Step 5: Click on vacationGoalToggle"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/vacationGoalToggle'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 5-Click on vacationGoalToggle.png')

"Step 6: Click on button financialToolNavigation (NextQuestion1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_financialToolNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_financialToolNavigation', ['button_financialToolNavigation_class': button_financialToolNavigation_class, 'button_financialToolNavigation_question': button_financialToolNavigation_question]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 6-Click on button financialToolNavigation NextQuestion1.png')

"Step 7: Click on goalNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/goalNameInput'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 7-Click on goalNameInput.png')

"Step 8: Enter input value in goalNameInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_financial_tool/goalNameInput'), goalNameInput2)

WebUI.takeScreenshot(reportLocation + '/TC21/Step 8-Enter input value in goalNameInput2.png')

"Step 9: Click on button financialToolNavigation (NextQuestion2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_financialToolNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_financialToolNavigation', ['button_financialToolNavigation_class': button_financialToolNavigation_class_1, 'button_financialToolNavigation_question': button_financialToolNavigation_question_1]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 9-Click on button financialToolNavigation NextQuestion2.png')

"Step 10: Click on textbox want save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/textbox_want_save'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 10-Click on textbox want save.png')

"Step 11: Enter input value in textbox want save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_financial_tool/textbox_want_save'), textbox_want_save)

WebUI.takeScreenshot(reportLocation + '/TC21/Step 11-Enter input value in textbox want save.png')

"Step 12: Click on div QuestionContent"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/div_QuestionContent'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 12-Click on div QuestionContent.png')

"Step 13: Enter input value in textbox want save"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_financial_tool/textbox_want_save'), textbox_want_save_1)

WebUI.takeScreenshot(reportLocation + '/TC21/Step 13-Enter input value in textbox want save.png')

"Step 14: Click on button financialToolNavigation (NextQuestion3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_financialToolNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_financialToolNavigation', ['button_financialToolNavigation_class': button_financialToolNavigation_class_2, 'button_financialToolNavigation_question': button_financialToolNavigation_question_2]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 14-Click on button financialToolNavigation NextQuestion3.png')

"Step 15: Click on textbox already saved"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/textbox_already_saved'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 15-Click on textbox already saved.png')

"Step 16: Enter input value in textbox already saved2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_financial_tool/textbox_already_saved'), textbox_already_saved2)

WebUI.takeScreenshot(reportLocation + '/TC21/Step 16-Enter input value in textbox already saved2.png')

"Step 17: Click on button financialToolNavigation (NextQuestion4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_financialToolNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_financialToolNavigation', ['button_financialToolNavigation_class': button_financialToolNavigation_class_3, 'button_financialToolNavigation_question': button_financialToolNavigation_question_3]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 17-Click on button financialToolNavigation NextQuestion4.png')

"Step 18: Click on button when will you need this money"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/button_when_will_you_need_this_money'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 18-Click on button when will you need this money.png')

"Step 19: Click on timeHorizonOptionThreeYears"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/timeHorizonOptionThreeYears'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 19-Click on timeHorizonOptionThreeYears.png')

"Step 20: Click on button financialToolNavigation (SeeResults)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_financialToolNavigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_financialToolNavigation', ['button_financialToolNavigation_class': button_financialToolNavigation_class_4, 'button_financialToolNavigation_question': button_financialToolNavigation_question_4]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 20-Click on button financialToolNavigation SeeResults.png')

"Step 21: Click on increaseMonthlySavingsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/increaseMonthlySavingsButton'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 21-Click on increaseMonthlySavingsButton.png')

"Step 22: Click on increaseMonthlySavingsButton -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/increaseMonthlySavingsButton'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 22-Click on increaseMonthlySavingsButton - Navigate to page .png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC21-Savings Goal Calculator and Input Verification_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}