package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class inputUserFinancialDataMultipleTimes {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input userFinancialData"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData', ['input_userFinancialData_internalLabel': data['input_userFinancialData_internalLabel']]))
        
        "Step 2: Enter input value in input userFinancialData"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData', ['input_userFinancialData_internalLabel': data['input_userFinancialData_internalLabel_1']]), data['input_userFinancialData'])
        
        "Step 3: Click on input userFinancialData"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData', ['input_userFinancialData_internalLabel': data['input_userFinancialData_internalLabel_2']]))
        
        "Step 4: Enter input value in input userFinancialData"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData', ['input_userFinancialData_internalLabel': data['input_userFinancialData_internalLabel_3']]), data['input_userFinancialData_1'])
        
        "Step 5: Click on input userFinancialData"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData', ['input_userFinancialData_internalLabel': data['input_userFinancialData_internalLabel_4']]))
        
        "Step 6: Enter input value in input userFinancialData"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userFinancialData', ['input_userFinancialData_internalLabel': data['input_userFinancialData_internalLabel_5']]), data['input_userFinancialData_2'])
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_userFinancialData'] = testData.getValue('input_userFinancialData', rowIndex)
        data['input_userFinancialData_1'] = testData.getValue('input_userFinancialData_1', rowIndex)
        data['input_userFinancialData_2'] = testData.getValue('input_userFinancialData_2', rowIndex)
        data['input_userFinancialData_internalLabel'] = testData.getValue('input_userFinancialData_internalLabel', rowIndex)
        data['input_userFinancialData_internalLabel_1'] = testData.getValue('input_userFinancialData_internalLabel_1', rowIndex)
        data['input_userFinancialData_internalLabel_2'] = testData.getValue('input_userFinancialData_internalLabel_2', rowIndex)
        data['input_userFinancialData_internalLabel_3'] = testData.getValue('input_userFinancialData_internalLabel_3', rowIndex)
        data['input_userFinancialData_internalLabel_4'] = testData.getValue('input_userFinancialData_internalLabel_4', rowIndex)
        data['input_userFinancialData_internalLabel_5'] = testData.getValue('input_userFinancialData_internalLabel_5', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_userFinancialData'] = 'default_data'
        data['input_userFinancialData_1'] = 'default_data'
        data['input_userFinancialData_2'] = 'default_data'
        data['input_userFinancialData_internalLabel'] = 'default_data'
        data['input_userFinancialData_internalLabel_1'] = 'default_data'
        data['input_userFinancialData_internalLabel_2'] = 'default_data'
        data['input_userFinancialData_internalLabel_3'] = 'default_data'
        data['input_userFinancialData_internalLabel_4'] = 'default_data'
        data['input_userFinancialData_internalLabel_5'] = 'default_data'
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

