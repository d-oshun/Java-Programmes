class Jlab2c1

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// program reads earthquake magnitude and displays the danger level
{
    public static void main(String[] args) 
    {
        double enterMag;
        final double MICRO = 2.0;
        final double MINOR = 3.0;
        final double LIGHT = 4.0;
        final double MODERATE = 5.0;
        final double STRONG1 = 6.0; 
        final double MAJOR = 7.0;
        final double GREAT = 8.0;

        System.out.print("Please enter the magnitude of the earthquake you expirienced ->");
        enterMag = EasyIn.getDouble();

        if (enterMag >= GREAT)
            {
                System.out.print("You have expirienced an earthquake of Great magnitude");
            }
        else if (enterMag>= MAJOR)
            {
                System.out.print("You have expirienced an earthquake of Major magnitude");
            }
        else if (enterMag>= STRONG1)
            {
                System.out.print("You have expirienced an earthquake of Strong magnitude"); 
            }
        else if (enterMag>= MODERATE)
            {
                System.out.print("You have expirienced an earthquake of Moderate magnitude");
            }
        else if (enterMag>= LIGHT)
            {
                System.out.print("You have expirienced an earthquake of Light magnitude");
            }
        else if (enterMag>= MINOR)
            {
                System.out.print("You have expirienced an earthquake of Minor magnitude");
            }
        else if (enterMag>= MICRO)
            {
                System.out.print("You have expirienced an earthquake of Micro magnitude");
            }
        else if (enterMag<= MICRO)
            {
                System.out.print("You have expirienced an earthquake of Micro magnitude");
            }
    }
}


