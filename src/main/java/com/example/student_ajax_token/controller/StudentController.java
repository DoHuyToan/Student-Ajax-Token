package com.example.student_ajax_token.controller;

import com.example.student_ajax_token.model.Student;
import com.example.student_ajax_token.service.studentService.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/students")
@CrossOrigin("*")
public class StudentController {

    @Autowired
    private IStudentService studentService;


    @GetMapping("")
    public ResponseEntity<Iterable<Student>> allStudent(){
        return new ResponseEntity<>(studentService.findAll(), HttpStatus.OK);
    }

    @GetMapping("/list")
    public ModelAndView getAllStudentPage() {
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("studentList", studentService.findAll());
        return modelAndView;
    }

    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        studentService.save(student);
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Student> delete(@PathVariable Long id){
        studentService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/edit")
    public ResponseEntity<Student> Edit(@RequestBody Student student){
        studentService.save(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> findById(@PathVariable Long id){
        Student student = studentService.findById(id).get();
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
}
