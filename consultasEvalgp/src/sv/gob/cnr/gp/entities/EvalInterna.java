package sv.gob.cnr.gp.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="EVAL_INTERNA")
public class EvalInterna implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private long id;
	
	@Column(name="GENERO")
	private String genero;
	
	@Column(name="EDAD")
	private String edad;
	
	@Column(name="AREA")
	private String area;
	
	@Column(name="PRG1")
	private int prg1;
	
	@Column(name="PRG2")
	private int prg2;
	
	@Column(name="PRG3")
	private int prg3;
	
	@Column(name="PRG4")
	private int prg4;
	
	@Column(name="PRG5")
	private int prg5;
	
	@Column(name="PRG6")
	private int prg6;
	
	@Column(name="PRG7")
	private int prg7;
	
	@Column(name="PRG8")
	private int prg8;
	
	@Column(name="SUGERENCIA")
	private String sugerencia;
	
	@Column(name="CARNET")
	private String carnet;
	
	@Column(name="FECHA")
	@Temporal(TemporalType.DATE)
	private Date fecha;
	
	@Column(name="USER_CRE")
	private String user_cre;
	
	@Column(name="MEDICION")
	private int medicion;
	
	@Column(name="ANIO")
	private String anio;
	
	@Column(name="UNIDAD")
	private String unidad;
	
	@Column(name="SUBUNIDAD")
	private String subunidad;
	
	@Column(name="SUGERENCIA_SRC")
	private String sugerencia_src;
	
	public EvalInterna() {
		// TODO Auto-generated constructor stub
	}

	public EvalInterna(long id, String genero, String edad, String area, int prg1, int prg2, int prg3, int prg4,
			int prg5, int prg6, int prg7, int prg8, String sugerencia, String carnet, Date fecha, String user_cre,
			int medicion, String anio, String unidad, String subunidad, String sugerencia_src) {
		super();
		this.id = id;
		this.genero = genero;
		this.edad = edad;
		this.area = area;
		this.prg1 = prg1;
		this.prg2 = prg2;
		this.prg3 = prg3;
		this.prg4 = prg4;
		this.prg5 = prg5;
		this.prg6 = prg6;
		this.prg7 = prg7;
		this.prg8 = prg8;
		this.sugerencia = sugerencia;
		this.carnet = carnet;
		this.fecha = fecha;
		this.user_cre = user_cre;
		this.medicion = medicion;
		this.anio = anio;
		this.unidad = unidad;
		this.subunidad = subunidad;
		this.sugerencia_src = sugerencia_src;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPrg1() {
		return prg1;
	}

	public void setPrg1(int prg1) {
		this.prg1 = prg1;
	}

	public int getPrg2() {
		return prg2;
	}

	public void setPrg2(int prg2) {
		this.prg2 = prg2;
	}

	public int getPrg3() {
		return prg3;
	}

	public void setPrg3(int prg3) {
		this.prg3 = prg3;
	}

	public int getPrg4() {
		return prg4;
	}

	public void setPrg4(int prg4) {
		this.prg4 = prg4;
	}

	public int getPrg5() {
		return prg5;
	}

	public void setPrg5(int prg5) {
		this.prg5 = prg5;
	}

	public int getPrg6() {
		return prg6;
	}

	public void setPrg6(int prg6) {
		this.prg6 = prg6;
	}

	public int getPrg7() {
		return prg7;
	}

	public void setPrg7(int prg7) {
		this.prg7 = prg7;
	}

	public int getPrg8() {
		return prg8;
	}

	public void setPrg8(int prg8) {
		this.prg8 = prg8;
	}

	public String getSugerencia() {
		return sugerencia;
	}

	public void setSugerencia(String sugerencia) {
		this.sugerencia = sugerencia;
	}

	public String getCarnet() {
		return carnet;
	}

	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getUser_cre() {
		return user_cre;
	}

	public void setUser_cre(String user_cre) {
		this.user_cre = user_cre;
	}

	public int getMedicion() {
		return medicion;
	}

	public void setMedicion(int medicion) {
		this.medicion = medicion;
	}

	public String getAnio() {
		return anio;
	}

	public void setAnio(String anio) {
		this.anio = anio;
	}

	public String getUnidad() {
		return unidad;
	}

	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}

	public String getSubunidad() {
		return subunidad;
	}

	public void setSubunidad(String subunidad) {
		this.subunidad = subunidad;
	}

	public String getSugerencia_src() {
		return sugerencia_src;
	}

	public void setSugerencia_src(String sugerencia_src) {
		this.sugerencia_src = sugerencia_src;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EvalInterna other = (EvalInterna) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EvalInterna [id=" + id + "]";
	}
	
	
	
}
