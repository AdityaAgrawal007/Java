// implicit casting - converting a smaller datatype to a bigger one 
class WideningTC{

	// how is the program running without String args[] ? 
	// that is because earlier java was strict and compulsorly requried Strings args[] to be there but in the newer versions it's fineJVM manages it ...
	public static void main(){
		int i = 10;
		long l = i;
		double d = i;

		System.out.println("Integer: " + i);
		System.out.println("Long: " + l);
		System.out.println("Double: " + d);
	}
}
