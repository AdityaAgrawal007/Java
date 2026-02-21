// right now AnimeGirls and ChainSawMan are outer class to Exp... class if they were inside then they would be inner class and Explic.... would have been the outer class then to make an object of the inner class we would first need and object of the outer class ...
class AnimeGirls{
		void whoamI(){
			System.out.println("I am a general Anime girl");
		}
	}

class ChainSawMan extends AnimeGirls{
		void whoamI(){
			System.out.println("I am Makima!");
		}
		void myPowers(){
			System.out.println("I am the control devil");
		}
	}
class ExplicitUpcasting{
	public static void main(String args[]){
		AnimeGirls girl = new ChainSawMan(); // sub class object is referenced by a superclass reference variable so this is the process of casting a subtype to a supertype
		girl.whoamI();
		// girl.myPowers(); this is not allowed
	}
}
