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

"Step 2: Click on input FundNameFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/input_FundNameFilter'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 2-Click on input FundNameFilter.png')

"Step 3: Hover over tr object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_fund_information/tr_object'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 3-Hover over tr object.png')

"Step 4: Enter input value in input FundNameFilter"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_fund_information/input_FundNameFilter'), input_FundNameFilter)

WebUI.takeScreenshot(reportLocation + '/TC32/Step 4-Enter input value in input FundNameFilter.png')

"Step 5: Click on link FundDetails -> Navigate to page 'product listing#*/products/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/link_FundDetails'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 5-Click on link FundDetails - Navigate to page product listingproducts.png')

"Step 6: Click on button SeriesB"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/button_SeriesB'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 6-Click on button SeriesB.png')

"Step 7: Click on link SeriesB -> Navigate to page 'fund information#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/link_SeriesB'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 7-Click on link SeriesB - Navigate to page fund information.png')

"Step 8: Hover over tr object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_fund_information/tr_object'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 8-Hover over tr object.png')

"Step 9: Click on link FundFactsDownload -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/link_FundFactsDownload'))

WebUI.takeScreenshot(reportLocation + '/TC32/Step 9-Click on link FundFactsDownload - Navigate to page .png')

"Step 10: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC32-Search Fund Name and Download Fund Facts_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}