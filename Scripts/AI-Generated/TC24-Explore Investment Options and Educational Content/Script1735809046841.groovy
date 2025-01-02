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

"Step 1: Navigate to *"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}")

"Step 2: Click on body Homepage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Homepage'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 2-Click on body Homepage2.png')

"Step 3: Click on body Homepage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Homepage'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 3-Click on body Homepage2.png')

"Step 4: Click on body Homepage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Homepage'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 4-Click on body Homepage2.png')

"Step 5: Click on body Homepage2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Homepage'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 5-Click on body Homepage2.png')

"Step 6: Click on investingForBeginnersLink -> Navigate to page 'investor education investing beginners#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/investingForBeginnersLink'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 6-Click on investingForBeginnersLink - Navigate to page investor education investing beginners.png')

"Step 7: Hover over div InvestingBeginners"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investor_education_investing_beginners/div_InvestingBeginners'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 7-Hover over div InvestingBeginners.png')

"Step 8: Click on link home -> Navigate to page 'homepage#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_investing_beginners/link_home'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 8-Click on link home - Navigate to page homepage.png')

"Step 9: Click on body Homepage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Homepage'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 9-Click on body Homepage3.png')

"Step 10: Click on body Homepage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Homepage'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 10-Click on body Homepage3.png')

"Step 11: Click on body Homepage3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Homepage'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 11-Click on body Homepage3.png')

"Step 12: Click on link investor education"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/link_investor_education'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 12-Click on link investor education.png')

"Step 13: Click on link investor education overview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/link_investor_education_overview'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 13-Click on link investor education overview.png')

"Step 14: Click on body Homepage4 -> Navigate to page 'investment options#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Homepage'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 14-Click on body Homepage4 - Navigate to page investment options.png')

"Step 15: Hover over link AwardsOverview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investment_options/link_AwardsOverview'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 15-Hover over link AwardsOverview.png')

"Step 16: Click on button SeeAllAwards -> Navigate to page 'insights awards#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_options/button_SeeAllAwards'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 16-Click on button SeeAllAwards - Navigate to page insights awards.png')

"Step 17: Click on body AwardsPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_awards/body_AwardsPage'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 17-Click on body AwardsPage.png')

"Step 18: Click on link fidelity emerging markets fund"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_awards/link_fidelity_emerging_markets_fund'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 18-Click on link fidelity emerging markets fund.png')

"Step 19: Click on body AwardsPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_awards/body_AwardsPage'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 19-Click on body AwardsPage.png')

"Step 20: Click on body AwardsPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_awards/body_AwardsPage'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 20-Click on body AwardsPage.png')

"Step 21: Click on body AwardsPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_awards/body_AwardsPage'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 21-Click on body AwardsPage.png')

"Step 22: Click on body AwardsPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_awards/body_AwardsPage'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 22-Click on body AwardsPage.png')

"Step 23: Click on body AwardsPage"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_awards/body_AwardsPage'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 23-Click on body AwardsPage.png')

"Step 24: Click on link volatility toolbox -> Navigate to page 'volatility tool page#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_awards/link_volatility_toolbox'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 24-Click on link volatility toolbox - Navigate to page volatility tool page.png')

"Step 25: Click on body VolatilityTool"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_volatility_tool_page/body_VolatilityTool'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 25-Click on body VolatilityTool.png')

"Step 26: Click on body VolatilityTool"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_volatility_tool_page/body_VolatilityTool'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 26-Click on body VolatilityTool.png')

"Step 27: Click on body VolatilityTool"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_volatility_tool_page/body_VolatilityTool'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 27-Click on body VolatilityTool.png')

"Step 28: Click on body VolatilityTool"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_volatility_tool_page/body_VolatilityTool'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 28-Click on body VolatilityTool.png')

"Step 29: Click on body VolatilityTool"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_volatility_tool_page/body_VolatilityTool'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 29-Click on body VolatilityTool.png')

"Step 30: Click on body VolatilityTool"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_volatility_tool_page/body_VolatilityTool'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 30-Click on body VolatilityTool.png')

"Step 31: Click on body VolatilityTool"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_volatility_tool_page/body_VolatilityTool'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 31-Click on body VolatilityTool.png')

"Step 32: Click on body VolatilityTool"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_volatility_tool_page/body_VolatilityTool'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 32-Click on body VolatilityTool.png')

"Step 33: Click on body VolatilityTool"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_volatility_tool_page/body_VolatilityTool'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 33-Click on body VolatilityTool.png')

"Step 34: Click on body VolatilityTool"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_volatility_tool_page/body_VolatilityTool'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 34-Click on body VolatilityTool.png')

"Step 35: Click on link investments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_volatility_tool_page/link_investments'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 35-Click on link investments.png')

"Step 36: Click on link investments overview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_volatility_tool_page/link_investments_overview'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 36-Click on link investments overview.png')

