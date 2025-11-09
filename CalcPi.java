// Computes an approximation of PI.
public class CalcPi {
            public static void main(String [] args) {
                        int number = Integer.parseInt(args[0]);
                        int numerator = 1;
                        int denominator = 1;
                        float sum =0;
                        for (int j=0; j<number; j++)
                        {
                                    if (j % 2 == 0)
                                    {
                                                sum += (float) numerator/denominator;
                                                denominator +=2;
                                    }
                                    else
                                    {
                                                sum -= (float) numerator/denominator;
                                                denominator +=2;
                                    }
                        }
                        System.out.println("pi according to Java: " + Math.PI);
                        System.out.println("pi, approximated:     " + (float) sum * 4);
                // Replac this comment with your code
            }
}