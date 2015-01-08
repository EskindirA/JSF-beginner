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
    //is the property you are binding to the jsf dataTable component
    //this can contain any sort of value and be type of a collection you chose to use.
    private Student[] students={new Student("Student 1",1),new Student("Student 2",2)};
    
    public Student[] getStudents() {
        return students;
    }
    
    
}
