public interface MyInterface {
    private int a = 10;    
    protected int b = 20;  
    public int c = 30;    }

class Test implements MyInterface {
    public void printValues() {
        // System.out.println(a); 
        // System.out.println(b); 
        System.out.println(c);    
    }
    public static void main(String[] args) {
        new Test().printValues();
    }
}