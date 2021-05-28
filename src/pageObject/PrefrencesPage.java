package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PrefrencesPage {

	public PrefrencesPage(AppiumDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(id = "android:id/checkbox")
	public WebElement EntryCheckbox;

	@AndroidFindBy(xpath = "\"(//android.widget.RelativeLayout)[2]\"")
	public WebElement RelativeLayout;
}
