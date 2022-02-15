package ec.edu.uce.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.repository.IPacienteRepo;


@Service
public class PacienteServiceImpl implements IPacienteService{

	private static Logger LOG = Logger.getLogger(PacienteServiceImpl.class);
	
	@Autowired
	private IPacienteRepo pacienteRepo;
	@Override
	public void guardarPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		this.pacienteRepo.insertarPaciente(paciente);
	}

	@Override
	public void actualizarPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		
		this.pacienteRepo.actualizarPaciente(paciente);
		LOG.info("SE HA ACTUALIZADO UNA CITA MEDICA");
	}

	@Override
	public Paciente buscarPacientePorId(Integer id) {
		// TODO Auto-generated method stub
		return this.pacienteRepo.buscarPacientePorId(id);
	}

	@Override
	public void borrarPacientePorId(Integer id) {
		// TODO Auto-generated method stub
		this.pacienteRepo.borrarPacientePorId(id);
	}

}
