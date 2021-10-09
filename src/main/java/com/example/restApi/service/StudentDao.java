package com.example.restApi.service;

import com.example.restApi.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentDao  extends CrudRepository<Student, Integer> {

}
