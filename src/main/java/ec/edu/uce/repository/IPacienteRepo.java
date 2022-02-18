package ec.edu.uce.repository;

import java.time.LocalDateTime;
import java.util.List;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.modelo.PacienteTO;

public interface IPacienteRepo {
	void insertarPaciente(Paciente paciente);
	void actualizarPaciente(Paciente paciente);
	Paciente buscarPacientePorId(Integer id);
	void borrarPacientePorId(Integer id);
	Paciente buscarPacientePorCodigo(String CodigoSeguroPaciente);
	Paciente buscarPacientePorCedula(String cedula);
	List<PacienteTO> buscarPorPacienteSencillo(LocalDateTime fecha,String genero);


}
