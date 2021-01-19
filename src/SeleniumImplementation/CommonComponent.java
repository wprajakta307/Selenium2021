package SeleniumImplementation;

import org.openqa.selenium.WebElement;

public class CommonComponent {
	public static boolean isPresent(WebElement element){
		Boolean isPresent=false;
		if(element.isDisplayed()){
			isPresent=true;
			return isPresent;
		}
		return isPresent;
		}
	public static boolean isClickable(WebElement element){
		Boolean isClickable=false;
		Boolean isPre=CommonComponent.isPresent(element);
		if(isPre==true){
			if(element.isEnabled()){
				isClickable=true;
				return isClickable;
			}
		}
		return isClickable;
		
	}

}
