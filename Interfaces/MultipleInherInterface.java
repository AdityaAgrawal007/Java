// in java multiple inheritance is not allowed to avoid ambiguity so we use interface to achieve the same
interface Add {
    int add(int num1, int num2);
}

interface Sub {
    int sub(int num1, int num2);
}

interface Calculator extends Add, Sub {
}

class Cal implements Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

class MultipleInherInterface {
    public static void main(String[] args) {
        Cal x = new Cal();
        System.out.println("Addition : " + x.add(2,1));
        System.out.println("Substraction : " + x.sub(2,1));
    }
}
