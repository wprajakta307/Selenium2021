package SeleniumImplementation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleFirstSession {

	public static void main(String[] args) {
		//BranchOne conflict check
		System.setProperty("webdriver.chrome.driver","G:/study/chromedriver_win32/newDivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://seleniumqtpautomation003.000webhostapp.com/final.html");
		//driver.navigate.to("https://www.google.co.in");
		String expectedTitle ="Register page";
		String actualTitle=driver.getTitle();
		WebElement username = driver.findElement(By.name("name"));
		if (actualTitle.equals(expectedTitle)){
				if(CommonComponent.isClickable(username)){
					username.sendKeys("Urjit");
					//System.out.println(driver.getTitle());
				}
				
				
		}
		WebElement password = driver.findElement(By.name("password"));
		if(CommonComponent.isClickable(password)){
			password.sendKeys("Urjit@2308");
		}
		
		WebElement confirmpassword = driver.findElement(By.name("confirmpassword"));
		if(confirmpassword.isDisplayed()){
			if(confirmpassword.isEnabled()){
				confirmpassword.sendKeys("Urjit@2308");
				
			}
		}
		WebElement LoginBtn = driver.findElement(By.linkText("LOGIN"));
		if(LoginBtn.isDisplayed()){
			if(LoginBtn.isEnabled()){
				LoginBtn.click();
				System.out.println(driver.getTitle());
				
			}
		}
	}

}
