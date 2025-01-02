package truetest.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class navigateAndUpdateUserDemographics {
    
    private static def execute_functional_method(Map data) {
        
        "Step 1: Click on link navigationActions (Next2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationActions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationActions', ['link_navigationActions_nth': data['link_navigationActions_nth']]))
        
        "Step 2: Click on input userDemographics (UserIncomeOther)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userDemographics"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userDemographics', ['input_userDemographics_internalLabel': data['input_userDemographics_internalLabel']]))
        
        "Step 3: Click on input userDemographics (UserIncomeOther)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userDemographics"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userDemographics', ['input_userDemographics_internalLabel': data['input_userDemographics_internalLabel_1']]))
        
        "Step 4: Enter input value in input userDemographics (UserIncomeOther2)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/input_userDemographics"
        WebUI.setText(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/input_userDemographics', ['input_userDemographics_internalLabel': data['input_userDemographics_internalLabel_2']]), data['input_userDemographics'])
        
        "Step 5: Click on link navigationActions (Next)"
        
        // Bind values to the variables in the locators of "AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationActions"
        WebUI.enhancedClick(findTestObject('AI-Generated/Dynamic Objects/Page_calculator_page/link_navigationActions', ['link_navigationActions_nth': data['link_navigationActions_nth_1']]))
    }
    
    private static def execute_with_data_source(String datasource, int rowIndex) {
        TestData testData = findTestData(datasource)
        Map data = [:]
        data['input_userDemographics'] = testData.getValue('input_userDemographics', rowIndex)
        data['input_userDemographics_internalLabel'] = testData.getValue('input_userDemographics_internalLabel', rowIndex)
        data['input_userDemographics_internalLabel_1'] = testData.getValue('input_userDemographics_internalLabel_1', rowIndex)
        data['input_userDemographics_internalLabel_2'] = testData.getValue('input_userDemographics_internalLabel_2', rowIndex)
        data['link_navigationActions_nth'] = testData.getValue('link_navigationActions_nth', rowIndex)
        data['link_navigationActions_nth_1'] = testData.getValue('link_navigationActions_nth_1', rowIndex)
        execute_functional_method(data)
    }
    
    private static def execute_without_data_source() {
        Map data = [:]
        data['input_userDemographics'] = 'default_data'
        data['input_userDemographics_internalLabel'] = 'default_data'
        data['input_userDemographics_internalLabel_1'] = 'default_data'
        data['input_userDemographics_internalLabel_2'] = 'default_data'
        data['link_navigationActions_nth'] = 'default_data'
        data['link_navigationActions_nth_1'] = 'default_data'
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

