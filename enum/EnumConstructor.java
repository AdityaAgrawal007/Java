enum Colors{
	RED, NIGA, MON;

	private Colors(){
		System.out.println("Constructor called for: " + this);
	}

	public void display(){
		System.out.println("Color: " + this);
	}
}


class EnumConstructor{
	public static void main(String args[]){
		Colors c = Colors.RED;
		c.display();
	}
		
}
