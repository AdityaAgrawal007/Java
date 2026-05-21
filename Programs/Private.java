public class Private{
    private int bank_balance = 10000;
    // now this variable will only be asseecbile in this class and not outside it 
    // this is Encapsulation i.e. hiding internal details so that they cannot be accesssed directly     

    // this is a 'Getter' it is used by other classes to get values
    int testerFxn(){
        return bank_balance;
    }
    // this is 'Setter' it is used to set values by other classes
    void setter(int x){
        bank_balance = x;
    }
    public static void main(String[] args){
        Private private_obj_for_main = new Private();
        System.out.println("This is Private's main function \n");
        System.out.println(private_obj_for_main.testerFxn() + "\n");
        private_obj_for_main.setter(100);
        System.out.println(private_obj_for_main.testerFxn() + "\n");
    }
}

// making a new class -> "But it shouldn't be public"
class Tester{
    public static void main(String[] args){
        // creating an object for a class 
        Private objForPrivateClass = new Private();
        // the following never prints becasue the variable is private 
        System.out.println("This is Tester's main function \n");
        System.out.println(objForPrivateClass.testerFxn() + "\n");
        objForPrivateClass.setter(100);
        System.out.println(objForPrivateClass.testerFxn() + "\n");
    }
}
