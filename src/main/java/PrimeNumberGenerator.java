import java.util.List;

public interface PrimeNumberGenerator {

    /**
     *
     * @param startingValue
     * @param endingValue
     * @return List of Prime values
     */
    List<Integer> generate(int startingValue, int endingValue);


    /**
     *
     * @param value
     * @return True if prime, false if not.
     */
    boolean isPrime(int value);

}
