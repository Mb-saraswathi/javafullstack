public class  PublicInterfacewithfields {
    private interface PrivateInterface {
        int VALUE = 200;
        String MESSAGE = "Hello Private Interface!";
        void printValues();
    }

    static class ImplementsPrivate implements PrivateInterface {
        public void printValues() {
            System.out.println("Private Value: " + VALUE);
            System.out.println("Private Message: " + MESSAGE);
        }
    }

    public static void main(String[] args) {
        ImplementsPrivate obj = new ImplementsPrivate();
        obj.printValues();
    }
}