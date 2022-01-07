package tests.tests_demo;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Test2 {


    @DataProvider(name = "provider")
    public static Object [][] dbData() {
        return new Object[][] {
                {"SQL", new Integer(1)},
                {"NOSQL", new Integer(2)}
        };
    }


    @Test (dataProvider = "provider")
    public void test2(String string, int integer) {

        System.out.println("Test 2 " + string + " " + integer);
    }

}
