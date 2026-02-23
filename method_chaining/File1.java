// parameter idiom, named parameter idiom, train wreak
class a{
	private int b;
	private float c;

	public a(){
		System.out.println("Constructor called");
	}

	public a seta(int user_b){
		this.b = user_b;
		// return this.b; wrong
		return this;	
	}

	public a setc(float user_c){
		this.c = user_c;
		// return this.c; wrong
		return this;
	}

	public void display(){
		System.out.println(b + " " + c);
	}
}

class File1{
	public static void main(String args[]){
		// when a constructor is called it returns a reference to the current object 
		// functions are called from left to right 
		// the constructor retuns reference to object and hence using . operator we can call the other function but if the other function doesn't return refernce to obj then we won't be able to call the next one
		new a().seta(2).setc(3).display(); // can pass init to setc, java implicitly converts it otherwise pass 3.0f (f suffix explicitly makes it float)
	}
}
