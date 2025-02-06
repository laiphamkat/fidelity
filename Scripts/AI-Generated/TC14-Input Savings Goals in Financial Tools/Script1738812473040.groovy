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

"Step 2: Click on link toolsAndCalculators (ToolsAndCalculators) -> Navigate to page 'financial tools#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_homepage/link_toolsAndCalculators'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 2-Click on link toolsAndCalculators ToolsAndCalculators - Navigate to page financial tools.png')

"Step 3: Hover over link SavingsCalculator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_financial_tools/link_SavingsCalculator'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 3-Hover over link SavingsCalculator.png')

"Step 4: Click on button tryItOut (TryItOut2) -> Navigate to page 'financial tool#*/savingscalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tools/button_tryItOut'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 4-Click on button tryItOut TryItOut2 - Navigate to page financial toolsavingscalculator.png')

"Step 5: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 5-Click on div object.png')

"Step 6: Click on div object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/div_object2'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 6-Click on div object2.png')

"Step 7: Click on div financialGoals (NewHome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/div_financialGoals"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/div_financialGoals', ['div_financialGoals_class': div_financialGoals_class, 'div_financialGoals_internalLabel': div_financialGoals_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 7-Click on div financialGoals NewHome.png')

"Step 8: Click on button navigation (Next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation', ['button_navigation_class': button_navigation_class, 'button_navigation_question': button_navigation_question]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 8-Click on button navigation Next.png')

"Step 9: Click on input NameYourGoal"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/input_NameYourGoal'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 9-Click on input NameYourGoal.png')

"Step 10: Enter input value in input NameYourGoal"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_financial_tool/input_NameYourGoal'), input_NameYourGoal)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 10-Enter input value in input NameYourGoal.png')

"Step 11: Enter input value in input NameYourGoal"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_financial_tool/input_NameYourGoal'), input_NameYourGoal_1)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 11-Enter input value in input NameYourGoal.png')

"Step 12: Click on button navigation (Next2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation', ['button_navigation_class': button_navigation_class_1, 'button_navigation_question': button_navigation_question_1]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 12-Click on button navigation Next2.png')

"Step 13: Click on input savingsGoals (HowMuchDoYouWantToSave)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals', ['input_savingsGoals_class': input_savingsGoals_class, 'input_savingsGoals_internalLabel': input_savingsGoals_internalLabel]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 13-Click on input savingsGoals HowMuchDoYouWantToSave.png')

"Step 14: Enter input value in input savingsGoals (HowMuchDoYouWantToSave)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals', ['input_savingsGoals_class': input_savingsGoals_class_1, 'input_savingsGoals_internalLabel': input_savingsGoals_internalLabel_1]), input_savingsGoals)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 14-Enter input value in input savingsGoals HowMuchDoYouWantToSave.png')

"Step 15: Click on button navigation (Next3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation', ['button_navigation_class': button_navigation_class_2, 'button_navigation_question': button_navigation_question_2]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 15-Click on button navigation Next3.png')

"Step 16: Click on input savingsGoals (HowMuchHaveYouAlready)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals', ['input_savingsGoals_class': input_savingsGoals_class_2, 'input_savingsGoals_internalLabel': input_savingsGoals_internalLabel_2]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 16-Click on input savingsGoals HowMuchHaveYouAlready.png')

"Step 17: Enter input value in input savingsGoals (HowMuchHaveYouAlready)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals"
WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/input_savingsGoals', ['input_savingsGoals_class': input_savingsGoals_class_3, 'input_savingsGoals_internalLabel': input_savingsGoals_internalLabel_3]), input_savingsGoals_1)

WebUI.takeScreenshot(reportLocation + '/TC14/Step 17-Enter input value in input savingsGoals HowMuchHaveYouAlready.png')

"Step 18: Click on div object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/div_object3'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 18-Click on div object3.png')

"Step 19: Click on button navigation (Next4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation', ['button_navigation_class': button_navigation_class_3, 'button_navigation_question': button_navigation_question_3]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 19-Click on button navigation Next4.png')

"Step 20: Click on button navigation (SelectAnOption)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation', ['button_navigation_class': button_navigation_class_4, 'button_navigation_question': button_navigation_question_4]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 20-Click on button navigation SelectAnOption.png')

"Step 21: Click on div dynamicObject (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/div_dynamicObject', ['div_dynamicObject_optCst': div_dynamicObject_optCst]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 21-Click on div dynamicObject object4.png')

"Step 22: Click on button navigation (SeeResults)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_financial_tool/button_navigation', ['button_navigation_class': button_navigation_class_5, 'button_navigation_question': button_navigation_question_5]))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 22-Click on button navigation SeeResults.png')

"Step 23: Hover over div object5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_financial_tool/div_object5'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 23-Hover over div object5.png')

"Step 24: Click on div object6 -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/savingscalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/div_object6'))

WebUI.takeScreenshot(reportLocation + '/TC14/Step 24-Click on div object6 - Navigate to page .png')

"Step 25: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC14-Input Savings Goals in Financial Tools_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}