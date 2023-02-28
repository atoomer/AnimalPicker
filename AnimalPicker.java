import java.util.Scanner;

public class AnimalPicker {

    public static String animal;
    public static String cat = "cat";
    public static String dog = "dog";

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;
        while (valid == false){
            System.out.println("What would you like to see: a cat or a dog? ");
            String animal = scan.next();
            if (animal.equalsIgnoreCase(cat)){
                System.out.println("      /\\_/\\\n /\\  / o o \\\n//\\\\ \\~(*)~/\n`  \\/   ^ /\n   | \\|| ||\n   \\ \'|| ||\n    \\)()-())");
                valid = true;
            }
            else if(animal.equalsIgnoreCase(dog)){
                System.out.println("         __\n        /  \\\n       / ..|\\\n      (_\\  |_)\n      /  \\@\'\n     /     \\\n _  /  `   |\n\\\\/  \\  | _\\\n \\   /_ || \\\\_\n  \\____)|_) \\_)");
                valid = true;
            }
            else{
                System.out.println("Error: Invalid input, try again.");
                valid = false;
            }
        }
    }
}
