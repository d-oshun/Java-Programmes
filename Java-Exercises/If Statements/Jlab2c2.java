class Jlab2c2

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// Date :				1/9/2005
//calculating how old a dog is from human years
{
    public static void main(String[] args) 
    {
        double humanYears;
        double dogYears;
        double newYear;
        final int ERRORMESSAGE = 0;
        final double TWODOGYRS = 10.5; //dog years for first two years
        final double AFTERTWO = 4; //dog years after two years
        final double CUTOFF = 2;

        System.out.print("Please eneter how old your dog is in human years ->");
        humanYears = EasyIn.getDouble();

        if (humanYears<=ERRORMESSAGE)
            {
                System.out.print("Error! This action is not possible");
            }
        else if (humanYears<=CUTOFF)
            {
                dogYears = (TWODOGYRS/CUTOFF)*humanYears;
                System.out.print("Your dog is " + dogYears + " years old in dog years");
            }
        else if (humanYears>CUTOFF)
            {
                newYear = humanYears - CUTOFF;
                dogYears = (newYear * AFTERTWO) + TWODOGYRS;
                System.out.print("Your dog is " + dogYears + " years old in dog years");
            }
    }
}


