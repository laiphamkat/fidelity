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

"Step 2: Click on link mutualFundsExploreTheWideSpectrumOfAvailabl -> Navigate to page 'investment mutual funds#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education/link_mutualFundsExploreTheWideSpectrumOfAvailabl'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link mutualFundsExploreTheWideSpectrumOfAvailabl - Navigate to page investment mutual funds.png')

"Step 3: Hover over link moneyMarketMutualFundsMoneyMarketFundsAreF"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investment_mutual_funds/link_moneyMarketMutualFundsMoneyMarketFundsAreF'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Hover over link moneyMarketMutualFundsMoneyMarketFundsAreF.png')

"Step 4: Click on button exploreMoneyMarketMutualFunds -> Navigate to page 'generic page#*/priceandperformance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_mutual_funds/button_exploreMoneyMarketMutualFunds'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button exploreMoneyMarketMutualFunds - Navigate to page generic pagepriceandperformance.png')

"Step 5: Click on button allFidelityFunds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_allFidelityFunds'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on button allFidelityFunds.png')

"Step 6: Click on link bsSelect10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_bsSelect10'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link bsSelect10.png')

"Step 7: Click on button all"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_all'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on button all.png')

"Step 8: Click on link bsSelect22"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_bsSelect22'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on link bsSelect22.png')

"Step 9: Click on button f5NlTSeries"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_f5NlTSeries'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on button f5NlTSeries.png')

"Step 10: Click on link bsSelect313"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_bsSelect313'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on link bsSelect313.png')

"Step 11: Click on button all2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_all2'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on button all2.png')

"Step 12: Click on link bsSelect41"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_bsSelect41'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on link bsSelect41.png')

"Step 13: Click on button downloadXlsx"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_downloadXlsx'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 13-Click on button downloadXlsx.png')

"Step 14: Click on link aboutUs -> Navigate to page 'informational page#*/aboutus'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_aboutUs'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 14-Click on link aboutUs - Navigate to page informational pageaboutus.png')

"Step 15: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Explore Mutual Funds and Download Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}