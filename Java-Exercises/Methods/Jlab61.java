
class Jlab62

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// checks if number is even or odd
{
    public static boolean isEven(int theInteger)
    {
        return (theInteger % 2 == 0);
    }
    public static void main(String[] args) 
    {
        int number1;

        System.out.print("Please enter a number -> ");
        number1 = EasyIn.getInt();

        if (isEven(number1)==true)
            {
                System.out.print("Your number is even");
            }
        else
            {
                System.out.print("Your number is odd");
            }
    }
}


