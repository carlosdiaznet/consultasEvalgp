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
@Table(name="EVL_UNIDADES")
public class EvlUnidades implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="EUD_ID")
	private Integer Id;
	
	@Column(name="FEC_CREA")
	@Temporal(TemporalType.DATE)
	private Date fechaCreacion;
	
	@Column(name="USU_CREA")
	private String usuarioCreacion;
	
	@Column(name="FEC_MODI")
	@Temporal(TemporalType.DATE)
	private Date fechaModificacion;
	
	@Column(name="USU_MODI")
	private String usuarioModificacion;
	
	@Column(name="REG_ACTIVO")
	private Integer registroActivo;
	
	@Column(name="EUD_NOMBRE")
	private String nombreUnidad;
	
	@Column(name="EUD_ID_PADRE")
	private Integer idPadre;
	
	@Column(name="EUD_GRUPO")
	private Integer grupo;
	
	public EvlUnidades() {
		// TODO Auto-generated constructor stub
	}

	public EvlUnidades(Integer id, Date fechaCreacion, String usuarioCreacion, Date fechaModificacion,
			String usuarioModificacion, Integer registroActivo, String nombreUnidad, Integer idPadre, Integer grupo) {
		Id = id;
		this.fechaCreacion = fechaCreacion;
		this.usuarioCreacion = usuarioCreacion;
		this.fechaModificacion = fechaModificacion;
		this.usuarioModificacion = usuarioModificacion;
		this.registroActivo = registroActivo;
		this.nombreUnidad = nombreUnidad;
		this.idPadre = idPadre;
		this.grupo = grupo;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}

	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	public Integer getRegistroActivo() {
		return registroActivo;
	}

	public void setRegistroActivo(Integer registroActivo) {
		this.registroActivo = registroActivo;
	}

	public String getNombreUnidad() {
		return nombreUnidad;
	}

	public void setNombreUnidad(String nombreUnidad) {
		this.nombreUnidad = nombreUnidad;
	}

	public Integer getIdPadre() {
		return idPadre;
	}

	public void setIdPadre(Integer idPadre) {
		this.idPadre = idPadre;
	}

	public Integer getGrupo() {
		return grupo;
	}

	public void setGrupo(Integer grupo) {
		this.grupo = grupo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
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
		EvlUnidades other = (EvlUnidades) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
	
	
	

}
