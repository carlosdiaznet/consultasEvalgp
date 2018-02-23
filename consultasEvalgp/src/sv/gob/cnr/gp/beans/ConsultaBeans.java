package sv.gob.cnr.gp.beans;


import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sv.gob.cnr.gp.controller.ConsultaController;
import sv.gob.cnr.gp.entities.EvalInterna;

@ManagedBean(name = "consultaBeans")
@ViewScoped
public class ConsultaBeans implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EvalInterna registro;
	private List<EvalInterna> registros;
	
	public EvalInterna getRegistro() {
		return registro;
	}
	public void setRegistro(EvalInterna registro) {
		this.registro = registro;
	}
	public List<EvalInterna> getRegistros() {
		return registros;
	}
	public void setRegistros(List<EvalInterna> registros) {
		this.registros = registros;
	}
	

	public void listar() throws Exception {
		ConsultaController datos;
		try {
			datos = new ConsultaController();
			registros = datos.listarDatos();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	


}
