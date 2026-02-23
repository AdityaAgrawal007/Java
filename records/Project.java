// this class is used to carry data from say client to server, to db etc ... 
class dev{
	// variables that hold data = state
	private final int id;
	private final String name;
	
	public dev(int u_id, String u_name){
		this.id = u_id;
		this.name = u_name;
	}

	// a getter method to fetch value for each variable 
	public int getter_id(){
		return id;
	}
	
	public String getter_name(){
		return name;
	}

	// other methods like toString, equalls ... to operate on this data, this is a ton of code just for a class that will hold data 
}

record Alien (int id, String name){}

class Project{
	public static void main(String args[]){
	dev dev_1 = new dev(1, "niga");
	System.out.println(dev_1.getter_id());
	System.out.println(dev_1);
	}
}
