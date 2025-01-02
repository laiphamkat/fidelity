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

"Step 2: Click on md etfsCheckbox2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_etfsCheckbox2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 2-Click on md etfsCheckbox2.png')

"Step 3: Click on checkbox etfs6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs6'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 3-Click on checkbox etfs6.png')

"Step 4: Click on checkbox product selection2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_product_selection2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 4-Click on checkbox product selection2.png')

"Step 5: Click on checkbox etfs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 5-Click on checkbox etfs2.png')

"Step 6: Click on checkbox etfs3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 6-Click on checkbox etfs3.png')

"Step 7: Click on checkbox etfs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 7-Click on checkbox etfs2.png')

"Step 8: Click on checkbox etfs3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 8-Click on checkbox etfs3.png')

"Step 9: Click on checkbox etfs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 9-Click on checkbox etfs2.png')

"Step 10: Click on checkbox etfs3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 10-Click on checkbox etfs3.png')

"Step 11: Click on checkbox etfs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 11-Click on checkbox etfs2.png')

"Step 12: Click on checkbox etfs3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 12-Click on checkbox etfs3.png')

"Step 13: Click on checkbox etfs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 13-Click on checkbox etfs2.png')

"Step 14: Click on checkbox product selection2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_product_selection2_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 14-Click on checkbox product selection2.png')

"Step 15: Click on checkbox etfs4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs4'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 15-Click on checkbox etfs4.png')

"Step 16: Click on checkbox etfs5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs5'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 16-Click on checkbox etfs5.png')

"Step 17: Click on checkbox etfs4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs4'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 17-Click on checkbox etfs4.png')

"Step 18: Click on checkbox etfs5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs5'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 18-Click on checkbox etfs5.png')

"Step 19: Click on checkbox etfs4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs4'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 19-Click on checkbox etfs4.png')

"Step 20: Click on checkbox etfs5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs5'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 20-Click on checkbox etfs5.png')

"Step 21: Click on checkbox etfs4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs4'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 21-Click on checkbox etfs4.png')

"Step 22: Click on checkbox etfs5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs5'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 22-Click on checkbox etfs5.png')

"Step 23: Click on checkbox etfs4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs4'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 23-Click on checkbox etfs4.png')

"Step 24: Click on checkbox etfs5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs5'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 24-Click on checkbox etfs5.png')

"Step 25: Click on checkbox etfs4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs4'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 25-Click on checkbox etfs4.png')

"Step 26: Click on checkbox etfs5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs5'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 26-Click on checkbox etfs5.png')

"Step 27: Click on checkbox managed portfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 27-Click on checkbox managed portfolios3.png')

"Step 28: Click on checkbox managed portfolios4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios4'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 28-Click on checkbox managed portfolios4.png')

"Step 29: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 29-Click on checkbox managed portfolios2.png')

"Step 30: Click on checkbox managed portfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios3_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 30-Click on checkbox managed portfolios3.png')

"Step 31: Click on checkbox etfs6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs6'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 31-Click on checkbox etfs6.png')

"Step 32: Click on checkbox product selection2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_product_selection2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 32-Click on checkbox product selection2.png')

"Step 33: Click on checkbox etfs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 33-Click on checkbox etfs2.png')

"Step 34: Click on checkbox etfs3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 34-Click on checkbox etfs3.png')

"Step 35: Click on checkbox etfs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 35-Click on checkbox etfs2.png')

"Step 36: Click on checkbox etfs3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 36-Click on checkbox etfs3.png')

"Step 37: Click on checkbox etfs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 37-Click on checkbox etfs2.png')

"Step 38: Click on md etfsCheckbox2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_etfsCheckbox2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 38-Click on md etfsCheckbox2.png')

"Step 39: Click on checkbox product selection3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_product_selection3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 39-Click on checkbox product selection3.png')

"Step 40: Click on checkbox etfs3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 40-Click on checkbox etfs3.png')

"Step 41: Click on checkbox etfs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 41-Click on checkbox etfs2.png')

"Step 42: Click on checkbox etfs3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 42-Click on checkbox etfs3.png')

"Step 43: Click on checkbox etfs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 43-Click on checkbox etfs2.png')

"Step 44: Click on checkbox etfs3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 44-Click on checkbox etfs3.png')

"Step 45: Click on checkbox etfs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 45-Click on checkbox etfs2.png')

"Step 46: Click on checkbox product selection2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_product_selection2_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 46-Click on checkbox product selection2.png')

"Step 47: Click on checkbox managed portfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 47-Click on checkbox managed portfolios3.png')

"Step 48: Click on checkbox managed portfolios4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios4'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 48-Click on checkbox managed portfolios4.png')

"Step 49: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 49-Click on checkbox managed portfolios2.png')

"Step 50: Click on checkbox managed portfolios4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios4_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 50-Click on checkbox managed portfolios4.png')

"Step 51: Click on checkbox managed portfolios5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios5'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 51-Click on checkbox managed portfolios5.png')

"Step 52: Click on checkbox managed portfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios3_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 52-Click on checkbox managed portfolios3.png')

"Step 53: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 53-Click on checkbox managed portfolios2.png')

"Step 54: Click on checkbox managed portfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios3_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 54-Click on checkbox managed portfolios3.png')

"Step 55: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 55-Click on checkbox managed portfolios2.png')

"Step 56: Click on checkbox managed portfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios3_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 56-Click on checkbox managed portfolios3.png')

