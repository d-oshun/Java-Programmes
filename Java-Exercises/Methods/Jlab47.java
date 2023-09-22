import java.time.LocalDateTime;

class Jlab47

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// Date :				1/9/2005
{
    public static void countA(String myName) 
    {
        
        char currentChar; 
        int letterA;
        int index;

        letterA = 0;

        
        for (index = 0; index <= myName.length()-1; index ++)
            {
                currentChar = myName.charAt(index);

                if ((currentChar =='A') || (currentChar =='a'))
                    {
                        letterA++;
                    }

            }

        System.out.print("The letter 'a' appearded " + letterA + " time(s) in your name");
    }
    public static void main(String[] args) 
    {
        String name;

        System.out.print("Please enter your name -> ");
        name = EasyIn.getString();

        countA(name);

    }
}
