import java.util.Scanner;

public class Menu {
    /**
     *
     * @param num1 built this way to enable testing, two blank strings are passed and then user is prompted to input 2 nums
     * @param num2 see above
     * @return an array of 2 Strings, not yet parsed to ints.
     */
    public String[] getNumsFromUser(String num1, String num2){
        String[] numsFromUser;

        if (num1.equals("") && num2.equals("")){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter first number: ");
            String firstNum = input.nextLine();
            System.out.println("Enter second number: ");
            String secondNum = input.nextLine();
             numsFromUser = new String[]{firstNum,secondNum};
            return numsFromUser;
        }
        numsFromUser = new String[]{num1,num2};
        return numsFromUser;
    }

    /**
     *
     * @param message basic string to display to output
     */
    public void displayMessage(String message){
        System.out.println(message);
    }

}
