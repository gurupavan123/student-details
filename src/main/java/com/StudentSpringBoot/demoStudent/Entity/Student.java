package com.StudentSpringBoot.demoStudent.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="student_tb",
       uniqueConstraints=@UniqueConstraint(
               name="Student_Email",
             columnNames = "Student_Email"
        )
  )
public class Student {
   @Id
   @SequenceGenerator(
           name="student_sequence",
           sequenceName = "student_sequence",
           allocationSize = 1
   )
   @GeneratedValue(
           strategy = GenerationType.SEQUENCE,
           generator = "student_sequence"
   )
   @Column(name="Student_ID")
    private int St_Id;
   @Column(name="Student_Name")
   private String St_Name;
   @Column(name="Student_PH_No")
   private String St_Phone_number;
   @Column(name="Student_Email",
            unique = false)
   private String Email;
   @Column(name="Student_Address")
   private String St_address;
   @Column(name ="Student_Group")
   private String St_group;
   @Column(name="Student_Total_Marks")
   private int St_Total_Marks;

}
