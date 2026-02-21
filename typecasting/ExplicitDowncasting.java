class bands{
	void makeNoise(){
		System.out.println("Rock, Rock!!!");
	}
}

class ACDC extends bands{
	void makeNoise(){
		System.out.println("Highway to hell!!!");
	}

	void lead(){
		System.out.println("Angus Young");
	}
}

class ExplicitDowncasting{
	public static void main(String args[]){
		bands Band = new ACDC();
		Band.makeNoise();
		ACDC acdc = (ACDC) Band; // subclass type refers to a parent class 
		acdc.lead();
		acdc.makeNoise();

		String s = "acdc";
		Integer i = (Integer) s; // raises ClassCastException
	}

}
