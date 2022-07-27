package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.Entity.Medicine;
import com.example.demo.Service.MedService;

@RestController
@RequestMapping("api/v1/")
public class MedicineController {
	@Autowired
	private MedService medservice;
	public MedicineController(MedService medservice) {
		super();
		this.medservice = medservice;
	}
	
	@GetMapping("medicines")
	public List<Medicine> getAllMedicines(){
		return this.medservice.getAllMedicines();
	}
	@PostMapping("medicines")
	public Medicine createMedicine(@RequestBody Medicine medicines) {
		return this.medservice.saveMed(medicines);
		
	}
	
	
}
