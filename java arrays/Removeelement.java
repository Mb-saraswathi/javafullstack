import java.util.Scanner;
public class Removeelement
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the number of elements: ");
int size = scanner.nextInt();
int[] array = new int[size];
System.out.println("Enter the elements:");
for (int i = 0; i < size; i++) 
{
array[i] = scanner.nextInt();
}
System.out.print("Enter the element to remove: ");
int elementToRemove = scanner.nextInt();
System.out.print("Array after removing " + elementToRemove + ": ");
for (int i = 0; i < size; i++) 
{
if (array[i] != elementToRemove) 
{
System.out.print(array[i] + " ");
}
}
scanner.close();
}
}