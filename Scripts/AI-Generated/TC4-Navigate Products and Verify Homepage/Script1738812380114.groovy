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

"Step 2: Click on md ETFs"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_ETFs'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 2-Click on md ETFs.png')

"Step 3: Click on md ManagedPortfolios"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_ManagedPortfolios'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 3-Click on md ManagedPortfolios.png')

"Step 4: Click on md ETFs2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_ETFs2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 4-Click on md ETFs2.png')

"Step 5: Click on md ManagedPortfolios2"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_ManagedPortfolios2'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 5-Click on md ManagedPortfolios2.png')

"Step 6: Click on md ManagedPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_ManagedPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 6-Click on md ManagedPortfolios3.png')

"Step 7: Click on md ManagedPortfolios4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_ManagedPortfolios4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 7-Click on md ManagedPortfolios4.png')

"Step 8: Click on md ManagedPortfolios3"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_ManagedPortfolios3'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 8-Click on md ManagedPortfolios3.png')

"Step 9: Click on md ManagedPortfolios4"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_ManagedPortfolios4'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 9-Click on md ManagedPortfolios4.png')

"Step 10: Click on md ClearPathRetirementPortfolios"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/md_ClearPathRetirementPortfolios'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 10-Click on md ClearPathRetirementPortfolios.png')

"Step 11: Click on main Object -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '.*/products/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/Page_product/main_Object'))

WebUI.takeScreenshot(reportLocation + '/TC4/Step 11-Click on main Object - Navigate to page .png')

"Step 12: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC4-Navigate Products and Verify Homepage_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}