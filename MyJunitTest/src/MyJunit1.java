import static org.junit.Assert.fail;

import org.junit.Test;


public class MyJunit1 {
	@Test
	public void Test1(){
		System.out.println("Message Test 1");
	}
	@Test
	public void Test2(){
		System.out.println("Message Test 2");
		fail("Fail test");
	}
	@Test
	public void Test3(){
		System.out.println("Message Test 3");
	}
}
