
class Jlab46

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// enters full name outputs surname first then first name
{
    public static void main(String[] args) 
    {
        String name;
        String firstname;
        String surname;
        int space;

        System.out.print("Please enter your name -> ");
        name = EasyIn.getString();

        space = name.indexOf(" ");
        firstname = name.substring(0, space);
        surname = name.substring(space + 1);

        System.out.print("The reverse of your name is " + surname + " " + firstname);



    }
}


