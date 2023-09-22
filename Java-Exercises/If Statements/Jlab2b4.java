
class Jlab2b4

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
//inputting 3 numbers and outputting them in ascending order
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

        if ((number1>number2) && (number1>number3))
            {
                if (number2>number3)
                {
                System.out.print("The lowest number entered = " + number3 + " the middle = " + number2 + " the highest = " + number1);
                }
                else
                {
                System.out.print("The lowest number entered = " + number2 + " the middle = " + number3 + " the highest = " + number1);
                }
            }
        else if ((number2>number1) && (number2>number3))
            {
                if (number1>number3)
                {
                System.out.print("The lowest number entered = " + number3 + " the middle = " + number1 + " the highest = " + number2);
                }
                else
                {
                System.out.print("The lowest number entered = " + number1 + " the middle = " + number3 + " the highest = " + number2);
                }
            }
        else 
            {
                if (number1>number2)
                {
                System.out.print("The lowest number entered = " + number2 + " the middle = " + number1 + " the highest = " + number3);
                }
                else
                {
                System.out.print("The lowest number entered = " + number1 + " the middle = " + number2 + " the highest = " + number3);
                } 
            }
    }
}



