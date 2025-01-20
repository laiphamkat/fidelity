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

"Step 2: Click on link investing for beginners -> Navigate to page 'investor education investing beginners#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/link_investing_for_beginners'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 2-Click on link investing for beginners - Navigate to page investor education investing beginners.png')

"Step 3: Click on link what is a stock -> Navigate to page 'investor education#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_investing_beginners/link_what_is_a_stock'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 3-Click on link what is a stock - Navigate to page investor education.png')

"Step 4: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investor_education/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 4-Hover over div object.png')

"Step 5: Click on link investor education -> Navigate to page 'educational content#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education/link_investor_education'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 5-Click on link investor education - Navigate to page educational content.png')

"Step 6: Click on link six tips to make the most of your rrsp -> Navigate to page 'insights articles#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/link_six_tips_to_make_the_most_of_your_rrsp'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 6-Click on link six tips to make the most of your rrsp - Navigate to page insights articles.png')

"Step 7: Click on link investment goals -> Navigate to page 'investor education investing goals#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/link_investment_goals'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 7-Click on link investment goals - Navigate to page investor education investing goals.png')

"Step 8: Hover over link SavingForEducation"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investor_education_investing_goals/link_SavingForEducation'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 8-Hover over link SavingForEducation.png')

"Step 9: Click on button viewAllInvestmentOptions (ViewAllSavingForEducation) -> Navigate to page 'investing goals#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_investor_education_investing_goals/button_viewAllInvestmentOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investor_education_investing_goals/button_viewAllInvestmentOptions', ['button_viewAllInvestmentOptions_class': button_viewAllInvestmentOptions_class]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 9-Click on button viewAllInvestmentOptions ViewAllSavingForEducation - Navigate to page investing goals.png')

"Step 10: Click on link investingGoals (AnIntroductionToRESPs) -> Navigate to page 'insights articles#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_investing_goals/link_investingGoals"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investing_goals/link_investingGoals', ['link_investingGoals_internalRoleLinkName': link_investingGoals_internalRoleLinkName]))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 10-Click on link investingGoals AnIntroductionToRESPs - Navigate to page insights articles.png')

"Step 11: Click on link faq how do i start investing -> Navigate to page 'investor education#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/link_faq_how_do_i_start_investing'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 11-Click on link faq how do i start investing - Navigate to page investor education.png')

"Step 12: Click on link financial goals -> Navigate to page 'dream acceleration page#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education/link_financial_goals'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 12-Click on link financial goals - Navigate to page dream acceleration page.png')

"Step 13: Click on link learn more -> Navigate to page 'guides#*/howtobuyfidelityfunds'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_dream_acceleration_page/link_learn_more'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 13-Click on link learn more - Navigate to page guideshowtobuyfidelityfunds.png')

"Step 14: Click on link search etf or mutual fund -> Navigate to page 'investment finder#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/howtobuyfidelityfunds?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_guides/link_search_etf_or_mutual_fund'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 14-Click on link search etf or mutual fund - Navigate to page investment finder.png')

"Step 15: Click on checkbox managed portfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 15-Click on checkbox managed portfolios3.png')

"Step 16: Click on checkbox managed portfolios4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios4'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 16-Click on checkbox managed portfolios4.png')

"Step 17: Click on checkbox clearpath retirement portfolios"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_clearpath_retirement_portfolios'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 17-Click on checkbox clearpath retirement portfolios.png')

"Step 18: Click on checkbox private investment pools"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_private_investment_pools'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 18-Click on checkbox private investment pools.png')

"Step 19: Click on checkbox etfs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 19-Click on checkbox etfs.png')

"Step 20: Click on md ManagedPortfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_ManagedPortfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 20-Click on md ManagedPortfolios2.png')

"Step 21: Click on checkbox clearpath retirement portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_clearpath_retirement_portfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 21-Click on checkbox clearpath retirement portfolios2.png')

"Step 22: Click on checkbox private investment pools2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_private_investment_pools2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 22-Click on checkbox private investment pools2.png')

"Step 23: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 23-Click on checkbox managed portfolios2.png')

"Step 24: Click on md PrivateInvestmentPools"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_PrivateInvestmentPools'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 24-Click on md PrivateInvestmentPools.png')

"Step 25: Click on md ManagedPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_ManagedPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 25-Click on md ManagedPortfolios3.png')

"Step 26: Click on div MutualFunds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_MutualFunds'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 26-Click on div MutualFunds.png')

"Step 27: Click on div MutualFunds2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_MutualFunds2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 27-Click on div MutualFunds2.png')

"Step 28: Click on div MutualFunds3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_MutualFunds3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 28-Click on div MutualFunds3.png')

"Step 29: Click on div MutualFunds4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_MutualFunds4'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 29-Click on div MutualFunds4.png')

"Step 30: Click on div MutualFunds3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_MutualFunds3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 30-Click on div MutualFunds3.png')

"Step 31: Click on div MutualFunds4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_MutualFunds4'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 31-Click on div MutualFunds4.png')

"Step 32: Click on div ETFs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_ETFs'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 32-Click on div ETFs.png')

"Step 33: Click on div ETFs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_ETFs2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 33-Click on div ETFs2.png')

