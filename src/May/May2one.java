package May;

import java.util.Scanner;

class Bank {
    private final double principal;
    public double monthlyIR;
    public int period;

    // The data come from the 'main' method.
    public Bank(double principal, double monthlyIR, int period){
        this.principal = principal;
        this.monthlyIR = monthlyIR;
        this.period = period;
    }

    // The data come directly from public Bank!
    // Because this method is NOT static,
    // it has direct access to the object's "brain".
    public void calculate(){
        System.out.println(Math.round(principal * Math.pow((1 + monthlyIR), period)));
    }
}

public class May2one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rate = scanner.nextDouble();
        double principal = scanner.nextDouble();
        int periods = scanner.nextInt();
        scanner.close();

        // We send 'principal', 'rate', and 'periods'
        // up to the Bank's constructor
        Bank bank = new Bank(principal, rate, periods);
        bank.calculate();
    }
}
