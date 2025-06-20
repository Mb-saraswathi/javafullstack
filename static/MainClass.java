class CSE {
static int a=10;
static int b=20;
int c=30;
int d=40;
static {
System.out.println("static block1");
System.out.println("static block 2");
}
{
System.out.println("instance block1");
System.out.println("instance block2");
}
static void add() {
System.out.println(a);
}
static void sub() {
System.out.println(b);
}
void show() {
System.out.println(c);
}
void show1() {
System.out.println(d);
}
}

class ECE {
static int p=50;
static int q=60;
int r=70;
int s=80;
static {
System.out.println("static block 3");
System.out.println("static block 4");
}
{
System.out.println("instance block 3");
System.out.println("instance block 4");
}
static void mul() {
System.out.println(p);
}
static void div() {
System.out.println(q);
}
void show2() {
System.out.println(r);
}
void show3() {
System.out.println(s);
}
}

public class MainClass {
public static void main(String[] args) {
CSE c1=new CSE();
ECE e1=new ECE();
CSE.add();
CSE.sub();
c1.show();
c1.show1();
ECE.mul();
ECE.div();
e1.show2();
e1.show3();
}
}