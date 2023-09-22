class JLab03

// Student Name : Diana Williams Oshun
// Student Id Number : C00283112
// Date : 1/9/2022

{
    public static void main(String args[])
    {
        double AnnInc;
        double NoChild;
        double TaxPay;

        System.out.print("What is your annual income? ");
        AnnInc = EasyIn.getDouble();
        System.out.print("How may children do you have? ");
        NoChild = EasyIn.getDouble();

        TaxPay = (AnnInc -5000 -(NoChild * 1000))* 0.24;

        System.out.print("This is your annual tax payment -> " + TaxPay);

    }
}