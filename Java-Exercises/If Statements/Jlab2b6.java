class Jlab2b6

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
//User choses which coversion method they want and the program executes it
{
    public static void main(String[] args) 
    {
        double inputValue;
        double conversion;
        int menuNo;
        final double FAHRENHEIT = 32;
        final double CELCIUS = (5.0/9.0);
        final double INCHES = 2.54;
        final double POUNDS = 2.205;

        System.out.println("Below is a menu of conversion methods please chose one:");
        System.out.println("1.	Fahrenheit to celcius");
        System.out.println("2.	Celcius to Fahrenheit");
        System.out.println("3.	Inches to centimetres");
        System.out.println("4.	Centimetres to inches");
        System.out.println("5.	Pounds to Kilograms");
        System.out.println("6.	Kilograms to Pounds");
        System.out.print("Enter the method chosen (1-6) ->");
        menuNo = EasyIn.getInt();

        switch (menuNo)
            {
                case 1:
                    System.out.print("You selected conversion 1, Please enter the value you wish to convert -> ");
                    inputValue = EasyIn.getDouble();

                    conversion = (inputValue -FAHRENHEIT)*CELCIUS;

                    System.out.print(inputValue + " degrees fahrenheit is converted to " + conversion + " degrees celcius");
                    break;

                case 2:
                    System.out.print("You selected conversion 2, Please enter the value you wish to convert -> ");
                    inputValue = EasyIn.getDouble();

                    conversion = (inputValue * CELCIUS) + FAHRENHEIT;

                    System.out.print(inputValue + " degrees celcius is converted to " + conversion + " degrees fahrenheit");
                    break;

                case 3:
                    System.out.print("You selected conversion 3, Please enter the value you wish to convert -> ");
                    inputValue = EasyIn.getDouble();

                    conversion = inputValue * INCHES;

                    System.out.print(inputValue + " inches is converted to " + conversion + " centimetres");
                    break;

                case 4:
                    System.out.print("You selected conversion 4, Please enter the value you wish to convert -> ");
                    inputValue = EasyIn.getDouble();

                    conversion = inputValue / INCHES;

                    System.out.print(inputValue + " centimetres is converted to " + conversion + " inches");
                    break;

                case 5:
                    System.out.print("You selected conversion 5, Please enter the value you wish to convert -> ");
                    inputValue = EasyIn.getDouble();

                    conversion = inputValue / POUNDS;

                    System.out.print(inputValue + " pounds is converted to " + conversion + " kilograms");
                    break;

                case 6:
                    System.out.print("You selected conversion 6, Please enter the value you wish to convert -> ");
                    inputValue = EasyIn.getDouble();

                    conversion = inputValue * POUNDS;

                    System.out.print(inputValue + " kilograms is converted to " + conversion + " pounds");
                    break;

                default:  
                    System.out.println("Invalid Option!");
                    break;

            }

    }
}



