

class JLab02

// Student Name : Diana Williams Oshun
// Student Id Number : C00283112
// Date : 1/9/2022
//
// A program that converts degrees Farenheit to degrees Centigrade
//
{
    public static void main(String args[])
    {
        double Centigrade;
        double Farenheit;

        System.out.print("Enter the dregrees in Farenheit here -> ");
        Farenheit = EasyIn.getDouble();

        Centigrade = (5.0/9.0)*(Farenheit-32);

        System.out.print("That eqauls " + Centigrade );

    }
}