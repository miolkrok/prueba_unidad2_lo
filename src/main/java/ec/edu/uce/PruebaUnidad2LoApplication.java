package ec.edu.uce;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.service.ICitaMedicaService;
import ec.edu.uce.service.IDoctorService;
import ec.edu.uce.service.IPacienteService;

@SpringBootApplication
public class PruebaUnidad2LoApplication implements CommandLineRunner{

	private static final Logger LOG =  LoggerFactory.getLogger(PruebaUnidad2LoApplication.class);
	
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
//		Paciente pac2 = new Paciente();
//		pac2.setCedula("1794986259");
//		pac2.setNombre("ariel");
//		pac2.setApellido("cabrera");
//		LocalDateTime miFechaNacimiento2 = LocalDateTime.of(1995, Month.MARCH,4,12,30);
//		pac2.setFechaNacimiento(miFechaNacimiento2);
//		pac2.setCodigoSeguro("17884a");
//		pac2.setEstatura("1.69m");
//		pac2.setPeso("70kg");
//		pac2.setGenero("masculino");
//		
//		this.pacienteService.guardarPaciente(pac2);
		
		
		Doctor midoc = new Doctor();
		midoc.setCedula("1718496944");
		Paciente mipaci = new Paciente();
		mipaci.setCedula("1794986259");
		
		
		//vamos a construir la lista de detalles
		List<CitaMedica> citas = new ArrayList<>();
		
		//primer detalle
		CitaMedica d1 = new CitaMedica();
		d1.setNumeroCita("2");
		d1.setFechaCita(LocalDateTime.of(2022, Month.MARCH,4,12,30));
		d1.setValorCita(new BigDecimal(10.5));

		

		
		
		this.citaService.insertarCitaMedica(d1);
		

		


		

	}

}
