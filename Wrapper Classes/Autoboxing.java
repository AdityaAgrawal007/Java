class  Autoboxing{
    public static void main (String agrs[]){
        // Unboxing - implicit conversion from Wrapper class to it's corresponding primitive data type
        // Integer i = new Integer(10); constructor has been deprecated to encourage  .valueOf() to improve performance and memory
        Integer i = new Integer(10);
        int inot = i;
        System.out.println(i);
        System.out.println(inot);

        // Autoboxing is the opposite of Unboxing
        int x = 20;
        Integer y = x;
        System.out.println(x);
        System.out.println(y);
    }
}

