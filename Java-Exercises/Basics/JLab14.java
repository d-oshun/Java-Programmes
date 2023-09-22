class JLab14

// Student Name : Diana Williams Oshun
// Student Id Number : C00283112
// Date : 1/9/2022

{
    public static void main(String args[])
    {
        double no1;
        double no2;
        double no3;
        double ave;
        double sum;
        double pro;

        System.out.print("Please enter the first number -> ");
        no1 = EasyIn.getDouble();

        sum = no1 + 0;
        ave = sum / 1;
        pro = no1 * 1;

        System.out.print(" The sum of all numbers entered is -> " + sum);
        System.out.print(" The product of all numbers entered is -> " + pro);
        System.out.print(" And lastly the average of all numbers entered is -> " + ave);



        System.out.print(" Please enter the second number -> ");
        no2 = EasyIn.getDouble();

        sum = no1 + no2;
        ave = sum / 2;
        pro = no1 * no2;

        System.out.print(" The sum of all numbers entered is -> " + sum);
        System.out.print(" The product of all numbers entered is -> " + pro);
        System.out.print(" And lastly the average of all numbers entered is -> " + ave);



        System.out.print(" Finally enter the third number -> ");
        no3 = EasyIn.getDouble();

        sum = no1 + no2 + no3;
        ave = sum / 3;
        pro = no1 * no2 * no3;

        System.out.print(" The sum of all numbers entered is -> " + sum);
        System.out.print(" The product of all numbers entered is -> " + pro);
        System.out.print(" And lastly the average of all numbers entered is -> " + ave);

    }
}