package com.bridgelabz.ucone;

import java.util.Random;

public class AttendanceCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		Boolean attendance=random.nextBoolean();
		
		if(attendance)
			System.out.println("Employee is present ");
		else
			System.out.println("Employee is absent ");
	}

}