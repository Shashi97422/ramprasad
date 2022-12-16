package practicepackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityPractice {
@Test(groups = "smoke")
public void Sendmsg() {
	System.out.println("Message sent successfully");
}
@Test
public void reciveMsg() {
	System.out.println("Message is recived successfully");
	Assert.fail();
}
@Test(groups = "smoke")
public void faildMessage() {
	System.out.println("Message sended failed");
}
}
