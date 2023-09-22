class Addition

// Student Name : Diana Williams Oshun
// Student Id Number : C00283112
// Date : 1/9/2022
//
//A Simple program that adds two numbers entered from the keyboard
//
{
    public static void main(String args[])
    {

        int number1;
        int number2;
        int answer;

        System.out.print("Enter the first number -> ");
        number1 = EasyIn.getInt();
        System.out.print("Enter the second number -> ");
        number2 = EasyIn.getInt();

        answer = number1 + number2;

        System.out.println("The sum of the two numbers is " + answer);

    }
}