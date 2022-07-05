class ComplexNumber {
      int real, image;
    public ComplexNumber(int r, int i)
	{
                this.real = r;
		this.image = i;
	}
          public void showC()  //function to print real number
	{
		System.out.print(this.real + " +i" + this.image);
	}
        public static ComplexNumber add(ComplexNumber n1,
					ComplexNumber n2)    //function for addition
	{

	   ComplexNumber res = new ComplexNumber(0, 0);    //creating blank complex number to store result

		res.real = n1.real + n2.real;           //adding real parts of both complex numbers

               res.image = n1.image + n2.image;        //adding imaginary parts   
                 return res;                           //returning result
	}
        public static void main(String arg[])
	{

                ComplexNumber c1 = new ComplexNumber(6, 5);      //creating two complex numbers
		ComplexNumber c2 = new ComplexNumber(20, 5);
                System.out.print("first Complex number: ");      //printing complex numbers 
		c1.showC();
		System.out.print("\nSecond Complex number: ");
		c2.showC();
         ComplexNumber res = add(c1, c2);                      //calling add() to perform addition
          System.out.println("\nAddition is :");               //displaying addition  
		res.showC();
	 }
      }