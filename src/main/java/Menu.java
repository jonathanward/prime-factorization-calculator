import java.util.Scanner;

public class Menu {

    private final Scanner input = new Scanner(System.in);

    public int getUserNumber() {
        System.out.print("Enter an integer >> ");
        int userNumber;
        try {
            userNumber = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid whole number.\r\n");
            return 0;
        }
        return userNumber;
    }

    public String displayAndGetOptions(String[] options) {
        StringBuilder optionsToDisplay = new StringBuilder();
        for (int i = 0; i < options.length; i++) {
            optionsToDisplay.append("(").append(i + 1).append(") ").append(options[i]).append("\r\n");
        }
        optionsToDisplay.append("Choose an option >> ");
        System.out.print(optionsToDisplay);
        int userChoice;
        try {
            userChoice = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid choice.\r\n");
            return "Error";
        }
        System.out.println();
        return options[userChoice - 1];
    }

    public void printAnswer(PrimeFactorization primeFactorization) {
        System.out.println(primeFactorization.toString() + "\r\n");
    }

    public void exit() {
        System.out.println("Goodbye!");
    }

}
