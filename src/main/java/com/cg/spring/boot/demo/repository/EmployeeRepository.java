package com.cg.spring.boot.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.spring.boot.demo.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public abstract List<Employee> findByEname(String ename);

	public abstract List<Employee> findBySalary(double salary);

	public abstract List<Employee> findBySalaryGreaterThan(double salary);

	public abstract List<Employee> findBySalaryLessThan(double salary);

	@Query("SELECT e FROM Employee e WHERE e.salary != ?1")
	public abstract List<Employee> findEmployeeBySalary(double salary);

	@Transactional
	@Modifying
	@Query("update Employee e set e.salary = :newSalary where e.salary > :oldSalary")
	public abstract void updateSalary(@Param("newSalary") double newSalary, @Param("oldSalary") double oldSalary);

}
