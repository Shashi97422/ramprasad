package Practice31102022;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ERetailerMart.generalutility.BaseClass;
@Listeners(com.ERetailerMart.generalutility.Implimentationclasslistner.class)
public class screenshots extends BaseClass {
	@Test
public void aaa() {
	driver.get("fb.com");
}
}
