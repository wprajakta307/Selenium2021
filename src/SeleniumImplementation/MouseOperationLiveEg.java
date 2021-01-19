package SeleniumImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperationLiveEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/study/chromedriver_win32/newDivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://nseindia.com");
		WebElement investLink=driver.findElement(By.linkText("INVEST"));
		Actions actionPerform=new Actions(driver);
		actionPerform.moveToElement(investLink).perform();
		WebElement dropdownitemINVEST=driver.findElement(By.className("nav-link"));
		dropdownitemINVEST.click();
	}

}
