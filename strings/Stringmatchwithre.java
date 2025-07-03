public class Stringmatchwithre{
    public static void main(String[] args) {
        String text = "Hello123";
        String pattern = "^[a-zA-Z0-9]+"; 
        if (text.matches(pattern)) {
            System.out.println("The string matches the pattern.");
        } else {
            System.out.println("The string does NOT match the pattern.");
        }
    }
}
