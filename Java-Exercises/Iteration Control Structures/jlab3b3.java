
class jlab3b3

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// times table table
{
    public static void main(String[] args) 
    {

        int multiplication; 
        final int MAXROWS = 12;
        
        System.out.println("Printing multiplication table start");
        for (int row = 1; row <= MAXROWS; row ++ )
            {
                for (int collum = 1; collum <= row; collum ++)
                    {
                        multiplication = row * collum;
                        System.out.print(row + "x" + collum + "=" + multiplication + " ");
                    }
                System.out.println(" ");
            }
    }
}



