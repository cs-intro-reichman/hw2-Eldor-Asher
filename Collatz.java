 
 
public class Collatz {
            public static void main(String args[]) {
                // Replace this comment with your code
                        int N = Integer.parseInt(args[0]);
                        String letter = args[1];
                        String sequence = "";
                        int counter = 1;
                        int number = 1;
                        boolean flag = true;
                        for (int i = 1; i <= N; i++)
                        {
                                    while (flag)
                                    {
                                                sequence += " " +String.valueOf(number);
                                                if (number % 2 == 0)
                                                {
                                                            number = number / 2;
                                                }
                                                else
                                                {
                                                            number = number * 3 + 1;
                                                }
                                                counter +=1;
                                                if (number == 1)
                                                {
                                                            flag = false;
                                                            sequence+= " " +String.valueOf(number);
                                                }
                                               
                                    }
                                    number = i +1;
                                    flag = true;
                                    if (letter.equals(""+ "v"))
                                    {
                                                System.out.println(sequence + " (" + counter +")");
                                    }
                                    counter =1;
                                    sequence = "";          
                        }
                        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
            }
}