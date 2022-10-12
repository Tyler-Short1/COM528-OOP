/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aggregationapp;

/**
 *
 * @author 5short82
 */
public abstract class Student
{
    protected String id, name, course;
    protected Double mark;

    public Student (String idIn, String nameIn, String courseIn, Double markIn)
    {
            this.id = idIn;
            this.name = nameIn;
            this.course = courseIn;
            this.mark = markIn;
    }

    public void printDetails()
    {
            System.out.println("ID: " + this.id + " - COURSE: " + this.course);
            System.out.println("NAME: " + this.name + " - MARK: " + this.mark);
    }
        
    public String getName()
    {
        return this.name;
    }
    
    public String getCourse()
    {
        return this.course;
    }
    
    public Double getMark()
    {
        return this.mark;
    }

    public abstract String getGrade();

    
    
    public void setMark (double newMark)
    {
        if(newMark>=0 && newMark<=100)
        {
            this.mark = newMark;
        }
    }

    public boolean didPass ()
    {
        /*
        if(mark>=40)
        {
            return true;
        }
        else
        {
            return false;
        }
        */
     
        return mark >= 40;
    }
}