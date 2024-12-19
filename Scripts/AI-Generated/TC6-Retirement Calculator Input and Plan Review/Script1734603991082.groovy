import truetest.common.enterFinancialInfoAndViewMyPlan
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import truetest.common.navigateAndInputFinancialInfo
import com.kms.katalon.core.configuration.RunConfiguration
import truetest.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to */retirementcalculator"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/retirementcalculator")

"Step 2: Enter financial information multiple times and view plan"

enterFinancialInfoAndViewMyPlan.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Navigate and input user financial information"

navigateAndInputFinancialInfo.execute(data_path_1, Integer.valueOf(index_1))

"Step 4: Click on div investmentStyleSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/div_investmentStyleSlider'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on div investmentStyleSlider.png')

"Step 5: Click on link navigation (next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/link_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/link_navigation', ['link_navigation_nth': link_navigation_nth]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on link navigation next.png')

"Step 6: Click on div userInputs (UserRequiredIncome)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/div_userInputs'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on div userInputs UserRequiredIncome.png')

"Step 7: Click on link navigation (seeMyResults)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/link_navigation"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/link_navigation', ['link_navigation_nth': link_navigation_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on link navigation seeMyResults.png')

"Step 8: Click on resultsViewSelect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/resultsViewSelect'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on resultsViewSelect.png')

"Step 9: Click on projectedIncomeTab"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/projectedIncomeTab'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Click on projectedIncomeTab.png')

"Step 10: Click on startOverButton -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/startOverButton'))

WebUI.takeScreenshot(reportLocation + '/TC6/Step 10-Click on startOverButton - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Retirement Calculator Input and Plan Review_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}