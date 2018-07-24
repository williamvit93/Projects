
package bean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JPAUtil {

    private static final EntityManagerFactory 
            emf = Persistence.createEntityManagerFactory("EcommercePulsePU");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public static void fechaEntityManager() {
        emf.close();
    }
}
