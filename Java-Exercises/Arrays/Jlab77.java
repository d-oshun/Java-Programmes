
class Jlab77

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// checks an array of palindromes
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
        words = new String[5];
        String reverse[];
        reverse = new String[5];
        int index;
        int palindrome;
        int notPalindrome;
        char characters;
        
        palindrome = 0;
        notPalindrome = 0;

        for (index = 0; index < words.length; index++)
            {
                System.out.print("Please enter a single word -> ");
                words[index] = EasyIn.getString();

                characters = words[index].charAt(index);
                reverse[index] = reverseNAME(words[index]);

                if(((characters >= 'a') && (characters <= 'z')) || ((characters >= 'A') && (characters <= 'Z')))
                    {  
                        
                        if (reverse[index].compareTo(words[index]) == 0)
                            {
                                System.out.println("This is an alphabetic palindrome!");
                                palindrome++;
                            }
                        else
                            {
                                System.out.println("This is not a palindrome");
                                notPalindrome++;
                            }
                    }
                else    
                    {
                        System.out.println("This is not an alphabetic palindrome");
                        notPalindrome++;
                    }
            }
        
        System.out.print("In the array there is a total of " + palindrome + " palindromes and " + notPalindrome + " non-palindromes");

    }
}




