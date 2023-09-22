
class Jlab75

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// checks if its a palindrome
{
    public static String reverseNAME(String myName) 
    {
        char reverse;
        int index;
        String reverseWord;

        reverseWord ="";

        for (index = myName.length()-1; index >= 0 ; index--)
            {
                reverse = myName.charAt(index);
                reverseWord = reverseWord + reverse;
            }
        return reverseWord;
       
    }
    public static void main(String[] args) 
    {
        char characters[];
        characters = new char[4];
        String reverse;
        String forward;
        int index;

        forward = "";
        reverse = "";
        

        for (index = 0; index < characters.length; index++)
            {
                System.out.println("Please enter character " + index + " -> ");
                characters[index] = EasyIn.getChar();
                
                if(((characters[index] >= 'a') && (characters[index] <= 'z')) || ((characters[index] >= 'A') && (characters[index] <= 'Z')))
                    {
                        forward = forward + characters[index];
                        
                    }
                else    
                    {
                        forward = "788";
                        break;
                    }
       
            }

         reverse = reverseNAME(forward);

        if (reverse.compareTo(forward) == 0)
            {
                System.out.println("This is an alphabetic palindrome!");
            }
        else
            {
                System.out.println("This is not an alphabetic palindrome");
            }            


    }
}


