// interfaces allows multiple classess to promise the same behavioure 
interface testInterface{
	final int a = 10;
	void display();
}

// implement is used when a class agrees to follow a certian contract (which in this case is to provide access to display method and a variable) whereas extends is used to inherit form a class
class TestInterface implements testInterface{
	public void display(){
		System.out.println("TestInterface");
	}	
}

// the program won't compile because the following class implements testInterface but does not provide the display method which is cumposlary 
// class anotherClass implements testInterface{
//
// }

class Interfaces{
	public static void main(String args[]){
		TestInterface t = new TestInterface();
		t.display();
		System.out.println(t.a);
	}
}
