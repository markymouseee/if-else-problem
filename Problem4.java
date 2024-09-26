import java.util.Scanner;

public class Problem4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String number = scanner.nextLine();


        if(number.length() == 2){
            System.out.println("The number has 2 digits: " + number);
        }else if(number.length() == 3){
            System.out.println("The number has 3 digits: " + number);
        }else if(number.length() == 4){
            System.out.println("The number has 4 digits: " + number);
        }else if(number.length() == 5){
            System.out.println("The number has 5 digits: " + number);
        }else if(number.length() == 6){
            System.out.println("The number has 6 digits: " + number);
        }else{
            System.out.println("The number has 1 digit: " + number);
        }

        scanner.close();
    }
}