package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Paciente;


@Repository
@Transactional
public class PacienteRepoImpl implements IPacienteRepo{
	
	private static final Logger LOG =  LoggerFactory.getLogger(PacienteRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
	}

	@Override
	public void actualizarPaciente(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
	}

	@Override
	public Paciente buscarPacientePorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Paciente.class, id);
	}

	@Override
	public void borrarPacientePorId(Integer id) {
		// TODO Auto-generated method stub
		Paciente pacienteBorrar = this.buscarPacientePorId(id);
		this.entityManager.remove(pacienteBorrar);
	}

}
