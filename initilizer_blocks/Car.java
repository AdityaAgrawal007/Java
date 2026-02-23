class Specs{
	String company;
	Specs(){
		System.out.println("Car manufactured by: " + company);
	}
	{
		System.out.println("Initilizer block executed");
		company = "toyota";
	}
	Specs(int price){
		System.out.println("Price of car is: " + price);
	}

}

class Car{
	public static void main(String args[]){
		Specs s = new Specs();
		// when we create a new object then memory for that object is allocated, then compnay = null but then the initilizer block is executed and then the constructor is called and it's called befoure any type of constructor 
		Specs parametrized_constructor = new Specs(1000);
	}
}
