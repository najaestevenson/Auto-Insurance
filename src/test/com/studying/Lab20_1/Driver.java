package test.com.studying.Lab20_1;

public class Driver {
	
	private int currentAge;
	private int drivingAge;
	private String gender;
	
	Driver(int currentAgeIn, int drivingAge, String gender){
		this.setCurrentAge(currentAgeIn);
		this.setDrivingAge(drivingAge);
		this.setGender(gender);
		
	}
	
	
	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getCurrentAge() {
		return currentAge;
	}

	public void setCurrentAge(int currentAge) {
		this.currentAge = currentAge;
	}

	public int getDrivingAge() {
		return drivingAge;
	}

	public void setDrivingAge(int drivingAge) {
		this.drivingAge = drivingAge;
	}

	
}
