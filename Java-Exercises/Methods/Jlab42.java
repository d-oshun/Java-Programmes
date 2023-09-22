class Jlab42

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// Date :				1/9/2005
{
    public static void firstname(String myName) 
    {
        
        String firstName;
        int spacePos;

        spacePos = myName.indexOf(" ");
        firstName = myName.substring(0, spacePos);

        System.out.print("Your first name is " + firstName);
    }
    public static void main(String[] args) 
    {
        String name;
        
        System.out.print("Please enter your full name -> ");
        name = EasyIn.getString();

        firstname(name);

    }
}


