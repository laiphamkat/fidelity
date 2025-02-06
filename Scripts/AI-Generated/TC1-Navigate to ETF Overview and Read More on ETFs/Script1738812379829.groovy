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

"Step 2: Click on link etfOverview (ETFsOverview) -> Navigate to page 'investment etfs#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_homepage/link_etfOverview'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on link etfOverview ETFsOverview - Navigate to page investment etfs.png')

"Step 3: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investment_etfs/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Hover over div object.png')

"Step 4: Click on button ReadMore -> Navigate to page 'investor education what is an etf#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/button_ReadMore'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on button ReadMore - Navigate to page investor education what is an etf.png')

"Step 5: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investor_education_what_is_an_etf/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Hover over div object.png')

"Step 6: Click on link InvestorEducation -> Navigate to page 'educational content#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_what_is_an_etf/link_InvestorEducation'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link InvestorEducation - Navigate to page educational content.png')

"Step 7: Click on link RRSPTips -> Navigate to page 'insights articles#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/link_RRSPTips'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on link RRSPTips - Navigate to page insights articles.png')

"Step 8: Click on link RRSPs101Chinese"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/link_RRSPs101Chinese'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on link RRSPs101Chinese.png')

"Step 9: Click on input EmailAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/input_EmailAddress'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on input EmailAddress.png')

"Step 10: Enter input value in input EmailAddress"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_insights_articles/input_EmailAddress'), input_EmailAddress)

WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Enter input value in input EmailAddress.png')

"Step 11: Click on label IndividualInvestor"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/label_IndividualInvestor'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on label IndividualInvestor.png')

"Step 12: Click on input InvestorOptIn -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/input_InvestorOptIn'))

WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on input InvestorOptIn - Navigate to page .png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Navigate to ETF Overview and Read More on ETFs_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}