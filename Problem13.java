import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        int basePrice = 70;
        double total_price;
        double discount;

        if(quantity > 50){
            discount = 0.10;
            total_price = basePrice - discount;
            System.out.println("Price: " + basePrice);
            System.out.println("You have 10% discount \nTotal Price: " + total_price);
        }else if(quantity > 100){
            discount = 0.20;
            total_price = basePrice - discount;
            System.out.println("Price: " + basePrice);
            System.out.println("You have 20% discount \nTotal Price: " + total_price);
        }

        scanner.close();
    }
}
