import java.util.Scanner;
class Average
{
public static void main(String[]arg)
{
Scanner sc=new  Scanner(System.in);

System.out.println("enter the size:");
float avg=0;
int sum=0;
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the "+n+"values:");
for( int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(int i=0;i<n;i++)
{
sum+=a[i];
}
System.out.println("addition:"+sum);
for(int i=0;i<n;i++)
{
avg=(sum/2);
}

System.out.println("average:"+avg);
}
}





