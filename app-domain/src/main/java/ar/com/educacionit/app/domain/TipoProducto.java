package ar.com.educacionit.app.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tipo_producto")
public class TipoProducto {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long Id;
	private String Dscripcion;
	
	
	public TipoProducto() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public TipoProducto(Long id, String dscripcion) {
		super();
		this.Id = id;
		Dscripcion = dscripcion;
	}




	@Override
	public String toString() {
		return "TipoProducto [Id=" + Id + ", Dscripcion=" + Dscripcion + "]";
	}




	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getDscripcion() {
		return Dscripcion;
	}
	public void setDscripcion(String dscripcion) {
		Dscripcion = dscripcion;
	}
	
}
