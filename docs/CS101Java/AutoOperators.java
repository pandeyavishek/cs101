public class AutoOperators
{
   public static void main(String[] args)
   {
      int number = 10; System.out.println(number);
      number++; System.out.println(number);
      number--; System.out.println(number);
      number+=2; System.out.println(number); 
      number-=3; System.out.println(number);
      number*=5; System.out.println(number);
      number/=2; System.out.println(number);
      number%=20; System.out.println(number);
      number = (int)(Math.random() * 2) + 1; System.out.println(number);
      number = (int)(Math.random() * 2); System.out.println(number);   
      number = (int)(Math.random() * 100) + 1; System.out.println(number); 
   }
}