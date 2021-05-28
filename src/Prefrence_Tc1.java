import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageObject.DependenciesPage;
import pageObject.EntryPage;
import pageObject.PrefrencesPage;

public class Prefrence_Tc1 extends Base {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = CapabilitiesDefine();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		EntryPage ep = new EntryPage(driver);
		PrefrencesPage pp = new PrefrencesPage(driver);
		DependenciesPage dp = new DependenciesPage(driver);
		
		ep.Preferences.click();
		ep.PreferencesDependencies.click();
		pp.EntryCheckbox.click();
		pp.RelativeLayout.click();
		dp.editText.sendKeys("Test");
		dp.finalSave.get(1).click();

	}

}
