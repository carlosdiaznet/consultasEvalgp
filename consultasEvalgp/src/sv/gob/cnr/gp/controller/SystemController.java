package sv.gob.cnr.gp.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SystemController {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("consultasEvalgp");
	EntityManager em = emf.createEntityManager();
	
	public SystemController() {
		
	}
	
	
	
	

}
