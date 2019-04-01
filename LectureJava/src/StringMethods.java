public class StringMethods
{
   public static void main(String[] args)
   {
      //declare and initialize variables
      String stuff = "AbCdEfG2<!";
      String upperStuff = stuff.toUpperCase();  //toUpperCase() is a String method
      String lowerStuff = stuff.toLowerCase();  //toLowerCase() is a String method
      int numberOfCharacters = stuff.length();  //length() is a String method
      String buildStringFromChars = "";

      System.out.print(stuff + ", " + upperStuff + ", " + lowerStuff + ", " + numberOfCharacters);
      System.out.println();
      //startsWith() and endsWith() are String methods
      System.out.println(stuff.startsWith("k") + " " + stuff.startsWith("K"));
      System.out.println(stuff.endsWith("!") + " " + stuff.endsWith("K"));

      buildStringFromChars += stuff.charAt(0);  //charAt() is a string method
      System.out.println(buildStringFromChars);
      buildStringFromChars += stuff.charAt(1);  //concatenate char to String in buildStringFromChars
      System.out.println(buildStringFromChars);
      buildStringFromChars += stuff.charAt(2);  //concatenate char to String in buildStringFromChars
      System.out.println(buildStringFromChars);
      System.out.println(stuff.indexOf('G'));
      buildStringFromChars = "";
      for(int index = 0; index < stuff.length(); index++)
      {
         buildStringFromChars += stuff.charAt(index);
      }
      System.out.println(buildStringFromChars + " was concatenated character by character from stuff!");
      
      // And one method of the Character class.
      // This is NOT a String method, it is a Character method.
      System.out.println(Character.isLetter('A') + " " + Character.isLetter('3'));
   }
}