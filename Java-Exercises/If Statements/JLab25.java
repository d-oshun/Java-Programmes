
class JLab25

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// inputting 3 numbers and testing whether the other two divid into the first one

{
    public static void main(String args[])
    {
        int number1;
        int number2;
        int number3;
        int result;
        int result2;

        System.out.println("We want to test whether one number can be perfectly divided by two other numbers!");
        System.out.print("Please enter the first number -> ");
        number1 = EasyIn.getInt();

        System.out.print("Now please enter the second number -> ");
        number2 = EasyIn.getInt();

        System.out.print("Finally please enter the third number -> ");
        number3 = EasyIn.getInt();

        result = number1 % number2;
        result2 = number1 % number3;

        if ((result==0) && (result2==0))
            {
                System.out.print("The first number you chose is perfectly divisible by the other two numbers!");
            }

        else if ((result!=0) && (result2!=0))
            {
                System.out.println("Unfortunately, the first number you chose is not perfectly divisible by any of your chosen numbers");
            }

        else if ((result==0) || (result2!=0))
            {
                System.out.println("The first number you chose is perfectly divisible by only one number");
                System.out.print("The that can divide into " + number1 + " is " + number2);
            }

        else if ((result!=0) || (result2==0))
            {
                System.out.println("The first number you chose is perfectly divisible by only one number");
                System.out.print("The that can divide into " + number1 + " is " + number3);
            }
    }
}


