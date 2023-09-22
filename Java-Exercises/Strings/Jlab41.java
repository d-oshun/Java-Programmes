
class Jlab41

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// inputs full name outputs just the surname
{
    public static void main(String[] args) 
    {

        String name;
        String surname;
        int spacePos;

        System.out.print("Please enter your full name -> ");
        name = EasyIn.getString();

        spacePos = name.indexOf(" ");
        surname = name.substring(spacePos + 1);

        System.out.print("Your surname is " + surname);

    }
}


