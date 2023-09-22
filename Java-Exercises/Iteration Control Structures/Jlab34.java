
class Jlab34

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// smallest, largest and average value of a collection of numbers
{
    public static void main(String[] args) 
    {
        int highest;
        int lowest;
        double average;
        int listNo;
        int currentNo;
        int index;
        int sum;

        highest = 0;
        lowest = 0;
        average = 0;
        sum = 0;

        System.out.print("Enter how many values are in your list -> ");
        listNo = EasyIn.getInt();

        for (index = 1; index <= listNo; index ++)
            {
                System.out.print("Enter number " + index + " ");
                currentNo = EasyIn.getInt();
                    
                    if (currentNo > highest)
                        {
                            highest =currentNo;
                        }
                    if (currentNo < lowest || index <= 1)
                        {
                            lowest = currentNo;
                            
                        }
                    sum += currentNo; 
                    average = (double) sum/listNo;
            }
        

       System.out.print("The highest number was " + highest + " and the lowest number was " + lowest + 
       " and the average number is " + average);
    }
}



