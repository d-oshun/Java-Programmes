
class Jlab72

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// records highest and lowest number entered
{
    public static void main(String[] args) 
    {
        int highest;
        int lowest;
        int index;
        int numbers[];
        numbers = new int[4];

        highest = 0;
        lowest = 0;

        for (index = 0; index < numbers.length; index++)
            {
                System.out.print("Please enter number " + index + " -> ");
                numbers[index]=EasyIn.getInt();

                if(numbers[index]>=highest)
                    {
                        highest = numbers[index];
                    }
                if((numbers[index]<=lowest) || (index == 0))
                    {
                        lowest = numbers[index];
                    }
            }
        System.out.print("The highest number entered is " + highest + " and the lowest is " + lowest);
    }
}


