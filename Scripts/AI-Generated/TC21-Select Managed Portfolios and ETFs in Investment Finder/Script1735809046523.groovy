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

"Step 2: Click on md etfsCheckbox"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_etfsCheckbox'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 2-Click on md etfsCheckbox.png')

"Step 3: Click on md ManagedPortfolios"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_ManagedPortfolios'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 3-Click on md ManagedPortfolios.png')

"Step 4: Click on checkbox product selection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_product_selection'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 4-Click on checkbox product selection.png')

"Step 5: Click on checkbox managed portfolios"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 5-Click on checkbox managed portfolios.png')

"Step 6: Click on md ManagedPortfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_ManagedPortfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 6-Click on md ManagedPortfolios2.png')

"Step 7: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 7-Click on checkbox managed portfolios2.png')

"Step 8: Click on md ManagedPortfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_ManagedPortfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 8-Click on md ManagedPortfolios2.png')

"Step 9: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 9-Click on checkbox managed portfolios2.png')

"Step 10: Click on md ClearPathRetirement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_ClearPathRetirement'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 10-Click on md ClearPathRetirement.png')

"Step 11: Click on main InvestmentFinder -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/main_InvestmentFinder'))

WebUI.takeScreenshot(reportLocation + '/TC21/Step 11-Click on main InvestmentFinder - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC21-Select Managed Portfolios and ETFs in Investment Finder_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}