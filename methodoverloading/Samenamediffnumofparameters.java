class Samenamediffnumofparameters {
    void show(int a) {
        System.out.println("int: " + a);
    }
    void show(int a, double b) {
        System.out.println("int and double: " + a + ", " + b);
    }

    public static void main(String[] args) {
        Samenamediffnumofparameters obj = new Samenamediffnumofparameters ();
        obj.show(5);
        obj.show(5, 3.14);
    }
}