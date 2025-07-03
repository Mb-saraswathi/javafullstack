class Equlasignorecase
{
public static void main(String args[])
{
String str1="Naveena";
String str2="VEENA";
String str3="veena";
System.out.println(str1.equalsIgnoreCase(str2));
System.out.println(str2.equalsIgnoreCase(str3));
System.out.println(str1.startsWith("N"));
System.out.println(str1.endsWith("a"));
System.out.println(str1.compareTo(str2));
System.out.println(str2.compareTo(str3));
}
}