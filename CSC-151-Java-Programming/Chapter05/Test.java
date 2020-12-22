import java.util.Scanner;

public class Test {

   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the temparature in Fahrenheittttttt: ");
       double ftemp = scan.nextDouble();
       Test t = new Test(ftemp);
       System.out.println("Celcius Temperature is "+t.getCelcius());
       System.out.println("Kevin Temperature is "+t.getKelvin());
   }


   private double ftemp;
   
   public Test(double f){
       ftemp = f;
   }
   public void setFahrenheit (double f){
       ftemp = f;
   }
   public double getFahrenheit(){
       return ftemp;
   }
   public double getCelcius(){
       return ((ftemp - 32) * 5)/9;
      
   }
   public double getKelvin(){
   return getCelcius() + 273.15;  
   }
}