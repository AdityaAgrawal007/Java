// implicit casting - converting a smaller datatype to a bigger one 
class WideningTC{

	// how is the program running without String args[] ? 
	public static void main(){
		int i = 10;
		long l = i;
		double d = i;

		System.out.println("Integer: " + i);
		System.out.println("Long: " + l);
		System.out.println("Double: " + d);
	}
}
