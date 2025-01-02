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

"Step 2: Click on link etfInformation (ETFsLookAtOurMixOf) -> Navigate to page 'investment etfs#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_homepage/link_etfInformation'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 2-Click on link etfInformation ETFsLookAtOurMixOf - Navigate to page investment etfs.png')

"Step 3: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investment_etfs/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 3-Hover over div object.png')

"Step 4: Click on readMoreButton -> Navigate to page 'investor education what is an etf#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/readMoreButton'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 4-Click on readMoreButton - Navigate to page investor education what is an etf.png')

"Step 5: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investor_education_what_is_an_etf/div_object'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 5-Hover over div object.png')

"Step 6: Click on investorEducationLink -> Navigate to page 'educational content#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_what_is_an_etf/investorEducationLink'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 6-Click on investorEducationLink - Navigate to page educational content.png')

"Step 7: Click on sixTipsForRRSP -> Navigate to page 'insights articles#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/sixTipsForRRSP'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 7-Click on sixTipsForRRSP - Navigate to page insights articles.png')

"Step 8: Click on rrsp101ChineseLink"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/rrsp101ChineseLink'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 8-Click on rrsp101ChineseLink.png')

"Step 9: Click on emailInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/emailInputField'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 9-Click on emailInputField.png')

"Step 10: Enter input value in input email address"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_insights_articles/emailInputField'), input_email_address)

WebUI.takeScreenshot(reportLocation + '/TC19/Step 10-Enter input value in input email address.png')

"Step 11: Click on userTypeSelection"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/userTypeSelection'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 11-Click on userTypeSelection.png')

"Step 12: Click on consentToReceiveCommunications -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/consentToReceiveCommunications'))

WebUI.takeScreenshot(reportLocation + '/TC19/Step 12-Click on consentToReceiveCommunications - Navigate to page .png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC19-Navigate to ETF Information and Subscribe for Updates_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}