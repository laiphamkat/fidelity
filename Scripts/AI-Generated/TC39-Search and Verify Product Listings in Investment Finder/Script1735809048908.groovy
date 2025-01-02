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

"Step 1: Navigate to */*/*"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/${GlobalVariable.path_param_2}/${GlobalVariable.path_param_3}")

"Step 2: Click on etfSelectionCheckbox2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/etfSelectionCheckbox2'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 2-Click on etfSelectionCheckbox2.png')

"Step 3: Click on checkbox managed portfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 3-Click on checkbox managed portfolios3.png')

"Step 4: Click on fundSearchInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/fundSearchInput'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 4-Click on fundSearchInput.png')

"Step 5: Enter input value in combobox fund search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_investment_finder/fundSearchInput'), combobox_fund_search)

WebUI.takeScreenshot(reportLocation + '/TC39/Step 5-Enter input value in combobox fund search.png')

"Step 6: Click on item InvestmentListItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/item_InvestmentListItem'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 6-Click on item InvestmentListItem.png')

"Step 7: Enter input value in combobox fund search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_investment_finder/fundSearchInput'), combobox_fund_search_1)

WebUI.takeScreenshot(reportLocation + '/TC39/Step 7-Enter input value in combobox fund search.png')

"Step 8: Click on fidelityAdvantageBitcoinETFFundOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/fidelityAdvantageBitcoinETFFundOption'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 8-Click on fidelityAdvantageBitcoinETFFundOption.png')

"Step 9: Click on span AssetClassLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/span_AssetClassLabel'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 9-Click on span AssetClassLabel.png')

"Step 10: Click on md selectOptions (SelectOption)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investment_finder/md_selectOptions'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 10-Click on md selectOptions SelectOption.png')

"Step 11: Click on md Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 11-Click on md Backdrop.png')

"Step 12: Click on span AssetCategoryLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/span_AssetCategoryLabel'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 12-Click on span AssetCategoryLabel.png')

"Step 13: Click on md selectOptions (SelectOption2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investment_finder/md_selectOptions'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 13-Click on md selectOptions SelectOption2.png')

"Step 14: Click on md Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 14-Click on md Backdrop.png')

"Step 15: Click on span GeographicFocusLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/span_GeographicFocusLabel'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 15-Click on span GeographicFocusLabel.png')

"Step 16: Click on md selectOptions (SelectOption3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investment_finder/md_selectOptions'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 16-Click on md selectOptions SelectOption3.png')

"Step 17: Click on md Backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_Backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 17-Click on md Backdrop.png')

"Step 18: Click on viewFundsLink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/viewFundsLink'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 18-Click on viewFundsLink.png')

"Step 19: Click on addToWatchlistButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/addToWatchlistButton'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 19-Click on addToWatchlistButton.png')

"Step 20: Click on closeButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/closeButton'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 20-Click on closeButton.png')

"Step 21: Click on fidelityAdvantageEtherETF -> Navigate to page 'product listing#*/products/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/fidelityAdvantageEtherETF'))

WebUI.takeScreenshot(reportLocation + '/TC39/Step 21-Click on fidelityAdvantageEtherETF - Navigate to page product listingproducts.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC39-Search and Verify Product Listings in Investment Finder_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}