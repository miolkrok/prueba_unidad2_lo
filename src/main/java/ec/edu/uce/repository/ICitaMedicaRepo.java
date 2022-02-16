package ec.edu.uce.repository;

import ec.edu.uce.modelo.CitaMedica;
import ec.edu.uce.modelo.Doctor;

public interface ICitaMedicaRepo {
	void insertarCitaMedica(CitaMedica citaMedica);
	CitaMedica buscarPorNumero(String numero);
	void actualizarCitaMedica(CitaMedica citaMedica);


}
