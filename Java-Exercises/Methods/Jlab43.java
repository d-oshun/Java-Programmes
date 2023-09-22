class Jlab43

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// Date :				1/9/2005
{
    public static void noCharacters(String myName) 
    { 
        int noChar;

        noChar = myName.length();

        System.out.print("There are " + (noChar-1)+ " letters in your name");
    }
    public static void main(String[] args) 
    {
        String name;
        
        System.out.print("Please enter your first and second name -> ");
        name = EasyIn.getString();

        noCharacters(name);
    }
}


