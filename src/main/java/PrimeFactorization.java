import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {

    private final int userNumber;
    private List<Integer> primeNumbers;

    public PrimeFactorization(int userNumber) {
        this.userNumber = userNumber;
        generatePrimeNumbers();
    }

    private void generatePrimeNumbers() {
        primeNumbers = new ArrayList<>();
        for (int i = 2; i < this.userNumber; i++) {
            boolean isIPrime = true;
            for (int number : primeNumbers) {
                if (i % number == 0) {
                    isIPrime = false;
                    break;
                }
            }
            if (isIPrime && (userNumber % i == 0)) {
                primeNumbers.add(i);
            }
        }
    }

    @Override
    public String toString() {
        String primeFactors = primeNumbers.toString();
        if (primeFactors.length() > 2) {
            return primeFactors.substring(1, primeFactors.length() - 1);
        }
        return userNumber + " is a prime number";
    }

    public int getUserNumber() {
        return userNumber;
    }
}
