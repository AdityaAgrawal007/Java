// System.in, System.out, System.err all the major streams
import java.io.IOException;
class Streams{
	public static void main(String args[]){
		System.out.println("Enter some shit: ");
		try{
		int data = System.in.read();
		System.out.println(data);
		System.out.println("you entered: " + (char)data);
		}
		catch(java.io.IOException e){
			System.out.println("Input error");
		}
			
	}
}
