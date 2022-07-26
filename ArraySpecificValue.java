package Array;
public class SpecificValue { //class 
public static boolean contains (int arr[], int item) { 
for (int n: arr) { //using foreach loop to check elements
if (item == n) { //condition
 return true;
}
}
return false;
}
public static void main(String[] args) { 
int arr1[] = {1789, 2035, 1899, 1456, 2013,2022,1958, 2295, 1971, 2950};   //initialize array 

System.out.println(contains(arr1, 2013));      //array output initialisation
System.out.println(contains(arr1, 2015));      //array output initialisation     
}
}
