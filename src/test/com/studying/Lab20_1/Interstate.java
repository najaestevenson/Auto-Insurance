package test.com.studying.Lab20_1;

class Interstate extends Road {

	public boolean determineLoc(String setOrientation){
		boolean valid= false;
		String location ="";
		if(super.getOrientation().equals("EW") & getRoad()>=2 & getRoad() <= 48){
			super.setLocation(location);location ="W";
			valid= true;
		}else if(super.getOrientation().equals("EW") & getRoad()>=50 & getRoad()<=98 ){
			location ="E";
			valid= true;
			
		}else if(super.getOrientation().equals("NS") & getRoad()>=1 & getRoad()<=49){
			location = "S";
			valid= true;
		}else{
			location ="N";
			valid= true;
		}
		return valid;
	}

}
