import java.util.Scanner;

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int totalNumber;

        if(number < 12){
            totalNumber = number + 5;
            System.out.println("The number increased by 5: " + totalNumber);
        }else if(number > 20){
            totalNumber = number + 50;
            System.out.println("The number increased by 50: " + totalNumber);
        }else{
            System.out.println();
        }

        scanner.close();
    }
}
