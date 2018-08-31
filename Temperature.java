// Name : Catherine Oliver
// Class : CIST1400-001
// Colleagues : N/A
// Resources : N/A
// The purpose of this program is to convert Celsius to Fahrenheit

public class Temperature
{
   public static void main(String[] args)
   {
   
      // declare variables
      double inputCelsius;
      double outputDegreesF;
      final double conversion = 9.0/5.0;
      final int base = 32;
      
      // set up input value 
      inputCelsius = 17;
      outputDegreesF = inputCelsius * conversion + base;
      System.out.println(inputCelsius + " degrees Celsius is " + outputDegreesF
                        + " degrees Fahrenheit.");
   }
}