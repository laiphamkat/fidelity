import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.configuration.RunConfiguration
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

"Step 1: Navigate to */*/*"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/${GlobalVariable.path_param_2}/${GlobalVariable.path_param_3}")

"Step 2: Click on welcomeMessage -> Navigate to page 'homepage#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/welcomeMessage'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on welcomeMessage - Navigate to page homepage.png')

"Step 3: Click on etfsLink -> Navigate to page 'investment etfs#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/etfsLink'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on etfsLink - Navigate to page investment etfs.png')

"Step 4: Click on searchByFundLink -> Navigate to page 'generic page#*/priceandperformance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/searchByFundLink'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on searchByFundLink - Navigate to page generic pagepriceandperformance.png')

"Step 5: Click on fundSearchInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/fundSearchInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on fundSearchInput.png')

"Step 6: Click on fundSearchInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/fundSearchInput'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on fundSearchInput.png')

"Step 7: Enter input value in fundSearchInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_generic/fundSearchInput'), fundSearchInput)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Enter input value in fundSearchInput.png')

"Step 8: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on div object.png')

"Step 9: Click on allFidelityFundsDropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/allFidelityFundsDropdown'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on allFidelityFundsDropdown.png')

"Step 10: Click on alternativeFundsDropdownItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/alternativeFundsDropdownItem'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on alternativeFundsDropdownItem.png')

"Step 11: Click on downloadXlsxButton -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/downloadXlsxButton'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on downloadXlsxButton - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Search and Download Fidelity Funds Data from Investment Finder_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}