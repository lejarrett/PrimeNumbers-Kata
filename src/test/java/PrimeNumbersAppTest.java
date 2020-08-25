import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumbersAppTest {
    Menu menu = new Menu();


    @Test
    void run() {

        int startNum = 1;
        int endNum = 10;
        PrimeNumbersApp app = new PrimeNumbersApp(menu);
        ReportGenerator reportGenerator = new ReportGenerator();
        List<Integer> primeNumbers = reportGenerator.generate(startNum, endNum);

    }

    @Test
    void parseArgsToNumsTest() {
        PrimeNumbersApp app = new PrimeNumbersApp(menu);

        String[] testArgs = new String[]{"1","10"};
        Assertions.assertArrayEquals(new Integer[]{1,10},app.parseArgsToNums(testArgs));
    }


    @Test
    void parseArgsToNumsMoreThan2ArgsTest() {
        PrimeNumbersApp app = new PrimeNumbersApp(menu);

        String[] testArgs = new String[]{"1","10","56","230"};
        Assertions.assertEquals(2,app.parseArgsToNums(testArgs).length);
        Assertions.assertArrayEquals(new Integer[]{1,10},app.parseArgsToNums(testArgs));

    }


    @Test
    void parseArgsToNumsInvalidArgs() {
        Menu menu = new Menu();
        PrimeNumbersApp app = new PrimeNumbersApp(menu);

        String[] argsWithWord = new String[]{"dog","10"};
        Assertions.assertNull(app.parseArgsToNums(argsWithWord));

        String[] argsWithNull = new String[]{null,"10"};
        Assertions.assertNull(app.parseArgsToNums(argsWithNull));

        String[] argsWithDoubleNull = new String[]{null,null};
        Assertions.assertNull(app.parseArgsToNums(argsWithDoubleNull));

        String[] argsWithBlankAndEmpty = new String[]{" ",""};
        Assertions.assertNull(app.parseArgsToNums(argsWithBlankAndEmpty));

    }
}