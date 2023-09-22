
class Jlab43

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// counts how many characters in a name		
{
    public static void main(String[] args) 
    {
        String name;
        int noChar;

        System.out.print("Please enter your first and second name -> ");
        name = EasyIn.getString();

        noChar = name.length();

        System.out.print("There are " + (noChar-1)+ " letters in  your name");
    }
}


