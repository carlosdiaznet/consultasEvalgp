package sv.gob.cnr.gp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import sv.gob.cnr.gp.entities.EvlUnidades;

public class UnidadesController extends SystemController {
	public UnidadesController() {
		// TODO Auto-generated constructor stub
	}
	
	public List<EvlUnidades> listarDatos() throws Exception {
		List<EvlUnidades> lst = new ArrayList<EvlUnidades>();
		try{
			em.getTransaction().begin();
			String consulta = "SELECT a FROM EvlUnidades a;";
			TypedQuery<EvlUnidades> listarDatos = em.createQuery(consulta, EvlUnidades.class);
			for(EvlUnidades a: listarDatos.getResultList()){
				lst.add(a);
			}
			em.getTransaction().commit();
			em.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lst;
	}
	
	public List<EvlUnidades> listarDatos2() throws Exception {
		List<EvlUnidades> lst = new ArrayList<EvlUnidades>();
		try{
			em.getTransaction().begin();
			String consulta = "SELECT a.Id, a.nombreUnidad FROM EvlUnidades a;";
			TypedQuery<EvlUnidades> listarDatos = em.createQuery(consulta, EvlUnidades.class);
			for(EvlUnidades a: listarDatos.getResultList()){
				lst.add(a);
			}
			em.getTransaction().commit();
			em.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return lst;
	}
}
