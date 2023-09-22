
class Jlab45

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// Date :				1/9/2005
{
    public static void reverseNAME(String myName) 
    {
        char reverse;
        int index;

        for (index = myName.length()-1; index >= 0 ; index--)
            {
                reverse = myName.charAt(index);
                System.out.print(reverse);
            }
       
    }
    public static void main(String[] args) 
    {
        String name;

        System.out.print("Please enter your name -> ");
        name = EasyIn.getString();

        reverseNAME(name);
    }
}


