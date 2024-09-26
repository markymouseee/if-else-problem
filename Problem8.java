import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word that is less than 5: ");
        String word = scanner.nextLine();

        if(word.length() > 5){
            System.out.println("Please input 5 characters only");
        }else{
            System.out.println("Correct: " + word);
        }

        scanner.close();
    }
}
