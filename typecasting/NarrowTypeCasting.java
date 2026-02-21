// casting from a bigger datatype to a smaller one, it's dangerous as data loss might ouccur due to smaller datatype having a smaller range
class NarrowTypeCasting{
	public static void main(String agrs[]){
		double i = 100.234;
		// cast operator (type)
		short j = (short) i;
		int k = (int) i;

		System.out.println("Original value: " + i);
		System.out.println("After typecasting to short: " + j);
		System.out.println("After typecasting to int: " + k);

	}
}
