package resources.testdata;

import org.testng.annotations.DataProvider;

public class TestData {
    @DataProvider(name = "AddUser")
    public Object[][] addUser() {
        Object[][] data = new Object[][]{
                {"Admin", "Admin", "Paul Collings", "Enable"},
                {"Cassidy.Hope", "ESS", "Cassidy Hope", "Enable"},
                {"Nina.Patel", "Ess", "Nina Patel", "Enable"},
                {"Odis.Adalwin", "Admin", "Odis Adalwin", "Enable"}
        };
        return data;
    }
}
