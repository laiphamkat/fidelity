package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class navigateAndEnterUserFinancialData {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link navigation (Next2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation', ['link_navigation_nth': data['link_navigation_nth']]))
        
        "Step 2: Click on input userFinancialData (UserIncomeOther)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData', ['input_userFinancialData_internalLabel': data['input_userFinancialData_internalLabel']]))
        
        "Step 3: Click on input userFinancialData (UserIncomeOther)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData', ['input_userFinancialData_internalLabel': data['input_userFinancialData_internalLabel_1']]))
        
        "Step 4: Enter input value in input userFinancialData (UserIncomeOther)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData', ['input_userFinancialData_internalLabel': data['input_userFinancialData_internalLabel_2']]), data['input_userFinancialData'])
        
        "Step 5: Click on link navigation (Next)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation', ['link_navigation_nth': data['link_navigation_nth_1']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_userFinancialData'] = testData.getValue('input_userFinancialData', rowIndex)
        data['input_userFinancialData_internalLabel'] = testData.getValue('input_userFinancialData_internalLabel', rowIndex)
        data['input_userFinancialData_internalLabel_1'] = testData.getValue('input_userFinancialData_internalLabel_1', rowIndex)
        data['input_userFinancialData_internalLabel_2'] = testData.getValue('input_userFinancialData_internalLabel_2', rowIndex)
        data['link_navigation_nth'] = testData.getValue('link_navigation_nth', rowIndex)
        data['link_navigation_nth_1'] = testData.getValue('link_navigation_nth_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_userFinancialData'] = 'default_data'
        data['input_userFinancialData_internalLabel'] = 'default_data'
        data['input_userFinancialData_internalLabel_1'] = 'default_data'
        data['input_userFinancialData_internalLabel_2'] = 'default_data'
        data['link_navigation_nth'] = 'default_data'
        data['link_navigation_nth_1'] = 'default_data'
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

