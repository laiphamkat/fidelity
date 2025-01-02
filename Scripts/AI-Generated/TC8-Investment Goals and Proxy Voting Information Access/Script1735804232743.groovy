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

"Step 2: Click on link welcomeMessage (WelcomeToFidelity) -> Navigate to page 'homepage#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investment_finder/link_welcomeMessage'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 2-Click on link welcomeMessage WelcomeToFidelity - Navigate to page homepage.png')

"Step 3: Click on investmentGoalsLink -> Navigate to page 'investor education investing goals#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/investmentGoalsLink'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 3-Click on investmentGoalsLink - Navigate to page investor education investing goals.png')

"Step 4: Hover over link Retirement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investor_education_investing_goals/link_Retirement'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 4-Hover over link Retirement.png')

"Step 5: Click on button viewAllGoals (ViewAllRetirement) -> Navigate to page 'investing goals#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_investor_education_investing_goals/button_viewAllGoals"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investor_education_investing_goals/button_viewAllGoals', ['button_viewAllGoals_class': button_viewAllGoals_class]))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 5-Click on button viewAllGoals ViewAllRetirement - Navigate to page investing goals.png')

"Step 6: Click on proxyVotingLink -> Navigate to page 'generic proxy#*/proxy'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investing_goals/proxyVotingLink'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 6-Click on proxyVotingLink - Navigate to page generic proxyproxy.png')

"Step 7: Click on article Generic"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/article_Generic'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 7-Click on article Generic.png')

"Step 8: Click on article Generic"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/article_Generic'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 8-Click on article Generic.png')

"Step 9: Click on div Core"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/div_Core'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 9-Click on div Core.png')

"Step 10: Click on article Generic"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/article_Generic'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 10-Click on article Generic.png')

"Step 11: Click on div GuidelinesGlossary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/div_GuidelinesGlossary'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 11-Click on div GuidelinesGlossary.png')

"Step 12: Click on div Core"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/div_Core'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 12-Click on div Core.png')

"Step 13: Click on item Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/item_Search'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 13-Click on item Search.png')

"Step 14: Click on searchButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/searchButton'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 14-Click on searchButton.png')

"Step 15: Click on searchInputField"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/searchInputField'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 15-Click on searchInputField.png')

"Step 16: Enter input value in searchInputField2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_generic_proxy/searchInputField'), searchInputField2)

WebUI.takeScreenshot(reportLocation + '/TC8/Step 16-Enter input value in searchInputField2.png')

"Step 17: Click on div CloseSubmitSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/div_CloseSubmitSearch'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 17-Click on div CloseSubmitSearch.png')

"Step 18: Click on closeButton"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/closeButton'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 18-Click on closeButton.png')

"Step 19: Click on article Generic -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/article_Generic'))

WebUI.takeScreenshot(reportLocation + '/TC8/Step 19-Click on article Generic - Navigate to page .png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC8-Investment Goals and Proxy Voting Information Access_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}