package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
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
		this.entityManager.merge(citaMedica);
		
	}

}
