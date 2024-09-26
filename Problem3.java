import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter score: ");
        double score = scanner.nextDouble();

        if(score >= 80 && score <= 90){
            
            double totalscore = score + 5;

            System.out.println("Score has increased by 5: " + totalscore);
        }else{
            System.out.println("No score increased");
        }

        scanner.close();
    }
}
