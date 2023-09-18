package TH2;
import java.util.Scanner;
public class TH2 {
    public static void main(String[] args) {
        double money = 1.0;   // tiền gửi
        int month = 1;        // tháng gửi
        double interestRate = 1.0; // tỉ lệ lãi suất
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = sc.nextDouble();
        System.out.println("Enter number of month: ");
        month = sc.nextInt();
        System.out.println("Enter annual interest rate in percentage : ");
        interestRate = sc.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate/100)/12 * month;

        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
