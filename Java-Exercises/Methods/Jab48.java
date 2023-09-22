
class Jab48

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// Date :				1/9/2005
{
    public static void noMiddle(String myName) 
    {
        String surname;
        String firstname;
        int firstSpace;
        int secondSpace;

        firstSpace = myName.indexOf(" ");
        firstname = myName.substring(0, firstSpace);

        secondSpace = myName.indexOf(" ", firstSpace +1);

        surname = myName.substring(secondSpace + 1);

        System.out.print("Your name without your middle name is " + firstname + " " + surname);

    }
    public static void main(String[] args) 
    {
        String name;

        System.out.print("Please enter your full name -> ");
        name = EasyIn.getString();

        noMiddle(name);
    }
}


