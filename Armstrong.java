//Creating a class
public class ArmstrongNum {

    public static void main(String[] args) {

        int n = 123, number, temp, t = 0;

        number = n;
        while (n!= 0)
        {
            temp = n % 10;
            t = t + temp*temp*temp;
            n =n / 10;
        }
//check the number is Armstrong or not
        if(t == number)
            System.out.println("The number is an Armstrong number :"+number); 
        else
            System.out.println("The number is not an Armstrong number :"+number);
    }
} 