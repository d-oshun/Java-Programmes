
class Jlab82

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// counts how many times the highest number was entered in an array
{
    public static int noHighest(int[] myArray)
        {
            int highest;
            int index;
            int noHigh;

            highest = 0;
            noHigh = 0;

            for (index = 0; index < myArray.length; index++)
                {
                    if (myArray[index] > highest)
                        {
                            highest = myArray[index];
                            noHigh = 1;
                            
                        }
                    else if (highest == myArray[index] )
                        { 
                            noHigh++;
                        }
                }
            return noHigh;
        }
    public static void main(String[] args) 
    {
        int numbers[];
        numbers = new int[10];
        int index;

        for (index = 0; index < numbers.length ; index++)
            {
                System.out.print("Please enter number " + index + " -> ");
                numbers[index] = EasyIn.getInt();
            }
        
        System.out.print("The highest number was entered " + noHighest(numbers) + " time(s)");
    }
}


