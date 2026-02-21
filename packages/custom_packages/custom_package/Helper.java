// Avoiding name conflicts (two classes with the same name can exist in different packages)
// user defined, builtin packages
package custom_package.custom_packages;
public class Helper{
	public static void show(){
		System.out.println("helper check");
	}
	public static void helper_function2(){
		System.out.println("this is helper function 2");
	}
}
