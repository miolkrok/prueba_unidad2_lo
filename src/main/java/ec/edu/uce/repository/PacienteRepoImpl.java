package ec.edu.uce.repository;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.Doctor;
import ec.edu.uce.modelo.Paciente;
import ec.edu.uce.modelo.PacienteTO;


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

	@Override
	public Paciente buscarPacientePorCodigo(String CodigoSeguroPaciente) {
		// TODO Auto-generated method stub
		TypedQuery<Paciente> myQuery = this.entityManager.createQuery("select p from Paciente p where p.codigoSeguro=: valor",Paciente.class);
		myQuery.setParameter("valor", CodigoSeguroPaciente);
		return myQuery.getSingleResult();
	}

	@Override
	public Paciente buscarPacientePorCedula(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Paciente> myQuery = this.entityManager.createQuery("select p from Paciente p where p.cedula=: valor",Paciente.class);
		myQuery.setParameter("valor", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public List<PacienteTO> buscarPorPacienteSencillo(LocalDateTime fecha, String genero) {
		// TODO Auto-generated method stub
		TypedQuery<PacienteTO> myQuery = this.entityManager
				.createQuery("SELECT NEW ec.edu.uce.modelo.PacienteTO(p.fechaNacimiento,p.genero,p.nombre,p.cedula) FROM Paciente p JOIN p.paciCitas c WHERE p.fechaNacimiento >=:fecha AND p.genero =:genero",PacienteTO.class);
		myQuery.setParameter("fecha", fecha);
		myQuery.setParameter("genero", genero);
		List<PacienteTO> reporte =  myQuery.getResultList();
		for(PacienteTO pacienteTO : reporte) {
			LOG.info(pacienteTO.toString());
		}
		return reporte;
	}

}
