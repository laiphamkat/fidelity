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

WebUI.takeScreenshot(reportLocation + '/TC7/Step 2-Hover over link GrowthCalculator.png')

"Step 3: Click on button try it out -> Navigate to page 'calculator page#*/growthcalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tools/button_try_it_out'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on button try it out - Navigate to page calculator pagegrowthcalculator.png')

"Step 4: Click on slider initial investment"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/slider_initial_investment'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on slider initial investment.png')

"Step 5: Click on div slider (Slider1)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/div_slider"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/div_slider', ['div_slider_rmSlider': div_slider_rmSlider]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 5-Click on div slider Slider1.png')

"Step 6: Click on div slider (Slider3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/div_slider"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/div_slider', ['div_slider_rmSlider': div_slider_rmSlider_1]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 6-Click on div slider Slider3.png')

"Step 7: Click on input rate of return"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_rate_of_return'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on input rate of return.png')

"Step 8: Enter input value in input rate of return"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/input_rate_of_return'), input_rate_of_return)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Enter input value in input rate of return.png')

"Step 9: Click on input additional contributions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/input_additional_contributions'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on input additional contributions.png')

"Step 10: Click on div slider (Slider2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/div_slider"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/div_slider', ['div_slider_rmSlider': div_slider_rmSlider_2]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 10-Click on div slider Slider2.png')

"Step 11: Click on div slider (Slider4)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/div_slider"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/div_slider', ['div_slider_rmSlider': div_slider_rmSlider_3]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 11-Click on div slider Slider4.png')

"Step 12: Enter input value in input additional contributions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/input_additional_contributions'), input_additional_contributions)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 12-Enter input value in input additional contributions.png')

"Step 13: Click on canvas GraphDemo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/canvas_GraphDemo'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 13-Click on canvas GraphDemo.png')

"Step 14: Click on combobox contribution frequency"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/combobox_contribution_frequency'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 14-Click on combobox contribution frequency.png')

"Step 15: Select option with input value from combobox contribution frequency"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_calculator_page/combobox_contribution_frequency'), combobox_contribution_frequency)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 15-Select option with input value from combobox contribution frequency.png')

"Step 16: Click on span dollarAmount (DollarAmount)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/span_dollarAmount"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/span_dollarAmount', ['span_dollarAmount_class': span_dollarAmount_class]))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 16-Click on span dollarAmount DollarAmount.png')

"Step 17: Click on input dollarAmount (NominalDollars) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_dollarAmount'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 17-Click on input dollarAmount NominalDollars - Navigate to page .png')

"Step 18: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Use Growth Calculator to Analyze Investments_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}