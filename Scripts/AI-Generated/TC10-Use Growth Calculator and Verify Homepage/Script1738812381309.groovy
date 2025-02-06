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

"Step 1: Navigate to */*"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/${GlobalVariable.path_param_2}")

"Step 2: Hover over link GrowthCalculator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_financial_tools/link_GrowthCalculator'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 2-Hover over link GrowthCalculator.png')

"Step 3: Click on button TryItOut -> Navigate to page 'calculator#*/growthcalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tools/button_TryItOut'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 3-Click on button TryItOut - Navigate to page calculatorgrowthcalculator.png')

"Step 4: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 4-Click on div object.png')

"Step 5: Click on div dynamicObject (object2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/div_dynamicObject', ['div_dynamicObject_rmSlider': div_dynamicObject_rmSlider]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 5-Click on div dynamicObject object2.png')

"Step 6: Click on div dynamicObject (object3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/div_dynamicObject', ['div_dynamicObject_rmSlider': div_dynamicObject_rmSlider_1]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 6-Click on div dynamicObject object3.png')

"Step 7: Click on input RateOfReturn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/input_RateOfReturn'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 7-Click on input RateOfReturn.png')

"Step 8: Enter input value in input RateOfReturn"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator/input_RateOfReturn'), input_RateOfReturn)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 8-Enter input value in input RateOfReturn.png')

"Step 9: Click on input AdditionalContributions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/input_AdditionalContributions'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 9-Click on input AdditionalContributions.png')

"Step 10: Click on div dynamicObject (object4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/div_dynamicObject', ['div_dynamicObject_rmSlider': div_dynamicObject_rmSlider_2]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 10-Click on div dynamicObject object4.png')

"Step 11: Click on div dynamicObject (object5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/div_dynamicObject', ['div_dynamicObject_rmSlider': div_dynamicObject_rmSlider_3]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 11-Click on div dynamicObject object5.png')

"Step 12: Enter input value in input AdditionalContributions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator/input_AdditionalContributions'), input_AdditionalContributions)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 12-Enter input value in input AdditionalContributions.png')

"Step 13: Click on canvas graphDemo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/canvas_graphDemo'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 13-Click on canvas graphDemo.png')

"Step 14: Click on select Frequency"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/select_Frequency'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 14-Click on select Frequency.png')

"Step 15: Select option with input value from select Frequency"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_calculator/select_Frequency'), select_Frequency)

WebUI.takeScreenshot(reportLocation + '/TC10/Step 15-Select option with input value from select Frequency.png')

"Step 16: Click on span financialValues (DollarAmount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/span_financialValues"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/span_financialValues', ['span_financialValues_class': span_financialValues_class]))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 16-Click on span financialValues DollarAmount.png')

"Step 17: Click on input nominalDollars (NominalDollars) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_nominalDollars'))

WebUI.takeScreenshot(reportLocation + '/TC10/Step 17-Click on input nominalDollars NominalDollars - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC10-Use Growth Calculator and Verify Homepage_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}