/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentweek2app;
import java.util.Scanner;

/**
 *
 * @author 5dawes65
 */
public class StudentWeek2App 
{
    public static void main (String[] args)
    {
            int i = 1;
            while(i < 2)
            {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter student ID");
                String id = scanner.nextLine();
                System.out.println("Please enter the student name:");
                String name = scanner.nextLine();
                System.out.println("Please enter the student's course:");
                String course = scanner.nextLine();
                
                Student x = new Masters (id, name, course, 0.0);
                System.out.println ("Created student " + x.getName() + " attending course " + x.getCourse());
                
                System.out.println("Please enter " + x.getName() + "'s mark:");
                String mark = scanner.nextLine();
                
                double marknum = Double.parseDouble(mark);
                if(marknum<0 || marknum>100)
                {
                    System.out.println("Mark must be between 0 and 100!");
                }
                else
                {
                    x.setMark(marknum);
                    System.out.println("The mark is: " + x.getMark());
                    System.out.println("The grade is: " + x.getGrade());
                    System.out.println(x.getName() + "passed their course? " + x.didPass());
                }
                
                /*
                System.out.println("Please enter the student's mark:");
                String mark = scanner.nextLine();

                System.out.println("You entered: " + name);
                System.out.println("You entered: " + course);

                double marknum = Double.parseDouble(mark);
                if(marknum<0 || marknum>100)
                        {
                                System.out.println("Mark must be between 0 and 100!");
                        }
                else
                        {
                                System.out.println("The mark is: " + marknum);
                                Student x = new Student (id, name, course, marknum);
                                x.printDetails();
                                System.out.println (x.getName());
                                System.out.println (x.getCourse());
                                System.out.println (x.getGrade());
                        }
                */
                
                i++;
            }

    }
}    

