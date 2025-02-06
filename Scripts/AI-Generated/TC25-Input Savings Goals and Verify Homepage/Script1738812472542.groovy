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

"Step 2: Click on link toolsAndCalculators (ToolsAndCalculators2) -> Navigate to page 'financial tools#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_homepage/link_toolsAndCalculators'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 2-Click on link toolsAndCalculators ToolsAndCalculators2 - Navigate to page financial tools.png')

"Step 3: Hover over link SavingsCalculator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_financial_tools/link_SavingsCalculator'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 3-Hover over link SavingsCalculator.png')

"Step 4: Click on button tryItOut (TryItOut3) -> Navigate to page 'financial tool#*/savingscalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tools/button_tryItOut'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 4-Click on button tryItOut TryItOut3 - Navigate to page financial toolsavingscalculator.png')

"Step 5: Click on div financialGoals (Vacation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/div_financialGoals"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/div_financialGoals', ['div_financialGoals_class': div_financialGoals_class, 'div_financialGoals_internalLabel': div_financialGoals_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 5-Click on div financialGoals Vacation.png')

"Step 6: Click on button navigation (Next5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation', ['button_navigation_class': button_navigation_class, 'button_navigation_question': button_navigation_question]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 6-Click on button navigation Next5.png')

"Step 7: Click on input NameYourGoal"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/input_NameYourGoal'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 7-Click on input NameYourGoal.png')

"Step 8: Enter input value in input NameYourGoal"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_financial_tool/input_NameYourGoal'), input_NameYourGoal)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 8-Enter input value in input NameYourGoal.png')

"Step 9: Click on button navigation (Next6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation', ['button_navigation_class': button_navigation_class_1, 'button_navigation_question': button_navigation_question_1]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 9-Click on button navigation Next6.png')

"Step 10: Click on input savingsGoals (HowMuchDoYouWantToSave)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals', ['input_savingsGoals_class': input_savingsGoals_class, 'input_savingsGoals_internalLabel': input_savingsGoals_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 10-Click on input savingsGoals HowMuchDoYouWantToSave.png')

"Step 11: Enter input value in input savingsGoals (HowMuchDoYouWantToSave)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals', ['input_savingsGoals_class': input_savingsGoals_class_1, 'input_savingsGoals_internalLabel': input_savingsGoals_internalLabel_1]), input_savingsGoals)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 11-Enter input value in input savingsGoals HowMuchDoYouWantToSave.png')

"Step 12: Click on div object7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/div_object7'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 12-Click on div object7.png')

"Step 13: Enter input value in input savingsGoals (HowMuchDoYouWantToSave)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals', ['input_savingsGoals_class': input_savingsGoals_class_2, 'input_savingsGoals_internalLabel': input_savingsGoals_internalLabel_2]), input_savingsGoals_1)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 13-Enter input value in input savingsGoals HowMuchDoYouWantToSave.png')

"Step 14: Click on button navigation (Next7)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation', ['button_navigation_class': button_navigation_class_2, 'button_navigation_question': button_navigation_question_2]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 14-Click on button navigation Next7.png')

"Step 15: Click on input savingsGoals (HowMuchHaveYouAlready)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals', ['input_savingsGoals_class': input_savingsGoals_class_3, 'input_savingsGoals_internalLabel': input_savingsGoals_internalLabel_3]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 15-Click on input savingsGoals HowMuchHaveYouAlready.png')

"Step 16: Enter input value in input savingsGoals (HowMuchHaveYouAlready)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals', ['input_savingsGoals_class': input_savingsGoals_class_4, 'input_savingsGoals_internalLabel': input_savingsGoals_internalLabel_4]), input_savingsGoals_2)

WebUI.takeScreenshot(reportLocation + '/TC25/Step 16-Enter input value in input savingsGoals HowMuchHaveYouAlready.png')

"Step 17: Click on button navigation (Next8)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation', ['button_navigation_class': button_navigation_class_3, 'button_navigation_question': button_navigation_question_3]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 17-Click on button navigation Next8.png')

"Step 18: Click on button navigation (SelectAnOption)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation', ['button_navigation_class': button_navigation_class_4, 'button_navigation_question': button_navigation_question_4]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 18-Click on button navigation SelectAnOption.png')

"Step 19: Click on div dynamicObject (OptCst3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/div_dynamicObject', ['div_dynamicObject_optCst': div_dynamicObject_optCst]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 19-Click on div dynamicObject OptCst3.png')

"Step 20: Click on button navigation (SeeResults2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation', ['button_navigation_class': button_navigation_class_5, 'button_navigation_question': button_navigation_question_5]))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 20-Click on button navigation SeeResults2.png')

"Step 21: Click on button IncreaseMonthlySavings"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/button_IncreaseMonthlySavings'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 21-Click on button IncreaseMonthlySavings.png')

"Step 22: Click on button IncreaseMonthlySavings -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/button_IncreaseMonthlySavings'))

WebUI.takeScreenshot(reportLocation + '/TC25/Step 22-Click on button IncreaseMonthlySavings - Navigate to page .png')

"Step 23: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC25-Input Savings Goals and Verify Homepage_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}