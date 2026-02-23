// enums are special types used to define a group of named constatns 
// can be declared inside a class but not method
// internally implemented as a class
// each constant is a object of enum type
enum TrafficLight{
	RED, YELLO, GREEN;
}

class Enum_class{
	static void main(String args[]){
	TrafficLight t = TrafficLight.RED;
	System.out.println(t);
	System.out.println(TrafficLight.YELLO);
	}	
}
