
class Jlab53

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
//outputs average, max and min amount of characters in the words entered
{
    public static void main(String[] args) 
    {
        
        String sentence;
    	String currentWord;
		char current;
		int noSpace;
    	int firstSpace;
    	int index;
    	int letterCount;
    	int validCount;
    	int strIndex;
        int senLength;
        int average;
        int minimum;
        int maximum;
    	
        maximum = 0;
        minimum = 0;
		noSpace = 0;
    	validCount = 0;

    	System.out.print("Please enter a sentence of 3 or more words -> ");
		sentence = EasyIn.getString();

        

		for (index = 0; index <= sentence.length()-1; index++)
            {
                current = sentence.charAt(index);

                if (current == ' ')
                    {
                        
                        noSpace++;
                        
                    }
			}

        senLength = sentence.length() - noSpace;

        for (index = 1; index <= noSpace; index++)
    		{
		    	firstSpace = sentence.indexOf(" ");
		    	currentWord = sentence.substring(0, firstSpace);
		    	sentence = sentence.substring(firstSpace + 1);
		    	letterCount = 0;
		    	for (strIndex = 0; strIndex < currentWord.length(); strIndex++)
		    		{
                        minimum = currentWord.length();
                        if (currentWord.length()< minimum)
                            {
                                minimum = currentWord.length();
                            }
                        if (currentWord.length() >= maximum)
                        {
                            maximum = currentWord.length();
                        }
		    			if (currentWord.charAt(strIndex) >= '#')
		    				{
		    					letterCount ++;
		    				}
		    		}
		    	if (letterCount == currentWord.length())
		    		{
		    			validCount ++;
		    		}

		    	if (sentence.charAt(strIndex) != '#')
		    		{
		    			letterCount ++;
		    		}

		    	if (letterCount == currentWord.length())
		    		{
		    			validCount ++;
		    		}	
               
			} 
        validCount = validCount + 1;
        if(sentence.length()>= maximum)	
            {
                maximum = sentence.length();
            }
        average = senLength/validCount;

		System.out.println("In the sentence you entered " + validCount + " word(s)");
		System.out.println("The average amount of characters in a word is " + average);
        System.out.println("The maximum amount of characters in a word is " + maximum);
        System.out.println("The minimum amount of characters in a word is " + minimum);
    }
}



