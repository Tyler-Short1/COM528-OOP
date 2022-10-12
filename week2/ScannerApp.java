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
public class ScannerApp
{
	public static void main (String[] args)
	{
		String str = "";
		Scanner scanner1 = new Scanner (System.in);
		System.out.println("Please enter a string:");
		str = scanner1.nextLine();
		System.out.println("You entered: " + str);
	
	}
	
}
