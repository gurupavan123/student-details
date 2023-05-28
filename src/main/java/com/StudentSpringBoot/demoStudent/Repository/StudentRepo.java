package com.StudentSpringBoot.demoStudent.Repository;

import com.StudentSpringBoot.demoStudent.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository <Student,Integer>{
}
