package Practice22112022;

import org.testng.annotations.Test;

public class createTest {
@Test(groups = "smoke")
public void test1() {
	System.out.println("tester");
	
}
@Test(groups = "regression")
public void test2() {
	System.out.println("test2");
}
}
