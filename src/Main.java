import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Hello! Recently I applied to a job, and I found this solution for one of its technical challenges.
            This code is a solution for searching an input from the user, but it can be changed to automatic processes.
            It uses indexOf(), when the first and second characters from the wanted String are found, we create a new sub string
            from the original using i as the beginning of our new String, and user.length() - 1 as our ending. And then,
            we finally compare the two Strings, and if they are equal found = true.

            It definitely works better as a method/function, though here I did not bother making it one.
         */

        // Feel free to use it in your own projects

        Scanner reader = new Scanner(System.in);

        String user = reader.nextLine();
        user = user.toUpperCase();
        boolean found = false;

        String dataBank = "KAUADIW832MELLCIAMIPEDROOASRAWENYHORLKMLETICIAFMATHIASFEOIWEROVICTORI23JR23OI";

        for (int i = 0; i < dataBank.length(); i++){

            if (dataBank.charAt(i) == user.charAt(0) && dataBank.charAt(i + 1) == user.charAt(1)) {

                int first = dataBank.indexOf(user.charAt(0), i);
                int last = dataBank.indexOf(user.charAt(user.length() - 1), i);

                String name = dataBank.substring(first, last + 1);

                if (name.equals(user)) {

                    found = true;

                }
            }
        }

        if (found){

            user = user.substring(0, 1).toUpperCase() + user.substring(1).toLowerCase();


        }

        if (found) {
            System.out.printf("Congrats, %s! Your name was found in the data bank!", user);
        } else {
            System.out.print("Sorry, your name was not found in the data bank!");
        }

    }
}
