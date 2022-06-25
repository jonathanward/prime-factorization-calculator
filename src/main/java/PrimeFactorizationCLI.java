public class PrimeFactorizationCLI {

    private static final Menu menu = new Menu();
    private static final String GET_PRIME_FACTORS = "Get prime factors";
    private static final String EXIT = "Exit";
    private static final String[] OPTIONS = new String[] {GET_PRIME_FACTORS, EXIT};

    public static void main(String[] args) {

        while (true) {
            String userChoice = menu.displayAndGetOptions(OPTIONS);
            if (userChoice.equals(GET_PRIME_FACTORS)) {
                int userNumber = menu.getUserNumber();
                PrimeFactorization primeFactorization = new PrimeFactorization(userNumber);
                if (primeFactorization.getUserNumber() != 0) {
                    menu.printAnswer(primeFactorization);
                }
            } else if (userChoice.equals(EXIT)) {
                menu.exit();
                break;
            }
        }

    }
}
