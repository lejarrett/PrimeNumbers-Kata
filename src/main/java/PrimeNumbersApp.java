public class PrimeNumbersApp {

    private Menu menu;
    public PrimeNumbersApp (Menu menu){
        this.menu = menu;
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        PrimeNumbersApp app = new PrimeNumbersApp(menu);
        String[] nums = menu.getNumbersFromUser();

        int num1;
        int num2;
        try {
            num1 = Integer.parseInt(nums[0]);
            num2 = Integer.parseInt(nums[1]);
        } catch (NumberFormatException n) {
            menu.displayMessage("Unable to parse input values.");
            return;
        }

        app.run(num1,num2);

    }


    public void run (int startNum, int endNum){








    }
}
