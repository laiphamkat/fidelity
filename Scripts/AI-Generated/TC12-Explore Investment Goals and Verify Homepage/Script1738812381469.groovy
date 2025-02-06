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

"Step 1: Navigate to */products/*"

TrueTestScripts.navigate("${GlobalVariable.path_param_1}/products/${GlobalVariable.products_id}")

"Step 2: Click on link welcomeMessage (WelcomeToFidelity) -> Navigate to page 'homepage#*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_product/link_welcomeMessage'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 2-Click on link welcomeMessage WelcomeToFidelity - Navigate to page homepage.png')

"Step 3: Click on link WhatAreMyInvestmentGoals -> Navigate to page 'investor education investing goals#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_homepage/link_WhatAreMyInvestmentGoals'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 3-Click on link WhatAreMyInvestmentGoals - Navigate to page investor education investing goals.png')

"Step 4: Hover over link Retirement"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.mouseOver(findTestObject('AI-Generated/Page_investor_education_investing_goals/link_Retirement'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 4-Hover over link Retirement.png')

"Step 5: Click on button viewAllRetirementOptions (ViewAllRetirement) -> Navigate to page 'investing goals#*/*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_investor_education_investing_goals/button_viewAllRetirementOptions"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_investor_education_investing_goals/button_viewAllRetirementOptions', ['button_viewAllRetirementOptions_class': button_viewAllRetirementOptions_class]))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 5-Click on button viewAllRetirementOptions ViewAllRetirement - Navigate to page investing goals.png')

"Step 6: Click on link ProxyVoting -> Navigate to page 'generic proxy#*/proxy'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investing_goals/link_ProxyVoting'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 6-Click on link ProxyVoting - Navigate to page generic proxyproxy.png')

"Step 7: Click on article object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/article_object'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 7-Click on article object.png')

"Step 8: Click on article object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/article_object'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 8-Click on article object.png')

"Step 9: Click on div core"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/div_core'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 9-Click on div core.png')

"Step 10: Click on article object"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/article_object'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 10-Click on article object.png')

"Step 11: Click on div GuidelinesGlossary"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/div_GuidelinesGlossary'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 11-Click on div GuidelinesGlossary.png')

"Step 12: Click on div core"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/div_core'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 12-Click on div core.png')

"Step 13: Click on item Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/item_Search'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 13-Click on item Search.png')

"Step 14: Click on link Search"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/link_Search'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 14-Click on link Search.png')

"Step 15: Click on input SearchText"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/input_SearchText'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 15-Click on input SearchText.png')

"Step 16: Enter input value in input SearchText"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.setText(findTestObject('AI-Generated/Page_generic_proxy/input_SearchText'), input_SearchText)

WebUI.takeScreenshot(reportLocation + '/TC12/Step 16-Enter input value in input SearchText.png')

"Step 17: Click on div CloseSubmitSearch"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/div_CloseSubmitSearch'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 17-Click on div CloseSubmitSearch.png')

"Step 18: Click on button Close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/button_Close'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 18-Click on button Close.png')

"Step 19: Click on article object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/proxy?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_generic_proxy/article_object'))

WebUI.takeScreenshot(reportLocation + '/TC12/Step 19-Click on article object - Navigate to page .png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC12-Explore Investment Goals and Verify Homepage_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}