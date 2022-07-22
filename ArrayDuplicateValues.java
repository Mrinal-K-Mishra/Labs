package Array;
 public class DuplicateValues {         //class
public static void main(String[] args)
{
int arr[] = {1, 2, 3, 4, 5, 5, 6, 7, 7, 2, 4, 9,9}; // initialize array

for (int i=0; i< arr.length-1; i++) //logic for print
{
for (int j=i+1;j< arr.length; j++)
{
if ((arr[i] == arr[j]) && (i!=j))
{
System.out.println("Duplicate Value:"+arr[j]);
}
}
}
}
}