import java.util.Scanner;

public class Menu {

    public String[] getNumbersFromUser() {
        String userInput ="";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers, separated by dash, to receive Prime Numbers, e.g. 1-10, or 10-1");

        userInput = input.nextLine();

        while (!userInput.contains("-")){
            displayMessage("Must separate by dash");
            userInput = input.nextLine();
        }

        String [] numsFromUser = userInput.split("-");

        return numsFromUser;
    }

    public void displayMessage(String message){
        System.out.println(message);
    }

}
