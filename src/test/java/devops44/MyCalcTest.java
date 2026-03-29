package devops44;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalcTest {
	
	MyCalc calc = new MyCalc();

	@Test
	public void test() {
		
		assertEquals(15, calc.sum(10, 5));

	}

}
