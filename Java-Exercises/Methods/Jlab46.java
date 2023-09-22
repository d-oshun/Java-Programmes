
class Jlab46

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// Date :				1/9/2005
{
    public static void backwardsName(String myName) 
    {
        
        String firstname;
        String surname;
        int space;

        
        space = myName.indexOf(" ");
        firstname = myName.substring(0, space);
        surname = myName.substring(space + 1);

        System.out.print("The reverse of your name is " + surname + " " + firstname);

    }
    public static void main(String[] args) 
    {
        String name;

        System.out.print("Please enter your name -> ");
        name = EasyIn.getString();

        backwardsName(name);

    }
}


