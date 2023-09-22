class JLab12

// Student Name : Diana Williams Oshun
// Student Id Number : C00283112
// Date : 1/9/2022

{
    public static void main(String args[])
    {
        double miles;
        double hours;
        double gallons;
        double avM;
        double avG;

        System.out.print("You have just gone on a trip!");
        System.out.print(" Please enter the distance you traveled in miles -> ");
        miles = EasyIn.getDouble();
        System.out.print(" Now can you enter the time spent on the trip in hours -> ");
        hours = EasyIn.getDouble();
        System.out.print(" Finally can you enter the amount of petrol you used in gallons -> ");
        gallons = EasyIn.getDouble();

        avM = miles / hours;
        avG = miles / gallons;

        System.out.print(" We have calculated that you have spent an average miles per hour of " + avM );
        System.out.print(" And an average miles per gallon of " + avG );

    }
}