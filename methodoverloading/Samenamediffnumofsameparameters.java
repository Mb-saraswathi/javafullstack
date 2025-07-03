class Samenamediffnumofsameparameters {
    void print(int a) {
        System.out.println("integer1: " + a);
    }
    void print(int a, int b) {
        System.out.println("integer2: " + a + ", " + b);
    }

    public static void main(String[] args) {
      Samenamediffnumofsameparameters obj = new Samenamediffnumofsameparameters();
        obj.print(10);
        obj.print(10, 20);
    }
}