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

"Step 2: Click on checkbox etfs5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs5'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 2-Click on checkbox etfs5.png')

"Step 3: Click on checkbox managed portfolios5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios5'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 3-Click on checkbox managed portfolios5.png')

"Step 4: Click on combobox fund name input"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/combobox_fund_name_input'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 4-Click on combobox fund name input.png')

"Step 5: Enter input value in combobox fund name input"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_investment_finder/combobox_fund_name_input'), combobox_fund_name_input)

WebUI.takeScreenshot(reportLocation + '/TC22/Step 5-Enter input value in combobox fund name input.png')

"Step 6: Click on item object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/item_object'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 6-Click on item object.png')

"Step 7: Enter input value in combobox fund name input"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_investment_finder/combobox_fund_name_input'), combobox_fund_name_input_1)

WebUI.takeScreenshot(reportLocation + '/TC22/Step 7-Enter input value in combobox fund name input.png')

"Step 8: Click on item option (Option2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investment_finder/item_option'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 8-Click on item option Option2.png')

"Step 9: Click on span object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/span_object'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 9-Click on span object.png')

"Step 10: Click on md option (Option)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investment_finder/md_option'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 10-Click on md option Option.png')

"Step 11: Click on md object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_object'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 11-Click on md object.png')

"Step 12: Click on span object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/span_object2'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 12-Click on span object2.png')

"Step 13: Click on md option (Option2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investment_finder/md_option'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 13-Click on md option Option2.png')

"Step 14: Click on md object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_object'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 14-Click on md object.png')

"Step 15: Click on span geographicFocusLabel"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/span_geographicFocusLabel'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 15-Click on span geographicFocusLabel.png')

"Step 16: Click on md option (Option3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investment_finder/md_option'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 16-Click on md option Option3.png')

"Step 17: Click on md object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_object'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 17-Click on md object.png')

"Step 18: Click on link view funds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/link_view_funds'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 18-Click on link view funds.png')

"Step 19: Click on link add to watchlist"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/link_add_to_watchlist'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 19-Click on link add to watchlist.png')

"Step 20: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 20-Click on button close.png')

"Step 21: Click on link fund name tag -> Navigate to page 'product listing#*/products/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/link_fund_name_tag'))

WebUI.takeScreenshot(reportLocation + '/TC22/Step 21-Click on link fund name tag - Navigate to page product listingproducts.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC22-Add Funds to Watchlist and Verify Product Listing_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}