"Step 37: Interact with educational content multiple times"

engageWithEducationalContent.execute()

"Step 38: Click on link tools and calculators"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/link_tools_and_calculators'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 38-Click on link tools and calculators.png')

"Step 39: Click on link tools calculators overview -> Navigate to page 'financial tools#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/link_tools_calculators_overview'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 39-Click on link tools calculators overview - Navigate to page financial tools.png')

"Step 40: Click on body FinancialTools"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tools/body_FinancialTools'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 40-Click on body FinancialTools.png')

"Step 41: Click on body FinancialTools"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tools/body_FinancialTools'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 41-Click on body FinancialTools.png')

"Step 42: Click on body FinancialTools"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tools/body_FinancialTools'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 42-Click on body FinancialTools.png')

"Step 43: Click on body FinancialTools"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tools/body_FinancialTools'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 43-Click on body FinancialTools.png')

"Step 44: Click on body FinancialTools"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tools/body_FinancialTools'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 44-Click on body FinancialTools.png')

"Step 45: Click on link fd-megamenu--desktop  subject -> Navigate to page 'generic page#*/priceandperformance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tools/link_fd-megamenu--desktop__subject'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 45-Click on link fd-megamenu--desktop  subject - Navigate to page generic pagepriceandperformance.png')

"Step 46: Hover over tr object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_generic_page/tr_object2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 46-Hover over tr object2.png')

"Step 47: Click on link FundFactsPDF"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/link_FundFactsPDF'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 47-Click on link FundFactsPDF.png')

"Step 48: Click on allFidelityFundsDropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/allFidelityFundsDropdown'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 48-Click on allFidelityFundsDropdown.png')

"Step 49: Click on div SearchFunds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/div_SearchFunds'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 49-Click on div SearchFunds.png')

"Step 50: Hover over tr object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_generic_page/tr_object'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 50-Hover over tr object.png')

"Step 51: Click on link ViewFund -> Navigate to page 'product listing#*/products/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/link_ViewFund'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 51-Click on link ViewFund - Navigate to page product listingproducts.png')

"Step 52: Click on link fundFacts (GetETFFacts) -> Navigate to page 'fund information#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_listing/link_fundFacts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_listing/link_fundFacts', ['link_fundFacts_internalRoleLinkName': link_fundFacts_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 52-Click on link fundFacts GetETFFacts - Navigate to page fund information.png')

"Step 53: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 53-Click on body FundInformation.png')

"Step 54: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 54-Click on body FundInformation.png')

"Step 55: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 55-Click on body FundInformation.png')

"Step 56: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 56-Click on body FundInformation.png')

"Step 57: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 57-Click on body FundInformation.png')

"Step 58: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 58-Click on body FundInformation.png')

"Step 59: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 59-Click on body FundInformation.png')

"Step 60: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 60-Click on body FundInformation.png')

"Step 61: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 61-Click on body FundInformation.png')

"Step 62: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 62-Click on body FundInformation.png')

"Step 63: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 63-Click on body FundInformation.png')

"Step 64: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 64-Click on body FundInformation.png')

"Step 65: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 65-Click on body FundInformation.png')

"Step 66: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 66-Click on body FundInformation.png')

"Step 67: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 67-Click on body FundInformation.png')

"Step 68: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 68-Click on body FundInformation.png')

"Step 69: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 69-Click on body FundInformation.png')

"Step 70: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 70-Click on body FundInformation.png')

"Step 71: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 71-Click on body FundInformation.png')

"Step 72: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 72-Click on body FundInformation.png')

"Step 73: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 73-Click on body FundInformation.png')

"Step 74: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 74-Click on body FundInformation.png')

"Step 75: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 75-Click on body FundInformation.png')

"Step 76: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 76-Click on body FundInformation.png')

"Step 77: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 77-Click on body FundInformation.png')

"Step 78: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 78-Click on body FundInformation.png')

"Step 79: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 79-Click on body FundInformation.png')

"Step 80: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 80-Click on body FundInformation.png')

"Step 81: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 81-Click on body FundInformation.png')

"Step 82: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 82-Click on body FundInformation.png')

"Step 83: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 83-Click on body FundInformation.png')

"Step 84: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 84-Click on body FundInformation.png')

"Step 85: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 85-Click on body FundInformation.png')

"Step 86: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 86-Click on body FundInformation.png')

"Step 87: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 87-Click on body FundInformation.png')

"Step 88: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 88-Click on body FundInformation.png')

"Step 89: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 89-Click on body FundInformation.png')

"Step 90: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 90-Click on body FundInformation.png')

"Step 91: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 91-Click on body FundInformation.png')

"Step 92: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 92-Click on body FundInformation.png')

"Step 93: Click on link investor education"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/link_investor_education'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 93-Click on link investor education.png')

