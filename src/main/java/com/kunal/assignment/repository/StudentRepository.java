package com.kunal.assignment.repository;

import com.kunal.assignment.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {
}
