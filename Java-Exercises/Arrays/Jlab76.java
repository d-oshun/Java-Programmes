
class Jlab76

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// checks if word is a palindrome
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
        String words[];
        words = new String[4];
        String reverse[];
        reverse = new String[4];
        int index;
        char characters;
        

        for (index = 0; index < words.length; index++)
            {
                System.out.println("Please enter a single word -> ");
                words[index] = EasyIn.getString();


                characters = words[index].charAt(index);
                reverse[index] = reverseNAME(words[index]);

                if(((characters >= 'a') && (characters <= 'z')) || ((characters >= 'A') && (characters <= 'Z')))
                    {
                        
                        if (reverse[index].compareTo(words[index]) == 0)
                            {
                                System.out.println("This is an alphabetic palindrome!");
                            }
                        else
                            {
                                System.out.println("This is not a palindrome");
                            }
                    }
                else    
                    {
                        System.out.println("This is not an alphabetic palindrome");
                    }
            }
        


    }
}





