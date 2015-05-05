import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

    public static void main(String[] args) {

        SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = factory.openSession();

        Czlowiek person = new Czlowiek();
        person.set_nazwisko("Kowalski");

        session.beginTransaction();
        session.persist(person);
        session.getTransaction().commit();

        session.close();
        factory.close();
    }
}
