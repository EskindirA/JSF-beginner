/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itsc;

/**
 *
 * @author eskindir
 */
public class StudentData {
    private Student[] students={new Student("Abebe"),
    new Student("aaa"),new Student("ccc")};

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    String msg;
    
    public String move(){
        return "go";
    }
}
