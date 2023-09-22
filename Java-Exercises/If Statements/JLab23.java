
class JLab23

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
//determining whether a number is odd or even

{
    public static void main(String args[])
    {
        int number1;
        int result;
        final int DIVIDER = 2;

        System.out.print("Please enter a whole number of your choice -> ");
        number1 = EasyIn.getInt();

        result = number1 % DIVIDER;

        if (result==0)
            {
                System.out.print("The number you have chosen is even!");
            }
        else
            {
                System.out.print("The number you have chosen in odd!");
            }
    }
}