"Step 57: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 57-Click on checkbox managed portfolios2.png')

"Step 58: Click on checkbox managed portfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios3_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 58-Click on checkbox managed portfolios3.png')

"Step 59: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 59-Click on checkbox managed portfolios2.png')

"Step 60: Click on checkbox managed portfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios3_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 60-Click on checkbox managed portfolios3.png')

"Step 61: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2_1'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 61-Click on checkbox managed portfolios2.png')

"Step 62: Click on checkbox managed portfolios6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios6'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 62-Click on checkbox managed portfolios6.png')

"Step 63: Click on md ManagedPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_ManagedPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 63-Click on md ManagedPortfolios3.png')

"Step 64: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 64-Click on checkbox managed portfolios2.png')

"Step 65: Click on md ManagedPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_ManagedPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 65-Click on md ManagedPortfolios3.png')

"Step 66: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 66-Click on checkbox managed portfolios2.png')

"Step 67: Click on md ManagedPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_ManagedPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 67-Click on md ManagedPortfolios3.png')

"Step 68: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 68-Click on checkbox managed portfolios2.png')

"Step 69: Click on md ManagedPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_ManagedPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 69-Click on md ManagedPortfolios3.png')

"Step 70: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 70-Click on checkbox managed portfolios2.png')

"Step 71: Click on md ManagedPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_ManagedPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 71-Click on md ManagedPortfolios3.png')

"Step 72: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 72-Click on checkbox managed portfolios2.png')

"Step 73: Click on md ManagedPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_ManagedPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 73-Click on md ManagedPortfolios3.png')

"Step 74: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 74-Click on checkbox managed portfolios2.png')

"Step 75: Click on md ManagedPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_ManagedPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 75-Click on md ManagedPortfolios3.png')

"Step 76: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 76-Click on checkbox managed portfolios2.png')

"Step 77: Click on md ManagedPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_ManagedPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 77-Click on md ManagedPortfolios3.png')

"Step 78: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 78-Click on checkbox managed portfolios2.png')

"Step 79: Click on md ManagedPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_ManagedPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 79-Click on md ManagedPortfolios3.png')

"Step 80: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 80-Click on checkbox managed portfolios2.png')

"Step 81: Click on md ManagedPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_ManagedPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 81-Click on md ManagedPortfolios3.png')

"Step 82: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 82-Click on checkbox managed portfolios2.png')

"Step 83: Click on md ManagedPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_ManagedPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 83-Click on md ManagedPortfolios3.png')

"Step 84: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 84-Click on checkbox managed portfolios2.png')

"Step 85: Click on md ManagedPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_ManagedPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 85-Click on md ManagedPortfolios3.png')

"Step 86: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 86-Click on checkbox managed portfolios2.png')

"Step 87: Click on md ManagedPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_ManagedPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 87-Click on md ManagedPortfolios3.png')

"Step 88: Click on checkbox etfs62"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_etfs62'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 88-Click on checkbox etfs62.png')

"Step 89: Click on checkbox managed portfolios9"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios9'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 89-Click on checkbox managed portfolios9.png')

"Step 90: Click on checkbox managed portfolios5"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios5'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 90-Click on checkbox managed portfolios5.png')

"Step 91: Click on checkbox managed portfolios6"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios6'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 91-Click on checkbox managed portfolios6.png')

"Step 92: Click on md ManagedPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/md_ManagedPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 92-Click on md ManagedPortfolios3.png')

"Step 93: Click on checkbox managed portfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_finder/checkbox_managed_portfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 93-Click on checkbox managed portfolios2.png')

"Step 94: Click on link welcomeMessage (WelcomeToFidelity2) -> Navigate to page 'homepage#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investment_finder/link_welcomeMessage'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 94-Click on link welcomeMessage WelcomeToFidelity2 - Navigate to page homepage.png')

"Step 95: Click on link etfInformation (ETFsLookAtOurMixOf2) -> Navigate to page 'investment etfs#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_homepage/link_etfInformation'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 95-Click on link etfInformation ETFsLookAtOurMixOf2 - Navigate to page investment etfs.png')

"Step 96: Click on searchByFundLink -> Navigate to page 'generic page#*/priceandperformance'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/searchByFundLink'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 96-Click on searchByFundLink - Navigate to page generic pagepriceandperformance.png')

"Step 97: Click on fundSearchInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/fundSearchInput'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 97-Click on fundSearchInput.png')

"Step 98: Click on fundSearchInput"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/fundSearchInput'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 98-Click on fundSearchInput.png')

"Step 99: Enter input value in fundSearchInput2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_generic_page/fundSearchInput'), fundSearchInput2)

WebUI.takeScreenshot(reportLocation + '/TC35/Step 99-Enter input value in fundSearchInput2.png')

"Step 100: Click on div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 100-Click on div object.png')

"Step 101: Click on allFidelityFundsDropdown2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/allFidelityFundsDropdown2'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 101-Click on allFidelityFundsDropdown2.png')

"Step 102: Click on alternativeFundsDropdownItem"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/alternativeFundsDropdownItem'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 102-Click on alternativeFundsDropdownItem.png')

"Step 103: Click on downloadXlsxButton -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/priceandperformance?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_page/downloadXlsxButton'))

WebUI.takeScreenshot(reportLocation + '/TC35/Step 103-Click on downloadXlsxButton - Navigate to page .png')

"Step 104: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC35-Select ETFs and Manage Watchlist in Investment Finder_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}