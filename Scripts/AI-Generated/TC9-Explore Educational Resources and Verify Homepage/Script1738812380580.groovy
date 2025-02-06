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

"Step 1: Navigate to *"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}")

"Step 2: Click on body Object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Object2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 2-Click on body Object2.png')

"Step 3: Click on body Object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Object2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 3-Click on body Object2.png')

"Step 4: Click on body Object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Object2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 4-Click on body Object2.png')

"Step 5: Click on body Object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Object2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 5-Click on body Object2.png')

"Step 6: Click on link InvestingForBeginners -> Navigate to page 'investor education investing beginners#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/link_InvestingForBeginners'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 6-Click on link InvestingForBeginners - Navigate to page investor education investing beginners.png')

"Step 7: Hover over div Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investor_education_investing_beginners/div_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 7-Hover over div Object.png')

"Step 8: Click on link Home -> Navigate to page 'homepage#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_investing_beginners/link_Home'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 8-Click on link Home - Navigate to page homepage.png')

"Step 9: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 9-Click on body Object3.png')

"Step 10: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 10-Click on body Object3.png')

"Step 11: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 11-Click on body Object3.png')

"Step 12: Click on link InvestorEducation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/link_InvestorEducation'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 12-Click on link InvestorEducation.png')

"Step 13: Click on link InvestorEducationOverview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/link_InvestorEducationOverview'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 13-Click on link InvestorEducationOverview.png')

"Step 14: Click on body Object3 -> Navigate to page 'investment options#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 14-Click on body Object3 - Navigate to page investment options.png')

"Step 15: Hover over link Awards"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investment_options/link_Awards'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 15-Hover over link Awards.png')

"Step 16: Click on button SeeAllAwards -> Navigate to page 'insights awards#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_options/button_SeeAllAwards'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 16-Click on button SeeAllAwards - Navigate to page insights awards.png')

"Step 17: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_awards/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 17-Click on body Object.png')

"Step 18: Click on link FidelityEmergingMarketsFund"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_awards/link_FidelityEmergingMarketsFund'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 18-Click on link FidelityEmergingMarketsFund.png')

"Step 19: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_awards/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 19-Click on body Object.png')

"Step 20: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_awards/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 20-Click on body Object.png')

"Step 21: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_awards/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 21-Click on body Object.png')

"Step 22: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_awards/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 22-Click on body Object.png')

"Step 23: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_awards/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 23-Click on body Object.png')

"Step 24: Click on link VolatilityToolbox -> Navigate to page 'financial tool#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_awards/link_VolatilityToolbox'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 24-Click on link VolatilityToolbox - Navigate to page financial tool.png')

"Step 25: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 25-Click on body Object.png')

"Step 26: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 26-Click on body Object.png')

"Step 27: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 27-Click on body Object.png')

"Step 28: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 28-Click on body Object.png')

"Step 29: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 29-Click on body Object.png')

"Step 30: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 30-Click on body Object.png')

"Step 31: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 31-Click on body Object.png')

"Step 32: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 32-Click on body Object.png')

"Step 33: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 33-Click on body Object.png')

"Step 34: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 34-Click on body Object.png')

"Step 35: Click on link Investments"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/link_Investments'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 35-Click on link Investments.png')

"Step 36: Click on link InvestmentsOverview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tool/link_InvestmentsOverview'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 36-Click on link InvestmentsOverview.png')

"Step 37: Click on body object multiple times"

clickBodyObjectMultipleTimes.execute()

"Step 38: Click on link educationalResources (ToolsAndCalculators)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_educational_content/link_educationalResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_educational_content/link_educationalResources', ['link_educationalResources_internalRoleLinkName': link_educationalResources_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 38-Click on link educationalResources ToolsAndCalculators.png')

"Step 39: Click on link ToolsAndCalculatorsOverview -> Navigate to page 'financial tools#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/link_ToolsAndCalculatorsOverview'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 39-Click on link ToolsAndCalculatorsOverview - Navigate to page financial tools.png')

"Step 40: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tools/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 40-Click on body object.png')

"Step 41: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tools/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 41-Click on body object.png')

