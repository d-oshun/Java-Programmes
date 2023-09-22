
class Jlab44

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// Date :				1/9/2005
{
    public static void upperChar(String myName) 
    {
       
        char currentChar; 
        int noUpper;
        int index;

        noUpper = 0;
        
        

        for (index = 0; index <= myName.length()-1; index ++)
            {
                currentChar =myName.charAt(index);

                if ((currentChar>='A') && (currentChar<='Z'))
                    {
                        noUpper++;
                    }

            }

        System.out.print("There is " + noUpper + " upper case letters in the name you entered");

    }
    public static void main(String[] args) 
    {
        String name;

        System.out.print("Please enter your name -> ");
        name = EasyIn.getString();

        upperChar(name);
    }
}


