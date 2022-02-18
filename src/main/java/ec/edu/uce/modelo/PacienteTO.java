package ec.edu.uce.modelo;

import java.time.LocalDateTime;

public class PacienteTO {
	
	private LocalDateTime fechaNacimiento;
	private String genero;
	private String nombre;
	private String cedula;
	
	public PacienteTO() {
		
	}
	

	public PacienteTO(LocalDateTime fechaNacimiento, String genero, String nombre, String cedula) {
		super();
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.nombre = nombre;
		this.cedula = cedula;
	}




	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	@Override
	public String toString() {
		return "PacienteTO [fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + ", nombre=" + nombre
				+ ", cedula=" + cedula + "]";
	}



}
