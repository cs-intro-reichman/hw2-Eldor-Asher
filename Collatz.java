 
 
public class Collatz {public static void main(String args[]) {
    int N = Integer.parseInt(args[0]);
    String letter = args[1];

    for (int i = 1; i <= N; i++) {
        int number = i;
        int counter = 1;
        String sequence = "";

        while (true) {
            // הוספת המספר לרצף בלי רווח מיותר בהתחלה
            if (sequence.equals("")) {
                sequence = "" + number;
            } else {
                sequence += " " + number;
            }

            if (number == 1) {
                break;
            }

            if (number % 2 == 0) {
                number = number / 2;
            } else {
                number = number * 3 + 1;
            }

            counter++;
        }

        if (letter.equals("v")) {
            System.out.println(sequence + " (" + counter + ")");
        }
    }

    System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
}
}