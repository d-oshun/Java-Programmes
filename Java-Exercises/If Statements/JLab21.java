
class JLab21

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// Date :				1/9/2005
// using if statements to determine whether a number is greater,equal or less than 0

{
    public static void main(String args[])
    {
        double number1;
        final double OTHERNO = 0;

        System.out.print("Please enter a number of your choice -> ");
        number1 = EasyIn.getDouble();

        if (number1>OTHERNO)
            {
                System.out.print("The whole number you have chosen is greater than");
            }
        else
            if (number1==OTHERNO)
                {
                    System.out.print("The number you have chosen is equal");
                }
            else
                {
                    System.out.print("The number that you have chosen is less than");
                }
    
    }
    
}


