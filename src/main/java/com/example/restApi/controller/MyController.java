package com.example.restApi.controller;

import com.example.restApi.entity.Student;
import com.example.restApi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {

         @Autowired
         private StudentService studentService;

        @GetMapping("/students")
        public List<Student> getAllStudent(){
            return studentService.getAllStudent();
        }

        @GetMapping("/students/{roll}")
        public Student getStudentById(@PathVariable int roll){
          return studentService.getStudentById(roll);

        }

        @PostMapping("/students")
        public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
       }

       @PutMapping("/students/{roll}")
       public void updateStudent( @RequestBody Student student, @PathVariable int roll){
            studentService.updateStudent( student, roll);
       }

       @DeleteMapping("/students/{roll}")
        public void deleteStudentById(@PathVariable int roll){
             studentService.deleteStudentById(roll) ;
       }

}
