class Instancemethodsinstaticmethods
{
int a=10;
void show()
{
System.out.println(a);
}
static void show1()
{
Instancemethodsinstaticmethods i=new Instancemethodsinstaticmethods();
i.show();
}
public static void main(String[]args)
{
show1();
}
}