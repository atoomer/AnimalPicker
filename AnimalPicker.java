import java.util.Scanner;

public class AnimalPicker {

    public static String animal;
    public static String cat = "cat";
    public static String dog = "dog";

    public static void main(String[]args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What would you like to see: a cat or a dog? ");
        String animal = scan.next();
    
        if (animal.equals(cat)){
            System.out.println("CAT ASCII ART HERE");
        }
        else if(animal.equals(dog)){
            System.out.println("DOG ASCII ART HERE");
        }
        else{
            System.out.println("huh");
        }
        
        
    }
   
    

}
