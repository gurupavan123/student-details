package com.StudentSpringBoot.demoStudent.controller;

import com.StudentSpringBoot.demoStudent.Entity.Student;
import com.StudentSpringBoot.demoStudent.Serves.Student_Serves;
import org.hibernate.annotations.Fetch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {
    @Autowired
    private Student_Serves student_serves;
  @PostMapping("/addStudent")
    public Student postDetails(@RequestBody Student student) {
      return student_serves.saveStudent(student);
  }
    @PutMapping("/putStudent")
    public Student putDetails(@RequestBody Student student) {
        return student_serves.saveStudent(student);
    }
    @DeleteMapping("/deleteStudent")
    public Student deleteDetails(@RequestBody Student student) {
        return student_serves.saveStudent(student);
    }
    @GetMapping("/getStudent")
   public Student getDetails(@RequestBody Student student){
      return student;
   }
   @GetMapping("/getStudent/{id}")
   public Student getIdDetails(@PathVariable int st_Id ){
      return student_serves.findById(st_Id);
   }
}
