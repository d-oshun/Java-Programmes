
class Skeleton

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// Date :				1/9/2005
{
    public static void secondlastSpace(String mySentence, int theLength)
    {
        int index;
        char currentChar;
        int firstTime;
        int secondTime;
        
        firstTime = 0;
        secondTime = 0;

        for (index=theLength-1; 0<=index; index --)
        {
            currentChar = mySentence.charAt(index);

            if (currentChar == ' ')
                {
                    if (firstTime == 0)
                        {
                            firstTime=index;
                            secondTime=index;
                        }
                    else if (secondTime == firstTime)
                        {
                            secondTime = index;
                        }

                }      
        }
        System.out.print("The index position of the second last space is " + secondTime);
    }
    public static void main(String[] args)
    {
        String sentence;

        System.out.print("Please enter a sentence -> ");
        sentence = EasyIn.getString();

        secondlastSpace(sentence, sentence.length()); 
    }
}


