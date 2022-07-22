package Array;
public class Oddposition {   //class
public static void main(String args[]) { 
int arr[] = new int[] {1, 2, 3, 4, 5};    //initializearray
System.out.println("Print odd position of array: ");      //looping through the array by incrementing value of i by 2
for(int i = 0; i < arr.length; i = i+2)
{
System.out.println(arr[i]);
}
}
}
