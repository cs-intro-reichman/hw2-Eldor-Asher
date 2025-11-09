public class Collatz {
    public static void main(String[] args) {

        int N = Integer.parseInt(args[0]);
        String mode = args[1]; 

        for (int i = 1; i <= N; i++) {

            int number = i;
            int counter = 1;
            String sequence = "" + number;

           
            while (number != 1) {
                if (number % 2 == 0)
                    number = number / 2;
                else
                    number = number * 3 + 1;

                sequence += " " + number;
                counter++;
            }

            
            if (mode.equals("v")) {
                System.out.println(sequence + " (" + counter + ")");
            }
        }

        System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
    }
}