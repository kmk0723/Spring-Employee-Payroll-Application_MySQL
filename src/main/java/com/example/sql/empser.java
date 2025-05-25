package com.example.sql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class empser implements Iempser{

    @Autowired
    private EmpRepository repository;

	@Override
	public List<empdata> empinfo() {
		return repository.findAll();

	}

	@Override
	public String empid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addid(empdata newid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updatid(int id, empdata upid) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteid(int id) {
		// TODO Auto-generated method stub
		
	}  


//    public List<empdata> empinfo() {
//        return repository.findAll();
//    }
//
//    public String empid(int id) {
//        Optional<empdata> data = repository.findById(id);
//        if (data.isPresent()) {
//            empdata emp = data.get();
//            return emp.getId() + " " + emp.getName() + " " + emp.getSal();
//        }
//        return "Employee not found!";
//    }
//
//
//    public void addid(empdata newid) {
//        repository.save(newid);
//    }
//
//   
//    public void updatid(int id, empdata upid) {
//        Optional<empdata> existingEmp = repository.findById(id);
//        if (existingEmp.isPresent()) {
//            empdata emp = existingEmp.get();
//            emp.setName(upid.getName());
//            emp.setSal(upid.getSal());
//            repository.save(emp);
//        }
//    }
//
//
//    public void deleteid(int id) {
//        repository.deleteById(id);
//    }
}
