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

"Step 1: Navigate to */taxsmartcalculator"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/taxsmartcalculator")

"Step 2: Click on button addFunds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/button_addFunds'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 2-Click on button addFunds.png')

"Step 3: Click on input fundNameOrCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/input_fundNameOrCode'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 3-Click on input fundNameOrCode.png')

"Step 4: Enter input value in input fundNameOrCode"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator/input_fundNameOrCode'), input_fundNameOrCode)

WebUI.takeScreenshot(reportLocation + '/TC31/Step 4-Enter input value in input fundNameOrCode.png')

"Step 5: Click on button object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/button_object'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 5-Click on button object.png')

"Step 6: Click on link taxSmartCalculator"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/link_taxSmartCalculator'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 6-Click on link taxSmartCalculator.png')

"Step 7: Click on button addFunds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/button_addFunds'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 7-Click on button addFunds.png')

"Step 8: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 8-Click on button object2.png')

"Step 9: Click on link investmentFinder -> Navigate to page 'product#*/products/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/link_investmentFinder'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 9-Click on link investmentFinder - Navigate to page productproducts.png')

"Step 10: Click on link taxSmartCalculator -> Navigate to page 'calculator#*/taxsmartcalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_taxSmartCalculator'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 10-Click on link taxSmartCalculator - Navigate to page calculatortaxsmartcalculator.png')

"Step 11: Click on button addFunds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/button_addFunds'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 11-Click on button addFunds.png')

"Step 12: Click on button object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/button_object2'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 12-Click on button object2.png')

"Step 13: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 13-Click on span object.png')

"Step 14: Click on input monthlyCashFlow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/input_monthlyCashFlow'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 14-Click on input monthlyCashFlow.png')

"Step 15: Click on label object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/label_object'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 15-Click on label object.png')

"Step 16: Click on button addFunds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/button_addFunds'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 16-Click on button addFunds.png')

"Step 17: Click on select category"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/select_category'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 17-Click on select category.png')

"Step 18: Select option with input value from select category"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_calculator/select_category'), select_category)

WebUI.takeScreenshot(reportLocation + '/TC31/Step 18-Select option with input value from select category.png')

"Step 19: Click on input fundNameOrCode2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/input_fundNameOrCode2'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 19-Click on input fundNameOrCode2.png')

"Step 20: Enter input value in input fundNameOrCode2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator/input_fundNameOrCode2'), input_fundNameOrCode2)

WebUI.takeScreenshot(reportLocation + '/TC31/Step 20-Enter input value in input fundNameOrCode2.png')

"Step 21: Click on input fidelityBalancedClass"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/input_fidelityBalancedClass'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 21-Click on input fidelityBalancedClass.png')

"Step 22: Click on button addSelectedFunds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/button_addSelectedFunds'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 22-Click on button addSelectedFunds.png')

"Step 23: Click on input allocationPercentage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/input_allocationPercentage'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 23-Click on input allocationPercentage.png')

"Step 24: Enter input value in input allocationPercentage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator/input_allocationPercentage2'), input_allocationPercentage2)

WebUI.takeScreenshot(reportLocation + '/TC31/Step 24-Enter input value in input allocationPercentage2.png')

"Step 25: Click on select province"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/select_province'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 25-Click on select province.png')

"Step 26: Select option with input value from select province"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

TrueTestScripts.selectOptionByValue(findTestObject('AI-Generated/Page_calculator/select_province'), select_province)

WebUI.takeScreenshot(reportLocation + '/TC31/Step 26-Select option with input value from select province.png')

"Step 27: Click on button Calculate"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/button_Calculate'))

WebUI.takeScreenshot(reportLocation + '/TC31/Step 27-Click on button Calculate.png')

"Step 28: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC31-Use Tax Smart Calculator and Verify Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}