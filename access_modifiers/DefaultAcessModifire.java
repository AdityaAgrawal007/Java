// because the access modifire is not defined hence it has default access modifire which enable class within the same package to access it but not outside the package 
class def{
	int niga = 0;
}

class DefaultAcessModifire{
	public static void main(String args[]){
		def d = new def();
		System.out.println(d.niga);
	}

}
