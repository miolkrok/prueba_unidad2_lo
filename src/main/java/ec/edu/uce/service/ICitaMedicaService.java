package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.PacienteTO;


public interface ICitaMedicaService {

	void insertarCitaMedica(String numeroCita, LocalDateTime fechaCita,BigDecimal valorCita, String lugarCita, String cedulaDoctor, String cedulaPaciente );
	void resultadoCita(String numero, String diagnostico, String receta, LocalDateTime fechaProxima);
	List<PacienteTO> buscarPorPacienteSencillo(LocalDateTime fecha,String genero);
}
