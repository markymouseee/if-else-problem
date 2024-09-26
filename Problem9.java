import java.util.Scanner;;

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner. nextInt();


        int totalNumber;

        if(number < 12){
            totalNumber = number + 5;
            System.out.println("The number increased by 5: " + totalNumber);
        }else{
            totalNumber = number + 8;
            System.out.println("The number increased by 8: " + totalNumber);
        }
        

        scanner.close();
    }
}
