
class Jlab36

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// prints out how many times the hieghest and lowest values were entered
{
    public static void main(String[] args) 
    {

        int highest;
        int lowest;
        int average;
        int listNo;
        int currentNo;
        int index;
        int timesHigh;
        int timesLow;
        final int DIVIDE = 2;

        highest = 0;
        lowest = 0;
        average = 0;
        timesHigh = 0;
        timesLow = 1;

        System.out.print("Enter how many values are in your list -> ");
        listNo = EasyIn.getInt();

        for (index = 1; index <= listNo; index ++)
            {
                System.out.print("Enter number " + index + " -> ");
                currentNo = EasyIn.getInt();
                    
                    if (currentNo > highest)
                        {
                            highest =currentNo;
                            timesHigh = 1;
                        }
                    else if (currentNo == highest)
                        {
                            timesHigh ++;
                        }
                    if (currentNo < lowest || index <= 1)
                        {
                            lowest = currentNo;
                            timesLow = 1;
                        }
                    else if (currentNo == lowest)
                        {
                            timesLow ++;
                        }
                    average = (highest + lowest)/DIVIDE;

                System.out.println("The highest number was " + highest + " and the lowest number was " + lowest + 
                                    " and the average number is " + average);
            }
        System.out.print("The highest number was entered " + timesHigh + " time(s) and the lowest number was entered " 
                            + timesLow + " time(s)");

    }
}



