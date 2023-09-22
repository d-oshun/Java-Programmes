
class JLab24

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// asks user for 2 numbers then calculates whether the first number is exactly divisible by the second number

{
    public static void main(String args[])
    {
        int number1;
        int number2;
        int result;

        System.out.println("We want to test whether two numbers are perfectly divisible by each other");
        System.out.print("Please enter the first number -> ");
        number1 = EasyIn.getInt();

        System.out.print("Now please enter the second number -> ");
        number2 = EasyIn.getInt();

        result = number1 % number2;

        if (result==0)
            {
                System.out.print("The first number you chose is perfectly divisible by the second number!");
            }
        else
            {
                System.out.print("Unfortunately, the first number you chose is not perfectly divisible by the second number");
            }
    }
}



