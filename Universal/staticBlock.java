import javax.management.RuntimeErrorException;

class staticBlock {
    // this block runs automatically when the class is loaded by the JVM
    // static blocks are used to -
    // 1. init static variables
    // 2. load config
    // 3. one time setup logic
    static {
        System.out.println("Static Block executed.");
        /*
            cannot throw checked excption directly 
         */
        if (true) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("checked Exception encountered");
            }
        }
        /*
            can throw unchecked excption directly 
        */
        if (true) {
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        System.out.println("main executed");
    }
}