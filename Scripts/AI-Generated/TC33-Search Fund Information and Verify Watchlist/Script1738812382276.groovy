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

"Step 2: Click on link Investments -> Navigate to page 'investment options#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/link_Investments'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 2-Click on link Investments - Navigate to page investment options.png')

"Step 3: Hover over link MutualFunds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investment_options/link_MutualFunds'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 3-Hover over link MutualFunds.png')

"Step 4: Click on button ViewAllFunds -> Navigate to page 'investment mutual funds#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_options/button_ViewAllFunds'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 4-Click on button ViewAllFunds - Navigate to page investment mutual funds.png')

"Step 5: Click on link SearchByFund -> Navigate to page 'generic#*/priceandperformance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_mutual_funds/link_SearchByFund'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 5-Click on link SearchByFund - Navigate to page genericpriceandperformance.png')

"Step 6: Click on input FundSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/input_FundSearch'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 6-Click on input FundSearch.png')

"Step 7: Enter input value in input FundSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_generic/input_FundSearch'), input_FundSearch)

WebUI.takeScreenshot(reportLocation + '/TC33/Step 7-Enter input value in input FundSearch.png')

"Step 8: Hover over tr object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_generic/tr_object4'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 8-Hover over tr object4.png')

"Step 9: Click on link fundInformation (AllInOneGrowthETF)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_generic/link_fundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 9-Click on link fundInformation AllInOneGrowthETF.png')

"Step 10: Hover over tr object4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_generic/tr_object4'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 10-Hover over tr object4.png')

"Step 11: Click on button AddToWatchlist"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_AddToWatchlist'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 11-Click on button AddToWatchlist.png')

"Step 12: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 12-Click on button Close.png')

"Step 13: Click on link WatchList -> Navigate to page 'personal watchlist#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_WatchList'))

WebUI.takeScreenshot(reportLocation + '/TC33/Step 13-Click on link WatchList - Navigate to page personal watchlist.png')

"Step 14: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC33-Search Fund Information and Verify Watchlist_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}