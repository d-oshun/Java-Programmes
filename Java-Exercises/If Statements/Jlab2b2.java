
class Jlab2b2

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
//credit card intrest with a cutoff point at 500
{
    public static void main(String[] args) 
    {
        double creditA;
        double toPay;
        double firstCut;
        final double CUTOFF = 500;
        final double CUTOFFINTREST = 1.12;
        final double GENERALINTREST = 1.18;

        System.out.println("Its time to pay your credit card off!");
        System.out.print("Please enter how much money you have spent ->£");
        creditA = EasyIn.getDouble();

        if (creditA>=500)
            {
                firstCut = CUTOFF * CUTOFFINTREST;
                toPay = (creditA - CUTOFF) * GENERALINTREST;
                toPay = toPay + firstCut;

                System.out.print("According to your spending you have to pay £" + toPay);
            }
        else 
            {
                toPay = creditA * CUTOFFINTREST;

                System.out.print("According to your spending you have to pay £" + toPay);
            }

    }
}



