public static void main(String args[])
  {
    int number1;
    int number2;
    int answer;

  ` System.out.print("Please enter the first number -> ");
    number1 = EasyIn.getInt();
    System.out.print("Please enter the second number -> ");
    number2 = EasyIn.getInt();

    answer = number1 - number2;

    System.out.print(number1 + "-" + number2 + "=" + answer);
    
  }
