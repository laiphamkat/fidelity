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

"Step 1: Navigate to */taxsmartcalculator"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/taxsmartcalculator")

"Step 2: Click on addFundsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/addFundsButton'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 2-Click on addFundsButton.png')

"Step 3: Click on fundNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/fundNameInput'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 3-Click on fundNameInput.png')

"Step 4: Enter input value in fundNameInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator/fundNameInput'), fundNameInput)

WebUI.takeScreenshot(reportLocation + '/TC16/Step 4-Enter input value in fundNameInput.png')

"Step 5: Click on closeDialogButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/closeDialogButton'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 5-Click on closeDialogButton.png')

"Step 6: Click on taxSmartCalculatorLink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/taxSmartCalculatorLink'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 6-Click on taxSmartCalculatorLink.png')

"Step 7: Click on addFundsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/addFundsButton'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 7-Click on addFundsButton.png')

"Step 8: Click on closeDialogButton2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/closeDialogButton2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 8-Click on closeDialogButton2.png')

"Step 9: Click on investmentFinderLink -> Navigate to page 'investment finder#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/investmentFinderLink'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 9-Click on investmentFinderLink - Navigate to page investment finder.png')

"Step 10: Click on taxSmartCalculatorLink -> Navigate to page 'calculator page#*/taxsmartcalculator'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/taxSmartCalculatorLink'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 10-Click on taxSmartCalculatorLink - Navigate to page calculator pagetaxsmartcalculator.png')

"Step 11: Click on addFundsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/addFundsButton'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 11-Click on addFundsButton.png')

"Step 12: Click on closeDialogButton2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/closeDialogButton2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 12-Click on closeDialogButton2.png')

"Step 13: Click on monthlyPreTaxCashFlow"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/monthlyPreTaxCashFlow'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 13-Click on monthlyPreTaxCashFlow.png')

"Step 14: Click on monthlyPreTaxCashFlow2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/monthlyPreTaxCashFlow2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 14-Click on monthlyPreTaxCashFlow2.png')

"Step 15: Click on investmentInTSeries"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/investmentInTSeries'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 15-Click on investmentInTSeries.png')

"Step 16: Click on addFundsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/addFundsButton'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 16-Click on addFundsButton.png')

"Step 17: Click on categorySelectElement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/categorySelectElement'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 17-Click on categorySelectElement.png')

"Step 18: Click on fundNameInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/fundNameInput2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 18-Click on fundNameInput2.png')

"Step 19: Enter input value in fundNameInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator/fundNameInput2'), fundNameInput2)

WebUI.takeScreenshot(reportLocation + '/TC16/Step 19-Enter input value in fundNameInput2.png')

"Step 20: Click on fidelityBalancedClassPortfolioCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/fidelityBalancedClassPortfolioCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 20-Click on fidelityBalancedClassPortfolioCheckbox.png')

"Step 21: Click on addSelectedFundsButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/addSelectedFundsButton'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 21-Click on addSelectedFundsButton.png')

"Step 22: Click on fundAllocationPercentageInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/fundAllocationPercentageInput'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 22-Click on fundAllocationPercentageInput.png')

"Step 23: Enter input value in fundAllocationPercentageInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_calculator/fundAllocationPercentageInput2'), fundAllocationPercentageInput2)

WebUI.takeScreenshot(reportLocation + '/TC16/Step 23-Enter input value in fundAllocationPercentageInput2.png')

"Step 24: Click on taxProvinceSelector"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/taxProvinceSelector'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 24-Click on taxProvinceSelector.png')

"Step 25: Click on calculateButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/taxsmartcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/calculateButton'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 25-Click on calculateButton.png')

"Step 26: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC16-Use Tax Smart Calculator for Fund Allocation_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}