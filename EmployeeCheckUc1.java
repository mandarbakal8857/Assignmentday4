package com.Assignment.day4;

public class EmployeeCheckUc1 {

	public static void main(String[] args)
	{
int IS_FULL_TIME=1;
		
		double empCheck=Math.floor(Math.random()*10)%2;
		
		if(empCheck==IS_FULL_TIME)
			System.out.println("Employee is present:-"+empCheck);
		else
			System.out.println("Employee is Absent:-"+empCheck);

	}



	}


