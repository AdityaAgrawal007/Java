class NewClass{
	public static class superclass{
		// static methods are resolved during compile time 
		static void print_stuff(){
			System.out.println("superclass called");
		}
	}
	public static class subclass extends superclass{
		static void print_stuff(){
			System.out.println("subclass called");
		}
	}
}

class static_binding{
	public static void main(String args[]){
	NewClass.superclass A = new NewClass.superclass();
	NewClass.superclass B = new NewClass.subclass();

	A.print_stuff();
	B.print_stuff();
	}
	
}
