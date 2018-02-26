package sv.gob.cnr.gp.beans;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sv.gob.cnr.gp.controller.UnidadesController;
import sv.gob.cnr.gp.entities.EvlUnidades;

@ManagedBean(name = "unidadesBeans")
@ViewScoped
public class UnidadesBeans implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EvlUnidades unidad;
	private List<EvlUnidades> unidades;
	
	public EvlUnidades getUnidad() {
		return unidad;
	}
	public void setUnidad(EvlUnidades unidad) {
		this.unidad = unidad;
	}
	public List<EvlUnidades> getUnidades() {
		return unidades;
	}
	public void setUnidades(List<EvlUnidades> unidades) {
		this.unidades = unidades;
	}
	
	public void listar() throws Exception {
		UnidadesController datos;
		try {
			datos = new UnidadesController();
			unidades = datos.listarDatos();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
