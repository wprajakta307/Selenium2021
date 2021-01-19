package SeleniumImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAndListBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","G:/study/chromedriver_win32/newDivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://seleniumqtpautomation003.000webhostapp.com/final.html");
		WebElement loginBtn = driver.findElement(By.linkText("LOGIN"));
		loginBtn.click();
		
		WebElement BirthDay = driver.findElement(By.name("Birthday_day"));
		WebElement BirthMonth = driver.findElement(By.name("Birthday_Month"));
		WebElement BirthYear = driver.findElement(By.name("Birthday_Year"));
		
		Select BD=new Select(BirthDay);
		Select BM=new Select(BirthMonth);
		Select BY=new Select(BirthYear);
		
		BD.selectByIndex(30);
		BM.selectByValue("July");
		BY.selectByVisibleText("1991");
	}

}
