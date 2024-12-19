package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import internal.GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

public class enterFinancialInfoAndViewMyPlan {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input userFinancialInfo (userAge)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInfo"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': data['input_userFinancialInfo_internalLabel']]))
        
        "Step 2: Enter input value in input userFinancialInfo (userAge)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInfo"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': data['input_userFinancialInfo_internalLabel_1']]), data['input_userFinancialInfo'])
        
        "Step 3: Click on input userFinancialInfo (userAnnualIncome)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInfo"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': data['input_userFinancialInfo_internalLabel_2']]))
        
        "Step 4: Enter input value in input userFinancialInfo (userAnnualIncome)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInfo"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': data['input_userFinancialInfo_internalLabel_3']]), data['input_userFinancialInfo_1'])
        
        "Step 5: Click on input userFinancialInfo (userRetirementSavings)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInfo"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': data['input_userFinancialInfo_internalLabel_4']]))
        
        "Step 6: Enter input value in input userFinancialInfo (userRetirementSavings)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInfo"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': data['input_userFinancialInfo_internalLabel_5']]), data['input_userFinancialInfo_2'])
        
        "Step 7: Click on main MyPlan"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator/main_MyPlan'))
        
        "Step 8: Click on input userFinancialInfo (userMonthlySavings)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInfo"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': data['input_userFinancialInfo_internalLabel_6']]))
        
        "Step 9: Enter input value in input userFinancialInfo (userMonthlySavings)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInfo"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator/input_userFinancialInfo', ['input_userFinancialInfo_internalLabel': data['input_userFinancialInfo_internalLabel_7']]), data['input_userFinancialInfo_3'])
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_userFinancialInfo'] = testData.getValue('input_userFinancialInfo', rowIndex)
        data['input_userFinancialInfo_1'] = testData.getValue('input_userFinancialInfo_1', rowIndex)
        data['input_userFinancialInfo_2'] = testData.getValue('input_userFinancialInfo_2', rowIndex)
        data['input_userFinancialInfo_3'] = testData.getValue('input_userFinancialInfo_3', rowIndex)
        data['input_userFinancialInfo_internalLabel'] = testData.getValue('input_userFinancialInfo_internalLabel', rowIndex)
        data['input_userFinancialInfo_internalLabel_1'] = testData.getValue('input_userFinancialInfo_internalLabel_1', rowIndex)
        data['input_userFinancialInfo_internalLabel_2'] = testData.getValue('input_userFinancialInfo_internalLabel_2', rowIndex)
        data['input_userFinancialInfo_internalLabel_3'] = testData.getValue('input_userFinancialInfo_internalLabel_3', rowIndex)
        data['input_userFinancialInfo_internalLabel_4'] = testData.getValue('input_userFinancialInfo_internalLabel_4', rowIndex)
        data['input_userFinancialInfo_internalLabel_5'] = testData.getValue('input_userFinancialInfo_internalLabel_5', rowIndex)
        data['input_userFinancialInfo_internalLabel_6'] = testData.getValue('input_userFinancialInfo_internalLabel_6', rowIndex)
        data['input_userFinancialInfo_internalLabel_7'] = testData.getValue('input_userFinancialInfo_internalLabel_7', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_userFinancialInfo'] = 'default_data'
        data['input_userFinancialInfo_1'] = 'default_data'
        data['input_userFinancialInfo_2'] = 'default_data'
        data['input_userFinancialInfo_3'] = 'default_data'
        data['input_userFinancialInfo_internalLabel'] = 'default_data'
        data['input_userFinancialInfo_internalLabel_1'] = 'default_data'
        data['input_userFinancialInfo_internalLabel_2'] = 'default_data'
        data['input_userFinancialInfo_internalLabel_3'] = 'default_data'
        data['input_userFinancialInfo_internalLabel_4'] = 'default_data'
        data['input_userFinancialInfo_internalLabel_5'] = 'default_data'
        data['input_userFinancialInfo_internalLabel_6'] = 'default_data'
        data['input_userFinancialInfo_internalLabel_7'] = 'default_data'
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

