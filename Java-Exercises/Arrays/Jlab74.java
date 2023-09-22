
class Jlab74

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// counts vowels and consonants in an arry
{
    public static void main(String[] args) 
    {
        int vowel;
        int consonants;
        int other;
        int index;
        char characters[];
        characters = new char[5];
        
        vowel = 0;
        consonants = 0;
        other = 0;

        for (index = 0; index < characters.length; index++)
        {
            System.out.print("Please enter a single character -> ");
            characters[index]=EasyIn.getChar();

            if(((characters[index] >= 'a') && (characters[index] <= 'z')) || ((characters[index] >= 'A') && (characters[index] <= 'Z')))
                {
                    if(((characters[index] == 'a') || (characters[index] == 'e') ||(characters[index] == 'i') ||(characters[index] == 'o') ||
                    (characters[index] == 'u')) ||((characters[index] == 'A') || (characters[index] == 'E') ||(characters[index] == 'I') ||
                    (characters[index] == 'O') ||(characters[index] == 'U')))
                        {
                            vowel++;
                        }
                    else
                        {
                            consonants++;
                        }
                }
            else
                {
                    other++;
                }
        }
        System.out.print("In your list there are " + vowel + " vowel(s), " + consonants + " consonant(s) and " + other + " other characters");
    }
}


