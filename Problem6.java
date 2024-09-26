import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        if(number < 0){
            System.out.println("Please input a positive number");
        }else{
            System.out.println("Your number is positve: " + number);
        }

        scanner.close();
    }
}
