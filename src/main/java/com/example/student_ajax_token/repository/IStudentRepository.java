package com.example.student_ajax_token.repository;

import com.example.student_ajax_token.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student, Long> {
}
