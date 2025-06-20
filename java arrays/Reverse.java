class Reverse
{
public static void main(String[]args)
{
int a[]={1,6,7,98,4,73,78};
int start=0;
int end=a.length-1;
while(start<end)
{
int temp=a[start];
a[start]=a[end];
a[end]=temp;
start++;
end--;
}
for(int num:a)
{
System.out.print(num + " ");
}
}
}
