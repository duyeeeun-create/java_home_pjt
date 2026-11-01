package com.office.array;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
	 
		String[] myArr;
		myArr = new String[3];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("3개의 문자열을 입력하시오.");
		
		for (int i = 0; i < 3; i++) {
			myArr[i] = scanner.nextLine();}
		
		for (int i = 0; i < 3; i++) {
			System.out.print(myArr[i] + " ");
		}
			
		 scanner.close();

	}

}
