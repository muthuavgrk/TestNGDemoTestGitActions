import org.testng.ITestListener;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

 
public class TestFile1 {

	@Test(dataProvider = "testData")
	public void testcase1(String name) {
		System.out.println("test case 1 "+name);
	}
	
	@DataProvider
	public Object[] testData() {
		return new String[] {"hi","there","how","are","you"};
	}
	
	@Test
	public void testcase2() {
		System.out.println("test case 2");
	}
	
	@Test
	public void testcase3() {
		System.out.println("test case 3");
	}
	@Test
	public void testcase4() {
		System.out.println("test case 4");
	}
	@Test
	public void testcase5() {
		System.out.println("test case 5");
	}
	@Test
	public void testcase6() {
		System.out.println("test case 6");
	}
	
	
	
}
