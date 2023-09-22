
class Jlab32

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// Program will add numbers until the end value is 0
{
    public static void main(String[] args)
    {
        int number1;
        int addNumber;
        int number0;

        System.out.println("This program will keep adding numbers until the reslut is zero");
        System.out.println("Please enter two numbers that equal zero");
        addNumber = 0;

        do
            {
                System.out.println("Please enter the first number -> ");
                number0 = EasyIn.getInt();

                System.out.println("Please enter the second number -> ");
                number1 = EasyIn.getInt();

                addNumber = number0 + number1;

                System.out.println("The total of the numbers entered is " + addNumber);
            }
        while (addNumber != 0);

    }
}



