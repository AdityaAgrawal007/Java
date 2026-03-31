// java is stricly pass by value
class niga{
	static int add(int x, int y){
		x += y;
		return x;
	}
}
class PassByReference{
	public static void main(String args[]){
		int a = 1, b = 2;
		niga n = new niga();
		System.out.println(n.add(a, b));
		System.out.println("a: " + a);
		System.out.println("b: " + b);
	}
	
}
