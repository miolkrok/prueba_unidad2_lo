package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
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

	@Override
	public Doctor buscarDoctorPorApellido(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Doctor> myQuery = this.entityManager.createQuery("select d from Doctor d where d.apellido=: valor",Doctor.class);
		myQuery.setParameter("valor", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public Doctor buscarDoctorPorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Doctor> myQuery = this.entityManager.createQuery("select d from Doctor d where d.cedula=: valor",Doctor.class);
		myQuery.setParameter("valor", cedula);
		return myQuery.getSingleResult();
	}

}
