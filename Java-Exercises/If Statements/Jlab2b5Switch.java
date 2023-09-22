
class Jlab2b5Switch

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
//using switch statements input the number of a month and outputting the name of that month
{
    public static void main(String[] args) 
    {
        int option;
 
	    System.out.print("Enter month option (1-12) ->");
 	    option = EasyIn.getInt();

	    switch(option) 
		    {
   			    case 1: 
				    System.out.println("You selected January ");
                    break;
   			    case 2: 
				    System.out.println("You selected Febuary");
                    break;
   			    case 3: 
				    System.out.println("You selected March");
                    break;
                case 4: 
                    System.out.println("You selected April");
                    break;
                case 5: 
                    System.out.println("You selected May");
                    break;
                case 6: 
                    System.out.println("You selected June");
                    break;
                case 7: 
                    System.out.println("You selected July");
                    break;
                case 8: 
                    System.out.println("You selected August");
                    break;
                case 9: 
                    System.out.println("You selected September");
                    break;
                case 10: 
                    System.out.println("You selected October");
                    break;
                case 11: 
                    System.out.println("You selected November");
                    break;
                case 12: 
                    System.out.println("You selected December");
                    break;
   			    default:  
				    System.out.println("Invalid Option!");
 		    }
    }
}


