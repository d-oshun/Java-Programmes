
class Jlab32

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
//Using the do while loop the user will enter the conversion method they prefer and the program will execute the conversion
{
    public static void main(String[] args) 
    {
        double inputValue;
        double conversion;
        int menuNo;
        final double FAHRENHEIT = 32;
        final double CELCIUS = (5.0/9.0);
        final double CENTIGRADE = (9.0/5.0);
        final double INCHES = 2.54;
        final double POUNDS = 2.205;
        final int STOP = 7;

        do 
            {
                System.out.println("Below is a menu of conversion methods please chose one:");
                System.out.println("1.	Fahrenheit to celcius");
                System.out.println("2.	Celcius to Fahrenheit");
                System.out.println("3.	Inches to centimetres");
                System.out.println("4.	Centimetres to inches");
                System.out.println("5.	Pounds to Kilograms");
                System.out.println("6.	Kilograms to Pounds");
                System.out.println("7.      To close the menu");
                System.out.print("Enter the method chosen (1-7) ->");
                menuNo = EasyIn.getInt();

                switch (menuNo)
                    {
                        case 1:
                            System.out.print("You selected conversion 1, Please enter the value you wish to convert -> ");
                            inputValue = EasyIn.getDouble();

                            conversion = (inputValue -FAHRENHEIT)* CELCIUS;

                            System.out.println(inputValue + " degrees fahrenheit is converted to " + conversion + " degrees celcius");
                            break;

                        case 2:
                            System.out.print("You selected conversion 2, Please enter the value you wish to convert -> ");
                            inputValue = EasyIn.getDouble();

                            conversion = (inputValue * CENTIGRADE) + FAHRENHEIT;

                            System.out.println(inputValue + " degrees celcius is converted to " + conversion + " degrees fahrenheit");
                            break;

                        case 3:
                            System.out.print("You selected conversion 3, Please enter the value you wish to convert -> ");
                            inputValue = EasyIn.getDouble();

                            conversion = inputValue * INCHES;

                            System.out.println(inputValue + " inches is converted to " + conversion + " centimetres");
                            break;

                        case 4:
                            System.out.print("You selected conversion 4, Please enter the value you wish to convert -> ");
                            inputValue = EasyIn.getDouble();

                            conversion = inputValue / INCHES;

                            System.out.println(inputValue + " centimetres is converted to " + conversion + " inches");
                            break;

                        case 5:
                            System.out.print("You selected conversion 5, Please enter the value you wish to convert -> ");
                            inputValue = EasyIn.getDouble();

                            conversion = inputValue / POUNDS;

                            System.out.println(inputValue + " pounds is converted to " + conversion + " kilograms");
                            break;

                        case 6:
                            System.out.print("You selected conversion 6, Please enter the value you wish to convert -> ");
                            inputValue = EasyIn.getDouble();

                            conversion = inputValue * POUNDS;

                            System.out.println(inputValue + " kilograms is converted to " + conversion + " pounds");
                            break;
                        case 7:
                            System.out.print("The menu is now closed");
                            break;

                        default:  
                            System.out.println("Invalid Option!");
                            break;

                    }
            }
        while (menuNo != STOP);
    }
}






