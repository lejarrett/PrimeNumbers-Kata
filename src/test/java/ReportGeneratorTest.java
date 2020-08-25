import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class ReportGeneratorTest {

    @Test
    void generate_listOfPrimeTest(){

        ReportGenerator rp = new ReportGenerator();

        List<Integer> testPrimeList = rp.generate(1,10);
        Assertions.assertEquals(4, testPrimeList.size());
        Assertions.assertEquals(2, testPrimeList.get(0));
        Assertions.assertEquals(3, testPrimeList.get(1));
        Assertions.assertEquals(5, testPrimeList.get(2));
        Assertions.assertEquals(7, testPrimeList.get(3));


        List<Integer> testPrimeListReverse = rp.generate(10,1);
        Assertions.assertEquals(4, testPrimeListReverse.size());
        Assertions.assertEquals(7, testPrimeListReverse.get(0));
        Assertions.assertEquals(5, testPrimeListReverse.get(1));
        Assertions.assertEquals(3, testPrimeListReverse.get(2));
        Assertions.assertEquals(2, testPrimeListReverse.get(3));



    }

    @Test
    void generate_7900thru7920Test(){

        ReportGenerator rp = new ReportGenerator();

        List<Integer> testPrimeList = rp.generate(7900,7920);
        Assertions.assertEquals(3, testPrimeList.size());

        Assertions.assertEquals(7901, testPrimeList.get(0));
        Assertions.assertEquals(7907, testPrimeList.get(1));
        Assertions.assertEquals(7919, testPrimeList.get(2));



    }


    @Test
    void isPrime_singleNumTest(){

        ReportGenerator rp = new ReportGenerator();

        int prime = 97;
        Assertions.assertTrue(rp.isPrime(prime));

        int nonPrime = 100;
        Assertions.assertFalse(rp.isPrime(nonPrime));

    }
    
}