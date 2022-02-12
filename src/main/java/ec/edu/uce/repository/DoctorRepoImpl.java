package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Doctor;


@Repository
@Transactional
public class DoctorRepoImpl implements IDoctorRepo{

	private static final Logger LOG =  LoggerFactory.getLogger(DoctorRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertarDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(doctor);
	}

	@Override
	public void actualizarDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(doctor);
	}

	@Override
	public Doctor buscarDoctorPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Doctor.class, id);
	}

	@Override
	public void borrarDoctorPorId(Integer id) {
		// TODO Auto-generated method stub
		Doctor doctorBorrar = this.buscarDoctorPorId(id);
		this.entityManager.remove(doctorBorrar);
	}

}
