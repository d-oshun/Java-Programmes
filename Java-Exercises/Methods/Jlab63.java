
class Jlab63

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// counts letters in a sentence
{
    public static void alphaCount(String theString)
    {
        int index;
        int count;

        count = 0;

        for (index = 0; index < theString.length(); index ++)
            {
                if (((theString.charAt(index)>='a')&&(theString.charAt(index)<='z')) || ((theString.charAt(index)>='A')&&(theString.charAt(index)<='Z')))
                    {
                        count++;
                    }
            }
        System.out.print(count);
    }
    public static void main(String[] args) 
    {
        String sentence;

        System.out.print("Please enter a sentence -> ");
        sentence = EasyIn.getString();

        System.out.print("There are ");
        alphaCount(sentence);
        System.out.print(" alphabetic characters in that sentence");
    }
}


