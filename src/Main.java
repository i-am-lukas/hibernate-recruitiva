import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Main {

    public static void main(String[] args) {

        SessionFactory factory = new AnnotationConfiguration().configure().buildSessionFactory();
        Session session = factory.openSession();

        Miasto miasto = new Miasto();
        miasto.nazwa = "krakow";

        Company nokia = new Company("Nokia");
        nokia.setMiasto(miasto);

        session.beginTransaction();
        session.persist(miasto);
        session.persist(nokia);
        session.getTransaction().commit();

        session.close();
        factory.close();
    }
}
