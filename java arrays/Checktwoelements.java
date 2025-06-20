class Checktwoelements{
public static void main(String[] args)
{
int[] arr={5,8,12,3,7,9};
int element1=3;
int element2=7;
boolean foundElement1=false;
boolean foundElement2=false;
for(int num:arr)
{
if(num==element1)
{
foundElement1=true;
}
if(num==element2)
{
foundElement2=true;
}
}
if(foundElement1&&foundElement2)
{
System.out.println("Both elements are present in the array.");
}
else{
System.out.println("Both elements are NOT present in the array.");
}
}
}
