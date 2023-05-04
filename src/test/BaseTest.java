package test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.w3c.dom.Document;
import page.CalculatorPage;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    //Attributes
    CalculatorPage calculatorPage;
    public static AndroidDriver driver;
    static ExtentReports extent;
    static ExtentTest myTests;
    private static String reportFilePath ="C:/Users/USER/IdeaProjects/appiumTest/reports/report.html";
    private String img= "C:/Users/USER/IdeaProjects/appiumTest/screenshot";
    private double firstNumber= Double.parseDouble(readFromFile("firstNumber"));
    private double secondNumber= Double.parseDouble(readFromFile("secondNumber"));


    //Constructor
    public BaseTest() throws Exception {
    }

    //Functions

    public double getFirstNumber() {
        return firstNumber;
    }
    public double getSecondNumber() {
        return secondNumber;
    }
    public String getImg() {
        return img;
    }

    //screenShot
    public String takeScreenShot(String imagesPate){
        TakesScreenshot takesScreenshot= (TakesScreenshot) driver;
        File screenShotFile= takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destinationFile= new File(imagesPate+".png");
        try{
            FileUtils.copyFile(screenShotFile, destinationFile);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return  imagesPate+".png";
    }
    //Data from xml file
    public static String readFromFile(String data) throws Exception{

        File xmlFile= new File("C:/Users/USER/IdeaProjects/appiumTest/src/data/text.xml");
        DocumentBuilderFactory dbFactory= DocumentBuilderFactory.newInstance();
        DocumentBuilder db= dbFactory.newDocumentBuilder();
        Document doc= db.parse(xmlFile);
        doc.getDocumentElement().normalize();

        return doc.getElementsByTagName(data).item(0).getTextContent();
    }



    //opening the application of calculator
    @BeforeClass
    public static void setup() throws IOException {
        DesiredCapabilities capabilities= new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Android Device");
        capabilities.setCapability("appPackage", "com.sec.android.app.popupcalculator");//com.android.chrome
        capabilities.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");//com.google.android.apps.chrome.Main
        capabilities.setCapability("newCommandTimeout", 120);
        capabilities.setCapability("unicodekeyboard", true);
        capabilities.setCapability("resetkeyboard", true);
        driver= new  AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub/"), capabilities);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        extent = new ExtentReports(reportFilePath);
        myTests = extent.startTest("calculatorTest");

    }
    //clear the calculator screen
    @Before
    public void clearScreen(){
        calculatorPage= new CalculatorPage(driver);
        calculatorPage.clickOnClearResultScreen();
    }
    @After
    public void afterTest(){
        extent.endTest(myTests);
    }
    @AfterClass
    public static void closeTests(){
        driver.quit();
        extent.flush();
    }

    //Casting the xml file Data to calculator clicks
    public CalculatorPage castingNumbers(String num){

        switch (num) {
            case "1":
                return calculatorPage.clickOnNumberOne();
            case "2":
                return calculatorPage.clickOnNumberTwo();
            case "3":
                return calculatorPage.clickOnNumberThree();
            case "4":
                return calculatorPage.clickOnNumberFour();
            case "5":
                return calculatorPage.clickOnNumberFive();
            case "6":
                return calculatorPage.clickOnNumberSix();
            case "7":
                return calculatorPage.clickOnNumberSeven();
            case "8":
                return calculatorPage.clickOnNumberEight();
            case "9":
                return calculatorPage.clickOnNumberNine();
            case "0":
                return calculatorPage.clickOnNumberZero();
            case ".":
                return calculatorPage.clickOnPoint();
            case "-":
                return calculatorPage.clickOnSubtraction();
            default:
                return null;
        }

    }
    //Pressing in the calculator on the number that appears in the file
    public void clickInCalculate(String inputFromFile){
        String[] strArray;
        strArray= inputFromFile.split("");
        for (int i= 0; i<strArray.length; i++){
            castingNumbers(strArray[i]);

        }

    }


    }
