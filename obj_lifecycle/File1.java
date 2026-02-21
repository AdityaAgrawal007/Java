class dummy{

}

class File1{
	// instance variable - that belong to the class, belong to the object on heap
	int x;
	public static void main(String agrs[]){
		int local_variable; // part of function and on stack, live as long as method is on stack
		dummy d = new dummy(); // this is just a reference (d) so it will be on the stack but the actual object it's pointing to will be on heap, the obj is alive as long as the reference is 		
	}
}
