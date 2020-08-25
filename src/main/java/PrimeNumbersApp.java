import java.util.List;

public class PrimeNumbersApp {

    private Menu menu;
    public PrimeNumbersApp (Menu menu){
        this.menu = menu;
    }

    /**
     *
     * @param args takes in args passed via command line, if not, user is prompted to input 2 numbers for range.
     */
    public static void main(String[] args) {
        Menu menu = new Menu();
        PrimeNumbersApp app = new PrimeNumbersApp(menu);
        String[] numsFromUser;

        if (args.length > 0){
            numsFromUser = new String[]{args[0],args[1]};
        } else {
            numsFromUser = menu.getNumsFromUser("","");
        }

        Integer[] parsedNums = app.parseArgsToNums(numsFromUser);

        if (parsedNums == null){
            System.exit(0);
        }

        app.run(parsedNums[0],parsedNums[1]);
    }

    /**
     *
     * @param startNum the first number in the range to search
     * @param endNum the last number in the range to search
     */
    public void run (int startNum, int endNum){

        ReportGenerator reportGenerator = new ReportGenerator();
        List<Integer> primeNumbers = reportGenerator.generate(startNum, endNum);

        menu.displayMessage("Found " + primeNumbers.size() + " prime numbers between " + startNum + " & " + endNum + ":");
        menu.displayMessage(primeNumbers.toString());

    }

    /**
     * @param args takes in an array of string inputs, to be parsed into ints.
     * @return a array of parsed ints to be used in the main run method.
     */
    public Integer[] parseArgsToNums(String[] args){

        int startNum = 0;
        int endNum = 0;
        Integer[] parsedNums;

        try {
            startNum = Integer.parseInt(args[0]);
            endNum = Integer.parseInt(args[1]);

        } catch (NumberFormatException n) {
            menu.displayMessage("Unable to parse input values: " + "'" + args[0] + "'" + " & " + "'" + args[1] + "'" + " try again.");
            return null;
        }
        parsedNums = new Integer[]{startNum,endNum};
        return parsedNums;
    }
}
