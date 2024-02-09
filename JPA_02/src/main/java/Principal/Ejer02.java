package Principal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Alumno;

public class Ejer02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction transaccion = em.getTransaction();	
		transaccion.begin();
		Alumno agregar = new Alumno("06602432Y","Alberto","De Teresa",20);
		em.persist(agregar);
		transaccion.commit();
		System.exit(0);
	}

}
