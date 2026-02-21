// keyword - cannot change value
// methods - cannot be overridden
// classes - cannot be extended
class otherClass{
	int x = 100;
}

class FinalKeyword{
	public static void main(String args[]){
	final int variable = 3;
	final int var; // blank final variable
	otherClass obj = new otherClass();
	System.out.println(obj.x);
	// A final reference cannot refer to a new object though the object it points to can change internally.
	final otherClass obj2 = new otherClass();	
	System.out.println(obj2.x);
	// obj2 = obj; this is illegal 
	}
}
