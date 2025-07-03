public class Stringsvalueof {
public static void main(String[] args) {
int a = 5;
long l = -2343834L;
float f = 23.4f;
double d = 923.234d;
String strInt = String.valueOf(a);
String strLong = String.valueOf(l);
String strFloat = String.valueOf(f);
String strDouble = String.valueOf(d);
System.out.println("Integer as String: " + strInt);
System.out.println("Long as String: " + strLong);
System.out.println("Float as String: " + strFloat);
System.out.println("Double as String: " + strDouble);
}
}