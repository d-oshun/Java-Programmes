
class Jab48

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// Date :				1/9/2005
{
    public static void main(String[] args) 
    {

        String name;
        String surname;
        String firstname;
        int firstSpace;
        int secondSpace;

        System.out.print("Please enter your full name -> ");
        name = EasyIn.getString();

        firstSpace = name.indexOf(" ");
        firstname = name.substring(0, firstSpace);

        secondSpace = name.indexOf(" ", firstSpace +1);

        surname = name.substring(secondSpace + 1);

        System.out.print("Your name without your middle name is " + firstname + " " + surname);

    }
}


