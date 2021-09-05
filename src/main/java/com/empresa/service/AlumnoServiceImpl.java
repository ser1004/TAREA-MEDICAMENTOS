/*cuarta va esta clase*/
package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Alumno;
import com.empresa.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService{

	@Autowired 
	private AlumnoRepository repository;
	
	
	@Override
	public List<Alumno> listaAlumno() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}


	@Override
	public Alumno insertaActualizaAlumno(Alumno obj) {
		// TODO Auto-generated method stub
		return repository.save(obj);
	}


	@Override
	public Optional<Alumno> obtenerPorId(int idAlumno) {
		// TODO Auto-generated method stub
		return repository.findById(idAlumno);
	}

}
