package Practice_Myself;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.*;

public class TestNG_Demo {
@BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test");
    }
    @BeforeClass
    public void beforeClass(){
    System.out.println("Before class");

    }
    @BeforeMethod
    public void setup(){

        System.out.println("before method");
    }
    @Test
    public void test1(){

        String word1="java";
        String word2="java";
        System.out.println("Test1");
        Assert.assertEquals(word1,word2);

    }

    @Test
    public void test2(){
        String word1="javascript";
        String word2="javascript";
        System.out.println("Test2");
        Assert.assertEquals(word1,word2);
    }

    @Test
    public void test3(){
        System.out.println("Test3");
        Assert.assertTrue(15>10);
        throw new SkipException("just Skipped");
    }


    @AfterMethod
    public void teardown(){
        System.out.println("After method");
    }
    @AfterClass
    public void afterClass(){
    System.out.println("After class");
}
    @AfterTest
    public void afterTest(){
        System.out.println("After test");
    }
    @AfterSuite
    public void afterSuite(){

        System.out.println("After suite");
    }

}
