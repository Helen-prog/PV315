package reservation;

import java.sql.*;
import java.util.Scanner;

public class ReservationSystem {

    private static final String url = "jdbc:mysql://localhost:3306/hotel_db";
    private static final String username = "root";
    private static final String password = "123456";

    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(url, username, password);
            while (true) {
                System.out.println("\nСИСТЕМА БРОНИРОВАНИЯ ОТЕЛЯ");
                Scanner sc = new Scanner(System.in);
                System.out.println("1. Бронирование номера");
                System.out.println("2. Просмотр бронирования");
                System.out.println("3. Уточнить номер комнаты");
                System.out.println("4. Обновить бронирование");
                System.out.println("5. Удалить бронирование");
                System.out.println("0. Выход");
                System.out.print("Выберите опцию: ");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        reserveRoom(connection, sc);
                        break;
                    case 2:
                        viewReservations(connection);
                        break;
                    case 3:
                        getRoomNumber(connection, sc);
                        break;
                    case 4:
                        updateReservation(connection, sc);
                        break;
                    case 5:
                        deleteReservation(connection, sc);
                        break;
                    case 0:
                        exit();
                        return;
                    default:
                        System.out.println("Неверный выбор. Попробуйте еще раз");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void deleteReservation(Connection connection, Scanner sc) {
        System.out.print("Введите идентификатор бронирования для удаления: ");
        int reservationId = sc.nextInt();

        if (!reservationExists(connection, reservationId)) {
            System.out.println("Бронирование не найдено для данного идентификатора");
            return;
        }

        String sql = "DELETE FROM reservations WHERE reservation_id = " + reservationId;

        try (Statement statement = connection.createStatement()) {
            int row = statement.executeUpdate(sql);

            if(row > 0) {
                System.out.println("Бронирование успешно удалено");
            }else {
                System.out.println("Удаление резервирования не удалось");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void updateReservation(Connection connection, Scanner sc) {
        System.out.print("Введите идентификатор бронирования для обновления: ");
        int reservationId = sc.nextInt();

        if (!reservationExists(connection, reservationId)) {
            System.out.println("Бронирование не найдено для данного идентификатора");
            return;
        }
        sc.nextLine();
        System.out.print("Введите новое имя гостя: ");
        String newGuestName = sc.nextLine();
        System.out.print("Введите новый номер комнаты: ");
        int newRoomNumber = sc.nextInt();
        System.out.print("Введите новый контактный номер: ");
        String newContactNumber = sc.next();

        String sql = "UPDATE reservations SET guest_name='" + newGuestName + "', room_number=" + newRoomNumber + ",  contact_number='" + newContactNumber + "' WHERE reservation_id=" + reservationId;

        try (Statement statement = connection.createStatement()) {
            int row = statement.executeUpdate(sql);

            if (row > 0) {
                System.out.println("Бронирование успешно обновлено!");
            } else {
                System.out.println("Обновление резервирования не удалось.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void getRoomNumber(Connection connection, Scanner sc) {
        System.out.print("Введите идентификатор бронирования: ");
        int reservationId = sc.nextInt();
        System.out.print("Введите имя гостя: ");
        String guestName = sc.next();

        String sql = "SELECT room_number FROM reservations WHERE reservation_id = " + reservationId + " AND guest_name = '" + guestName + "'";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            if (resultSet.next()) {
                int roomNumber = resultSet.getInt("room_number");
                System.out.println("Номер комнаты для идентификатора бронирования " + reservationId + " и гостя " + guestName + "  является: " + roomNumber);
            } else {
                System.out.println("Бронирование не найдено для данного идентификатора и имени гостя.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void viewReservations(Connection connection) {
        String sql = "select * from reservations";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            System.out.println("Текущее бронирование:");
            System.out.println("+----------------------------+-----------+------------------+------------------+-----------------------+");
            System.out.println("| Идентификатор бронирования | Гость     | Номер комнаты    | Контактный номер | Дата бронирования     |");
            System.out.println("+----------------------------+-----------+------------------+------------------+-----------------------+");
            while (resultSet.next()) {
                int reservationId = resultSet.getInt("reservation_id");
                String guestName = resultSet.getString("guest_name");
                int roomNumber = resultSet.getInt("room_number");
                String contactNumber = resultSet.getString("contact_number");
                String reservationDate = resultSet.getTimestamp("reservation_date").toString();
                System.out.printf("| %-26d | %-9s | %-16d | %-16s | %-21s |\n", reservationId, guestName, roomNumber, contactNumber, reservationDate);
            }
            System.out.println("+----------------------------+-----------+------------------+------------------+-----------------------+");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void reserveRoom(Connection connection, Scanner sc) {
        System.out.print("Введите имя гостя: ");
        String guestName = sc.next();
        System.out.print("Введите номер комнаты: ");
        int roomNumber = sc.nextInt();
        System.out.print("Введите контактный номер: ");
        String contactNumber = sc.next();

        String sql = "INSERT INTO reservations (guest_name, room_number, contact_number) VALUES ('" + guestName + "', " + roomNumber + ", '" + contactNumber + "')";

        try (Statement stmt = connection.createStatement()) {
            int row = stmt.executeUpdate(sql);
            if (row > 0) {
                System.out.println("Бронирование успешно!");
            } else {
                System.out.println("Бронирование не удалось");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void exit() {
        System.out.println("Выход из системы");
        System.out.println("Спасибо за использования системы бронирования отеля!!!");
    }

    private static boolean reservationExists(Connection connection, int reservationId) {
        String sql = "SELECT reservation_id FROM reservations WHERE reservation_id = " + reservationId;

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            return resultSet.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
