import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.clickBodyObjectMultipleTimes
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

"Step 2: Click on body object multiple times"

clickBodyObjectMultipleTimes.execute()

"Step 3: Click on body object multiple times"

clickBodyObjectMultipleTimes.execute()

"Step 4: Click on body Object -> Navigate to page 'homepage#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Click on body Object - Navigate to page homepage.png')

"Step 5: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on body Object.png')

"Step 6: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on body Object.png')

"Step 7: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on body Object.png')

"Step 8: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on body Object.png')

"Step 9: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on body Object.png')

"Step 10: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Click on body Object.png')

"Step 11: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 11-Click on body Object.png')

"Step 12: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 12-Click on body Object.png')

"Step 13: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 13-Click on body Object.png')

"Step 14: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 14-Click on body Object.png')

"Step 15: Click on link etfOverview (ETFsOverview) -> Navigate to page 'investment etfs#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_homepage/link_etfOverview'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 15-Click on link etfOverview ETFsOverview - Navigate to page investment etfs.png')

"Step 16: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 16-Click on body Object.png')

"Step 17: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 17-Click on body Object.png')

"Step 18: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 18-Click on body Object.png')

"Step 19: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 19-Click on body Object.png')

"Step 20: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 20-Click on body Object.png')

"Step 21: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 21-Click on body Object.png')

"Step 22: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 22-Click on body Object.png')

"Step 23: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investment_etfs/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 23-Hover over div object.png')

"Step 24: Click on button ReadMore -> Navigate to page 'investor education what is an etf#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/button_ReadMore'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 24-Click on button ReadMore - Navigate to page investor education what is an etf.png')

"Step 25: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_what_is_an_etf/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 25-Click on body Object.png')

"Step 26: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_what_is_an_etf/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 26-Click on body Object.png')

"Step 27: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_what_is_an_etf/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 27-Click on body Object.png')

"Step 28: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_what_is_an_etf/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 28-Click on body Object.png')

"Step 29: Click on link PriceAndPerformance -> Navigate to page 'generic#*/priceandperformance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_what_is_an_etf/link_PriceAndPerformance'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 29-Click on link PriceAndPerformance - Navigate to page genericpriceandperformance.png')

"Step 30: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 30-Click on body Object.png')

"Step 31: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 31-Click on body Object.png')

"Step 32: Hover over tr object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_generic/tr_object2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 32-Hover over tr object2.png')

"Step 33: Click on link ViewFund -> Navigate to page 'product listing#*/products/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_ViewFund'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 33-Click on link ViewFund - Navigate to page product listingproducts.png')

"Step 34: Click on div Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/div_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 34-Click on div Object.png')

"Step 35: Click on div Object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/div_Object2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 35-Click on div Object2.png')

"Step 36: Click on link fundStatistics (GetETFStats) -> Navigate to page 'fund information#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_listing/link_fundStatistics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_listing/link_fundStatistics', ['link_fundStatistics_internalRoleLinkName': link_fundStatistics_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 36-Click on link fundStatistics GetETFStats - Navigate to page fund information.png')

"Step 37: Click on button AllSalesOptions"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/button_AllSalesOptions'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 37-Click on button AllSalesOptions.png')

"Step 38: Click on link SalesOptionA"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/link_SalesOptionA'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 38-Click on link SalesOptionA.png')

"Step 39: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 39-Click on body Object.png')

"Step 40: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 40-Click on body Object.png')

"Step 41: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 41-Click on body Object.png')

"Step 42: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 42-Click on body Object.png')

"Step 43: Click on link PriceAndPerformance -> Navigate to page 'generic#*/priceandperformance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/link_PriceAndPerformance'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 43-Click on link PriceAndPerformance - Navigate to page genericpriceandperformance.png')

"Step 44: Hover over tr object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_generic/tr_object3'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 44-Hover over tr object3.png')

"Step 45: Click on link ViewFund2 -> Navigate to page 'product listing#*/products/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_ViewFund2'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 45-Click on link ViewFund2 - Navigate to page product listingproducts.png')

"Step 46: Click on link fundStatistics (GetFundFacts) -> Navigate to page 'fund information#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_listing/link_fundStatistics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_listing/link_fundStatistics', ['link_fundStatistics_internalRoleLinkName': link_fundStatistics_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 46-Click on link fundStatistics GetFundFacts - Navigate to page fund information.png')

"Step 47: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Navigate Educational Content and Verify Fund Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}