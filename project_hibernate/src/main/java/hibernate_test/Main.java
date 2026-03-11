package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        Session session = factory.getCurrentSession();
//        Employee employee = new Employee("Сергей", "Бирюков", "IT", 500);
//        Employee employee = new Employee("Виктор", "Сазанов", "HR", 750);
//        Employee employee = new Employee("Игорь", "Винник", "Sales", 700);
//        Employee employee = new Employee("Игорь", "Сазанов", "IT", 600);
        Employee employee = new Employee("Ирина", "Федорова", "Sales", 800);
        session.beginTransaction();
        session.persist(employee);
//        System.out.println(employee);
        session.getTransaction().commit();

        int myId = employee.getId();
        session = factory.getCurrentSession();
        session.beginTransaction();
        Employee employee2 = session.get(Employee.class, myId);  // get == SELECT
        session.getTransaction().commit();
        System.out.println(employee2);

        session.close();
    }
}
