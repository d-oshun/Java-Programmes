
class Jlab68

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// last space but uses a method
{
    public static void lastSpace(String mySentence, int theLength)
    {
        int index;
        char currentChar;
        int firstTime;
        
        firstTime = 0;

        for (index=theLength-1; 0<=index; index --)
        {
            currentChar = mySentence.charAt(index);

            if (currentChar == ' ')
                {
                    if (firstTime == 0)
                        {
                            firstTime=index;
                        }

                }

            
        }
       System.out.print("The index position of the last space is " + firstTime);
    }
    public static void main(String[] args) 
    {
        String sentence;

        System.out.print("Please enter a sentence -> ");
        sentence = EasyIn.getString();

        lastSpace(sentence, sentence.length()); 
    }
}


