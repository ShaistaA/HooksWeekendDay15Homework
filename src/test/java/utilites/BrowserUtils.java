package utilites;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilites.Driver;

public class BrowserUtils {
	Actions action;
	WebDriverWait wait;
	
	public void waitUntilElementVisible(WebElement element) {
	 wait = new WebDriverWait(Driver.getDriver(), 5);
	 wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	
	public void actionsSendKeys(WebElement element, String text) {
		action = new Actions(Driver.getDriver());
		action.sendKeys(element, text).build().perform();
	}
	
	public void actionsSendKeys() {
		action = new Actions(Driver.getDriver());
		action.sendKeys(Keys.CONTROL + "a").build().perform();
		action.sendKeys(Keys.DELETE).build().perform();
	}
}
