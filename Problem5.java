import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if(number < 12){
            int totalNumber = number + 10;
            System.out.println("Number added by 10: " + totalNumber);
        }

        scanner.close();;
    }
}
