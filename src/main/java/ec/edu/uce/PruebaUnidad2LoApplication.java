package ec.edu.uce;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.service.GestorCitaMedicaServiceImpl;
import ec.edu.uce.service.ICitaMedicaService;
import ec.edu.uce.service.IDoctorService;
import ec.edu.uce.service.IPacienteService;

@SpringBootApplication
public class PruebaUnidad2LoApplication implements CommandLineRunner{

	private static Logger LOG = Logger.getLogger(PruebaUnidad2LoApplication.class);
	
	@Autowired
	private IDoctorService doctorService;
	@Autowired
	private IPacienteService pacienteService;
	@Autowired
	private ICitaMedicaService citaService;
	public static void main(String[] args) {
		SpringApplication.run(PruebaUnidad2LoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
//		Doctor doc1 = new Doctor();
//		doc1.setCedula("178496944");
//		doc1.setNombre("luis");
//		doc1.setApellido("ortiz");
//		LocalDateTime miFechaNacimiento = LocalDateTime.of(1989, Month.AUGUST,8,12,45);
//		doc1.setFechaNacimiento(miFechaNacimiento);
//		doc1.setNumeroConsultorio("8b");
//		doc1.setCodigoSenescyt("1484-1894-2015");
//		doc1.setGenero("masculino");
//		
//		this.doctorService.guardarDoctor(doc1);
		
//		Doctor doc2 = new Doctor();
//		doc2.setCedula("1704115102");
//		doc2.setNombre("miguel");
//		doc2.setApellido("quiroz");
//		LocalDateTime miFechaNacimiento2 = LocalDateTime.of(1979, Month.SEPTEMBER,16,12,30);
//		doc2.setFechaNacimiento(miFechaNacimiento2);
//		doc2.setNumeroConsultorio("7a");
//		doc2.setCodigoSenescyt("8785-1894-2010");
//		doc2.setGenero("masculino");
//		
//		this.doctorService.guardarDoctor(doc2);
		
//		Paciente pac1 = new Paciente();
//		pac1.setCedula("1794986259");
//		pac1.setNombre("ariel");
//		pac1.setApellido("cabrera");
//		LocalDateTime miFechaNacimiento = LocalDateTime.of(1995, Month.MARCH,4,12,30);
//		pac1.setFechaNacimiento(miFechaNacimiento);
//		pac1.setCodigoSeguro("17884a");
//		pac1.setEstatura("1.69m");
//		pac1.setPeso("70kg");
//		pac1.setGenero("masculino");
//		
//		this.pacienteService.guardarPaciente(pac1);
//		
		Paciente pac2 = new Paciente();
		pac2.setId(2);
		pac2.setCedula("1841615061");
		pac2.setNombre("karla");
		pac2.setApellido("icaza");
		LocalDateTime miFechaNacimiento2 = LocalDateTime.of(1995, Month.APRIL,30,12,30);
		pac2.setFechaNacimiento(miFechaNacimiento2);
		pac2.setCodigoSeguro("184961q");
		pac2.setEstatura("1.70m");
		pac2.setPeso("72kg");
		pac2.setGenero("femenino");
		
		this.pacienteService.actualizarPaciente(pac2);
		
		Doctor doc2 = new Doctor();
		doc2.setId(2);
		doc2.setCedula("1704115102");
		doc2.setNombre("byron");
		doc2.setApellido("quiroz");
		LocalDateTime miFechaNacimientoDOC = LocalDateTime.of(1979, Month.SEPTEMBER,16,12,30);
		doc2.setFechaNacimiento(miFechaNacimientoDOC);
		doc2.setNumeroConsultorio("7a");
		doc2.setCodigoSenescyt("8785-1894-2010");
		doc2.setGenero("masculino");
		
		this.doctorService.actualizarDoctor(doc2);
		

		this.citaService.insertarCitaMedica("20", LocalDateTime.of(2022, Month.MARCH,25,12,30),new BigDecimal(30.50), "recreo", "quiroz", "184961q");
		

		


		

	}

}
