class SamenameSamenumdiffparams{
    void process(int a) {
        System.out.println("Process int: " + a);
    }
    void process(String s) {
        System.out.println("Process String: " + s);
    }

    public static void main(String[] args) {
        SamenameSamenumdiffparams obj = new SamenameSamenumdiffparams();
        obj.process(42);
        obj.process("Hello");
    }
}