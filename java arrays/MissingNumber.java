import java.util.Scanner;
class MissingNumber {
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
System.out.println("Enter the size:");
int n = sc.nextInt();
 int[] arr = new int[n];
System.out.println("Enter 99 numbers from 1 to 100 (one number is missing):");
 int sum = 0;
for (int i = 0; i < n; i++)
{
arr[i] = sc.nextInt();
sum += arr[i];
}
int total = 100 * 101 / 2;
System.out.println("Missing number: " + (total - sum));
}
}