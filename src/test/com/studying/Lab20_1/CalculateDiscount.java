package test.com.studying.Lab20_1;

import java.util.ArrayList;
import java.util.Collection;

class CalculateDiscount {

	
	int currentAge;
	int drivingAge;
	String gender;
	Collection<Driver> driverList = new ArrayList<Driver>();

	public int determineCost(Driver d) {
		int cost = 0;
		if (d.getCurrentAge() <= 25 & d.getCurrentAge() >= 15) {
			cost = 1000;
		} else if (d.getCurrentAge() >= 26 & d.getCurrentAge() <= 30) {
			cost = 800;
		} else if (d.getCurrentAge() >= 31 & d.getCurrentAge() <= 40) {
			cost = 600;
		} else if (d.getCurrentAge() >= 41 & d.getCurrentAge() <= 50) {
			cost = 400;

		} else if (d.getCurrentAge() >= 51 & d.getCurrentAge() <= 100) {
			cost = 200;
		}

		return cost;

	}

	public int discountByExp(Driver d) {
		int experience = d.getCurrentAge() - d.getDrivingAge();
		int newCost = determineCost(d) - experience * 5;
		return newCost;
	}

	public double genderDiscount(Driver d) {
		double finalCost = 0;
		double expense = 0;

		if (d.getGender().contains("Male") & d.getGender() != null) {
			expense = discountByExp(d) * .10;
			finalCost = discountByExp(d) + expense;

		} else {

			return finalCost = discountByExp(d);
		}
		return finalCost;
	}

	public void addPeople(Driver d) {
		driverList.add(d);
		

	}

	public double multiDriverDiscount() {
		double multiDiscount = 0;
		double groupQuote = 0;
		double finalQuote=0;
		for (Driver driver : driverList) {
			groupQuote = groupQuote + genderDiscount(driver);
			System.out.println(groupQuote);
		}
				
		if (driverList.size() >= 3 & driverList.size() <= 15) {
			System.out.println(driverList.size());
			multiDiscount = groupQuote * ((driverList.size() * .02) - .04);
			System.out.println(multiDiscount);
			finalQuote = groupQuote - multiDiscount;

		}
		System.out.println(finalQuote);
		return finalQuote;
	}

}
