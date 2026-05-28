public class assertions {
    public static void main(String args[]){
        int val = 15;
        assert val > 20 : "Underdog"; // if the condition is false then the second expression is passed
        // to the assertion constructor and it raises a AssertionException along with the error meesage 
        System.out.println("this weight is surely over 20: " + val); // else if the condition is true then 
        // this block executes but for the above to work assertions must be enabled in the ide 
    }
    
}
