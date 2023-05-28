package com.StudentSpringBoot.demoStudent.Serves;

import com.StudentSpringBoot.demoStudent.Entity.Student;
import com.StudentSpringBoot.demoStudent.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class Student_Serves {
    @Autowired
    private StudentRepo studentRepo;

    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

       public Student findById(int st_Id ){
          return studentRepo.findById( st_Id).orElse(null);
}
}