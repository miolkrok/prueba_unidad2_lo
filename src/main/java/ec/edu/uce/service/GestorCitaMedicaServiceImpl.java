package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.repository.ICitaMedicaRepo;
import ec.edu.uce.repository.IDoctorRepo;
import ec.edu.uce.repository.IPacienteRepo;

@Service
public class GestorCitaMedicaServiceImpl implements ICitaMedicaService {

	@Autowired
	private ICitaMedicaRepo citaMedicaRepoG;
	@Autowired
	private IPacienteRepo pacienteRepoG;
	@Autowired
	private IDoctorRepo doctorRepoG;
	
	@Override
	public void insertarCitaMedica(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.citaMedicaRepoG.insertarCitaMedica(citaMedica);
	}

}
