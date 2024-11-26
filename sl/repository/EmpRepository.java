package com.sl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sl.entity.Employee;

public interface EmpRepository extends JpaRepository<Employee, Integer> {

}
