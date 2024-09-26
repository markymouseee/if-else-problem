import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a quantity: ");
        int quantity = scanner.nextInt();

        int price;
        int total_price;

        if(quantity > 100){
            price = 30;
            total_price = quantity * price;

            System.out.println("Price: " + price);
            System.out.println("Total Price: " + total_price);
        }else if(quantity > 50){
            price = 50;
            total_price = quantity * price;

            System.out.println("Price: " + price);
            System.out.println("Total Price: " + total_price);
        }else{
            price = 70;
            total_price = quantity * price;

            System.out.println("Price: " + price);
            System.out.println("Total Price: " + total_price);
        }
        

        scanner.close();
    }
}
