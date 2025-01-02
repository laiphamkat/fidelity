package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class navigateAndInputIncomeLevel {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link navigation (Next)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation', ['link_navigation_nth': data['link_navigation_nth']]))
        
        "Step 2: Click on textbox income level"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/textbox_income_level'))
        
        "Step 3: Click on textbox income level"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/textbox_income_level'))
        
        "Step 4: Enter input value in textbox income level2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/textbox_income_level'), data['textbox_income_level2'])
        
        "Step 5: Click on link navigation (NextStep)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation', ['link_navigation_nth': data['link_navigation_nth_1']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['link_navigation_nth'] = testData.getValue('link_navigation_nth', rowIndex)
        data['link_navigation_nth_1'] = testData.getValue('link_navigation_nth_1', rowIndex)
        data['textbox_income_level2'] = testData.getValue('textbox_income_level2', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['link_navigation_nth'] = 'default_data'
        data['link_navigation_nth_1'] = 'default_data'
        data['textbox_income_level2'] = 'default_data'
        execute_functional_method(data)
    }
    
    public static def execute(String datasource = null, int rowIndex = 1) {
        if (datasource != null) {
            execute_with_data_source(datasource, rowIndex)
        } else {
            execute_without_data_source()
        }
    }
}

