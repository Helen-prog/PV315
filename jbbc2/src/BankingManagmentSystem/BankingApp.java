package BankingManagmentSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class BankingApp {
    private static final String url = "jdbc:mysql://localhost:3306/banking_system";
    private static final String username = "root";
    private static final String password = "123456";

    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(url, username, password);
            Scanner sc = new Scanner(System.in);
            User user = new User(conn, sc);
            Account account = new Account(conn, sc);
            AccountManager accountManager = new AccountManager(conn, sc);

            String email;
            long accountNumber;

            while (true) {
                System.out.println("*** ДОБРО ПОЖАЛОВАТЬ В БАНКОВСКУЮ СИСТЕМУ ***");
                System.out.println("\n1. Регистрация");
                System.out.println("2. Авторизация");
                System.out.println("3. Выход");
                System.out.print("Ваш выбор: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        user.register();
                        break;
                    case 2:
                        email = user.login();
                        if (email != null) {
                            System.out.println("\nПользователь вошел в систему!\n");
                            if (!account.accountExists(email)) {
                                System.out.println("1. Открытие нового банковского счета");
                                System.out.println("2. Выход");
                                System.out.print("Ваш выбор: ");
                                if (sc.nextInt() == 1) {
                                    accountNumber = account.openAccount(email);
                                    System.out.println("Аккаунт создан успешно");
                                    System.out.println("Ваш номер счета: " + accountNumber);
                                } else {
                                    break;
                                }
                            }
                            accountNumber = account.getAccountNumber(email);
                            int chose2 = 0;
                            while (chose2 != 5) {
                                System.out.println("1. Снят личные средства");
                                System.out.println("2. Займ кредитных средств");
                                System.out.println("3. Перевод денег");
                                System.out.println("4. Проверка баланса");
                                System.out.println("5. Выход");
                                System.out.print("Ваш выбор: ");
                                chose2 = sc.nextInt();
                                switch (chose2) {
                                    case 1:
                                        accountManager.debitMoney(accountNumber);
                                        break;
                                    case 2:
                                        accountManager.creditMoney(accountNumber);
                                        break;
                                    case 3:
                                        accountManager.transferMoney(accountNumber);
                                        break;
                                    case 4:
                                        accountManager.getBalance(accountNumber);
                                        break;
                                    case 5:
                                        break;
                                    default:
                                        System.out.println("Такого варианта нет!\n");
                                        break;
                                }
                            }
                        } else {
                            System.out.println("Некорректный адрес почты или пароль!\n");
                        }
                        break;
                    case 3:
                        System.out.println("СПАСИБО ЗА ИСПОЛЬЗОВАНИЕ БАНКОВСКОЙ СИСТЕМЫ");
                        return;
                    default:
                        System.out.println("Такого варианта нет\n");
                        break;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
