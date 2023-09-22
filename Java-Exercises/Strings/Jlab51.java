
class Jlab51

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// counts individual words in a string
{
    public static void main(String[] args) 
    {
        String sentence;
        char current;
        int noSpace;
        int index;
        int number;

        noSpace = 1;
        number = 0;

        System.out.print("Please enter a sentence -> ");
        sentence = EasyIn.getString();

        for (index = 0; index <= sentence.length()-1; index++)
            {
                current = sentence.charAt(index);

                if (current == ' ')
                    {
                        
                        noSpace++;
                        
                    }
                if ( (current >= '0') && (current <='9'))
                    {
                        number++;
                    }
            }
        
        System.out.print("There is " + (noSpace-number) + " word(s) in your sentence");

    }
}


