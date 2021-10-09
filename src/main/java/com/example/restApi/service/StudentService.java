package com.example.restApi.service;
import com.example.restApi.entity.Student;
import com.example.restApi.exception.StudentNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    List<Student> ls = new ArrayList<>();


    public List<Student> getAllStudent(){
      studentDao.findAll().forEach(ls::add);
        return  ls;
    }


    public Student getStudentById(int roll) {
        /*
        Student st = null;

        for(Student s:ls){
            if(s.getRoll()==roll){
                st = s;
                break;
            }

        }
        return st;

         */

      if(studentDao.findById(roll).isEmpty()==true)
         throw new StudentNotFoundException("this id is not available");

      return studentDao.findById(roll).get();

    }

    public void addStudent(Student student) {
        //ls.add(student);

       studentDao.save(student);
    }


    public void updateStudent(Student student, int roll) {

        /*for(int i=0; i < ls.size(); i++){
            Student s = ls.get(i);
            if(s.getRoll() == roll){
                ls.set(i, student);
                return;
            }
        }

         */

        studentDao.save(student);
    }

    public void deleteStudentById(int roll) {
       //ls.removeIf(t->t.getRoll()==roll);

        studentDao.deleteById(roll);

    }
}
