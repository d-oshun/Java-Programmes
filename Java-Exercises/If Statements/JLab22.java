class JLab22

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// Date :				1/9/2005
//Using the average of three grades to determine if they got a distinction, mert1, metit2, pass or fail

{
    public static void main(String args[])
    {
        double prog;
        double maths;
        double hardw;
        double averageM;
        double noSub;
        final double DISTINCTION = 70;
        final double MERIT1 = 63;
        final double MERIT2 = 55;
        final double PASS = 40;

        System.out.println("You have just finished your Christmass exams!");
        System.out.print("Please enter your grade for Programming -> ");
        prog = EasyIn.getDouble();

        System.out.print("Now enter your grade for Maths -> ");
        maths = EasyIn.getDouble();

        System.out.print("Finally enter your grade for Hardware -> ");
        hardw = EasyIn.getDouble();
        
        noSub = 3;
        averageM = (prog + maths + hardw)/ noSub;

        if (averageM>=DISTINCTION)
            {
                System.out.print("According to your average mark you have achieved the Distinction grade");
            }
        else if(averageM>=MERIT1)
                {
                    System.out.print("According to your average mark you have achieved the Merit1 grade");
                }
        else if(averageM>=MERIT2)
                {
                    System.out.print("According to your average mark you have achieved the Merit2 grade");
                }
        else if(averageM>=PASS)
                {
                    System.out.print("According to your average mark you have achieved the Pass grade");
                }
        else
                {
                    System.out.print("According to your average mark you have achieved the Fail grade");
                }
    }
}



