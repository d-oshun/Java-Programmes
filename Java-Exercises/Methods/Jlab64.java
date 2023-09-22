
class Jlab64

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// calculates grade for test
{
    public static void award(int theGrade)
    {
        if (theGrade>=70)
            {
                System.out.print("Distinction, Pass");
            }
        else if (theGrade>=63)
            {
                System.out.print("Merit1, Pass");
            }
        else if (theGrade>=55)
            {
                System.out.print("Merit2, Pass");
            }
        else if (theGrade>=40)
            {
                System.out.print("Pass");
            }
        else 
            {
                System.out.print("Fail");
            }
    }
    public static void main(String[] args) 
    {
        int grade;

        System.out.print("Please enter your final grade -> ");
        grade = EasyIn.getInt();

        System.out.print("Your final marking is ");
        award(grade);
    }
}


