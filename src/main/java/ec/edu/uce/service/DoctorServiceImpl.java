package ec.edu.uce.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.repository.IDoctorRepo;


@Service
public class DoctorServiceImpl implements IDoctorService{

	private static Logger LOG = Logger.getLogger(DoctorServiceImpl.class);
	
	@Autowired
	private IDoctorRepo doctorRepo;
	
	@Override
	public void guardarDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepo.insertarDoctor(doctor);
	}

	@Override
	public void actualizarDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		
		this.doctorRepo.actualizarDoctor(doctor);
		LOG.info("SE HA ACTUALIZADO UNA CITA MEDICA");
	}

	@Override
	public Doctor buscarDoctorPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.doctorRepo.buscarDoctorPorId(id);
	}

	@Override
	public void borrarDoctorPorId(Integer id) {
		// TODO Auto-generated method stub
		this.doctorRepo.borrarDoctorPorId(id);
	}

}
