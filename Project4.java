package project4; //graded 5/5/2025 - 91/100
import java.util.Scanner;
public class Project4 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String adjective1;
        String noun;
        String adjective2;
        String verb;
        String adjective3;
        
        System.out.print("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a verb end with -ing (action): ");
        verb = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();
        
        System.out.println("\nToday, I went to a " + adjective1 + " mall");
        System.out.println("In a fast food, I saw " + noun + ".");
        System.out.println(noun + " was " + adjective2 + " and " + verb + ".");
        System.out.println("I was " + adjective3 + "!");
        
        scanner.close();
    }
    
}
