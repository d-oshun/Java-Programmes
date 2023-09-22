
class Jlab62

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// checks if character is a letter
{
    public static void isAlpha(char theChar)
    {
        int index;

        if (((theChar >= 'a') && (theChar <= 'z')) || ((theChar >= 'A') && (theChar <= 'Z')))
            {
                System.out.print("true");
            }
        else
            {
                System.out.print("false");
            }
    }
    public static void main(String[] args) 
    {
        char character1;

        System.out.print("Please enter one character -> ");
        character1 = EasyIn.getChar();

        System.out.print("Did you enter an alphabetic character, true or false? ");
        isAlpha(character1);
    }
}


