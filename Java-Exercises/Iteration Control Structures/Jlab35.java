
class Jlab35

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// The smalles, largest and average value is outputted after each number is entered
{
    public static void main(String[] args) 
    {

        int highest;
        int lowest;
        int average;
        int listNo;
        int currentNo;
        int index;
        final int DIVIDE = 2;

        highest = 0;
        lowest = 0;
        average = 0;

        System.out.print("Enter how many values are in your list -> ");
        listNo = EasyIn.getInt();

        for (index = 1; index <= listNo; index ++)
            {
                System.out.print("Enter number " + index + " -> ");
                currentNo = EasyIn.getInt();
                    
                    if (currentNo > highest)
                        {
                            highest =currentNo;
                        }
                    if (currentNo < lowest || index <= 1)
                        {
                            lowest = currentNo;
                            
                        }
                    average = (highest + lowest)/DIVIDE;

                System.out.println("The highest number was " + highest + " and the lowest number was " + lowest + 
                                    " and the average number is " + average);
            }
      
    }
}



