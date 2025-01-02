import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.fillUserDemographicsAndSavings
import truetest.common.navigateAndUpdateUserDemographics
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

"Step 2: Enter user demographics and savings information"

fillUserDemographicsAndSavings.execute(data_path_0, Integer.valueOf(index_0))

"Step 3: Navigate and update user demographics"

navigateAndUpdateUserDemographics.execute(data_path_1, Integer.valueOf(index_1))

"Step 4: Click on div investmentStyleSlider"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/div_investmentStyleSlider'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 4-Click on div investmentStyleSlider.png')

"Step 5: Click on link navigationActions (Next)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationActions', ['link_navigationActions_nth': link_navigationActions_nth]))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 5-Click on link navigationActions Next.png')

"Step 6: Click on div userInputSections (userInputs)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/div_userInputSections'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 6-Click on div userInputSections userInputs.png')

"Step 7: Click on link navigationActions (SeeMyResults)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationActions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationActions', ['link_navigationActions_nth': link_navigationActions_nth_1]))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 7-Click on link navigationActions SeeMyResults.png')

"Step 8: Click on resultsViewSelect"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/resultsViewSelect'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 8-Click on resultsViewSelect.png')

"Step 9: Click on projectedIncomeTab"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/projectedIncomeTab'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 9-Click on projectedIncomeTab.png')

"Step 10: Click on startOverButton -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/retirementcalculator?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/startOverButton'))

WebUI.takeScreenshot(reportLocation + '/TC28/Step 10-Click on startOverButton - Navigate to page .png')

"Step 11: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC28-Complete Retirement Calculator with User Inputs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}