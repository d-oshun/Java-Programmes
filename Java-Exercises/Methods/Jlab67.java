
class Jlab67

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// outputs loction of last space
{
    public static void lastSpace(String mySentence)
    {
        int index;
        char currentChar;
        int lastTime;

        lastTime = 0;

        for (index=1;mySentence.length()>index; index ++)
        {
            currentChar = mySentence.charAt(index);

            if (currentChar == ' ')
                {
                    lastTime = index;
                }

            
        }
       System.out.print("The index position of the last space is " + lastTime);
    }
    public static void main(String[] args) 
    {
        String sentence;

        System.out.print("Please enter a sentence -> ");
        sentence = EasyIn.getString();

        lastSpace(sentence); 
    }
}


