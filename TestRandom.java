
public  class  TestRandom {
            public static void main(String[]  args) {
                        int number = Integer.parseInt(args[0]);
                        int heads = 0;
                        int tails = 0;
                        int i = 0;
                        double choice;
                        while (i < number)
                        {
                                    choice =Math.random();
                                    if (choice <= 0.5)
                                    {
                                                tails ++;
                                    }
                                    else
                                    {
                                                heads ++;
                                    }
                                    i++;
                        }
                        float ratio;
                        if (heads !=0 && tails != 0)
                        {
                                    ratio = (float) heads / tails;
                                    System.out.println(ratio);
                        }
                        else
                        {
                                    System.out.println("you need more attempts");
                        }
 
 
                // Replace this comment with your code
            }
}