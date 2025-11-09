
//feedback
 
/*
Great work boaz!
*/
 
 
// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String word = args[0];
                int number = Integer.parseInt(args[1]);
                int i=0;
                String letters = "AEFHILMNORSX";
                while (i < word.length())
                {
                        word = word.toUpperCase();
                        char c = word.charAt(i);
                        if (letters.contains("" + c))
                        {
                                System.out.println("Give me an " + args[0].charAt(i) + ": " + args[0].charAt(i) + "!");
                        }
                        else
                        {
                                System.out.println("Give me a  " + args[0].charAt(i) + ": " + args[0].charAt(i) + "!");
                        }
                        i++;
                }
                System.out.println("What does that spell?");
                for (int j =0; j<number ; j++)
                {
                        
                        System.out.println(word + "!!!");
                }
        }
}