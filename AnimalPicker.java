import java.util.Scanner;

public class AnimalPicker {     //Class that prompts for an animal, cat, dog, or fish, and prints out ASCII art of what is chosen.

    public static String animal;            //Constructors
    public static String cat = "cat";       //''
    public static String dog = "dog";       //''
    public static String fish = "fish";     //''

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);      //Create scanner
        boolean valid = false;     //boolean used to dermine if input is valid.
        while (valid == false){     //While loop that continues until a valid input is entered.
            System.out.println("What would you like to see: A cat, dog, or fish? ");    //Input prompt.
            String animal = scan.next();    //Input from keyboard into animal.
            if (animal.equalsIgnoreCase(cat)){      //Checks if animal equals cat.
                System.out.println("      /\\_/\\\n /\\  / o o \\\n//\\\\ \\~(*)~/\n`  \\/   ^ /\n   | \\|| ||\n   \\ \'|| ||\n    \\)()-())");     //Cat ASCII art.
                valid = true;   //Valid becomes true so the loop ends.
            }
            else if(animal.equalsIgnoreCase(dog)){      //Checks if animal equals dog.
                System.out.println("         __\n        /  \\\n       / ..|\\\n      (_\\  |_)\n      /  \\@\'\n     /     \\\n _  /  `   |\n\\\\/  \\  | _\\\n \\   /_ || \\\\_\n  \\____)|_) \\_)");     //Dog ASCII art.
                valid = true;      //Valid becomes true so the loop ends.
            }
            else if(animal.equalsIgnoreCase(fish)){     //Checks if animal equals fish.
                System.out.println("|\\   \\\\\\\\__     o\n| \\_/    o \\    o \n> _   (( <_  oo  \n| / \\__+___/      \n|/     |/");      //Fish ASCII art.
                valid = true;       //Valid becomes true so the loop ends.
            }
            else{       //If animal does not equal cat, dog, or fish.
                System.out.println("Error: Invalid input, try again.");     //Error message.
                valid = false;      //Valid stays false so the loop repeats.
            }
        }
        scan.close();
    }
}
