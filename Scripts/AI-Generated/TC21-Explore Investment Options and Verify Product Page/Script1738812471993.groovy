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

"Step 1: Navigate to *"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}")

"Step 2: Click on link InvestingForBeginners -> Navigate to page 'investor education investing beginners#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/link_InvestingForBeginners'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 2-Click on link InvestingForBeginners - Navigate to page investor education investing beginners.png')

"Step 3: Click on link WhatIsAStock -> Navigate to page 'investor education#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_investing_beginners/link_WhatIsAStock'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 3-Click on link WhatIsAStock - Navigate to page investor education.png')

"Step 4: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investor_education/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 4-Hover over div object.png')

"Step 5: Click on link InvestorEducation -> Navigate to page 'educational content#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education/link_InvestorEducation'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 5-Click on link InvestorEducation - Navigate to page educational content.png')

"Step 6: Click on link RRSPTips -> Navigate to page 'insights articles#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/link_RRSPTips'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 6-Click on link RRSPTips - Navigate to page insights articles.png')

"Step 7: Click on link InvestmentGoals -> Navigate to page 'investor education investing goals#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/link_InvestmentGoals'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 7-Click on link InvestmentGoals - Navigate to page investor education investing goals.png')

"Step 8: Hover over link SavingForEducation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investor_education_investing_goals/link_SavingForEducation'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 8-Hover over link SavingForEducation.png')

"Step 9: Click on button viewAllRetirementOptions (ViewAllSavingForEducation) -> Navigate to page 'investing goals#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_investor_education_investing_goals/button_viewAllRetirementOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investor_education_investing_goals/button_viewAllRetirementOptions', ['button_viewAllRetirementOptions_class': button_viewAllRetirementOptions_class]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 9-Click on button viewAllRetirementOptions ViewAllSavingForEducation - Navigate to page investing goals.png')

"Step 10: Click on link investingResources (IntroductionToRESPs) -> Navigate to page 'insights articles#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_investing_goals/link_investingResources"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investing_goals/link_investingResources', ['link_investingResources_internalRoleLinkName': link_investingResources_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 10-Click on link investingResources IntroductionToRESPs - Navigate to page insights articles.png')

"Step 11: Click on link StartInvesting -> Navigate to page 'investor education#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/link_StartInvesting'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 11-Click on link StartInvesting - Navigate to page investor education.png')

"Step 12: Click on link FinancialGoals -> Navigate to page 'product promotion#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education/link_FinancialGoals'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 12-Click on link FinancialGoals - Navigate to page product promotion.png')

"Step 13: Click on link LearnMore -> Navigate to page 'guidance#*/howtobuyfidelityfunds'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product_promotion/link_LearnMore'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 13-Click on link LearnMore - Navigate to page guidancehowtobuyfidelityfunds.png')

"Step 14: Click on link SearchETFOrMutualFund -> Navigate to page 'product#*/products/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/howtobuyfidelityfunds?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_guidance/link_SearchETFOrMutualFund'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 14-Click on link SearchETFOrMutualFund - Navigate to page productproducts.png')

"Step 15: Click on md ManagedPortfolios5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_ManagedPortfolios5'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 15-Click on md ManagedPortfolios5.png')

"Step 16: Click on md ManagedPortfolios6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_ManagedPortfolios6'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 16-Click on md ManagedPortfolios6.png')

"Step 17: Click on md ClearPathRetirement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_ClearPathRetirement'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 17-Click on md ClearPathRetirement.png')

"Step 18: Click on md PrivateInvestmentPools"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_PrivateInvestmentPools'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 18-Click on md PrivateInvestmentPools.png')

"Step 19: Click on md ETFs3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_ETFs3'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 19-Click on md ETFs3.png')

"Step 20: Click on md ManagedPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_ManagedPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 20-Click on md ManagedPortfolios3.png')

"Step 21: Click on md ClearPathRetirement2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_ClearPathRetirement2'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 21-Click on md ClearPathRetirement2.png')

"Step 22: Click on md PrivateInvestmentPools2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_PrivateInvestmentPools2'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 22-Click on md PrivateInvestmentPools2.png')

"Step 23: Click on md ManagedPortfolios4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_ManagedPortfolios4'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 23-Click on md ManagedPortfolios4.png')

"Step 24: Click on md PrivateInvestmentPools3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_PrivateInvestmentPools3'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 24-Click on md PrivateInvestmentPools3.png')

"Step 25: Click on md ManagedPortfolios7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_ManagedPortfolios7'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 25-Click on md ManagedPortfolios7.png')

"Step 26: Click on div MutualFunds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_MutualFunds'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 26-Click on div MutualFunds.png')

"Step 27: Click on div MutualFunds2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_MutualFunds2'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 27-Click on div MutualFunds2.png')

"Step 28: Click on div MutualFunds3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_MutualFunds3'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 28-Click on div MutualFunds3.png')

"Step 29: Click on div MutualFunds4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_MutualFunds4'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 29-Click on div MutualFunds4.png')

"Step 30: Click on div MutualFunds3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_MutualFunds3'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 30-Click on div MutualFunds3.png')