"Step 42: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tools/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 42-Click on body object.png')

"Step 43: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tools/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 43-Click on body object.png')

"Step 44: Click on body object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tools/body_object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 44-Click on body object.png')

"Step 45: Click on link PriceAndPerformance -> Navigate to page 'generic#*/priceandperformance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_financial_tools/link_PriceAndPerformance'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 45-Click on link PriceAndPerformance - Navigate to page genericpriceandperformance.png')

"Step 46: Hover over tr object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_generic/tr_object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 46-Hover over tr object3.png')

"Step 47: Click on link FundFacts"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_FundFacts'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 47-Click on link FundFacts.png')

"Step 48: Click on button AllFidelityFunds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_AllFidelityFunds'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 48-Click on button AllFidelityFunds.png')

"Step 49: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 49-Click on div object.png')

"Step 50: Hover over tr object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_generic/tr_object2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 50-Hover over tr object2.png')

"Step 51: Click on link ViewFund -> Navigate to page 'product listing#*/products/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_ViewFund'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 51-Click on link ViewFund - Navigate to page product listingproducts.png')

"Step 52: Click on link fundStatistics (GetETFStats) -> Navigate to page 'fund information#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_product_listing/link_fundStatistics"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product_listing/link_fundStatistics', ['link_fundStatistics_internalRoleLinkName': link_fundStatistics_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 52-Click on link fundStatistics GetETFStats - Navigate to page fund information.png')

"Step 53: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 53-Click on body Object.png')

"Step 54: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 54-Click on body Object.png')

"Step 55: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 55-Click on body Object.png')

"Step 56: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 56-Click on body Object.png')

"Step 57: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 57-Click on body Object.png')

"Step 58: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 58-Click on body Object.png')

"Step 59: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 59-Click on body Object.png')

"Step 60: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 60-Click on body Object.png')

"Step 61: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 61-Click on body Object.png')

"Step 62: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 62-Click on body Object.png')

"Step 63: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 63-Click on body Object.png')

"Step 64: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 64-Click on body Object.png')

"Step 65: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 65-Click on body Object.png')

"Step 66: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 66-Click on body Object.png')

"Step 67: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 67-Click on body Object.png')

"Step 68: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 68-Click on body Object.png')

"Step 69: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 69-Click on body Object.png')

"Step 70: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 70-Click on body Object.png')

"Step 71: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 71-Click on body Object.png')

"Step 72: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 72-Click on body Object.png')

"Step 73: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 73-Click on body Object.png')

"Step 74: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 74-Click on body Object.png')

"Step 75: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 75-Click on body Object.png')

"Step 76: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 76-Click on body Object.png')

"Step 77: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 77-Click on body Object.png')

"Step 78: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 78-Click on body Object.png')

"Step 79: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 79-Click on body Object.png')

"Step 80: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 80-Click on body Object.png')

"Step 81: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 81-Click on body Object.png')

"Step 82: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 82-Click on body Object.png')

"Step 83: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 83-Click on body Object.png')

"Step 84: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 84-Click on body Object.png')

"Step 85: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 85-Click on body Object.png')

"Step 86: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 86-Click on body Object.png')

"Step 87: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 87-Click on body Object.png')

"Step 88: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 88-Click on body Object.png')

"Step 89: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 89-Click on body Object.png')

"Step 90: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 90-Click on body Object.png')

"Step 91: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 91-Click on body Object.png')

"Step 92: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 92-Click on body Object.png')

"Step 93: Click on link InvestorEducation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/link_InvestorEducation'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 93-Click on link InvestorEducation.png')

"Step 94: Click on link InvestorEducationOverview"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/link_InvestorEducationOverview'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 94-Click on link InvestorEducationOverview.png')

"Step 95: Click on body Object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 95-Click on body Object.png')

"Step 96: Click on body Object -> Navigate to page 'educational content#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_fund_information/body_Object'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 96-Click on body Object - Navigate to page educational content.png')

"Step 97: Click on body Object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 97-Click on body Object2.png')

"Step 98: Click on body Object2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 98-Click on body Object2.png')

"Step 99: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 99-Click on body Object3.png')

