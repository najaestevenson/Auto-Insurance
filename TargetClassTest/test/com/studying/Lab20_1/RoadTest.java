package test.com.studying.Lab20_1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RoadTest {
	Road interstate;
	Interstate i;
	Road route;
	String rd;

	@Before
	public void setUp() {
		rd = "I-84";
		
		i= new Interstate();
		interstate =new Interstate();
		
		route = new Route();
	}

	@Test
	public void rdNumTest() {

		String expected = "EW";
		i.setOrientation(20);
		String actual = i.getOrientation();
		
		assertEquals(expected, actual);

		
		interstate.setOrientation(35);
		String expected1 = "NS";
		String actual1 = interstate.getOrientation();

		assertEquals(expected1, actual1);

	}

	@Test
	public void locationTypeTest() {
		String expected = "Interstate";
		interstate.setRoadType("I");
		String actual = interstate.getRoadType();
		
		assertEquals(expected, actual);
		
	}
	@Test
	public void genLocationTest(){
		String expected = "E";
		String actual = interstate.parseRoad(rd);
		
		assertEquals(expected, actual);

	}

}
