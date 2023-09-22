
class Jlab45

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// outputs reverse of a name
{
    public static void main(String[] args) 
    {
        String name;
        char reverse;
        int index;



        System.out.print("Please enter your name -> ");
        name = EasyIn.getString();

        for (index = name.length()-1; index >= 0 ; index--)
            {
                reverse = name.charAt(index);
                System.out.print(reverse);
            }
       
    }
}


