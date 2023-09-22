
class Jlab83

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
//issue deleted names end up at the top of the list
{
    public static void addName(String[] myName, int myElements)
    {
        String search;
        int index;

        System.out.print("Please enter the name you want to replace or press enter if there is a vacant slot -> ");
        search = EasyIn.getString();

        for (index = 0; index < myElements; index++)
            {
                if ((myName[index].compareTo(search)) == 0)
                    {
                        System.out.print("Please enter the new name -> ");
                        myName[index] = EasyIn.getString();
                    }
            }
        for(int i = 0; i<myElements; i++)
            {  
                for (int j = i+1; j<myElements; j++)
                {  
                   if(myName[i].compareTo(myName[j])>0)   
                   {  
                       String temp = myName[i];  
                       myName[i] = myName[j];  
                       myName[j] = temp;  
                    }  
                 }  
              }  
        
    }
    public static void deleteName(String[] myName, int myElements)
    {
        String search;
        int index;

        System.out.print("Please enter the name you want to delete -> ");
        search = EasyIn.getString();

        for (index = 0; index < myElements; index++)
            {
                if ((myName[index].compareTo(search)) == 0)
                    {
                        myName[index] = "";
                        myElements--;
                    }
            }
        for(int i = 0; i<myElements; i++)
            {  
                for (int j = i+1; j<myElements; j++)
                {  
                   if(myName[i].compareTo(myName[j])>0)   
                   {  
                       String temp = myName[i];  
                       myName[i] = myName[j];  
                       myName[j] = temp;  
                    }  
                 }  
              }  
        
    }
    public static void checkName(String[] myName, int myElements)
    {
        String search;
        int index;
        int find;

        find = 0;

        System.out.println("Please enter the name you're lookig for -> ");
        search = EasyIn.getString();

        for (index = 0; index < myElements; index++)
            {
                if ((myName[index].compareTo(search)) == 0)
                    {
                        find = index;
                        System.out.println("The name you're looking for is at number " + find);

                    }
            }
        
    }
    public static void listName(String[] myName, int myElements)
    {
        int index;

        for (index = 0; index < myElements; index++)
            {
                System.out.println(index + ". " + myName[index]);
            }  
    }
    public static void main(String[] args) 
    {
        int index;
        int menuNo;
        int elements;
        String names[];
        names = new String[5];


        elements = names.length;


        for (index = 0; index < elements; index ++)
            {
                System.out.print("Enter name " + index + " -> ");
                names[index] = EasyIn.getString();
            }

        for(int i = 0; i<elements; i++)   //Holds each element
        {  
            for (int j = i+1; j<elements; j++)  //Check for remaining elements 
            {  
                 
               if(names[i].compareTo(names[j])>0)   //compares each elements of the array to all the remaining elements
               {  
                   
                   String temp = names[i];  //swapping array elements  
                   names[i] = names[j];  
                   names[j] = temp;  
                }  
             }  
          }  

        do
        {
        System.out.println("Please enter a number from the menu");
        System.out.println("1.  Add Name");
        System.out.println("2.  Delete Name");
        System.out.println("3.  Search for a Name");
        System.out.println("4.  List all names");
        System.out.println("5.  Exit");
        System.out.print("-> ");
        menuNo = EasyIn.getInt();

        if (menuNo == 1)
          {
                addName(names, elements);
          }
        else if (menuNo == 2)
          {
                deleteName(names, elements);
          }
        else if (menuNo == 3)
            {
                checkName(names, elements);
            }
        else if (menuNo == 4)
            {
               listName(names, elements);     
            }
        else if (menuNo == 5)
            {
                System.out.print("You have exited the program!");
            }
        else    
          { 
                System.out.println("There is no function for this number!");
          }
        }
        while (menuNo != 5);

         
        
      } 

    }


