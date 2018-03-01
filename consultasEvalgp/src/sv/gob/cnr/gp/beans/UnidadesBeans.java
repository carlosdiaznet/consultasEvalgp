package sv.gob.cnr.gp.beans;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
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
	/*
	public void generatePDF(ActionEvent actionEvent) throws JRException, IOException {	
		File jasper = new File(FacesContext.getCurrentInstance().getExternalContext().getRealPath("/reports/rptUnidadesAdm.jasper"));
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasper.getPath(), null, new JRBeanCollectionDataSource(this.unidades));
		HttpServletResponse response = (HttpServletResponse) FacesContext.getCurrentInstance().getExternalContext().getResponse();
		response.addHeader("Content-disposition", "attachment; filename=jsrReporte.pdf");
		ServletOutputStream stream = response.getOutputStream();
		JasperExportManager.exportReportToPdfStream(jasperPrint, stream);
		stream.flush();
		stream.close();
		FacesContext.getCurrentInstance().responseComplete();
	}
*/
}
