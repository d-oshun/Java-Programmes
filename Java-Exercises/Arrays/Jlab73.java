
class Jlab73

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// counts amount of highest and lowest number entered
{
    public static void main(String[] args) 
    {
        int highest;
        int lowest;
        int timeLow;
        int timeHigh;
        int index;
        int numbers[];
        numbers = new int[5];

        highest = 0;
        lowest = 0;
        timeHigh = 0;
        timeLow = 0;

        for (index = 0; index < numbers.length; index++)
            {
                System.out.print("Please enter number " + index + " -> ");
                numbers[index]=EasyIn.getInt();

                if(numbers[index]>highest)
                    {
                        highest = numbers[index];
                        timeHigh = 1;
                    }
                else if (numbers[index]==highest)
                    {
                        timeHigh++;
                    }
                if((numbers[index]<lowest) || (index == 0))
                    {
                        lowest = numbers[index];
                        timeLow = 1;
                    }
                else if (numbers[index]==lowest)
                    {
                        timeLow++;
                    }
            }
        System.out.println("The highest number is " + highest + " and it was entered " + timeHigh + " time(s)");
        System.out.println("The lowest number is " + lowest + " and it was entered " + timeLow + " time(s)");
    }
}



