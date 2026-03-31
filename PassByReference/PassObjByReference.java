class Test{
	int x;
	Test(int i){ x = i;}
	Test(){x = 0;}
}

class PassObjByReference{
	public static void main(String args[]){
		Test t = new Test(4);
		Test t2 = new Test();
		System.out.println(t.x);
		System.out.println(t2.x);
		Test returned_obj = change(t);
		System.out.println(returned_obj.x);
		System.out.println(t.x);
	}

	// if you pass the reference to an object then a copy of that reference is made but then both the original and the copy reference point to the same memory address
	public static Test change(Test t){
		// t = new Test();
		t.x = 239;
		System.out.println(t.x);
		return t;
	}
}


