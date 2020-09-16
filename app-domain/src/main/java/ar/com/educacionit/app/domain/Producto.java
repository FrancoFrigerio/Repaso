package ar.com.educacionit.app.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "producto")

public class Producto {
 
 @Id
 @GeneratedValue (strategy = GenerationType.IDENTITY)
 private Long Id;
 //***********
 
 @Column(name = "titulo")
 private String titulo;
 //********
 
 @Column(name = "precio")
 private Float precio;
 //*********
 
 @Column(name = "codigo", unique = true)
 private String codigo;
 //*******
 
 
 @ManyToOne
 @JoinColumn(name = "tipo_producto", referencedColumnName = "id")
 
 private TipoProducto tipoProducto;
//***** tipo producto lo toma como un objeto****
//es una relacion muchos a uno 
 
 
 
 public Producto() {
	// TODO Auto-generated constructor stub
}
 
  

public Producto(Long id, String titulo, Float precio, String codigo, TipoProducto tipoProducto) {
	super();
	this.Id = id;
	this.titulo = titulo;
	this.precio = precio;
	this.codigo = codigo;
	this.tipoProducto = tipoProducto;
}


public Producto(String titulo, Float precio, String codigo, TipoProducto tipoProducto) {
	super();
	this.titulo = titulo;
	this.precio = precio;
	this.codigo = codigo;
	this.tipoProducto = tipoProducto;
}







public String getCodigo() {
	return codigo;
}


public void setCodigo(String codigo) {
	this.codigo = codigo;
}


public Long getId() {
	return Id;
}
public void setId(Long id) {
	Id = id;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public Float getPrecio() {
	return precio;
}
public void setPrecio(Float precio) {
	this.precio = precio;
}
public TipoProducto getTipoProducto() {
	return tipoProducto;
}
public void setTipoProducto(TipoProducto tipoProducto) {
	this.tipoProducto = tipoProducto;
}
@Override
public String toString() {
	return "PRODUCTO [ID = " + Id + ", TITULO/DESCRIPCION = " + titulo + ", PRECIO = " + precio + ", TIPO DE PRODUCTO = " + tipoProducto + "]";








}
}
