package com.produit.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;


import com.produit.models.Student;
import com.produit.repository.StudentRepository;
@CrossOrigin(origins = "http://localhost:8090", maxAge = 3600, allowCredentials="true")
@RestController
@RequestMapping("/api")
public class StudentController {
	@Autowired
	private StudentRepository er;
	
	
	@GetMapping(value="/getstudents")
	public List<Student> getallstudents(){
		return er.findAll();
	}
	
	
	@PostMapping(value= "/addstudent")
	public Student create(@RequestBody Student s1 ) {
		return er.save(s1);
		
		
	}
	
	
//get one onestudent
@GetMapping("/onestudent/{id}")
public ResponseEntity<Student> getstudentById(@PathVariable Long id){
		Student student = er.findById(id)
				.orElseThrow(()-> new ResourceAccessException("student not exist with id:" + id));
			return ResponseEntity.ok(student);
	}

@DeleteMapping(value= "/deletestudent/{id}")
void deleteserver(@PathVariable Long id) {
er.deleteById(id);
}

//update server
@PutMapping("/updatestudent/{id}")
public ResponseEntity<Student> updatechampion(@PathVariable Long id,@RequestBody Student studentnew) {
	Student student = er.findById(id)
			.orElseThrow(()-> new ResourceAccessException("student not exist with id:" + id));
	student.setFirstname(studentnew.getFirstname());
	student.setLastname(studentnew.getLastname());
	student.setEmail(studentnew.getEmail());
	student.setCin(studentnew.getCin());
	student.setDepartment(studentnew.getDepartment());

	
	
	Student updatedstudent = er.save(student);
	return ResponseEntity.ok(updatedstudent);
}

}
