
class Jlab71

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// counts odd and even numbers in an array
{
    public static boolean isEven(int theInteger)
    {
        return (theInteger % 2 == 0);
    }
    public static void main(String[] args) 
    {
        int even;
        int odd;
        int index;
        int numbers[];
        numbers = new int[4];

        even = 0;
        odd = 0;
      
        for (index = 0; index < numbers.length; index++)
            {
                System.out.print("Please enter a number -> ");
                numbers[index]= EasyIn.getInt();

                if (isEven(numbers[index])==true)
                    {
                        even++;
                    }
                else    
                    {
                        odd++;
                    }

            }
        System.out.print("There is " + odd + " odd number(s) and " + even + " even number(s) in your list");
    }
}


