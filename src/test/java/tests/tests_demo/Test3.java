package tests.tests_demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 {

    // * Повторяем запуск теста при неудачном результате (Retry.class)
    @Test(retryAnalyzer = Retry.class)
    public void test1() {
        System.out.println("Test 1");
        Assert.fail("Error !");
    }


    // * test2 тест должен выполняться только после test1 (alwaysRun = true - не жесткая зависимость)
    @Test(dependsOnMethods = {"test1"}, alwaysRun = true)
    public void test2() {
        System.out.println("Test 2");
    }
}
