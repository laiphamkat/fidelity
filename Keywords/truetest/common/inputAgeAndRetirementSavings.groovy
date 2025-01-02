package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class inputAgeAndRetirementSavings {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on textbox age input"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/textbox_age_input'))
        
        "Step 2: Enter input value in textbox age input2"
        
        WebUI.setText(findTestObject('AI-Generated/Page_calculator_page/textbox_age_input'), data['textbox_age_input2'])
        
        "Step 3: Click on input retirementSavings (AnnualIncome)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_retirementSavings"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_retirementSavings', ['input_retirementSavings_internalLabel': data['input_retirementSavings_internalLabel']]))
        
        "Step 4: Enter input value in input retirementSavings (AnnualIncome2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_retirementSavings"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_retirementSavings', ['input_retirementSavings_internalLabel': data['input_retirementSavings_internalLabel_1']]), data['input_retirementSavings'])
        
        "Step 5: Click on input retirementSavings (RetirementSavings)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_retirementSavings"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_retirementSavings', ['input_retirementSavings_internalLabel': data['input_retirementSavings_internalLabel_2']]))
        
        "Step 6: Enter input value in input retirementSavings (RetirementSavings2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_retirementSavings"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_retirementSavings', ['input_retirementSavings_internalLabel': data['input_retirementSavings_internalLabel_3']]), data['input_retirementSavings_1'])
        
        "Step 7: Click on main MyPlan"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/main_MyPlan'))
        
        "Step 8: Click on input retirementSavings (MonthlySavings)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_retirementSavings"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_retirementSavings', ['input_retirementSavings_internalLabel': data['input_retirementSavings_internalLabel_4']]))
        
        "Step 9: Enter input value in input retirementSavings (MonthlySavings2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_retirementSavings"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_retirementSavings', ['input_retirementSavings_internalLabel': data['input_retirementSavings_internalLabel_5']]), data['input_retirementSavings_2'])
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_retirementSavings'] = testData.getValue('input_retirementSavings', rowIndex)
        data['input_retirementSavings_1'] = testData.getValue('input_retirementSavings_1', rowIndex)
        data['input_retirementSavings_2'] = testData.getValue('input_retirementSavings_2', rowIndex)
        data['input_retirementSavings_internalLabel'] = testData.getValue('input_retirementSavings_internalLabel', rowIndex)
        data['input_retirementSavings_internalLabel_1'] = testData.getValue('input_retirementSavings_internalLabel_1', rowIndex)
        data['input_retirementSavings_internalLabel_2'] = testData.getValue('input_retirementSavings_internalLabel_2', rowIndex)
        data['input_retirementSavings_internalLabel_3'] = testData.getValue('input_retirementSavings_internalLabel_3', rowIndex)
        data['input_retirementSavings_internalLabel_4'] = testData.getValue('input_retirementSavings_internalLabel_4', rowIndex)
        data['input_retirementSavings_internalLabel_5'] = testData.getValue('input_retirementSavings_internalLabel_5', rowIndex)
        data['textbox_age_input2'] = testData.getValue('textbox_age_input2', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_retirementSavings'] = 'default_data'
        data['input_retirementSavings_1'] = 'default_data'
        data['input_retirementSavings_2'] = 'default_data'
        data['input_retirementSavings_internalLabel'] = 'default_data'
        data['input_retirementSavings_internalLabel_1'] = 'default_data'
        data['input_retirementSavings_internalLabel_2'] = 'default_data'
        data['input_retirementSavings_internalLabel_3'] = 'default_data'
        data['input_retirementSavings_internalLabel_4'] = 'default_data'
        data['input_retirementSavings_internalLabel_5'] = 'default_data'
        data['textbox_age_input2'] = 'default_data'
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

