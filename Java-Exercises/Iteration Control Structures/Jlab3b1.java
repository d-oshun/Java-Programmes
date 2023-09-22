
class Jlab3b1

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// cash register 
{
    public static void main(String[] args) 
    {
        final double BREAD = 1.50;
        final double MILK = 1.95;
        final double COFFEE = 1.15;
        final double BUTTER = 2.00;
        double total;
        int currentItem;

        total = 0;

        System.out.println("To start the cash register press 1 ->");
        currentItem = EasyIn.getInt();

        while (currentItem != 5 )
            {
                System.out.println("Below is the cash register screen:");
                System.out.println("1.	Bread");
                System.out.println("2.	Milk");
                System.out.println("3.	Coffee");
                System.out.println("4.	Butter");
                System.out.println("5.	Exit and Display Bill");
                System.out.print("Enter the item chosen (1-5) ->");
                currentItem = EasyIn.getInt();

                switch (currentItem)
                    {
                        case 1:

                            System.out.print("Bread");
                            total = total + BREAD;                          
                            break;

                        case 2:
                            System.out.print("Milk"); 
                            total = total + MILK;                          
                            break;

                        case 3:
                            System.out.print("Coffee");
                            total = total + COFFEE;                            
                            break;

                        case 4:
                            System.out.print("Butter"); 
                            total = total + BUTTER;                                                        
                            break;

                        case 5:
                            System.out.println("The menu is now closed");
                            break;

                        default:  
                            System.out.println("Invalid Option!");
                            break;
                    }
            }
        System.out.println("Your total is " + total + "£");
    }
}



