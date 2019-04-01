public class StringConcatenation
{
   public static void main(String[] args)
   {
      //String concatenation examples:
      String word1 = "Tom", word2 = "Cat", word3 = word1 + word2, word4;
      System.out.println(word3);
      System.out.println(word1 + word2);
      word4 = word1 + " " + word2 + " pay attention to spaces INSIDE quotation marks! " + word3;
      System.out.println(word4);
      word4 = word1    +    word2 +     "pay attention to spaces INSIDE quotation marks!"    + word3;
      System.out.println(word4);
      word1 = "";          //word1 contains the empty String (nothing)
      System.out.println(word1); //nothing to see, notice the blank line in the output
      //On the line below, note the a is wrapped in ' and ', not " and ".
      //This makes the a type char rather than type String
      word1 += 'a';        // concatenate a type char to the empty String
      System.out.println(word1);
      word1 += 'b';        // concatenate another char to word1
      System.out.println(word1);
      word1 += ", the first two letters of the alphabet."; //concatenate a String to word1
      System.out.println(word1);
   }
}