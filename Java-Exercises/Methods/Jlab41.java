
class Jlab41

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// Date :				16/01/2023
{
    public static void surname(String myName) 
    {
        String surname;
        int spacePos;

        
        spacePos = myName.indexOf(" ");
        surname = myName.substring(spacePos + 1);

        System.out.print("Your surname is " + surname);

    }
    public static void main(String[] args) 
    {
        String name;
         
        System.out.print("Please enter your full name -> ");
        name = EasyIn.getString();

        surname(name);

    }
}


