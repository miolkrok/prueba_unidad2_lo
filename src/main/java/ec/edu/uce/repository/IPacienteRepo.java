package ec.edu.uce.repository;

import ec.edu.uce.modelo.Paciente;

public interface IPacienteRepo {
	void insertarPaciente(Paciente paciente);
	void actualizarPaciente(Paciente paciente);
	Paciente buscarPacientePorId(Integer id);
	void borrarPacientePorId(Integer id);

}
