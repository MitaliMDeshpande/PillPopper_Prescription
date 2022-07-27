package com.example.demo.Service;

import java.util.List;

import com.example.demo.Dao.Entity.Medicine;

public interface MedService {
	Medicine saveMed(Medicine medicine);
	List<Medicine> getAllMedicines();
	Medicine getMedById(long id);
	Medicine updateMed(Medicine medicine, long id);
	void deleteMed(long id);
}
