class Jlab2c3

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// Date :				1/9/2005
//utility bill calculator
{
    public static void main(String[] args) 
    {
        double utility;
        double utility2;
        double bill;
        double endBill;
        final double INTEREST = 1.2;
        final int TEIR1 = 50;
        final int TEIR2 = 150;
        final int TEIR3 = 250;
        final int TEIR1A = 25;
        final int TEIR2A = 100;
        final int TEIR3A = 220;
        final double TEIR1P = 0.5;
        final double TEIR2P = 0.75;
        final double TEIR3P = 1.2; 
        final double TEIR4P = 1.5;
        
        System.out.print("Please enter the amount of electrical units you expended ->");
        utility = EasyIn.getDouble();

        if (utility<=TEIR1)
            {
                bill = utility * TEIR1P;
                System.out.print("Your utility bill is £" + bill);
            }
        else if (utility<=TEIR2)
            {
                bill = utility - TEIR1;
                endBill = (bill * TEIR2P) + TEIR1A;
                System.out.print("Your utility bill is £" + endBill);
            }
        else if (utility<=TEIR3)
            {
                bill = utility - TEIR2;
                endBill = (bill * TEIR3P) + TEIR2A;
                System.out.print("Your utility bill is £" + endBill);
            }
        else if (utility>TEIR3)
            {
                utility2 = utility - TEIR3;
                bill = (utility2 * TEIR4P) + TEIR3A;
                endBill = bill * INTEREST;
                System.out.print("Your utility bill is £" + endBill);
            }
    }
}

