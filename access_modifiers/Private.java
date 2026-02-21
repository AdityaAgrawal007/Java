// to access private memebers outside a class we can use some methods 
class dummy{
	public int getter(){
			return confidential_integer;
		}
	private	int confidential_integer = 666;
}

class Private{
	public static void main(String args[]){
		// dummy d; // this only declares a reference variable 
		dummy d  = new dummy();
		System.out.println(d.getter());	
	}
}
