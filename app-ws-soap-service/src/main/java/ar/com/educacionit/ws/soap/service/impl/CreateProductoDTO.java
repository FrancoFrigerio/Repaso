package ar.com.educacionit.ws.soap.service.impl;

public class CreateProductoDTO {

	private String codigo;
	
	private Float precio;
	
	private String titulo;
	
	private Long tipoProducto;

	public CreateProductoDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public CreateProductoDTO(String codigo, Float precio, String titulo, Long tipoProducto) {
		super();
		this.codigo = codigo;
		this.precio = precio;
		this.titulo = titulo;
		this.tipoProducto = tipoProducto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Long getTipoProducto() {
		return tipoProducto;
	}

	public void setTipoProducto(Long tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	
	
}
