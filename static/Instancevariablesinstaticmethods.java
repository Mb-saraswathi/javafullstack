class Instancevariablesinstaticmethods
{
int a=10;
static void add() 
{
Instancevariablesinstaticmethods obj=new Instancevariablesinstaticmethods();
System.out.println(obj.a);
}
public static void main(String[] args) 
{
add();
}
}