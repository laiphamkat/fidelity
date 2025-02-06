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

WebUI.takeScreenshot(reportLocation + '/TC11/Step 2-Click on link etfOverview ETFsOverview - Navigate to page investment etfs.png')

"Step 3: Click on link ETFResources -> Navigate to page 'insights library#*/*/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_investment_etfs/link_ETFResources'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 3-Click on link ETFResources - Navigate to page insights library.png')

"Step 4: Click on button wellnessPodcasts (Podcasts)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_insights_library/button_wellnessPodcasts"
WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_insights_library/button_wellnessPodcasts', ['button_wellnessPodcasts_nthChild': button_wellnessPodcasts_nthChild, 'button_wellnessPodcasts_class': button_wellnessPodcasts_class, 'button_wellnessPodcasts_internalRoleCheckboxName': button_wellnessPodcasts_internalRoleCheckboxName]))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 4-Click on button wellnessPodcasts Podcasts.png')

"Step 5: Click on button ApplyFilters"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_library/button_ApplyFilters'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 5-Click on button ApplyFilters.png')

"Step 6: Click on link AboutUs -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/.*/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_insights_library/link_AboutUs'))

WebUI.takeScreenshot(reportLocation + '/TC11/Step 6-Click on link AboutUs - Navigate to page .png')

"Step 7: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC11-Access ETF Resources and Verify Homepage_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}