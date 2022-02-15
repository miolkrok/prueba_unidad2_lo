package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.PruebaUnidad2LoApplication;
import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repository.ICitaMedicaRepo;
import ec.edu.uce.repository.IDoctorRepo;
import ec.edu.uce.repository.IPacienteRepo;

@Service
public class GestorCitaMedicaServiceImpl implements ICitaMedicaService {
	
	//private static final Logger LOG =  Logger.getLogger(GestorCitaMedicaServiceImpl.class);
	private static Logger LOG = Logger.getLogger(GestorCitaMedicaServiceImpl.class);

	@Autowired
	private ICitaMedicaRepo citaMedicaRepoG;
	@Autowired
	private IPacienteRepo pacienteRepoG;
	@Autowired
	private IDoctorRepo doctorRepoG;
	
	@Override
	public void insertarCitaMedica(String numeroCita, LocalDateTime fechaCita,BigDecimal valorCita, String lugarCita, String apellidoDoctor, String codigoSeguroPaciente ) {
		// TODO Auto-generated method stub
		CitaMedica citaMedica = new CitaMedica();
		citaMedica.setNumeroCita(numeroCita);
		citaMedica.setFechaCita(fechaCita);
		
		citaMedica.setLugarCita(lugarCita);
		citaMedica.setDoctor(this.doctorRepoG.buscarDoctorPorApellido(apellidoDoctor));
		citaMedica.setPaciente(this.pacienteRepoG.buscarPacientePorCodigo(codigoSeguroPaciente));
		if(fechaCita.isAfter(LocalDateTime.now())) {
			citaMedica.setValorCita(valorCita.multiply(new BigDecimal(0.12).add(valorCita)));
			
			this.citaMedicaRepoG.insertarCitaMedica(citaMedica);
			LOG.info("SE HA INGRESADO UNA CITA MEDICA");
		}else{
			LOG.warn("no se pudo ingresar, fecha incorrecta!!!");
		}
		
	}

}
