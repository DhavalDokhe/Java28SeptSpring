//package com.CodeKul.Java28SeptSpring.storedprocedure.repository;
//
//import com.CodeKul.Java28SeptSpring.di.Employee;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import java.util.List;
//import java.util.Map;
//
//public interface EmployeeRepoSp extends JpaRepository<Employee,Integer> {
//
//    @Query(value = "{call getemployee()}",nativeQuery = true)
//    List<Map <String ,String >> getemployee();
//}
