import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if(number < 12){
            System.out.println("The number is: " + number);
        }

        scanner.close();
    }
}
