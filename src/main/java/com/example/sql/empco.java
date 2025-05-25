package com.example.sql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class empco {

    @Autowired
    Iempser iservice;

  
    @GetMapping("/data")
    public List<empdata> info() {
        return iservice.empinfo();
    }

    @GetMapping("/data/{id}")
    public String infoid(@PathVariable int id) {
        return iservice.empid(id);
    }

  
    @PostMapping("/data")
    public void addid(@RequestBody empdata newid) {
        iservice.addid(newid);
    }

  
    @PutMapping("/data/{id}")
    public String updateid(@PathVariable int id, @RequestBody empdata upid) {
        iservice.updatid(id, upid);
        return "Employee with ID " + id + " updated.";
    }

  
    @DeleteMapping("/data/{id}")
    public String deleteid(@PathVariable int id) {
        iservice.deleteid(id);
        return "Employee with ID " + id + " deleted.";
    }
}
