class Methodsandvariables {
static int a = 10;
static int b = 20;
int c = 30;
int d = 40;
{
System.out.println("Instance variables values:");
}
void add() {
System.out.println(c);
}
void sub() {
System.out.println(d);
}
static void display() {
System.out.println("Static variables are:");
System.out.println(a);
}
static void display1() {
System.out.println(b);
}
public static void main(String[] args) {
Methodsandvariables m = new Methodsandvariables();
m.add();
m.sub();
display();
display1();
}
}