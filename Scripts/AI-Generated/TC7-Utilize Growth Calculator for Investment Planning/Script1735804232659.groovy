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

"Step 3: Click on tryItOutButton -> Navigate to page 'calculator page#*/growthcalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tools/tryItOutButton'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 3-Click on tryItOutButton - Navigate to page calculator pagegrowthcalculator.png')

"Step 4: Click on initialInvestmentSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/initialInvestmentSlider'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 4-Click on initialInvestmentSlider.png')

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

"Step 7: Click on rateOfReturnInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/rateOfReturnInput'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 7-Click on rateOfReturnInput.png')

"Step 8: Enter input value in rateOfReturnInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/rateOfReturnInput'), rateOfReturnInput2)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 8-Enter input value in rateOfReturnInput2.png')

"Step 9: Click on additionalContributionsInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/additionalContributionsInput'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 9-Click on additionalContributionsInput.png')

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

WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/additionalContributionsInput'), input_additional_contributions)

WebUI.takeScreenshot(reportLocation + '/TC7/Step 12-Enter input value in input additional contributions.png')

"Step 13: Click on canvas GraphDemo"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/canvas_GraphDemo'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 13-Click on canvas GraphDemo.png')

"Step 14: Click on contributionFrequencyDropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/contributionFrequencyDropdown'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 14-Click on contributionFrequencyDropdown.png')

"Step 15: Click on nominalDollarsOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/nominalDollarsOption'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 15-Click on nominalDollarsOption.png')

"Step 16: Click on input nominalDollars (NominalDollars) -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/growthcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_nominalDollars'))

WebUI.takeScreenshot(reportLocation + '/TC7/Step 16-Click on input nominalDollars NominalDollars - Navigate to page .png')

"Step 17: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC7-Utilize Growth Calculator for Investment Planning_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}