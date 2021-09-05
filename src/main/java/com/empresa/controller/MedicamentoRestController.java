package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Medicamento;
import com.empresa.service.MedicamentoService;

@RestController
@RequestMapping("/rest/medicamento")
public class MedicamentoRestController {
	
	@Autowired
	private MedicamentoService service;
	/*LISTAR*/
	@GetMapping()
	@ResponseBody
	public ResponseEntity<List<Medicamento>> listaMedicamento(){
		List<Medicamento> lista=service.listaMedicamento();
		return ResponseEntity.ok(lista);
	}
	/*INSERTAR*/
	@PostMapping
	@ResponseBody
	public ResponseEntity<Medicamento> registra(@RequestBody Medicamento obj){
		if(obj==null) {
			return ResponseEntity.noContent().build();
		}else {
			obj.setIdMedicamento(0);
			Medicamento objSalida = service.insertarMed(obj);
			return ResponseEntity.ok(objSalida);
		}
		
	}
	/*@PostMapping
	@ResponseBody
	public ResponseEntity<Alumno> insertaAlumno(@RequestBody Alumno obj){
		if(obj == null) {
			return ResponseEntity.noContent().build();
		}else {
		obj.setIdAlumno(0);
		Alumno objsalida = service.insertaActualizaAlumno(obj);
		return ResponseEntity.ok(objsalida);
		
		}
	}*/

}
