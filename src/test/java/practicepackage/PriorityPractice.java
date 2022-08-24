package practicepackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityPractice {
@Test(dependsOnMethods = "reciveMsg")
public void Sendmsg() {
	System.out.println("Message sent successfully");
}
@Test
public void reciveMsg() {
	System.out.println("Message is recived successfully");
	Assert.fail();
}
@Test(dependsOnMethods = "Sendmsg")
public void faildMessage() {
	System.out.println("Message sended failed");
}
}
