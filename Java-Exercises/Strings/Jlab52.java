
class Jlab52

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// if a word only caintains alphatical characters its valid, tells you how many valid words
//and what the last word is
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
    	for (index = sentence.length()-1; index >= 0; index--)
    		{
		    	firstSpace = sentence.indexOf(" ");
                currentWord = sentence.substring(firstSpace + 1, sentence.length()-1);
		    	sentence = sentence.substring(firstSpace - 1);
		    	letterCount = 0;

                System.out.print(currentWord + " ");
		    	for (strIndex = 0; strIndex < currentWord.length(); strIndex++)
		    		{
		    			if ((currentWord.charAt(strIndex) >= 'a' && currentWord.charAt(strIndex) <= 'z')||(currentWord.charAt(strIndex) >= 'A' && currentWord.charAt(strIndex) <= 'Z'))
		    				{
		    					letterCount ++;
		    				}
		    		}
		    	if (letterCount == currentWord.length())
		    		{
		    			validCount ++;
		    		}

		    	if ((sentence.charAt(strIndex) >= 'a' && sentence.charAt(strIndex) <= 'z')||(sentence.charAt(strIndex) >= 'A' && sentence.charAt(strIndex) <= 'Z'))
		    		{
		    			letterCount ++;
		    		}

		    	if (letterCount == currentWord.length())
		    		{
		    			validCount ++;
		    		}		
			}
        System.out.print(sentence);
		System.out.println("In the sentence you entered " + validCount + " word(s) are valid");
        System.out.println("this is the last word " + sentence);
		System.out.println();
    }
}




