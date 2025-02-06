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

"Step 1: Navigate to */products/*"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/products/${GlobalVariable.products_id}")

"Step 2: Click on md ETFs4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_ETFs4'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 2-Click on md ETFs4.png')

"Step 3: Click on md ManagedPortfolios8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_ManagedPortfolios8'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 3-Click on md ManagedPortfolios8.png')

"Step 4: Click on input SearchField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/input_SearchField'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 4-Click on input SearchField.png')

"Step 5: Enter input value in input SearchField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/input_SearchField'), input_SearchField)

WebUI.takeScreenshot(reportLocation + '/TC26/Step 5-Enter input value in input SearchField.png')

"Step 6: Click on item product"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/item_product'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 6-Click on item product.png')

"Step 7: Enter input value in input SearchField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_product/input_SearchField'), input_SearchField_1)

WebUI.takeScreenshot(reportLocation + '/TC26/Step 7-Enter input value in input SearchField.png')

"Step 8: Click on item productOptions (option)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/item_productOptions'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 8-Click on item productOptions option.png')

"Step 9: Click on span assetClass"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/span_assetClass'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 9-Click on span assetClass.png')

"Step 10: Click on md selectOptions (selectOption)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/md_selectOptions'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 10-Click on md selectOptions selectOption.png')

"Step 11: Click on md backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 11-Click on md backdrop.png')

"Step 12: Click on span assetCategory"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/span_assetCategory'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 12-Click on span assetCategory.png')

"Step 13: Click on md selectOptions (selectOption2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/md_selectOptions'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 13-Click on md selectOptions selectOption2.png')

"Step 14: Click on md backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 14-Click on md backdrop.png')

"Step 15: Click on span geographicFocus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/span_geographicFocus'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 15-Click on span geographicFocus.png')

"Step 16: Click on md selectOptions (selectOption3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/md_selectOptions'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 16-Click on md selectOptions selectOption3.png')

"Step 17: Click on md backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_backdrop'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 17-Click on md backdrop.png')

"Step 18: Click on link viewFunds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_viewFunds'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 18-Click on link viewFunds.png')

"Step 19: Click on link addToWatchlist"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_addToWatchlist'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 19-Click on link addToWatchlist.png')

"Step 20: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/button_close'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 20-Click on button close.png')

"Step 21: Click on link viewFund -> Navigate to page 'product listing#*/products/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/link_viewFund'))

WebUI.takeScreenshot(reportLocation + '/TC26/Step 21-Click on link viewFund - Navigate to page product listingproducts.png')

"Step 22: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC26-Search Funds and Verify Product Listing_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}