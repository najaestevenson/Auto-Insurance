package test.com.studying.Lab20_1;

class Route extends Road {
	
	public boolean determineLoc(String setOrientation){
		boolean valid= false;
		String location ="";
		if(super.getOrientation().equals("EW") & getRoad()>=2 & getRoad() <= 48){
			location ="N";
			valid=true;
		}else if(super.getOrientation().equals("EW") & getRoad()>=50 & getRoad()<=98 ){
			location ="S";
			valid=true;
		}else if(super.getOrientation().equals("NS") & getRoad()>=1 & getRoad()<=49){
			location = "E";
			valid=true;
		}else{
			location ="W";
			valid=true;
		}
		return valid;
	}

}
