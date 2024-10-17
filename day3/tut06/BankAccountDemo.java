package PR1.day3.tut06;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount a = new BankAccount(500, 2.5, "Yen Nhi");
        BankAccount b = new BankAccount(100, 2.5, "Chuc Vy");

        System.out.println(a);
        System.out.println(b);

        a.deposit(50);
        System.out.println("After " + a);

        b.withdraw(80);
        System.out.println("After " + b);

        a.annualInterest();
        System.out.println("After " + a);

        a.transfer(b, 100);
        System.out.println("After:");
        System.out.println(a);
        System.out.println(b);

        b.transfer(a, 120);
        System.out.println("After:");
        System.out.println(a);
        System.out.println(b);




    }

}
