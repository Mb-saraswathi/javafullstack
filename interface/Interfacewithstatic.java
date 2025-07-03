interface MyInterface {
    int VALUE = 100;     
void showValue();
}
class MyClass implements MyInterface {
    public void showValue() {
        System.out.println("The value is: " + VALUE);
    }
}

public class Interfacewithstatic {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showValue(); 
    }
}