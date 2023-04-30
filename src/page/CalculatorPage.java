package page;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class CalculatorPage extends BasePage {

    //Attributes
    By numberZeroClick= By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_00");
    By numberOneClick= By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_01");
    By numberTwoClick= By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02");
    By numberThreeClick= By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_03");
    By numberFourClick= By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_04");
    By numberFiveClick= By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05");
    By numberSixClick= By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_06");
    By numberSevenClick= By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_07");
    By numberEightClick= By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_08");
    By numberNineClick= By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_09");
    By additionClick= By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add");
    By subtractionClick= By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_sub");
    By multiplicationClick= By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_mul");
    By divisionClick= By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_div");
    By clearResultScreenClick= By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_clear");
    By resultScreen= By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula");
    By equalClick= By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal");
    By pointClick= By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_dot");

    //Constructor
    public CalculatorPage(AndroidDriver driver) {
        super(driver);
    }


    //Functions
    public CalculatorPage clickOnNumberOne(){
        click(numberOneClick);
        return this;
    }
    public CalculatorPage clickOnNumberTwo(){
        click(numberTwoClick);
        return this;
    }
    public CalculatorPage clickOnNumberThree(){
        click(numberThreeClick);
        return this;
    }
    public CalculatorPage clickOnNumberFour(){
        click(numberFourClick);
        return this;
    }
    public CalculatorPage clickOnNumberFive(){
        click(numberFiveClick);
        return this;
    }
    public CalculatorPage clickOnNumberSix(){
        click(numberSixClick);
        return this;
    }
    public CalculatorPage clickOnNumberSeven(){
        click(numberSevenClick);
        return this;
    }
    public CalculatorPage clickOnNumberEight(){
        click(numberEightClick);
        return this;
    }
    public CalculatorPage clickOnNumberNine(){
        click(numberNineClick);
        return this;
    }
    public CalculatorPage clickOnNumberZero(){
        click(numberZeroClick);
        return this;
    }
    public CalculatorPage clickOnAddition(){
        click(additionClick);
        return this;
    }
    public CalculatorPage clickOnMultiplication(){
        click(multiplicationClick);
        return this;
    }
    public CalculatorPage clickOnSubtraction(){
        click(subtractionClick);
        return this;
    }
    public CalculatorPage clickOnDivision(){
        click(divisionClick);
        return this;
    }
    public CalculatorPage clickOnEqual(){
        click(equalClick);
        return this;
    }
    public CalculatorPage clickOnPoint(){
        click(pointClick);
        return this;
    }
    public CalculatorPage clickOnClearResultScreen(){
        click(clearResultScreenClick);
        return this;
    }
    public String showResult(){
        return getText(resultScreen);
    }

}
