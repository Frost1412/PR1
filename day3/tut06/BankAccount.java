package PR1.day3.tut06;

public class BankAccount {
        double balance;
        int transactions;
        double interestRate;
        String holderName;





        public BankAccount(double initial, double interestRate, String holderName ) {
            this.balance = initial;
            this.transactions = 1;
            this.interestRate = interestRate;
            this.holderName = holderName;
        }

        public void annualInterest() {
            double interest = balance * (interestRate /100);
            balance += interest;

        }



        public void deposit(double amount) {
            balance += amount;
            transactions++;
        }

        public void withdraw(double amount) {
            balance -= amount;
            transactions++;
        }

        public void monthlyFee() {
            this.withdraw(10);
        }

        public void transfer(BankAccount target,double amount) {
            double total = amount + 0.5;
            if (total < balance) {
                withdraw(total);
                target.deposit(amount);
                System.out.println(target.holderName + "received " + amount + "from" + this.holderName);

            } else {
                System.out.println("Giao dich that bai");
            }

        }


    public String toString() {
        String output = holderName + ", ";
        if (balance < 0) {
            output += "-$" + String.format("%.2f", -balance);
        } else
            output += "$" + String.format("%.2f", balance);
        return output;
    }
    }

