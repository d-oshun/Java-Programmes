
class Jlab42

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// inputs full name outputs just the first name			
{
    public static void main(String[] args) 
    {
        String name;
        String firstName;
        int spacePos;

        System.out.print("Please enter your full name -> ");
        name = EasyIn.getString();

        spacePos = name.indexOf(" ");
        firstName = name.substring(0, spacePos);

        System.out.print("You're first name is " + firstName);
    }
}


