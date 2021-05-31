package tests;

import org.testng.annotations.DataProvider;

public class DataPrClass {
    @DataProvider(name = "dp")
    public Object[][] getTestData(){

        Object[][] data = {{"hyraitesting","hyrai6161"},{"hy@gmd.com","password1"},
                {"ma@gmd.com","password1"},{"mali@gmd.com","password1"}};
        return data;

    }
}
