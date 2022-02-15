package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public interface ICitaMedicaService {

	void insertarCitaMedica(String numeroCita, LocalDateTime fechaCita,BigDecimal valorCita, String lugarCita, String apellidoDoctor, String codigoSeguroPaciente );
}
