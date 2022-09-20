import java.util.Scanner;

public class ComputerGame {
    Scanner sc = new Scanner(System.in);

    void run() {
        String inputGo;
        System.out.println("Think of a secret number not smaller than 0 and not greater than 999. "
                + "Type 'go' when you have thought");
        inputGo = sc.next();

        if ("go".equals(inputGo)) {
            // the first output number produced by the computer
            int secretCode;
            //declare a variable to test if the guessing of computer is right
            String numberCompare;
            boolean computerWin = false;
            int MAX_ATTEMPT = 10;
            //the upper limit and the lower limit to guess
            int max = 1000;
            int min = 0;
            /*if the number is the same as the user thinking,
            then there is no need to jump into the loop*/
            Attempts:
            for (int i = 0; i < MAX_ATTEMPT; i++) {
                secretCode = (min + max) / 2;
                System.out.println(secretCode);
                numberCompare = sc.next();
                switch (numberCompare) {
                    case "guessed":
                        computerWin = true;
                        break Attempts;
                    case "higher":
                        min = secretCode;
                        break;
                    case "lower":
                        max = secretCode;
                        break;
                }
            }
            if (!computerWin)
                System.out.println("I give up");
        }
    }

    public static void main(String[] args) {
        new ComputerGame().run();
    }
}

