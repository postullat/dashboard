package dashboard;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.lviv.model.Student;

import java.util.List;

public class App {
    public static void main(String []args) {
        Configuration configuration = new Configuration();
        SessionFactory factory = configuration.configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        List<Student> list = session.createCriteria(Student.class).list();
        for(Student st : list){
            System.out.println(st.getFirstName());
        }
        session.getTransaction().commit();
        session.close();
    }
}
