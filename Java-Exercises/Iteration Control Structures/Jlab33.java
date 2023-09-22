class Jlab33

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// Date :				1/9/2005
//redaing a list of ints and finding the first and last time 12 appears
{
    public static void main(String[] args) 
    {
        int lastOcc;
        int firstOcc;
        int currentNo;
        int listNo;
        int index;
        final int START = 1;
        final int FIND = 12;
        lastOcc = 0;
        firstOcc = 0;

        System.out.print("Please enter the amount of values you want in the list -> ");
        listNo = EasyIn.getInt();

        for (index = START; index <= listNo; index ++)
            {
                System.out.print("Please enter number " + index + " -> ");
                currentNo = EasyIn.getInt();

                if (currentNo == FIND)
                    {
                        if (firstOcc == 0)
                            {
                                firstOcc = index;
                            }
                        lastOcc = index;
                    }
            }
        if (lastOcc != 0)
            {
                System.out.println("The first occurance of " + FIND + " is index " + firstOcc);
                System.out.println("The last occurance of " + FIND + " is index " + lastOcc);
            }
        else
            {
                System.out.print(FIND + " doesnt appear in the list");
            }
    }
}


