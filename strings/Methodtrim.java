class Methodtrim
{
public static void main(String[]args)
{
String s1="  Naveena";
String s2="     hello";
System.out.println("Before trim():");
System.out.println(s1);
System.out.println(s2);
System.out.println("after trim():");
String s3= s1.trim();
String s4=s2.trim();
System.out.println(s3);
System.out.println(s4);
}
}