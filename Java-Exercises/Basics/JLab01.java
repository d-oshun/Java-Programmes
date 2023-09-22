class JLab01

// Student Name : Diana Williams Oshun
// Student Id Number : C00283112
// Date : 1/9/2022
//
// A Simple program that multiplys three numbers entered from the keyboard
//
{
    public static void main(String args[])
    {
        int number1;
        int number2;
        int number3;
        int answer;

        System.out.print("Enter the first number here -> ");
        number1 = EasyIn.getInt();
        System.out.print("Enter the second number here -> ");
        number2 = EasyIn.getInt();
        System.out.print("Enter the third number here -> ");
        number3 = EasyIn.getInt();

        answer = number1 * number2 * number3;

        System.out.println("The product of the three numbers is " + answer);


    }
}