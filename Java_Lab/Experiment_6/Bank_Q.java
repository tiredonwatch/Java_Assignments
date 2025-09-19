abstract class Bank {
    protected int balance;
    protected String bankName;

    Bank(String bankName, int balance) {
        this.bankName = bankName;
        this.balance = balance;
    }

    abstract int getBalance();
}

class BankA extends Bank {
    BankA() {
        super("Bank A", 100);
    }

    @Override
    int getBalance() {
        return balance;
    }
}

class BankB extends Bank {
    BankB() {
        super("Bank B", 150);
    }

    @Override
    int getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    BankC() {
        super("Bank C", 200);
    }

    @Override
    int getBalance() {
        return balance;
    }
}

public class Bank_Q {
    public static void main(String[] args) {
        Bank[] banks = { new BankA(), new BankB(), new BankC() };

        for (Bank bank : banks) {
            System.out.println(bank.bankName + " Balance: $" + bank.getBalance());
        }
    }
}
