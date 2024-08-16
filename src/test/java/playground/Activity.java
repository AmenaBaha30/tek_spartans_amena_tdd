package playground;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Activity {
        @Test(dataProvider = "addingName")
        public void testAdding(String firstName, String lastName, String expectedFullName) {
            String actualFullName = formatFullName(firstName, lastName);
            Assert.assertEquals(actualFullName, expectedFullName);
        }

        @DataProvider(name = "addingName")
        public static Object[][] addingName() {
            return new Object[][]{
                    {"Amena", "Baha", "BAHA, AMENA"},
                    {"Ayesha", "Zubaida", "Javid, Manizha"}
            };
        }

        private String formatFullName(String firstName, String lastName) {
            return lastName.toUpperCase() + ", " + firstName;
        }
}
