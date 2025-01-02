package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class fillUserDemographicsAndSavings {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on input userDemographics (UserAge)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userDemographics"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userDemographics', ['input_userDemographics_internalLabel': data['input_userDemographics_internalLabel']]))
        
        "Step 2: Enter input value in input userDemographics (UserAge2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userDemographics"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userDemographics', ['input_userDemographics_internalLabel': data['input_userDemographics_internalLabel_1']]), data['input_userDemographics'])
        
        "Step 3: Click on input userSavings (UserAnnualIncome)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userSavings"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userSavings', ['input_userSavings_internalLabel': data['input_userSavings_internalLabel']]))
        
        "Step 4: Enter input value in input userSavings (UserAnnualIncome2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userSavings"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userSavings', ['input_userSavings_internalLabel': data['input_userSavings_internalLabel_1']]), data['input_userSavings'])
        
        "Step 5: Click on input userSavings (UserRetirementSavings)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userSavings"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userSavings', ['input_userSavings_internalLabel': data['input_userSavings_internalLabel_2']]))
        
        "Step 6: Enter input value in input userSavings (UserRetirementSavings2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userSavings"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userSavings', ['input_userSavings_internalLabel': data['input_userSavings_internalLabel_3']]), data['input_userSavings_1'])
        
        "Step 7: Click on main MyPlan"
        
        WebUI.enhancedClick(findTestObject('AI-Generated/Page_calculator_page/main_MyPlan'))
        
        "Step 8: Click on input userSavings (UserMonthlySavings)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userSavings"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userSavings', ['input_userSavings_internalLabel': data['input_userSavings_internalLabel_4']]))
        
        "Step 9: Enter input value in input userSavings (UserMonthlySavings2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userSavings"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userSavings', ['input_userSavings_internalLabel': data['input_userSavings_internalLabel_5']]), data['input_userSavings_2'])
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_userDemographics'] = testData.getValue('input_userDemographics', rowIndex)
        data['input_userDemographics_internalLabel'] = testData.getValue('input_userDemographics_internalLabel', rowIndex)
        data['input_userDemographics_internalLabel_1'] = testData.getValue('input_userDemographics_internalLabel_1', rowIndex)
        data['input_userSavings'] = testData.getValue('input_userSavings', rowIndex)
        data['input_userSavings_1'] = testData.getValue('input_userSavings_1', rowIndex)
        data['input_userSavings_2'] = testData.getValue('input_userSavings_2', rowIndex)
        data['input_userSavings_internalLabel'] = testData.getValue('input_userSavings_internalLabel', rowIndex)
        data['input_userSavings_internalLabel_1'] = testData.getValue('input_userSavings_internalLabel_1', rowIndex)
        data['input_userSavings_internalLabel_2'] = testData.getValue('input_userSavings_internalLabel_2', rowIndex)
        data['input_userSavings_internalLabel_3'] = testData.getValue('input_userSavings_internalLabel_3', rowIndex)
        data['input_userSavings_internalLabel_4'] = testData.getValue('input_userSavings_internalLabel_4', rowIndex)
        data['input_userSavings_internalLabel_5'] = testData.getValue('input_userSavings_internalLabel_5', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_userDemographics'] = 'default_data'
        data['input_userDemographics_internalLabel'] = 'default_data'
        data['input_userDemographics_internalLabel_1'] = 'default_data'
        data['input_userSavings'] = 'default_data'
        data['input_userSavings_1'] = 'default_data'
        data['input_userSavings_2'] = 'default_data'
        data['input_userSavings_internalLabel'] = 'default_data'
        data['input_userSavings_internalLabel_1'] = 'default_data'
        data['input_userSavings_internalLabel_2'] = 'default_data'
        data['input_userSavings_internalLabel_3'] = 'default_data'
        data['input_userSavings_internalLabel_4'] = 'default_data'
        data['input_userSavings_internalLabel_5'] = 'default_data'
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

