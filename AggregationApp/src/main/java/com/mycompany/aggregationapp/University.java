/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aggregationapp;

/**
 *
 * @author 5short82
 */

// University class
import java.util.ArrayList;
        
public class University 
{
    private ArrayList<Student> students = new ArrayList<>();
    
    public void enrolStudent(Student s)
    {
        students.add(s);
    }
    
    // Search for a student by their ID
    public Student findStudentByID (int searchID)
    {
        for(int count=0; count<students.size(); count++)
        {
            Student currentStudent = students.get(count);
            if(currentStudent.getName().equals(searchID))
            {
                return currentStudent;
            }
        }
        return null;
    }
    
    // Search for a student by their ID
    public Student findStudentByName (String searchName)
    {
        for(int count=0; count<students.size(); count++)
        {
            Student currentStudent = students.get(count);
            if(currentStudent.getName().equals(searchName))
            {
                
            }
        }
        return null;
    }
}
