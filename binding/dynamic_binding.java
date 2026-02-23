class NewClass{
	public static class superclass{
		 void print_stuff(){
			System.out.println("superclass called");
		}
	}
	public static class subclass extends superclass{
		@Override void print_stuff(){
			System.out.println("subclass called");
		}
	}
}

class dynamic_binding{
	public static void main(String args[]){
	NewClass.superclass A = new NewClass.superclass();
	NewClass.superclass B = new NewClass.subclass();

	A.print_stuff();
	B.print_stuff();
	}
	
}
