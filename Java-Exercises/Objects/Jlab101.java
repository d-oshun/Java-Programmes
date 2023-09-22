
class Footballer

// Student Name : 		Diana Williams Oshun
// Student Id Number : 	C00283112
// footballer object
{        
            private String name;
            private int goals;
            private int points;
            private int total;

            public Footballer ()  //constucter
                {
                    name = "";
                    goals = 0;
                    points = 0;
                    total = 0;
                }
            
            public void setName(String theName)    //setter
                {
                    name = theName;
                }
            public void setGoals(int theGoals)
                {
                    goals = theGoals;
                }
            public void setPoints(int thePoints)
                {
                    points = thePoints;
                }
            public void setTotal(int theTotal)
                {
                    total = theTotal;
                }

            
            public String getName(String theName)     //setter
                {
                    return name;
                }
            public int getGoals(int theGoals)
                {
                    return goals;
                }
            public int getPoints(int thePoints)
                {
                    return points;
                }
            public int getTotal(int theTotal)
                {
                    return total;
                }

            public String toString ()    //to String
                {
                    String myString;
                    
                    myString = "";
                    myString += "\n Name         : " + name;
                    myString += "\n Goals        : " + goals;
                    myString += "\n Points       : " + points;
                    myString += "\n Total Points : " + total;
                    
                    return myString;
                }
        public static void main(String[] args)
            {
                Footballer footballer1;
                String curName;             //cur = current
                int curGoals;
                int curPoints;
                int curTotal;
                final int GVALUE = 3;

                footballer1 = new Footballer();

                System.out.print("Please enter the footballer's name -> ");
                curName = EasyIn.getString();
                System.out.print("Please enter the goals scored by the footballer -> ");
                curGoals = EasyIn.getInt();
                System.out.print("Please enter the points scored by the footballer -> ");
                curPoints = EasyIn.getInt();
                
                curTotal = curPoints + (curGoals * GVALUE);

                footballer1.setName(curName);
                footballer1.setGoals(curGoals);
                footballer1.setPoints(curPoints);
                footballer1.setTotal(curTotal);
                System.out.println(footballer1.toString());          
            }

}


