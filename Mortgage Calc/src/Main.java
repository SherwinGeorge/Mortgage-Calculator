import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Mortgage,Interest;
        int Principal,Period;
        System.out.print("Enter Principal: ");
        Principal = scanner.nextInt();
        System.out.print("Enter Duration of payment(MONTHS): ");
        Period = scanner.nextInt();
        System.out.print("Enter the Interest rate: ");
        Interest = scanner.nextFloat();

        double temp1 = Interest+1;
        double temp2 = Math.pow(temp1,Period);

        Mortgage = ((Interest*temp2)/(temp2-1))*Principal;

        System.out.print("The Mortgage is $");
        System.out.format("%.2f",Mortgage);

    }
}