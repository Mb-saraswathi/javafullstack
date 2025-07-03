public class Objecttostring{
public static void main(String[] args) {
Integer num = 123;
String str1 = String.valueOf(num);
String str2 = num.toString();
String str3 = "" + num;
System.out.println("Using String.valueOf: " + str1);
System.out.println("Using toString(): " + str2);
System.out.println("Using concatenation: " + str3);
}
}