"Step 94: Click on link investor education overview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/link_investor_education_overview'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 94-Click on link investor education overview.png')

"Step 95: Click on body FundInformation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 95-Click on body FundInformation.png')

"Step 96: Click on body FundInformation2 -> Navigate to page 'educational content#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_FundInformation'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 96-Click on body FundInformation2 - Navigate to page educational content.png')

"Step 97: Click on body EducationalContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 97-Click on body EducationalContent2.png')

"Step 98: Click on body EducationalContent2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 98-Click on body EducationalContent2.png')

"Step 99: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 99-Click on body EducationalContent3.png')

"Step 100: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 100-Click on body EducationalContent3.png')

"Step 101: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 101-Click on body EducationalContent3.png')

"Step 102: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 102-Click on body EducationalContent3.png')

"Step 103: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 103-Click on body EducationalContent3.png')

"Step 104: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 104-Click on body EducationalContent3.png')

"Step 105: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 105-Click on body EducationalContent3.png')

"Step 106: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 106-Click on body EducationalContent3.png')

"Step 107: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 107-Click on body EducationalContent3.png')

"Step 108: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 108-Click on body EducationalContent3.png')

"Step 109: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 109-Click on body EducationalContent3.png')

"Step 110: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 110-Click on body EducationalContent3.png')

"Step 111: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 111-Click on body EducationalContent3.png')

"Step 112: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 112-Click on body EducationalContent3.png')

"Step 113: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 113-Click on body EducationalContent3.png')

"Step 114: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 114-Click on body EducationalContent3.png')

"Step 115: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 115-Click on body EducationalContent3.png')

"Step 116: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 116-Click on body EducationalContent3.png')

"Step 117: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 117-Click on body EducationalContent3.png')

"Step 118: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 118-Click on body EducationalContent3.png')

"Step 119: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 119-Click on body EducationalContent3.png')

"Step 120: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 120-Click on body EducationalContent3.png')

"Step 121: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 121-Click on body EducationalContent3.png')

"Step 122: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 122-Click on body EducationalContent3.png')

"Step 123: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 123-Click on body EducationalContent3.png')

"Step 124: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 124-Click on body EducationalContent3.png')

"Step 125: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 125-Click on body EducationalContent3.png')

"Step 126: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 126-Click on body EducationalContent3.png')

"Step 127: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 127-Click on body EducationalContent3.png')

"Step 128: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 128-Click on body EducationalContent3.png')

"Step 129: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 129-Click on body EducationalContent3.png')

"Step 130: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 130-Click on body EducationalContent3.png')

"Step 131: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 131-Click on body EducationalContent3.png')

"Step 132: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 132-Click on body EducationalContent3.png')

"Step 133: Click on body EducationalContent3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_EducationalContent2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 133-Click on body EducationalContent3.png')

"Step 134: Click on link investor education"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/link_investor_education'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 134-Click on link investor education.png')

"Step 135: Click on link mutual funds -> Navigate to page 'investment mutual funds#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/link_mutual_funds'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 135-Click on link mutual funds - Navigate to page investment mutual funds.png')

"Step 136: Hover over link MoneyMarketFunds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investment_mutual_funds/link_MoneyMarketFunds'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 136-Hover over link MoneyMarketFunds.png')

"Step 137: Click on button ExploreFunds -> Navigate to page 'generic page#*/priceandperformance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_mutual_funds/button_ExploreFunds'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 137-Click on button ExploreFunds - Navigate to page generic pagepriceandperformance.png')

"Step 138: Click on allFidelityFundsDropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/allFidelityFundsDropdown'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 138-Click on allFidelityFundsDropdown.png')

"Step 139: Click on option my watch list"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/option_my_watch_list'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 139-Click on option my watch list.png')

"Step 140: Click on combobox all"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/combobox_all'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 140-Click on combobox all.png')

"Step 141: Click on option dropdown item"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/option_dropdown_item'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 141-Click on option dropdown item.png')

"Step 142: Click on combobox f5 nl t series"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/combobox_f5_nl_t_series'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 142-Click on combobox f5 nl t series.png')

"Step 143: Click on option dropdown item2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/option_dropdown_item2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 143-Click on option dropdown item2.png')

"Step 144: Click on combobox all2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/combobox_all2'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 144-Click on combobox all2.png')

"Step 145: Click on option dropdown item3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/option_dropdown_item3'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 145-Click on option dropdown item3.png')

"Step 146: Click on button download xlsx"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/button_download_xlsx'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 146-Click on button download xlsx.png')

"Step 147: Click on link about us -> Navigate to page 'informational page#*/aboutus'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/link_about_us'))

WebUI.takeScreenshot(reportLocation + '/TC24/Step 147-Click on link about us - Navigate to page informational pageaboutus.png')

"Step 148: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC24-Explore Investment Options and Educational Content_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}