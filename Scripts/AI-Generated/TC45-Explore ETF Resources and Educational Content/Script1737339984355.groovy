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

"Step 2: Click on link etfResources (ETFsLookAtOurMixOf) -> Navigate to page 'investment etfs#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_homepage/link_etfResources'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 2-Click on link etfResources ETFsLookAtOurMixOf - Navigate to page investment etfs.png')

"Step 3: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investment_etfs/div_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 3-Hover over div object.png')

"Step 4: Click on button read more -> Navigate to page 'investor education what is an etf#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/button_read_more'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 4-Click on button read more - Navigate to page investor education what is an etf.png')

"Step 5: Hover over div object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investor_education_what_is_an_etf/div_object_1'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 5-Hover over div object.png')

"Step 6: Click on link investor education -> Navigate to page 'educational content#*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investor_education_what_is_an_etf/link_investor_education'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 6-Click on link investor education - Navigate to page educational content.png')

"Step 7: Click on link six tips to make the most of your rrsp -> Navigate to page 'insights articles#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_educational_content/link_six_tips_to_make_the_most_of_your_rrsp'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 7-Click on link six tips to make the most of your rrsp - Navigate to page insights articles.png')

"Step 8: Click on link rrsp 101 chinese version"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/link_rrsp_101_chinese_version'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 8-Click on link rrsp 101 chinese version.png')

"Step 9: Click on input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/input_email'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 9-Click on input email.png')

"Step 10: Enter input value in input email"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_insights_articles/input_email'), input_email)

WebUI.takeScreenshot(reportLocation + '/TC45/Step 10-Enter input value in input email.png')

"Step 11: Click on user role radio"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/user_role_radio'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 11-Click on user role radio.png')

"Step 12: Click on consent checkbox -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_articles/consent_checkbox'))

WebUI.takeScreenshot(reportLocation + '/TC45/Step 12-Click on consent checkbox - Navigate to page .png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC45-Explore ETF Resources and Educational Content_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}