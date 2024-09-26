import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day portion of day: ");
        int day = scanner.nextInt();

        if(day > 31 || day < 1){
            System.out.println("Invalid Day");
        }else{
            System.out.println("Correct");
        }

        scanner.close();
    }
}
