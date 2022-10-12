/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aggregationapp;

/**
 *
 * @author 5short82
 */
public class Undergraduate extends Student {
   
    public Undergraduate(String idIn, String nameIn, String courseIn, Double markIn) {
        super(idIn, nameIn, courseIn, markIn);
    }
    public String getGrade()
    {
        if(mark>69)
        {
            return "First";           
        }
        else if(mark>=60)
        {
            return "2/1";
        }
        else if(mark>=50)
        {
            return "2/2";
        }
        else if(mark>=40)
        {
            return "Third";
        }
        else
        {
            return "Fail";
        }
    }
}