"Step 100: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 100-Click on body Object3.png')

"Step 101: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 101-Click on body Object3.png')

"Step 102: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 102-Click on body Object3.png')

"Step 103: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 103-Click on body Object3.png')

"Step 104: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 104-Click on body Object3.png')

"Step 105: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 105-Click on body Object3.png')

"Step 106: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 106-Click on body Object3.png')

"Step 107: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 107-Click on body Object3.png')

"Step 108: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 108-Click on body Object3.png')

"Step 109: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 109-Click on body Object3.png')

"Step 110: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 110-Click on body Object3.png')

"Step 111: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 111-Click on body Object3.png')

"Step 112: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 112-Click on body Object3.png')

"Step 113: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 113-Click on body Object3.png')

"Step 114: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 114-Click on body Object3.png')

"Step 115: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 115-Click on body Object3.png')

"Step 116: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 116-Click on body Object3.png')

"Step 117: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 117-Click on body Object3.png')

"Step 118: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 118-Click on body Object3.png')

"Step 119: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 119-Click on body Object3.png')

"Step 120: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 120-Click on body Object3.png')

"Step 121: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 121-Click on body Object3.png')

"Step 122: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 122-Click on body Object3.png')

"Step 123: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 123-Click on body Object3.png')

"Step 124: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 124-Click on body Object3.png')

"Step 125: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 125-Click on body Object3.png')

"Step 126: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 126-Click on body Object3.png')

"Step 127: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 127-Click on body Object3.png')

"Step 128: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 128-Click on body Object3.png')

"Step 129: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 129-Click on body Object3.png')

"Step 130: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 130-Click on body Object3.png')

"Step 131: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 131-Click on body Object3.png')

"Step 132: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 132-Click on body Object3.png')

"Step 133: Click on body Object3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/body_Object3'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 133-Click on body Object3.png')

"Step 134: Click on link educationalResources (InvestorEducation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_educational_content/link_educationalResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_educational_content/link_educationalResources', ['link_educationalResources_internalRoleLinkName': link_educationalResources_internalRoleLinkName_1]))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 134-Click on link educationalResources InvestorEducation.png')

"Step 135: Click on link MutualFunds -> Navigate to page 'investment mutual funds#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/link_MutualFunds'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 135-Click on link MutualFunds - Navigate to page investment mutual funds.png')

"Step 136: Hover over link MoneyMarketMutualFunds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investment_mutual_funds/link_MoneyMarketMutualFunds'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 136-Hover over link MoneyMarketMutualFunds.png')

"Step 137: Click on button ExploreFunds -> Navigate to page 'generic#*/priceandperformance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_mutual_funds/button_ExploreFunds'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 137-Click on button ExploreFunds - Navigate to page genericpriceandperformance.png')

"Step 138: Click on button AllFidelityFunds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_AllFidelityFunds'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 138-Click on button AllFidelityFunds.png')

"Step 139: Click on link MyWatchList"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_MyWatchList'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 139-Click on link MyWatchList.png')

"Step 140: Click on button All"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_All'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 140-Click on button All.png')

"Step 141: Click on link TSeriesOnly"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_TSeriesOnly'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 141-Click on link TSeriesOnly.png')

"Step 142: Click on button F5NLTSeries"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_F5NLTSeries'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 142-Click on button F5NLTSeries.png')

"Step 143: Click on link I5ISCTSeries"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_I5ISCTSeries'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 143-Click on link I5ISCTSeries.png')

"Step 144: Click on button All2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_All2'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 144-Click on button All2.png')

"Step 145: Click on link CDN"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_CDN'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 145-Click on link CDN.png')

"Step 146: Click on button DownloadXLSX"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/button_DownloadXLSX'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 146-Click on button DownloadXLSX.png')

"Step 147: Click on link AboutUs -> Navigate to page 'informational#*/aboutus'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic/link_AboutUs'))

WebUI.takeScreenshot(reportLocation + '/TC9/Step 147-Click on link AboutUs - Navigate to page informationalaboutus.png')

"Step 148: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC9-Explore Educational Resources and Verify Homepage_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}