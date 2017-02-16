package dto;

import java.util.ArrayList;
import java.util.List;


public class PatologiaDTO {
	
	private int id;
	private String nombre;
	private String causa;
	private String tratamiento;
	private String descripcion;
	private List<SintomaDTO> lista_sintomas;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCausa() {
		return causa;
	}
	public void setCausa(String causa) {
		this.causa = causa;
	}
	public String getTratamiento() {
		return tratamiento;
	}
	public void setTratamiento(String tratamiento) {
		this.tratamiento = tratamiento;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public List<SintomaDTO> getLista_sintomas() {
		return lista_sintomas;
	}
	public void setLista_sintomas(List<SintomaDTO> lista_sintomas) {
		this.lista_sintomas = lista_sintomas;
	}
	
	public void addSintoma (SintomaDTO sintomadto)
	{
		this.lista_sintomas.add(sintomadto);
	}
	
	public PatologiaDTO(int id, String nombre, String causa, String tratamiento, String descripcion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.causa = causa;
		this.tratamiento = tratamiento;
		this.descripcion = descripcion;
		this.lista_sintomas = new ArrayList<SintomaDTO>();
	}
	
	@Override
	public String toString() {
		String strdev = "PATOLOGIA = " + this.nombre + " ID = " + this.id + " N� Sintomas = " + this.lista_sintomas.size(); 
		return strdev;
	}

	

}
