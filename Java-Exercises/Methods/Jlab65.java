
class Jlab65

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// measurement converter

{
    public static void menu(int myMenu)
    {
        double amount;

        System.out.print("Enter the amount you wish to convert -> ");
        amount = EasyIn.getInt();

        if (myMenu == 1)
        {
            FahrToCel(amount);
        }
        else if (myMenu == 2)
        {
            CelToFahr(amount);
        }
        else if (myMenu == 3)
        {
            IncToCen(amount);
        }
        else if (myMenu == 4)
        {
            CenToInc(amount);
        }
        else if (myMenu == 5)
        {
            PouToKil(amount);
        }
        else if (myMenu == 6)
        {
            KilToPou(amount);
        }
        else
        {
            System.out.println("You have exited the program");
        }
    }
    public static void FahrToCel(double myAmount)
    {
        double Fahrenheit = 32;
        double celcius = (5.0/9.0);
        double conversion;

        conversion = (myAmount -Fahrenheit)*celcius;

        System.out.println(myAmount + " degrees fahrenheit is converted to " + conversion + " degrees celcius");
    }
    public static void CelToFahr(double myAmount)
    {
        double Fahrenheit = 32;
        double celcius = (5.0/9.0);
        double conversion;

        conversion = (myAmount * celcius) + Fahrenheit;

        System.out.println(myAmount + " degrees celcius is converted to " + conversion + " degrees fahrenheit");
    }
    public static void IncToCen(double myAmount)
    {
        double INCHES = 2.54;
        double conversion;

        conversion = myAmount * INCHES;

        System.out.println(myAmount + " inches is converted to " + conversion + " centimetres");
    }
    public static void CenToInc(double myAmount)
    {
        double INCHES = 2.54;
        double conversion;

        conversion = myAmount / INCHES;

        System.out.println(myAmount + " centimetres is converted to " + conversion + " inches");
    }
    public static void PouToKil(double myAmount)
    {
        double pounds = 2.205;
        double conversion;

        conversion = myAmount / pounds;

        System.out.println(myAmount + " pounds is converted to " + conversion + " kilograms");
    }
    public static void KilToPou(double myAmount)
    {
        double pounds = 2.205;
        double conversion;

        conversion = myAmount * pounds;

        System.out.println(myAmount + " kilograms is converted to " + conversion + " pounds");
    }
    public static void main(String[] args) 
    {
        int menuNo;


        do
        {
            System.out.println("Below is a menu of conversion methods please chose one:");
            System.out.println("1.	Fahrenheit to celcius");
            System.out.println("2.	Celcius to Fahrenheit");
            System.out.println("3.	Inches to centimetres");
            System.out.println("4.	Centimetres to inches");
            System.out.println("5.	Pounds to Kilograms");
            System.out.println("6.	Kilograms to Pounds");
            System.out.println("7.	To exit the program");
            System.out.print("Enter the method chosen (1-7) ->");
            menuNo = EasyIn.getInt();

            menu(menuNo);
        }
        while (menuNo != 7);
        
    }
}


