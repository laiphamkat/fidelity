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

"Step 2: Click on textbox search input"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/textbox_search_input'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 2-Click on textbox search input.png')

"Step 3: Hover over tr object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_fund_information/tr_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 3-Hover over tr object.png')

"Step 4: Enter input value in textbox search input"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_fund_information/textbox_search_input'), textbox_search_input)

WebUI.takeScreenshot(reportLocation + '/TC68/Step 4-Enter input value in textbox search input.png')

"Step 5: Click on link fidelity canadian asset allocation fund -> Navigate to page 'product listing#*/products/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/link_fidelity_canadian_asset_allocation_fund'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 5-Click on link fidelity canadian asset allocation fund - Navigate to page product listingproducts.png')

"Step 6: Click on combobox series b"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/combobox_series_b'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 6-Click on combobox series b.png')

"Step 7: Click on option series b -> Navigate to page 'fund information#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/option_series_b'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 7-Click on option series b - Navigate to page fund information.png')

"Step 8: Hover over tr object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_fund_information/tr_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 8-Hover over tr object.png')

"Step 9: Click on link B -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/link_B'))

WebUI.takeScreenshot(reportLocation + '/TC68/Step 9-Click on link B - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC68-Search Fund Information and Verify Details_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}