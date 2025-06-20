import java.util.Scanner;
class CheckNumbers
{
public static boolean has12and23(int[] arr) 
{
boolean found12 = false;
boolean found23 = false;
for (int num : arr) {
if (num == 12)
{
found12 = true;
}
if (num == 23)
{
found23 = true;
}
}
return found12 && found23;
}
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.print("How many numbers will you enter? ");
int n = scanner.nextInt();
int[] numbers = new int[n];
System.out.println("Enter the numbers:");
for (int i = 0; i < n; i++)
{
numbers[i] = scanner.nextInt();
}
if (has12and23(numbers)) 
{
System.out.println("Array contains both 12 and 23.");
}
else {
System.out.println("Array does NOT contain both 12 and 23.");
}
}
}