enum Colors{
	RED, GREEN, YELLOW;
}

class EnumSwitch{
	public static void main(){
		Colors var = Colors.GREEN;
		switch(var){
			case RED:
				System.out.println("RED");
				break;
			case GREEN:
				System.out.println("GREEN");
				break;
			case YELLOW:
				System.out.println("YELLOW");
				break;
			default:
				System.out.println("Not found");
				break;
		}
	}
}
