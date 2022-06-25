import org.junit.Assert;
import org.junit.Test;

public class PrimeFactorizationTest {

    @Test
    public void findPrimeFactors_expects_string_of_prime_factors() {
        assertOutcomesMatch(4, "2");
        assertOutcomesMatch(27, "3");
        assertOutcomesMatch(15, "3, 5");
        assertOutcomesMatch(18, "2, 3");
    }

    @Test
    public void findPrimeFactors_expects_no_values_for_number_without_prime_factors() {
        assertOutcomesMatch(17, "17 is a prime number");
        assertOutcomesMatch(43, "43 is a prime number");
    }

    private void assertOutcomesMatch(int inputNum, String expectedString) {
        PrimeFactorization primeFactorizationTest = new PrimeFactorization(inputNum);
        String expectedValue = primeFactorizationTest.toString();
        Assert.assertEquals(expectedValue, expectedString);
    }
}
