
class Jlab81

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// finds highest number in an array
{
    public static int findHighest(int[] myArray)
        {
            int highest;
            int index;

            highest = 0;

            for (index = 0; index < myArray.length; index++)
                {
                    if (myArray[index]>= highest)
                        {
                            highest = myArray[index];
                        }
                }
            return highest;
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
        
        System.out.print(findHighest(numbers));
    }
}


