public class JLab15

// Student Name : Diana Williams Oshun
// Student Id Number : C00283112
// Date : 1/9/2022

{
   public static void main(String args[])
   {
        double loanAmount;
        double intrestRate;
        double yearsLoan;
        double repaid;
        double rateOfIntrest;
        
        System.out.print("You have taken out a loan, please enter the loan amout ->");
        loanAmount = EasyIn.getDouble();
        System.out.print("What is the intrest rate per annum on your loan -> ");
        intrestRate = EasyIn.getDouble();
        System.out.print("Finally enter how many years you have taken out the loan for ->");
        yearsLoan = EasyIn.getDouble();

        rateOfIntrest = (intrestRate / 100);
        repaid = (loanAmount * rateOfIntrest * yearsLoan) + loanAmount;

        System.out.print("The amount to be repaid is -> " + repaid);

   }
} 
