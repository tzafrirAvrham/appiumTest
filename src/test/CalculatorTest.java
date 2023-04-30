package test;

import com.relevantcodes.extentreports.LogStatus;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest extends BaseTest {


    //Constructor
    public CalculatorTest() throws Exception {
    }

    @Test
    public void test01_addition() throws Exception {

        myTests= extent.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
        clickInCalculate(readFromFile("firstNumber"));
        calculatorPage.clickOnAddition();
        clickInCalculate(readFromFile("secondNumber"));
        calculatorPage.clickOnEqual();

        double actualResult= Double.parseDouble(calculatorPage.showResult());
        double exceptedResult= getFirstNumber()+getSecondNumber();

        try{
            assertEquals(exceptedResult,actualResult, 0.0001);
            myTests.log(LogStatus.PASS, "correct result");
        } catch(AssertionError e) {
            myTests.log(LogStatus.FAIL, "the right result is " + actualResult+" and not "+exceptedResult);
            myTests.log(LogStatus.INFO, "screen:" + myTests.addScreenCapture(takeScreenShot(getImg() + "\\" + System.currentTimeMillis())));
        }

        }

    @Test
    public void test02_subtraction() throws Exception {

        myTests= extent.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
        clickInCalculate(readFromFile("firstNumber"));
        calculatorPage.clickOnSubtraction();
        clickInCalculate(readFromFile("secondNumber"));
        calculatorPage.clickOnEqual();

        double actualResult= Double.parseDouble(calculatorPage.showResult());
        double  exceptedResult= getFirstNumber()-getSecondNumber();

        try{
            assertEquals(exceptedResult,actualResult, 0.0001);
            myTests.log(LogStatus.PASS, "correct result");
        } catch(AssertionError e) {
            myTests.log(LogStatus.FAIL, "the right result is " + actualResult+" and not "+exceptedResult);
            myTests.log(LogStatus.INFO, "screen:" + myTests.addScreenCapture(takeScreenShot(getImg() + "\\" + System.currentTimeMillis())));
        }
    }

    @Test
    public void test03_Multiplication() throws Exception {

        myTests= extent.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
        clickInCalculate(readFromFile("firstNumber"));
        calculatorPage.clickOnMultiplication();
        clickInCalculate(readFromFile("secondNumber"));
        calculatorPage.clickOnEqual();

        double actualResult= Double.parseDouble(calculatorPage.showResult());
        double exceptedResult= getFirstNumber()*getSecondNumber();

        try{
            assertEquals(exceptedResult,actualResult, 0.0001);
            myTests.log(LogStatus.PASS, "correct result");
        } catch(AssertionError e) {
            myTests.log(LogStatus.FAIL, "the right result is " + actualResult+" and not "+exceptedResult);
            myTests.log(LogStatus.INFO, "screen:" + myTests.addScreenCapture(takeScreenShot(getImg() + "\\" + System.currentTimeMillis())));
        }
    }

    @Test
    public void test04_division() throws Exception {

        myTests= extent.startTest(Thread.currentThread().getStackTrace()[1].getMethodName());
        clickInCalculate(readFromFile("firstNumber"));
        calculatorPage.clickOnDivision();
        clickInCalculate(readFromFile("secondNumber"));
        calculatorPage.clickOnEqual();

        double actualResult= Double.parseDouble(calculatorPage.showResult());
        double exceptedResult= getFirstNumber()/(double)getSecondNumber();

        try{
            assertEquals(exceptedResult,actualResult, 0.0001);
            myTests.log(LogStatus.PASS, "correct result");
        } catch(AssertionError e) {
            myTests.log(LogStatus.FAIL, "the right result is " + actualResult+" and not "+exceptedResult);
            myTests.log(LogStatus.INFO, "screen:" + myTests.addScreenCapture(takeScreenShot(getImg() + "\\" + System.currentTimeMillis())));
        }

    }
}
