import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeNumberTest {

    public boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Test
    public void testPrimeNumber() {
        assertTrue(isPrime(2));
        assertTrue(isPrime(3));
        assertTrue(isPrime(5));
    }

    @Test
    public void testNonPrimeNumber() {
        assertFalse(isPrime(4));
        assertFalse(isPrime(6));
        assertFalse(isPrime(8));
    }

    @Test
    public void testLessThanOrEqualToOne() {
        assertFalse(isPrime(1));
        assertFalse(isPrime(0));
        assertFalse(isPrime(-1));
    }
}