"Step 31: Click on div MutualFunds4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_MutualFunds4'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 31-Click on div MutualFunds4.png')

"Step 32: Click on div ETFs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ETFs'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 32-Click on div ETFs.png')

"Step 33: Click on div ETFs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ETFs2'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 33-Click on div ETFs2.png')

"Step 34: Click on div ETFs3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ETFs3'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 34-Click on div ETFs3.png')

"Step 35: Click on div ETFs4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ETFs4'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 35-Click on div ETFs4.png')

"Step 36: Click on div MutualFunds5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_MutualFunds5'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 36-Click on div MutualFunds5.png')

"Step 37: Click on div MutualFunds6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_MutualFunds6'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 37-Click on div MutualFunds6.png')

"Step 38: Click on div MutualFunds7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_MutualFunds7'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 38-Click on div MutualFunds7.png')

"Step 39: Click on div MutualFunds6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_MutualFunds6'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 39-Click on div MutualFunds6.png')

"Step 40: Click on div ManagedPortfolios"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ManagedPortfolios'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 40-Click on div ManagedPortfolios.png')

"Step 41: Click on div ManagedPortfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ManagedPortfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 41-Click on div ManagedPortfolios2.png')

"Step 42: Click on div ManagedPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ManagedPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 42-Click on div ManagedPortfolios3.png')

"Step 43: Click on div ManagedPortfolios4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ManagedPortfolios4'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 43-Click on div ManagedPortfolios4.png')

"Step 44: Click on div ManagedPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ManagedPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 44-Click on div ManagedPortfolios3.png')

"Step 45: Click on div ClearPathRetirement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ClearPathRetirement'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 45-Click on div ClearPathRetirement.png')

"Step 46: Click on div ClearPathRetirementPortfolios"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ClearPathRetirementPortfolios'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 46-Click on div ClearPathRetirementPortfolios.png')

"Step 47: Click on div ClearPathRetirement2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ClearPathRetirement2'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 47-Click on div ClearPathRetirement2.png')

"Step 48: Click on div ClearPathRetirementPortfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ClearPathRetirementPortfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 48-Click on div ClearPathRetirementPortfolios2.png')

"Step 49: Click on div PrivateInvestmentPools"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_PrivateInvestmentPools'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 49-Click on div PrivateInvestmentPools.png')

"Step 50: Click on div PrivateInvestmentPools2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_PrivateInvestmentPools2'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 50-Click on div PrivateInvestmentPools2.png')

"Step 51: Click on div MutualFunds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_MutualFunds'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 51-Click on div MutualFunds.png')

"Step 52: Click on div ETFs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ETFs'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 52-Click on div ETFs.png')

"Step 53: Click on div ClearPathRetirement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ClearPathRetirement'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 53-Click on div ClearPathRetirement.png')

"Step 54: Click on div PrivateInvestmentPools"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_PrivateInvestmentPools'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 54-Click on div PrivateInvestmentPools.png')

"Step 55: Click on div PrivateInvestmentPools3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_PrivateInvestmentPools3'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 55-Click on div PrivateInvestmentPools3.png')

"Step 56: Click on div ClearPathRetirementPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ClearPathRetirementPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 56-Click on div ClearPathRetirementPortfolios3.png')

"Step 57: Click on div ManagedPortfolios5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ManagedPortfolios5'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 57-Click on div ManagedPortfolios5.png')

"Step 58: Click on div ETFs5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ETFs5'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 58-Click on div ETFs5.png')

"Step 59: Click on div MutualFunds8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_MutualFunds8'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 59-Click on div MutualFunds8.png')

"Step 60: Click on div MutualFunds7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_MutualFunds7'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 60-Click on div MutualFunds7.png')

"Step 61: Click on div ETFs6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ETFs6'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 61-Click on div ETFs6.png')

"Step 62: Click on div ManagedPortfolios6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ManagedPortfolios6'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 62-Click on div ManagedPortfolios6.png')

"Step 63: Click on div ClearPathRetirement3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_ClearPathRetirement3'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 63-Click on div ClearPathRetirement3.png')

"Step 64: Click on div PrivateInvestmentPools4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_PrivateInvestmentPools4'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 64-Click on div PrivateInvestmentPools4.png')

"Step 65: Click on div PrivateInvestmentPools5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_PrivateInvestmentPools5'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 65-Click on div PrivateInvestmentPools5.png')

"Step 66: Click on div PrivateInvestmentPools6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_PrivateInvestmentPools6'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 66-Click on div PrivateInvestmentPools6.png')

"Step 67: Click on div PrivateInvestmentPools5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_PrivateInvestmentPools5'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 67-Click on div PrivateInvestmentPools5.png')

"Step 68: Click on div PrivateInvestmentPools6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_PrivateInvestmentPools6'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 68-Click on div PrivateInvestmentPools6.png')

"Step 69: Click on div PrivateInvestmentPools5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_PrivateInvestmentPools5'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 69-Click on div PrivateInvestmentPools5.png')

"Step 70: Click on div MutualFunds6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/div_MutualFunds6'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 70-Click on div MutualFunds6.png')

"Step 71: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC21-Explore Investment Options and Verify Product Page_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}