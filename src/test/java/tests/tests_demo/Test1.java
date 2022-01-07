package tests.tests_demo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class Test1 {


       @Parameters({"string"})
    @Test (groups = {"smokeTest"})
    public void test1(String string) {
        System.out.println("Test 1 smoke " + string);
    }


    @Test (groups = {"regress"})
    public void test2() {
        System.out.println("Test 1 smoke1 + regress");
    }


    @Test (groups = {"smokeTest", "regress"})
    public void test3() {
        System.out.println("Test 1 smoke2 + regress");
    }

}
