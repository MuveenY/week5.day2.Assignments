package week5.day2.Assignments;


import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import excelData.ReadExcel;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead extends BaseClass {
	
	@BeforeTest
	public void setFileName() {
		fileName= "CreateLead2";
	}

 @Test(dataProvider = "sendData")

	public void runCreateLead(String firstName, String lastName, String companyName, String phNo) {
		
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		
}
 
 
 
}






