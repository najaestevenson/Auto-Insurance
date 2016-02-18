package test.com.studying.Lab20_1;

abstract class Road {

	private int road;
	private String orientation;
	private String Location;
	private String roadType;

	

	public int getRoad() {
		return road;
	}

	public void setRoad(int road) {
		this.road = road;
	}

	public String getOrientation() {
		return orientation;
	}

	public void setOrientation(int i) {
		String orientation = "";
		if (i >= 1 & i <= 99 & i % 2 == 0) {
			orientation = "EW";
		} else {
			orientation = "NS";
		}

		this.orientation = orientation;
	}

	public String getLocation(Road r) {
		return Location;
	}

	public void setLocation(String location) {
		Interstate i= new Interstate();
		Route r= new Route();
		if(i.determineLoc(getOrientation())|| r.determineLoc(getOrientation())){
			
			Location = location;
		}

	}

	public String getRoadType() {
		return roadType;
	}

	public void setRoadType(String id) {
		if (id.equals("I")) {
			id = "Interstate";
		} else if (id.equals("R")) {
			id = "Route";
		}
		this.roadType = id;
	}

	public String parseRoad(String currentLocation) {
		String[] sArr = currentLocation.split("-");

		this.setRoadType(sArr[0]);
		this.setOrientation(Integer.parseInt(sArr[1]));

		return currentLocation;
	}
	public abstract boolean determineLoc(String setOrientation);
	

}