"Step 34: Click on div ETFs3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_ETFs3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 34-Click on div ETFs3.png')

"Step 35: Click on div ETFs4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_ETFs4'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 35-Click on div ETFs4.png')

"Step 36: Click on div MutualFunds5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_MutualFunds5'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 36-Click on div MutualFunds5.png')

"Step 37: Click on div MutualFunds6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_MutualFunds6'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 37-Click on div MutualFunds6.png')

"Step 38: Click on div MutualFunds7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_MutualFunds7'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 38-Click on div MutualFunds7.png')

"Step 39: Click on div MutualFunds6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_MutualFunds6'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 39-Click on div MutualFunds6.png')

"Step 40: Click on div ClearPathRetirement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_ClearPathRetirement'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 40-Click on div ClearPathRetirement.png')

"Step 41: Click on div ClearPathRetirementPortfolios"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_ClearPathRetirementPortfolios'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 41-Click on div ClearPathRetirementPortfolios.png')

"Step 42: Click on div ClearPathRetirement2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_ClearPathRetirement2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 42-Click on div ClearPathRetirement2.png')

"Step 43: Click on div ClearPathRetirementPortfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_ClearPathRetirementPortfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 43-Click on div ClearPathRetirementPortfolios2.png')

"Step 44: Click on div ClearPathRetirement2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_ClearPathRetirement2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 44-Click on div ClearPathRetirement2.png')

"Step 45: Click on div PrivateInvestmentPools"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_PrivateInvestmentPools'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 45-Click on div PrivateInvestmentPools.png')

"Step 46: Click on div PrivateInvestmentPools2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_PrivateInvestmentPools2'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 46-Click on div PrivateInvestmentPools2.png')

"Step 47: Click on div PrivateInvestmentPools3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_PrivateInvestmentPools3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 47-Click on div PrivateInvestmentPools3.png')

"Step 48: Click on div PrivateInvestmentPools4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_PrivateInvestmentPools4'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 48-Click on div PrivateInvestmentPools4.png')

"Step 49: Click on div PrivateInvestmentPools5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_PrivateInvestmentPools5'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 49-Click on div PrivateInvestmentPools5.png')

"Step 50: Click on div PrivateInvestmentPools6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_PrivateInvestmentPools6'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 50-Click on div PrivateInvestmentPools6.png')

"Step 51: Click on div MutualFunds"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_MutualFunds'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 51-Click on div MutualFunds.png')

"Step 52: Click on div ETFs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_ETFs'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 52-Click on div ETFs.png')

"Step 53: Click on div PrivateInvestmentPools"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_PrivateInvestmentPools'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 53-Click on div PrivateInvestmentPools.png')

"Step 54: Click on div PrivateInvestmentPools5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_PrivateInvestmentPools5'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 54-Click on div PrivateInvestmentPools5.png')

"Step 55: Click on div PrivateInvestmentPools7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_PrivateInvestmentPools7'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 55-Click on div PrivateInvestmentPools7.png')

"Step 56: Click on div PrivateInvestmentPools8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_PrivateInvestmentPools8'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 56-Click on div PrivateInvestmentPools8.png')

"Step 57: Click on div ClearPathRetirementPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_ClearPathRetirementPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 57-Click on div ClearPathRetirementPortfolios3.png')

"Step 58: Click on div ETFs5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_ETFs5'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 58-Click on div ETFs5.png')

"Step 59: Click on div MutualFunds8"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_MutualFunds8'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 59-Click on div MutualFunds8.png')

"Step 60: Click on div MutualFunds7"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_MutualFunds7'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 60-Click on div MutualFunds7.png')

"Step 61: Click on div ETFs6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_ETFs6'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 61-Click on div ETFs6.png')

"Step 62: Click on div ClearPathRetirement3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_ClearPathRetirement3'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 62-Click on div ClearPathRetirement3.png')

"Step 63: Click on div PrivateInvestmentPools9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_PrivateInvestmentPools9'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 63-Click on div PrivateInvestmentPools9.png')

"Step 64: Click on div PrivateInvestmentPools10"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_PrivateInvestmentPools10'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 64-Click on div PrivateInvestmentPools10.png')

"Step 65: Click on div PrivateInvestmentPools11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_PrivateInvestmentPools11'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 65-Click on div PrivateInvestmentPools11.png')

"Step 66: Click on div PrivateInvestmentPools12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_PrivateInvestmentPools12'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 66-Click on div PrivateInvestmentPools12.png')

"Step 67: Click on div PrivateInvestmentPools11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_PrivateInvestmentPools11'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 67-Click on div PrivateInvestmentPools11.png')

"Step 68: Click on div PrivateInvestmentPools12"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_PrivateInvestmentPools12'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 68-Click on div PrivateInvestmentPools12.png')

"Step 69: Click on div PrivateInvestmentPools11"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_PrivateInvestmentPools11'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 69-Click on div PrivateInvestmentPools11.png')

"Step 70: Click on div MutualFunds6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/div_MutualFunds6'))

WebUI.takeScreenshot(reportLocation + '/TC16/Step 70-Click on div MutualFunds6.png')

"Step 71: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC16-Comprehensive Search for Investment Products_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}