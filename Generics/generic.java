public class generic {
    public static void main(String args[]) {
        Box boxObj = new Box();
        String str = new String();
        boxObj.set(str);
        // Integer i = (Integer)boxObj.get(); here explicit cast is needed here because
        // java
        // doesn't allow without cast and that's because it doesn't know it at compile
        // time
        Integer i = (Integer) boxObj.get(); // this is allowed now cause the compiler does not know 
        // but when there will be a type mismatch at runtime it will throw an error at runtime that
        // cannot convert from String to Integer 

        // BoxBox objBoxBox = new BoxBox(); if declared without parameter it takes Object by default 
        BoxBox<String> objBoxBox = new BoxBox<>();  
        objBoxBox.set(str);
        // Integer i = (Integer) objBoxBox.get(); here the compiler flags it befoure running cause it knows
        // it's a string type that's gonna be returned and the compiler is the one that handels the main 
        // behind the schenes logic the syntax highlighting and the gui only is managed by the plugins
    }
}

class BoxBox<T> {
    private T t;

    public void set(T tt) {
        this.t = tt;
    }

    public T get() {
        return t;
    }
}

class Box {
    private Object object;

    public void set(Object obj) {
        this.object = obj;
    }

    public Object get() {
        return object;
    }
}