package hibernate_test;

import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

        Session session = factory.getCurrentSession();
        session.beginTransaction();

        session.createQuery("delete from Employee where name='Игорь'").executeUpdate();

//        Employee emp = session.get(Employee.class, 1);
//        emp.setSalary(1500);

//        session.createQuery("update Employee set salary = 1000 where name='Игорь'").executeUpdate();
//        session.remove(emp);

        session.getTransaction().commit();
        session.close();
    }
}
