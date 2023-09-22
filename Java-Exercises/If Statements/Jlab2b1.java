
class Jlab2b1

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// code to calculate the insurance premium for the next year depending on the amout of claims made

{
    public static void main(String args[])
    {
        double lastYearP;
        double numbClaim;
        double newPremium;
        final double BASICP = 1.05;
        final double NOCLAIM = 0.98;
        final double CLAIM = 0.2;

        System.out.println("We will be calculating your insurance premium for the next year.");
        System.out.print("Please enter last years premium ->");
        lastYearP = EasyIn.getDouble();

        System.out.print("Now please enter the number of claims you made last year ->");
        numbClaim = EasyIn.getDouble();

        newPremium = lastYearP * BASICP;

        if (numbClaim==0)
            {
                newPremium = newPremium * NOCLAIM;
                System.out.print("Because you made no claims last year your new insurance premium for next year is " + newPremium);
            }
        else 
            {
                newPremium = ((CLAIM * numbClaim) +1) * newPremium;
                System.out.print("You made " + numbClaim + " last year as a result your new insurance premium for next year is £" + newPremium);
            }

    }
}

