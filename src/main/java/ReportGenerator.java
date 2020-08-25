import java.util.ArrayList;
import java.util.List;

public class ReportGenerator implements PrimeNumberGenerator{


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



    public boolean isPrime(int value) {

        for (int i = 2; i < value; i++) {
            if( value % i == 0){
                return false;
            }
        }
        return true;
    }
}