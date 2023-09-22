import java.time.LocalDateTime;

class Jlab47

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// counts how many times a letter appeared in a name
{
    public static void main(String[] args) 
    {
        
   
        String name;
        char currentChar; 
        int letterA;
        int index;

        letterA = 0;

        System.out.print("Please enter your name -> ");
        name = EasyIn.getString();

        for (index = 0; index <= name.length()-1; index ++)
            {
                currentChar = name.charAt(index);

                if ((currentChar =='A') || (currentChar =='a'))
                    {
                        letterA++;
                    }

            }

        System.out.print("The letter 'a' appearded " + letterA + " time(s) in your name");
    }
}
