import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.common.engageWithEducationalContent
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

"Step 2: Interact with educational content on the page"

engageWithEducationalContent.execute()

"Step 3: Interact with educational content on the page"

engageWithEducationalContent.execute()

"Step 4: Click on body EducationalContent -> Navigate to page 'homepage#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 4-Click on body EducationalContent - Navigate to page homepage.png')

"Step 5: Click on body Homepage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Homepage'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 5-Click on body Homepage.png')

"Step 6: Click on body Homepage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Homepage'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 6-Click on body Homepage.png')

"Step 7: Click on body Homepage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Homepage'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 7-Click on body Homepage.png')

"Step 8: Click on body Homepage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Homepage'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 8-Click on body Homepage.png')

"Step 9: Click on body Homepage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Homepage'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 9-Click on body Homepage.png')

"Step 10: Click on body Homepage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Homepage'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 10-Click on body Homepage.png')

"Step 11: Click on body Homepage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Homepage'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 11-Click on body Homepage.png')

"Step 12: Click on body Homepage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Homepage'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 12-Click on body Homepage.png')

"Step 13: Click on body Homepage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Homepage'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 13-Click on body Homepage.png')

"Step 14: Click on body Homepage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Homepage'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 14-Click on body Homepage.png')

"Step 15: Click on link etfOptions (ETFsLookAtOurMixOf) -> Navigate to page 'investment etfs#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_homepage/link_etfOptions'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 15-Click on link etfOptions ETFsLookAtOurMixOf - Navigate to page investment etfs.png')

"Step 16: Click on body ETFsPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/body_ETFsPage'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 16-Click on body ETFsPage.png')

"Step 17: Click on body ETFsPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/body_ETFsPage'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 17-Click on body ETFsPage.png')

"Step 18: Click on body ETFsPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/body_ETFsPage'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 18-Click on body ETFsPage.png')

"Step 19: Click on body ETFsPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/body_ETFsPage'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 19-Click on body ETFsPage.png')

"Step 20: Click on body ETFsPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/body_ETFsPage'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 20-Click on body ETFsPage.png')

"Step 21: Click on body ETFsPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/body_ETFsPage'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 21-Click on body ETFsPage.png')

"Step 22: Click on body ETFsPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/body_ETFsPage'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 22-Click on body ETFsPage.png')

"Step 23: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investment_etfs/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 23-Hover over div object.png')

"Step 24: Click on button read more -> Navigate to page 'investor education what is an etf#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/button_read_more'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 24-Click on button read more - Navigate to page investor education what is an etf.png')

"Step 25: Click on body WhatIsETF"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_what_is_an_etf/body_WhatIsETF'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 25-Click on body WhatIsETF.png')

"Step 26: Click on body WhatIsETF"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_what_is_an_etf/body_WhatIsETF'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 26-Click on body WhatIsETF.png')

"Step 27: Click on body WhatIsETF"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_what_is_an_etf/body_WhatIsETF'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 27-Click on body WhatIsETF.png')

"Step 28: Click on body WhatIsETF"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_what_is_an_etf/body_WhatIsETF'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 28-Click on body WhatIsETF.png')

"Step 29: Click on link fd-megamenu--desktop  subject -> Navigate to page 'generic page#*/priceandperformance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_what_is_an_etf/link_fd-megamenu--desktop__subject'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 29-Click on link fd-megamenu--desktop  subject - Navigate to page generic pagepriceandperformance.png')

"Step 30: Click on body GenericPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/body_GenericPage'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 30-Click on body GenericPage.png')

"Step 31: Click on body GenericPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/body_GenericPage'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 31-Click on body GenericPage.png')

"Step 32: Hover over tr GenericPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_generic_page/tr_GenericPage'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 32-Hover over tr GenericPage.png')

"Step 33: Click on link ViewFund -> Navigate to page 'product listing#*/products/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/link_ViewFund'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 33-Click on link ViewFund - Navigate to page product listingproducts.png')

"Step 34: Click on div HighchartsToolbar"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/div_HighchartsToolbar'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 34-Click on div HighchartsToolbar.png')

"Step 35: Click on div StockToolsWrapper"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_listing/div_StockToolsWrapper'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 35-Click on div StockToolsWrapper.png')

"Step 36: Click on link fundFacts (GetETFFacts) -> Navigate to page 'fund information#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_listing/link_fundFacts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_listing/link_fundFacts', ['link_fundFacts_internalRoleLinkName': link_fundFacts_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 36-Click on link fundFacts GetETFFacts - Navigate to page fund information.png')

"Step 37: Click on combobox all sales options"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/combobox_all_sales_options'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 37-Click on combobox all sales options.png')

"Step 38: Click on option dropdown item"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/option_dropdown_item'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 38-Click on option dropdown item.png')

"Step 39: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 39-Click on body FundInformation.png')

"Step 40: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 40-Click on body FundInformation.png')

"Step 41: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 41-Click on body FundInformation.png')

"Step 42: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 42-Click on body FundInformation.png')

"Step 43: Click on link fd-megamenu--desktop  subject -> Navigate to page 'generic page#*/priceandperformance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/link_fd-megamenu--desktop__subject'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 43-Click on link fd-megamenu--desktop  subject - Navigate to page generic pagepriceandperformance.png')

"Step 44: Hover over tr GenericPage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_generic_page/tr_GenericPage2'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 44-Hover over tr GenericPage2.png')

"Step 45: Click on link view fund -> Navigate to page 'product listing#*/products/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/link_view_fund'))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 45-Click on link view fund - Navigate to page product listingproducts.png')

"Step 46: Click on link fundFacts (GetFundFacts) -> Navigate to page 'fund information#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_listing/link_fundFacts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_listing/link_fundFacts', ['link_fundFacts_internalRoleLinkName': link_fundFacts_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC5/Step 46-Click on link fundFacts GetFundFacts - Navigate to page fund information.png')

"Step 47: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC5-Interact with Educational Content and Verify Fund Information_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}