package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.custom.TrueTestScripts

public class navigateAndInputFinancialInvestmentData {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link navigation"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation', ['link_navigation_nth': data['link_navigation_nth']]))
        
        "Step 2: Click on input userFinancialData"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData', ['input_userFinancialData_internalLabel': data['input_userFinancialData_internalLabel']]))
        
        "Step 3: Enter input value in input userFinancialData"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData', ['input_userFinancialData_internalLabel': data['input_userFinancialData_internalLabel_1']]), data['input_userFinancialData'])
        
        "Step 4: Click on link navigation"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation', ['link_navigation_nth': data['link_navigation_nth_1']]))
        
        "Step 5: Adjust div UserInvestmentStyle by input value"
        
        TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Page_calculator_page/div_UserInvestmentStyle'), Double.valueOf(data['div_UserInvestmentStyle']))
        
        "Step 6: Click on link navigation"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigation', ['link_navigation_nth': data['link_navigation_nth_2']]))
        
        "Step 7: Adjust div userRequiredIncome by input value"
        
        TrueTestScripts.setSliderValue(findTestObject('AI-Generated/Page_calculator_page/div_userRequiredIncome'), Double.valueOf(data['div_userRequiredIncome']))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['div_UserInvestmentStyle'] = testData.getValue('div_UserInvestmentStyle', rowIndex)
        data['div_userRequiredIncome'] = testData.getValue('div_userRequiredIncome', rowIndex)
        data['input_userFinancialData'] = testData.getValue('input_userFinancialData', rowIndex)
        data['input_userFinancialData_internalLabel'] = testData.getValue('input_userFinancialData_internalLabel', rowIndex)
        data['input_userFinancialData_internalLabel_1'] = testData.getValue('input_userFinancialData_internalLabel_1', rowIndex)
        data['link_navigation_nth'] = testData.getValue('link_navigation_nth', rowIndex)
        data['link_navigation_nth_1'] = testData.getValue('link_navigation_nth_1', rowIndex)
        data['link_navigation_nth_2'] = testData.getValue('link_navigation_nth_2', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['div_UserInvestmentStyle'] = 'default_data'
        data['div_userRequiredIncome'] = 'default_data'
        data['input_userFinancialData'] = 'default_data'
        data['input_userFinancialData_internalLabel'] = 'default_data'
        data['input_userFinancialData_internalLabel_1'] = 'default_data'
        data['link_navigation_nth'] = 'default_data'
        data['link_navigation_nth_1'] = 'default_data'
        data['link_navigation_nth_2'] = 'default_data'
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

