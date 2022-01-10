package com.CodeKul.Java28SeptSpring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//one to one mapping

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("saveEmployee")
    public String saveEmployee(@RequestBody Employee employee) {
        employeeRepository.save(employee);
        return "Employee saved..";
    }

    @GetMapping("getEmployee")
    public List<Employee> getEmployee() {
        return employeeRepository.findAll();

    }

    @PutMapping("updateEmployee")
    public String updateEmployee(@RequestBody Employee employee) {
        Employee employee1 = employeeRepository.getById(employee.getId());

        employee1.setName(employee.getName());
        employee1.setAddress(employee1.getAddress());
        employeeRepository.save(employee);
        return "record updated..";
    }


    @DeleteMapping("deleteEmployee/{id}")
    public String deleteEmp(@PathVariable(value = "id") Integer id) {
        Employee employee = employeeRepository.getById(id);
        employeeRepository.delete(employee);
        return "record deleted..";
    }

    @GetMapping("getEmployeeOpt/{id}")
    public Optional<Employee> getEmpByIdOpt(@PathVariable(value = "id") Integer id){
        return employeeRepository.findById(id);
    }

    @GetMapping("getEmpByIdAndName")
    public Employee getEmpByIdAndName(@RequestParam("id")Integer id,
                                      @RequestParam ("name") String name){
        return employeeRepository.findByIdAndName(id,name);
    }


    @GetMapping("getEmpByIdOrName")
    public List<Employee> getEmpByIdOrName(@RequestParam("id")Integer id,
                                      @RequestParam ("name") String name){
        return employeeRepository.findByIdOrName(id,name);
    }


    @GetMapping("getNameStartingWith")
    public List<Employee> getNameStartingWith(
                                           @RequestParam ("name") String name){
        return employeeRepository.findByNameStartingWith(name);
    }

    @GetMapping("getNameEndingWith")
    public List<Employee> getNameEndingWith(
                                              @RequestParam ("name") String name){
        return employeeRepository.findByNameEndingWith(name);
    }

}
///https://github.com/DhavalDokhe/SpringBoot.git