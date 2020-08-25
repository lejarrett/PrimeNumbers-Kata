import org.junit.platform.commons.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ReportGenerator implements PrimeNumberGenerator{

    Menu menu = new Menu();

    /**
     *
     * @param startNum the first number in the range to begin searching for Primes
     * @param endNum the second number in the range to end the search for Primes
     * @return a list of Intergers in order, e.g 100-1 should return from 100 downwards.
     */
    public List<Integer> generate(int startNum, int endNum) {
        List<Integer> primeList = new ArrayList<Integer>();

        if (startNum < endNum){

            for (int i = startNum; i <= endNum; i++){

                if (i > 1 && isPrime(i)){
                    primeList.add(i);
                }
            }
            return primeList;
        }
        else {
            for (int i = startNum; i >= endNum; i--){

                if (i > 1 && isPrime(i)){
                    primeList.add(i);
                }
            }
            return primeList;
        }
    }

    /**
     *
     * @param value an int value to check for Prime eligibility
     * @return returns true if Prime, false, if not.
     */
    public boolean isPrime(int value) {

        for (int i = 2; i < value; i++) {
            if( value % i == 0){
                return false;
            }
        }
        return true;
    }

}