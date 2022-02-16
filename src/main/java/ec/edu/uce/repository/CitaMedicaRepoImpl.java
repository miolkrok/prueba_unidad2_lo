package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import ec.edu.uce.modelo.CitaMedica;


@Repository
@Transactional
public class CitaMedicaRepoImpl implements ICitaMedicaRepo {
	
	private static final Logger LOG =  LoggerFactory.getLogger(CitaMedicaRepoImpl.class);

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertarCitaMedica(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(citaMedica);
		
	}
	
	
	@Override
	public CitaMedica buscarPorNumero(String numero) {
		TypedQuery<CitaMedica> myQuery = this.entityManager
				.createQuery("SELECT c FROM CitaMedica c WHERE c.numeroCita =: numeroCita", CitaMedica.class);
		myQuery.setParameter("numeroCita", numero);

		return myQuery.getSingleResult();
	}


	@Override
	public void actualizarCitaMedica(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(citaMedica);
	}

}
