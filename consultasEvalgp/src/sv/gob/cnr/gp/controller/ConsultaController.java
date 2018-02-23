package sv.gob.cnr.gp.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import sv.gob.cnr.gp.entities.EvalInterna;

public class ConsultaController extends SystemController {
	public ConsultaController() {
	}
	
	public List<EvalInterna> listarDatos() throws Exception {
		List<EvalInterna> lst = new ArrayList<EvalInterna>();
		try {
			em.getTransaction().begin();
			String consulta = "SELECT a FROM EvalInterna a;";
			TypedQuery<EvalInterna> listarDatos = em.createQuery(consulta, EvalInterna.class);
			for(EvalInterna a: listarDatos.getResultList()){
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
