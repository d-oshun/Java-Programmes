
class Jlab44

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// counts how many upper case letter in name			
{
    public static void main(String[] args) 
    {
        String name;
        char currentChar; 
        int noUpper;
        int index;

        noUpper = 0;
        
        System.out.print("Please enter your name -> ");
        name = EasyIn.getString();

        for (index = 0; index <= name.length()-1; index ++)
            {
                currentChar = name.charAt(index);

                if ((currentChar>='A') && (currentChar<='Z'))
                    {
                        noUpper++;
                    }

            }

        System.out.print("There is " + noUpper + " upper case letters in the name you entered");

    }
}


