class Jlab2b3

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// entering 3 numbers and outputting the largest number
{
    public static void main(String args[])
    {
        double number1;
        double number2;
        double number3;

        System.out.println("Please enter three different numbers ");
        System.out.print("The first number -> ");
        number1 = EasyIn.getDouble();

        System.out.print("The second number ->");
        number2 = EasyIn.getDouble();

        System.out.print("The third number ->");
        number3 = EasyIn.getDouble();

        if ((number1<number2) && (number1<number3))
            {
                System.out.print("The lowest number you entered was " + number1);
            }
        else if ((number2<number1) && (number2<number3))
            {
                System.out.print("The lowest number you entered was " + number2);
            }
        else 
            {
                System.out.print("The lowest number you entered was " + number3);
            }
    }
}



