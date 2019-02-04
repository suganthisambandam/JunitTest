package firstTest.junitTest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	String message = "Hello World";	
	String message1 = "Hello World hai";	
	   MessageUtil messageUtil = new MessageUtil(message);

	   @Test
	   public void testPrintMessage() {
	      assertEquals(message,messageUtil.printMessage());
	   }
	   
/*	   @Test
	   public void testPrintMessage1() {
	      assertEquals(message1,messageUtil.printMessage());
	   }
*/
}
