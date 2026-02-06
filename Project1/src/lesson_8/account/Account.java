package lesson_8.account;

public interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
