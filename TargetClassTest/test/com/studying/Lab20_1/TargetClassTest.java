package test.com.studying.Lab20_1;

import static org.junit.Assert.*;



import org.junit.Before;
import org.junit.Test;

public class TargetClassTest {
	CalculateDiscount cd;
	
	@Before
	public void setUp(){
		
		cd = new CalculateDiscount();
	}
	@Test
	public void methodtest() {
		Driver driver = new Driver(18, 20, "Female");
		;
		int expected = 1000;
		int actual = cd.determineCost(driver);
		assertEquals(expected, actual);
				
	}
	@Test
	public void agetest() {
		Driver driver = new Driver(33, 15, "Female");
		int expected = 600;
		int actual = cd.determineCost(driver);
		assertEquals(expected, actual);
}
	@Test
	public void drivExper(){
		Driver driver = new Driver(25, 15, "Male");
		int expected =950;
		int actual = cd.discountByExp(driver);
		assertEquals(expected, actual);
	}
	@Test
	public void femaleDriver(){
		Driver driver = new Driver(33, 19, "Male");
		double expected = 583;
		double actual = cd.genderDiscount(driver);
		assertEquals(expected, actual, .01);
		
	}
	
	@Test
	public void additionalDriverTest(){
		
		cd.addPeople(new Driver(29,19,"Female"));
		cd.addPeople(new Driver(44,20,"Male"));
		cd.addPeople(new Driver(32,17,"Female"));
		cd.addPeople(new Driver(21,18,"Male"));
		
		
		
		double expected = 2559.84;
		double actual = cd.multiDriverDiscount();
		
		assertEquals( expected, actual, .01);
	}
}
